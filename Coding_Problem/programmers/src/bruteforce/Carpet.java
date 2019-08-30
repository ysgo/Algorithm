package bruteforce;

/*Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 빨간색으로 칠해져 있고
 *  모서리는 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.

image.png

Leo는 집으로 돌아와서 아까 본 카펫의 빨간색과 갈색으로 색칠된 격자의 개수는 기억했지만, 
전체 카펫의 크기는 기억하지 못했습니다.

Leo가 본 카펫에서 갈색 격자의 수 brown, 빨간색 격자의 수 red가 매개변수로 주어질 때 카펫의 가로,
 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한사항
갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
빨간색 격자의 수 red는 1 이상 2,000,000 이하인 자연수입니다.
카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
입출력 예
brown	red		return
10		2		[4, 3]
8		1		[3, 3]
24		24		[8, 6] */
public class Carpet {
	public static void main(String[] args) {
		SolutionCarpet su = new SolutionCarpet();
//		int brown = 10;
//		int red = 2;
//		int brown = 8;
//		int red = 1;
		int brown = 24;
		int red = 24;
		for (int answer : su.solution(brown, red))
			System.out.println(answer);
	}
}

class SolutionCarpet {
	public int[] solution(int brown, int red) {	
		int[] answer = new int[2];
		int iAllNum = brown + red;
	     int iHeight = 0;

	     for (int iBrownWidth = 1; iBrownWidth < brown; iBrownWidth++) {
	         iHeight = iAllNum/iBrownWidth;

	         if((iBrownWidth-2)*(iHeight-2) == red) {
	             answer[0] = iBrownWidth;
	             answer[1] = iHeight;
	         }
	     }
	     return answer;
	}
//  다른 풀이1
// for(int i=1; i<=red; i++) {
//     if(red%i==0 && (red/i+i)*2+4==brown) {
//         return new int[] {red/i+2, i+2};
//     }
// }
// return null;
	
// 		이 코드는 통과는 되고 테스트케이스가 실패					// 이전에 했던 i*j를 sum과 비교하여 break하는 코드는 
//		int[] answer = new int[2];						// 3개의 에러로 인해 규칙을 통한 풀이로 접근하는게 좋은것 같다 
//		int sum = brown + red;						// 반복횟수는 합보다는 red길이로만 해도 충분할듯하다 
//		int x = (brown - 2) / 2;						// 가로 길이 추출
//		int rFirst = x - 2;								// 중복되는 brown개수에 따른 red개수의 가장 작은 값 
//		for (int y = 3, i = 0; y <= red; x--,y++,i++) { // 세로길이는 최소 3부터 시작
//			if ((rFirst - i) * (i + 1) == red) {
//				answer[0] = x;
//				answer[1] = y;
//				break;
//			}
//		}
//		return answer;
}
