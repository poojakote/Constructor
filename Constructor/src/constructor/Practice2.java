package constructor;

//import java.util.Scanner;

public class Practice2 {
	String name;
	int rollNo;
	char div;
	public Practice2(String s, int i, char c) {
		name =s;
		rollNo=i;
		div=c;
	}
		public void getStudentInfo() {	
			System.out.println("Name of Student " + name);
			System.out.println("Roll no of student is " + rollNo);
			System.out.println("Div of student is " + div);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice2 ref =new Practice2("Rohan",12, 'A');         
        ref.getStudentInfo();
	}

}
