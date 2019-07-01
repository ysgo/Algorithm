package bruteforce;

import java.util.Arrays;

/*
 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
입출력 예
answers		return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3] */
public class MockTest {	
	public static void main(String[] args) {
		SolutionMockTest su = new SolutionMockTest();
//		int[] answer = {1,2,3,4,5};		// [1]
		int[] answer = {1,3,2,4,2};	// [1, 2, 3]
		for(int data : su.solution(answer))
			System.out.println(data);
	}
}
class SolutionMockTest {
    public int[] solution(int[] answers) {
    	int[] first = {1, 2, 3, 4, 5};
    	int[] second = {2, 1, 2, 3, 2};	//, 4, 2, 5};
    	int[] third = {3, 3, 1, 1, 2};	//, 2, 4, 4, 5, 5};
    	int[] cnt = new int[3];
    	for(int i=0; i<answers.length; i++) {
    		if(answers[i] == first[i])
    			cnt[0]++;
    		if(answers[i] == second[i])
    			cnt[1]++;
    		if(answers[i] == third[i])
    			cnt[2]++;
    	}
    	Arrays.sort(cnt);
    	int[] answer = {cnt[2]};
    	int max = answer[0];
    	if(max == cnt[0]) {
    		answer = new int[3];
    		answer[0] = cnt[2];
    		answer[1] = cnt[1];
    		answer[2] = cnt[0];
    	}
    	if(max == cnt[1]) {
    		answer = new int[2];
    		answer[0] = cnt[2];
    		answer[1] = cnt[1];
    	}
        return answer;
    }
}
