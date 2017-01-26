
public class ThreadTest14_1 extends Thread {
	
	ThreadTest14Share ts;
	
	public void run(){
		
		while(true){
		for(int i=0; i<ts.nameList.length;i++){
			try {
				if(!ts.corretList[i])
					System.out.println(ts.nameList[i]);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(ts.answerNumber==ts.nameList.length)
				System.out.println("종료합니다.");
			}
		
		}
		
	}

}
