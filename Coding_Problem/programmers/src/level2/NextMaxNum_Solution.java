package level2;

public class NextMaxNum_Solution {
	public static void main(String[] args) {
		OtherSolutionNextMaxNum su = new OtherSolutionNextMaxNum();
		int n = 78;
		System.out.println(su.nextBigNumber(n));
	}
// 1번째 soltion 간결 코드
	public int nextBigNumber(int n) {
		int postPattern = n & -n, smallPattern = ((n ^ (n + postPattern)) / postPattern) >> 2;
		return n + postPattern | smallPattern;
	}
}

// 2번째 solution bitCount를 사용한 방법
class OtherSolutionNextMaxNum {
	public int nextBigNumber(int n) {
		int a = Integer.bitCount(n);
		int compare = n + 1;

		while (true) {
			if (Integer.bitCount(compare) == a)
				break;
			compare++;
		}

		return compare;
	}
}