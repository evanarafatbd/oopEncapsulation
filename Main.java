package oopEncapsulation;

public class Main {
	
	public static void main(String [] args) {
		
		TV myTV = new TV();
		
		myTV.setTvName("Sony");
		myTV.setPixle(1080);
		myTV.setPrice(999.99);
		
		
		System.out.println("My new TV's name is "+ myTV.getTvName()
		+ " with a mega pixle of "+ myTV.getPixle()+" and cost me $"+
		myTV.getPrice());
		
		
		
		
		
		
		
		
	}
	

}
