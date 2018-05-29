package java_example_08_180525;

import java.util.Scanner;

public class _03_MemberServiceExample {

	public static void main(String[] args) {

		String id;
		String password;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디입력");
		id=scan.nextLine();
		System.out.println("패스워드입력");
		password=scan.nextLine();
		
		
		_04_MemberService memberService = new _04_MemberService();
		
		boolean result = memberService.login(id, password);
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("yourid");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		

	}

}
