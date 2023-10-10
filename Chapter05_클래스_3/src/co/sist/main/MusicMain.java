package co.sist.main;
import java.util.*; // Scanner
import java.io.*; // 파일 입출력
// 일반 데이터형 
class Music
{
	String rank;
	String title;
	String singer;
	String album;
	String key;
}
// 데이터형 모아서 관리
class MusicData
{
	Music[] musics=new Music[49];
	// 사용자 정의 데이터형 = 기본형처럼 사용가능
	// 초기화 
	// 1. 초기화 블록
	// 2. 생성자
	//{구현이 가능} => 초기화 블록 => 자동 생성
	{
		// 예외처리 => 에러를 미리 방지 => check ,uncheck
		try
		{
			FileReader fr=
					new FileReader("c:\\javaDev\\genie.txt");
			String data="";
			int i=0; // 1글자씩 => 정수형으로 읽어옴 => char로 변환
			while((i=fr.read())!=-1)
			{
				// -1 파일의 끝 => EndOfFile
				data+=(char)i;
			}
			fr.close(); // 파일 닫기
			//System.out.println(data);
			String[] datas=data.split("\n");
			i=0;
			for(String s:datas)
			{
				String[] ss=s.split("\\|");
				musics[i]=new Music();
				if(ss[0].equals("47"))
					continue;
				musics[i].rank=ss[0];
				musics[i].title=ss[1];
				musics[i].singer=ss[2];
				musics[i].album=ss[3];
				musics[i].key=ss[4];
				i++;
			}
		}catch(Exception ex) {}
	}
}
// 제어
public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicData md= new MusicData();
		System.out.println("============ 뮤직 TOP 50 ===========");
		for(int i=0;i<md.musics.length-1;i++)
		{
			System.out.println("순위 :"+md.musics[i].rank);
			System.out.println("곡명 :"+md.musics[i].title);
			System.out.println("가수명 :"+md.musics[i].singer);
			System.out.println("앨범 :"+md.musics[i].album);
			System.out.println("동영상 키 :"+md.musics[i].key);
			System.out.println("==============================");
		}
		Scanner scan=new Scanner(System.in);
		System.out.println("동영상 선택 (1~50=>47 제외) :");
		int mno=scan.nextInt();
		Music mm=md.musics[mno-1];  //index 번호로 찾기
		System.out.println("======== 상세보기 ========");
		System.out.println("순위 :"+mm.rank);
		System.out.println("곡명 :"+mm.title);
		System.out.println("가수명 :"+mm.singer);
		System.out.println("앨범명 :"+mm.album);
		System.out.println("동영상을 실행할까요? (y|n):");
		char c=scan.next().charAt(0);
		if(c=='y' || c=='Y')
		{
			try
			{
				Runtime.getRuntime().exec("\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\"" +
			 "http://youtube.com/embed/"+mm.key);
			}catch(Exception ex) {}
		}
		else
		{
			System.out.println("프로그램 종료!!");
		}
		
	}

}
