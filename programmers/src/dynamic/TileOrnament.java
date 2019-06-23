package dynamic;

/*
 * 대구 달성공원에 놀러 온 지수는 최근에 새로 만든 타일 장식물을 보게 되었다. 
 * 타일 장식물은 정사각형 타일을 붙여 만든 형태였는데, 한 변이 1인 정사각형 타일부터 시작하여 
 * 마치 앵무조개의 나선 모양처럼 점점 큰 타일을 붙인 형태였다. 
 * 타일 장식물의 일부를 그리면 다음과 같다.

그림에서 타일에 적힌 수는 각 타일의 한 변의 길이를 나타낸다. 
타일 장식물을 구성하는 정사각형 타일 한 변의 길이를 안쪽 타일부터 시작하여 차례로 적으면 다음과 같다.
[1, 1, 2, 3, 5, 8, .]
지수는 문득 이러한 타일들로 구성되는 큰 직사각형의 둘레가 궁금해졌다. 
예를 들어, 처음 다섯 개의 타일이 구성하는 직사각형(위에서 빨간색으로 표시한 직사각형)의 둘레는 26이다.

타일의 개수 N이 주어질 때, N개의 타일로 구성된 직사각형의 둘레를 return 하도록 solution 함수를 작성하시오.

제한 사항
N은 1 이상 80 이하인 자연수이다.
입출력 예
N	return
5	26
6	42 */
public class TileOrnament {
	public static void main(String[] args) {
		SolutionTileOrnament su = new SolutionTileOrnament();
//		int N = 3;	// 10
//		int N = 4;	// 16
		int N = 5;	// 26
//		int N = 6;	// 42
//		int N = 7;	// 68
//		int N = 8; // 110
		System.out.println(su.solution(N));
	}
}

class SolutionTileOrnament {
	public long solution(int N) {
		long answer = 3;		// N이 3일때의 가로+세로, 즉 두 길이의 합 
		long preNum = 2;		// N이 2일때의 두 길이의 합
		long[] arr = new long[N];
		arr[0] = 1; arr[1] = 1;
		if (N == 1) {			// N이 1이면 둘레가 4
			return 4;
		} else if (N == 2) {	// N이 2이면 둘레가 6 
			return 6;
		} else {
			for (int i = 2; i < N; i++) {	// 입력받은 N 길이만큼 반복
				long tmp = answer;			// 이전의 가로+세로의 합을 따로 저장 
				answer = answer + preNum;	// 현재와 이전의 가로+세로를 합하여 저장 
				preNum = tmp;				// 이전의 합의 값을 현재의 합으로 저장 
			}								// 정확성, 효율성 통과 
//			for(int i=2; i<N; i++) {
//				arr[i] = arr[i-1] + arr[i-2];
//				System.out.println(arr[i]);
//			}
//			answer = (arr[N-1] + arr[N-2]) + (arr[N-2] + arr[N-3]);		// 정확성 통과, 효율성 미통과
																		// long[]로 하니 효율성 통과 
		}
		return answer * 2;		// 둘레의 길이를 구하기에 가로+세로에 x2를 해줌 
	}
}