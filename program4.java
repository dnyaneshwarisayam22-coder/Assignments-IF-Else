import java.util.*;

class C2W3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Alphabet: ");
		char ch = sc.next().charAt(0);
		
		if(ch >= 65 && ch <= 90){
			System.out.println(ch + " is an UPPERCASE character");
		}else if(ch >= 97 && ch <= 122){
			System.out.println(ch + " is a lowercase character");
		}else{
			System.out.println(ch + " is not an alphabet");
		}
	}
}

