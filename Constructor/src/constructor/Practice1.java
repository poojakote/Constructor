package constructor;

public class Practice1 {
	
	//constructor of class
		public Practice1() {
			this("Pune");
			System.out.println("No argument constructor");
		}
		//2 constructor
		public Practice1(int x) {
			System.out.println("Int type argument constructor");
		}
		public Practice1 (String s) {
			this(10);
			System.out.println("String type argument constructor");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Practice1 ref =new Practice1();
	
	}

}
