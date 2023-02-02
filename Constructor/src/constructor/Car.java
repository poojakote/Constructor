package constructor;

public class Car {
	String name;
	String color;
	int price;
	//constructor of class to initialize instance data members
	public Car (String name, String color, int price) {
		this.name=name;
		this.color=color;
		this.price=price;
	}
	public void getCarInfo() {
		System.out.println("Name of car " + name);
		System.out.println("Having color " + color);
		System.out.println("with price " + price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object of class
				Car var =new Car("BMW", "RED",7000000);
				var.getCarInfo();
				Car var1 =new Car ("AUDI", "PURPLE", 8000000);
				var1.getCarInfo();
	}

}
