package constructor;

public class Practice3 {

	String name;
	String color;
	int price;
	//constructor of class to initialize instance data members
	public Practice3 (String name, String color, int price) {
		this.name=name;
		this.color=color;
		this.price=price;
	}
	public void getCarInfo() {
		System.out.println("Name of car " + name);
		System.out.println("Having color " + color);
		System.out.println("with price " + price);
	}
}
