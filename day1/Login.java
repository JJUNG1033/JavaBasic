package day1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		System.out.println("Login");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID �Է�");
		String id = sc.next();     
		System.out.println("PW �Է�");
		String pw = sc.next(); 
		final String WRONG = "Ʋ���ϴ�";
		if(pw.equals("kim") && pw.equals("1")) {
			System.out.println("�α��μ���");}
		else if(!id.equals("kim") && pw.equals("1")){
			System.out.println("ID��"+WRONG);}
		else if(id.equals("kim") && !pw.equals("1")){
			System.out.println("pw��"+WRONG);}
		else{System.out.println("ID PW "+WRONG);}
	}

}


