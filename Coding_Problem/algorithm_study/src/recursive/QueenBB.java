package recursive;

/* 각 행, 열에 1개의 퀸을 배치하는 조합을 재귀적으로 나열
 * 가지 뻗기 방식으로는 퀸을 배치하는 조합을 나열만 가능, 8퀸 문제의 답을 얻을 수는 없음
 * 한정(bounding) 조작 = 필요하지 않은 분기를 없애 불필요한 조합을 줄이는 방법
 * 분기 한정법 = 가지 뻗기와 한정 조작을 조합하여 문제를 풀어가는 방법	
 */

// 퀸의 행 방향과 열 방향으로 겹쳐지지 않는 조합을 나열하기만 하는 클래스(8룩 문제를 해결했다고 할수 있음)
public class QueenBB {
	static boolean[] flag = new boolean[8];		// 각 행에 퀸을 배치했는지 체크
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
			if(flag[j] == false) {	// j행에는 퀸을 아직 배치하지 않았다면
				pos[i] = j;			// 퀸을 j행에 배치한다
				if(i == 7)			// 모든 열에 배치한 경우
					print();
				else {
					flag[j] = true;
					set(i + 1);
					flag[j] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
}
