
public class StockClass {
	static float stockPrice=100;
	public static void main(String[] args)
	
	{
		Thread1 p = new Thread1();
		Thread2 n= new Thread2();
		p.start();
		try{
			Thread.sleep(50);
		}
		catch(InterruptedException e){
		
			System.out.println("pressed Control+C");
			return;
		};
		n.start();
		
		try{
		p.join();
		n.join();
		}
		
		catch(InterruptedException e){
			System.out.println("Error!");
		};
		System.out.println("Day ended. Stock price exit value is="+StockClass.stockPrice);
	}
}
