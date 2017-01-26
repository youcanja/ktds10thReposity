package com.ktds.ibj;

public class Person {
	private String name;
	private String job;
	
	/**
	 * 
	 * 기본 생성자
	 * Default Constructor
	 * ------------------------------------
	 * 멤버변수 값 초기화
	 * 
	 */
	
	// 생성자 오버로딩 ( 이름, 리턴값이 같고 파라미터가 다른 것)
	public Person(){
		System.out.println("Person  기본 생성자 실행됨!");
		name = "이름 없음";
		job = "알 수 없음";
	}
	
	/**
	 * 생성자 오버로딩
	 * 기본생성자에 파라미터를 추가해 데이터를 초기화 시킨다.
	 * @param name
	 * @param job
	 */
	public Person(String name, String job){
		System.out.println("Person 생성자 실행됨!");
		this.name = name;
		this.job = job;
		
	}
	//데이터베이스와 연동할 경우 , 데이터베이스에 관련된 것에서는 생성자 오버로딩을 잘 쓰지 않음 
	
	
	public void setJob(String job){
		this.job=job;
	}
	public void setName(String name){
		this.name=name;
	}
	public void introduce(){
		String message = String.format("이름 : %s ,  직업 : %s" , name,job);
		System.out.println(message);
	}

//	생성자 오버로딩
//		 * 기본생성자에 파라미터를 추가해 데이터를 초기화 시킨다.
}
