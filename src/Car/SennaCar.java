package Car;

import java.util.Random;


public class SennaCar extends Car {

	
	public SennaCar(){

		setColor("�������");
		setName("������ �����");

		Random rand = new Random();
	      
		

	    	

		System.out.println("������� " +getColor()+ " ������ �����. " + "�� ��������� " + (rand.nextInt(300)) + " ��/���.");
		
//		if (b = rand.nextInt(300) <max ){
//			System.out.println(max);
//		}
		
		}

	
	
}
