package codingtest.easysoft;

public class ESTProblem3 {
	public static String solution(int U, int L, int[] C) {
		String answer = null;
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		int[][] matrix = new int[2][C.length];
		int cnt = 0; int tmp1 = U; int tmp2 = L;
		for(int i=0; i<C.length; i++) {
			if(C[i] == 2) {
				matrix[0][i] = matrix[1][i] = 1;
				tmp1--; tmp2--;
			} else if(C[i] == 0) {
				matrix[0][i] = matrix[1][i] = 0;
			} else {
				if(cnt % 2 == 0 & tmp1 != 0 | tmp2 == 0) {
					matrix[0][i] = 1;
					matrix[1][i] = 0;
					tmp1--;
				} else {
					matrix[0][i] = 0;
					matrix[1][i] = 1;
					tmp2--;
				}
				cnt++;
			}
			sb1.append(matrix[0][i]);
			sb2.append(matrix[1][i]);
		}
//		System.out.println(sb1.toString());
//		System.out.println(sb2.toString());
		if(getLength(sb1) == U && getLength(sb2) == L) {
			answer = sb1.toString() + "," + sb2.toString();
		} else {
			answer = "IMPOSSIBLE";
		}
		return answer;
    }
	public static int getLength(StringBuilder s) {
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
//		int U = 3;
//		int L = 2;
//		int[] C = {2, 1, 1, 0, 1};		// 11001, 10100
//		int U = 2;
//		int L = 3;
//		int[] C = {0, 0, 1, 1, 2};		// IMPOSSIBLE		
//		int U = 2;
//		int L = 2;
//		int[] C = {2, 0, 2, 0};			// 1010, 1010
		int U = 3;
		int L = 1;
		int[] C = {1,1,1,1};			// 1010, 1010
		System.out.println(solution(U, L, C));
	}
}
