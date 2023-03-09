package week1.day2;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {2, 5, 7, 7, 5, 9, 2, 3};
		
		int len = num.length;
		Arrays.sort(num);
		
		for (int i = 0; i < len-1; i++) {
			
//			for (int j = i+1; j < len; j++) {
				
				if (num[i]==num[i+1]) {
					System.out.println("This number is duplicate : " +num[i]);
					
				} 
			}
			
		}
	}


