package Car;

import java.util.Random;


public class SennaCar extends Car {

	
	public SennaCar(){

		setColor("Зеленая");
		setName("Гонщик Сенна");

		Random rand = new Random();
	      
		

	    	

		System.out.println("Поехала " +getColor()+ " машина Сенны. " + "Со скоростью " + (rand.nextInt(300)) + " км/час.");
		
//		if (b = rand.nextInt(300) <max ){
//			System.out.println(max);
//		}
		
		}

	
	
}
