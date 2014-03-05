package Car;



public abstract class Car {
	
		private String color;
		private String name;

	
	public void setColor(String col){    // делаем так сказать ссылку на то что б переменную задать с дочернего класса
		this.color=col;
			
	}
	
	public String getColor(){
		return this.color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
