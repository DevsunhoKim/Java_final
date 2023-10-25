package com.sist.lib;
/*
 *  338p => 제네릭
 *   제네릭 : 데이터형을 통일화 (기존에 설정된 데이터를 변경)
 *      => 기본형은 사용할 수 없고 클래스형만 사용이 가능
 *         --------------------------
 *          => Wrapper 를 이용해서 기본형을 사용할 수 있게 만든다
 *    <클래스형> => 자바에서는 컬렉션 => Object로 설정이 되어있다
 *                             ------- 지정된 클래스형으로 변경
 *    <T> => type (클래스형)
 *    <E> => element (요소)
 *    <K> => key
 *    <V> => value
 *    
 *    List<E>
 *    Vector<E>
 *    Set<E>
 *    Map<K,V>
 *    
 *    장점 => 소스 간결해진다 => 형변환이 필요없다
 *    단점 => 무조건 지정된 데이터형만 첨부
 *    ArrayList => Object
 *    ArrayList<String> => String
 *    ArrayList<Integer> => int ArrayList<int> ==> 오류
 *    ArrayList<Music> => Music => 사용자 정의 클래스도 가능
 *    => 저장된 데이터는 같은 데이터형을 사용해야 편리하다
 */
class Data<T>
{
	private T t; //T가 없는 경우는 자동으로 Object
	public void setT(T t)
	{
		this.t=t;
	}
	public T getT()
	
	{
		return t;
	}
}
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data=new Data(); // 경고 메시지
		Data<String> d=new Data<String>();
		
	}

}
