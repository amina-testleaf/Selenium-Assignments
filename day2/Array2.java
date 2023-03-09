package week1.day2;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] subjects = {"Tamil", "English", "Maths"};
Arrays.sort(subjects);
int len = subjects.length;
System.out.println(len);

for (int i = 0; i <len; i++) {
	
	System.out.println(subjects[i]);
	
}

	}

}
