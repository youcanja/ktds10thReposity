
public class ThreadTest15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ThreadTest14_1 t1 = new ThreadTest14_1();
		ThreadTest14_2 t2 = new ThreadTest14_2();
		
		ThreadTest14Share ts = new ThreadTest14Share();
		
		t1.ts=ts;
		t2.ts=ts;
		
		t1.start();
		t2.start();
		
	}

}
