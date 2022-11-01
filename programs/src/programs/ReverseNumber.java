package programs;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(args[0]);
		int reverse = 0;
		while(number!=0) {
			reverse = reverse * 10 + number%10;
			number = number/10;
		}
		System.out.println("Reverse of given number is "+reverse);
		
		
		

	}

}
