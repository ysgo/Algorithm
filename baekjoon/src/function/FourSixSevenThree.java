// 함수 문제
public class FourSixSevenThree {
	static int dn(int i) {
		int n = i;
		while(i != 0) {
			n += i % 10;
			i /= 10;
		}
		return n;
	}
	public static void main(String[] args) {
		boolean[] nSelf = new boolean[10000];
		for(int i=0; i<10000; i++) {
			if(dn(i) < 10000)
				nSelf[dn(i)] = true;
		}
		for(int i=0; i<10000; i++) {
			if(nSelf[i] == false)
				System.out.println(i);
		}
	}
}
