package com.ktds.ibj;

public class PersonName {
	public static void main(String[] args){
		
		Person khw = new Person();
		khw.setName("김형우");
		khw.setJob("프로그래머");
		khw.introduce();
		
		Person ibj = new Person();
		ibj.setName("인병주");
		ibj.setJob("축구선수");
		ibj.introduce();
		
		Person pmw = new Person();
		pmw.setName("박민우");
		pmw.setJob("백수");
		pmw.introduce();
		
		//생성자를 만들고, 기본 데이터를 입력하지 않았을때.
		Person unknown = new Person();
		unknown.introduce();
		
		Person ksk = new Person("김슬기","감독");
		ksk.introduce();
		
		
		
		
	}
}
