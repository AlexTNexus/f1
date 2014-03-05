package Car;

import java.util.Random;


public class MarioCar extends Car {

	public MarioCar(){
		
		setColor("Синяя");
		setName("Гонщик Mario");
	
		
		
		Random rand = new Random();
		      	
    	    	System.out.println("Поехала " +getColor()+ " машина Марио. " + "Со скоростью " + (rand.nextInt(300)) + " км/час.");
	
    
	}


}
