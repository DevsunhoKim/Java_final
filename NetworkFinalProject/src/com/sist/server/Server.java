package com.sist.server;
/*
 *   서버
 *   ----
 *     접속 담당 ==> 1개만 사용
 *     통신 담당(요청 => 응답) ==> 클라이언트 접속자 수 만큼 
 *     ------ 스레드
 *     
 *     서버
 *      => 서버 구동 ServerSocket
 *                bind() ==> 개통(ip, port) => 유심
 *      => 대기(클라이언트 접근) => listen()
 *      => 접속 처리 => accept() => 발신자 정보 확인
 *         => 메모리에 저장
 *         => 스레드를 클라이언트마다 생성 => 따로 통신
 *         => 기능별(Function)
 *            스레드 => 사용자 요청 => 처리 결과 응답
 */
import java.net.*;
import java.io.*;
import java.util.*;

import com.sist.common.Function;

public class Server implements Runnable{
	// 클라이언트 정보 저장 => id, name, sex, ip, port
	private Vector<Client> waitVC=new Vector<Client>();
	private ServerSocket ss;
	private final int PORT=10000; // 10000으로 바꿀 것
	
	// 서버 가동 ==> 한 번만 실행 가능
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT); // IP자동 인식
			// bind() => listen()
			// 50명까지 한정
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
	
	// 접속 시 처리
	public void run()
	{
		try
		{
			while(true)
			{
				// 클라이언트 정보 얻기 => Socket(ip, port)
				Socket s=ss.accept(); // 발신자 정보를 받음
				
				Client client=new Client(s);
				client.start(); // 통신 시작
				
			}
		}catch(Exception ex) {}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
		new Thread(server).start();
	}
	
	// 통신 담당 => 따로 작동 => 스레드
	class Client extends Thread
	{
		String id, name, sex, pos;
		Socket s;
		
		// 클라이언트 요청/응답
		// 본인 메모리에 써 놓고 서버가 읽어감 Socket에 써 놓음 메모리에 저장해 놓기 때문에 가져가도 파일 자체가 사라지지 않음
		// 읽어가면 Refresh(사라짐)
		BufferedReader in; // 요청 받은 경우
		OutputStream out; // 응답
		public Client(Socket s)
		{
			this.s=s; // 클라이언트 컴퓨터
			// 서버는 클라이언트 정보를 가지고 있어야 하고 클라이언트는 서버의 정보를 가지고 있어야 함
			// PORT 연결선 => 서버는 고정 PORT / 클라이언트 자동 생서야 => 중복 없이 생성
			try
			{
				in=new BufferedReader(new InputStreamReader(s.getInputStream())); // 클라이언트의 소켓. 요청한값을 클라이언트 메모리에서 읽기
				out=s.getOutputStream(); // 클라이언트에서 읽을 수 있게 메모리에 저장
			}catch(Exception ex) {}
		}
		// 요청 시 응답
		public void run()
		{
			try
			{
				while(true)
				{
					String msg=in.readLine();
					System.out.println("Client => " + msg);
					// 로그인 => 100|id|name|sex
					StringTokenizer st=new StringTokenizer(msg, "|");
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol)
					{
						case Function.LOGIN:
						{
							id=st.nextToken();
							name=st.nextToken();
							sex=st.nextToken();
							pos="대기실";
							
							// 접속되어 있는 사람들에게 전송
							messageAll(Function.LOGIN + "|" + id + "|"
									   + name + "|" + sex + "|" + pos);
							messageAll(Function.WAITCHAT + "|[알림 ☞]"
									    + name + "님 입장하셨습니다");
							// waitVc => 저장
							waitVC.add(this);
							// Login창을 닫고, main을 보여줌
							messageTo(Function.MYLOG + "|" + id);
							
							// 접속자 명단을 보냄
							for(Client client:waitVC)
							{
								messageTo(Function.LOGIN + "|"
										  + client.id + "|"
										  + client.name + "|"
										  + client.sex + "|"
										  + client.pos);
								
							}
						}
						break;
						case Function.WAITCHAT: // 웹 => jsp
						{
							String data=st.nextToken();
							messageAll(Function.WAITCHAT + "|[" + name + "]" + data);
						}
						break;
						case Function.EXIT:
						{
							messageAll(Function.WAITCHAT + "|[알림 ☞]" + name + "님 퇴장하셨습니다");
							messageAll(Function.EXIT + "|" + id);
							
							// id를 테이블에서 제거
							for(int i=0;i<waitVC.size();i++)
							{
								Client client=waitVC.get(i);
								if(client.id.equals(id))
								{
									messageTo(Function.MYEXIT + "|");
									waitVC.remove(i);
									try
									{
										// 송수신 종료
										in.close();
										out.close();
									}catch(Exception ex) {}
									break;
								}
							}
						}
						break;
					}
				}
			}catch(Exception ex) {}
		}
		
		// 처리 방식 => 2개
		// 1. 접속자 전체로 전송 => 로그인(먼저 로그인 한 사람)/나가기(남아 있는 사람)/채팅
		public synchronized void messageAll(String msg)
		{
			// synchronized => 동기방식(스레드)
			try
			{
				for(Client client:waitVC)
				{
					client.messageAll(msg);
				}
			}catch(Exception ex) {}
		}
		
		// 2. 로그인, 나가기
		public synchronized void messageTo(String msg)
		{
			try
			{
				out.write((msg + "\n").getBytes());
			}catch(Exception ex) {}
			
			
		}
	}

}