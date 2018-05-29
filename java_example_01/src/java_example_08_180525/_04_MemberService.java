package java_example_08_180525;

public class _04_MemberService {

	
	
	_04_MemberService(){
		
	}
	
	boolean login(String id, String password){
		if(id.equals("yourid") && password.equals("12345")){
			return true;
		} else {
			return false;
		}
	}
	void logout(String password) {
		System.out.println("로그아웃 되었습니다.");	
	}

	
	
	
	
}
