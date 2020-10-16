package javaapp1016;

public class FiboMain {
	
	//피보나치 수열을 재귀를 이용하지 않고 리턴하는 함수
	public static int noRecurion(int n) {
		int n1 = 1;
		int n2 = 1;
		int result = 1;
		
		for(int i=3; i<=n; i=i+1) {
			result = n1 + n2;
			n2 = n1;
			n1 = result;
		}
		return result;
	}
	
	//재귀를 이용한 피보나치 수열 메소드
	public static int recurion(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}else {
			return recurion(n - 1) + recurion(n -2);
		}
	}

	public static void main(String[] args) {
		System.out.println(noRecurion(100));
		System.out.println(recurion(10));

	}

}
