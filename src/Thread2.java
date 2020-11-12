
public class Thread2 extends Thread{
	public void run(){
		int i;
			for(i=1;i<=5;i++){
			//meiwsh ths stock.price
				StockClass.stockPrice=StockClass.stockPrice -20;
			// emfanish diaforas
				System.out.println("Reduced price. New value="+StockClass.stockPrice);
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

