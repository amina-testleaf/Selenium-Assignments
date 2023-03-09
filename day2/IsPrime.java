package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 15;
		for (int i = 2; i <= input; i++) {
			
			if(input%i==0)
				System.out.println("non Prime");
			break;
		}
				System.out.println("IsPrime");
	}

}
