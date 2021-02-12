package recursive;
// 8퀸 문제를 해결하는 클래스
// 퀸은 대각선 방향으로도 이동가능하기에 어떤 대각선에서도 퀸을 1개만 배치하는 한정 조작 추가필요
public class EightQueen {
	static boolean[] flag_a = new boolean[8];	// 각 행에 퀸을 배치했는지 체크
	static boolean[] flag_b = new boolean[15];	// /대각선 방향으로 퀸을 배치했는지 체크
	static boolean[] flag_c = new boolean[15];	// \대각선 방향으로 퀸을 배치했는지 체크
	static int[] pos = new int[8];				// 각 열의 퀸의 위치
	
	// 각 열의 퀸의 위치를 출력
	static void print() {
		for(int i=0; i<8; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	// i열의 알맞은 위치에 퀸을 배치
	static void set(int i) {
		for(int j=0; j<8; j++) {
			if(flag_a[j] == false &&				// 가로(j행)에 아직 배치되지 않음
					flag_b[i + j] == false &&		// 대각선 /에 아직 배치되지 않음
					flag_c[i - j + 7] == false) {	// 대각선 \에 아직 배치되지 않음
				pos[i] = j;			// 퀸을 j행에 배치
				if(i == 7)			// 모든 열에 배치되었다면
					print();
				else {
					flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
					set(i + 1);
					flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
}
