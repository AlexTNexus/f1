package Car;

import java.util.Random;


public class MarioCar extends Car {

	public MarioCar(){
		
		setColor("�����");
		setName("������ Mario");
	
		
		
		Random rand = new Random();
		      	
    	    	System.out.println("������� " +getColor()+ " ������ �����. " + "�� ��������� " + (rand.nextInt(300)) + " ��/���.");
	
    
	}


}
