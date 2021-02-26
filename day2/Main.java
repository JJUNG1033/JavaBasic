package day2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ###회원가입창####");
		join();
		
		
		
	}

	public static void join() {
		Scanner sc = new Scanner(System.in);
		System.out.println("~~~회원가입 창~~~~");
		System.out.println("ID 입력");
		String id = sc.next();
		System.out.println("비번 입력");
		String pw= sc.next();
		User u= new User();
		u.setId(id);
		u.setPw(pw);
		System.out.println("가입정보 : ID:  "+u.getId()+", PW:"+u.getPw());
		login(u);
		
		}

	public static void login(User u) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--로그인 창--");
		//System.out.println("ID 입력");
		//System.out.println("비번 입력");
		
		String id = u.getId();
		String pw = u.getPw();
		System.out.println("가입정보 : ID:  "+id+", PW:"+pw);
	}

	
	
		public static void pass() {
			Scanner sc = new Scanner(System.in);
			System.out.println("패스워드 창");
			String pw = sc.next();
			if(pw.equals("1")) {System.out.println("로그인 성공");}
		
		}
		
			
	}

