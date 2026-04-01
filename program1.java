import java.util.*;

class C2W{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
				int num = sc.nextInt();
				if(num > 0){
					System.out.println(num + "is positive number");
				}else if(num < 0){
					System.out.println(num + "is negative number");
				}else{
					System.out.println(num + "is neutral");
				}
	}
}

