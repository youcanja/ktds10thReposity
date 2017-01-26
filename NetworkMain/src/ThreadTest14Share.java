import java.util.Scanner;

public class ThreadTest14Share {
	
	Scanner input = new Scanner(System.in);
	//문제
	String[] nameList ={"인병주","InbyeongJoo","印昞柱"};
	boolean [] corretList = {false,false,false};
	
	//답
	String answer;
	int answerNumber;
	
	
	//boolean isInput= false;
	
	
	void play(){
		
		//입력 쓰레드 입력 시작
		while(true){
			
			System.out.print("입력 :");
			answer=input.next();
			
			for(int i=0; i<nameList.length;i++){
				//찾기
				if(nameList[i].equals(answer)){
					corretList[i]=true;
					answerNumber++;
				}
			}
			if(answerNumber==3)
				break;
			
		}
		
		
		
	}

}
