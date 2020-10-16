package javaapp1016;

public class UserMain {

	public static void main(String[] args) {
//		//인스턴스 생성
//		//프로그램 내에서 인스턴스를 1개만 만드는 경우
//		//인스턴스 이름을 클래스 이름으로 하는데 첫글자를 소문자로 변경
//		//User()는 생성자를 호출하는 것이다(Class를 호출하는 것이 아니다)
//		User user = new User();
//		
//		user.setNum(7);
//		user.setId("leejae");
//		user.setPw("123456");
//		user.setNickname("나이스");
//		user.setName("이 재원");
		
//		//속성의 값을 가져올 때는 get메소드를 이용
//		System.out.printf("%s\n",user.getId());
//		//전체를 확인 - toString을 호출해서 출력 println(user);
//		System.out.println(user);
//		
//		//오버로딩
//		User user1 = new User(8,"lol","3637","맨","홍 길동");
//		System.out.println(user1);
//		

		
		//3개의 User 인스턴스를 저장할 배열로 생성
		User[] users = new User[3];
		//배열에 데이터를 대입
		users[0] = new User(1,"lje","123","wo","이 재원");
		users[1] = new User(2,"ljee","456","won","재원");
		
		User user = new User();
		user.setNum(3);
		user.setId("ljeee");
		user.setPw("789");
		user.setNickname("wowo");
		user.setName("이");
		users[2] = user;
		
		//users의 모든 데이터에 접근해서 출력
		for(User temp : users) {
			System.out.println(temp);
		}

	}

}
