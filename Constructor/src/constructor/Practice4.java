package constructor;

public class Practice4 {

	Car ref;
	//constructor of class
	public Practice4() {
		 ref =new Car("AUDI", "BlACK", 7500000);
	}

	public void getInfo() {
		ref.getCarInfo();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Practice4 var =new Practice4();	
		var.getInfo();	

	}

}
