package day1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		System.out.println("Login");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID 입력");
		String id = sc.next();     
		System.out.println("PW 입력");
		String pw = sc.next(); 
		final String WRONG = "틀립니다";
		if(pw.equals("kim") && pw.equals("1")) {
			System.out.println("로그인성공");}
		else if(!id.equals("kim") && pw.equals("1")){
			System.out.println("ID가"+WRONG);}
		else if(id.equals("kim") && !pw.equals("1")){
			System.out.println("pw가"+WRONG);}
		else{System.out.println("ID PW "+WRONG);}
	}

}


