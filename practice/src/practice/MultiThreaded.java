package practice;

class DemoThread implements Runnable{
	String tname;
	Thread th;
	DemoThread(String thname){
		tname=thname;
		th=new Thread(this,tname);
		System.out.println("Mythread:"+th);
		th.start();
	}
	public void run(){
	try{
		for(int k=3;k>0;k--){
			System.out.println(tname+k);
			Thread.sleep(100);
		}
	}
	catch(InterruptedException ie){
		System.out.println(tname+"INTURRUPTED");
	}
	System.out.println(tname+"Exiting");
	}
}
class MultiThreaded{
	public static void main(String args[]){
		new DemoThread("First");
		new DemoThread("Second");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			System.out.println("Main inturrupted");
		}
		System.out.println("Main thread is exiting");
	}
}
