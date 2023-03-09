package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] scores = {90,99,100,100,87};
int len= scores.length;

System.out.println("The lenght of array is " + len);
System.out.println("The third element is " + scores[2]);

for (int i = 0; i < len; i++) {
	System.out.println(scores[i]);
	
}
		Arrays.sort(scores);
System.out.println("The min value is " + scores[0]);
System.out.println("The max value is " + scores[len-1]);
	}

}
