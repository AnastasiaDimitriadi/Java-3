
public class Thread1 extends Thread{
	public void run(){
		int i;
			for(i=1;i<=5;i++){
			//diplasiasmos ths stock
				StockClass.stockPrice=StockClass.stockPrice*2;
			// emfanish diplasiasmoy
				System.out.println("Doubled price. New value="+StockClass.stockPrice);
			// thread to sleep for 3 milliseconds
				try{
					Thread.sleep(3000);
				}
				catch(InterruptedException e){
				
					System.out.println("pressed Control+C");
					return;
				};
				
			}
		}

}
