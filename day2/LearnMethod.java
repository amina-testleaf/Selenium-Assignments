package week1.day2;

import io.cucumber.core.plugin.Format.Color;

public class LearnMethod {
	
	public int void bicycle() {
		// TODO Auto-generated method stub //short cut method-->Ctrl+space+enter - change private to public

		return 4;
	}
	
	public void bicyclecolor() {
		// TODO Auto-generated method stub

	}
	
	public void bicyclebrand(String brand) {
		// TODO Auto-generated method stub
System.out.println(brand);
		
	}
	
	public static void main(String[] args) {
		
		LearnMethod obj = new LearnMethod();
		
		System.out.println(obj.bicycle());
		obj.bicyclecolor();
		obj.bicyclebrand("Hero Cycle");
	}
}
