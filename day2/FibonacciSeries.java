package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//0 1 1 2 3 5 8 13 21
		
		int firstnum = 0;
		int secnum = 1;
		int sum =0; 
		System.out.println(firstnum);//0
		System.out.println(secnum);//1
		
		for (int i = 1; i <= 11; i++) {
			
			sum = firstnum+secnum; //1
			firstnum = secnum; //1
			secnum = sum;
			System.out.println(sum);						
		}
				
		
	}

}
