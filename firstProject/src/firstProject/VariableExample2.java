package firstProject;

public class VariableExample2 {

	public static void main(String[] args) {
		// 이름, 나이, 참/거짓
		int age = 25;
		int myAge = 26;
		String name = "정민규";
		boolean whatAge;
		whatAge = age <= myAge;
		
		// age < 나이 => 25세 이상
		
		// age > 나이 => 25세 이하
		
		if(whatAge) {
			System.out.println(name + "은 25세 이상.");
		}
		
		whatAge = age >= myAge;
		
		if(whatAge) {
			System.out.println(name + "은 25세 이하.");
		}
		
		System.out.println("end of prog");
	}

}
