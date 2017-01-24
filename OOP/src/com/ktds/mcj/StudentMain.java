package com.ktds.mcj;

public class StudentMain {

	public static void main(String[] args) {
		
		Student sjm = new Student();
		
		sjm.introduce();
		
		//sjm.name = "고흥수";
		sjm.setName("고흥수");
		sjm.setGrade(1);
		sjm.setClassRoomNumber(206);
		sjm.setSchoolName("ktds university");
		
		String[] books = {"Angular.js2", "React.js"};
		sjm.setBooks(books);
		
		sjm.introduce();
		sjm.study();
		
		
		
	}
	
}
