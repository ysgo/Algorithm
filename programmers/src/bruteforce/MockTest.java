package bruteforce;

import java.util.ArrayList;

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
    	int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
    	int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    	int[] cnt = new int[3];
    	for(int i=0; i<answers.length; i++) {
    		if(answers[i] == first[i%5])
    			cnt[0]++;
    		if(answers[i] == second[i%8])
    			cnt[1]++;
    		if(answers[i] == third[i%10])
    			cnt[2]++;
    	}
    	ArrayList<Integer> arr = new ArrayList<>();
//    	int max = cnt[0];
//    	for(int i=0; i<cnt.length; i++) {
//    		if(cnt[i] > max)
//    			max = cnt[i];
//    	}
    	int max = Math.max(Math.max(cnt[0], cnt[1]), cnt[2]);
    	for(int i=0; i<cnt.length; i++) {
    		if(cnt[i] == max) {
    			arr.add(i);
    		}
    	}
    	int[] answer = new int[arr.size()];
    	for(int i=0; i<arr.size(); i++) {
    		answer[i] = arr.get(i)+1;
    	}
        return answer;
    }
}
/* 다른 풀이법 1 
 *  int[] answer = {};

		ArrayList<Integer> list = new ArrayList<>();
		
		int[][] people = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
		
		for(int i=0;i<people.length;i++) {
			list.add(0);
		}

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == people[0][i%people[0].length]) {
				list.set(0, list.get(0)+1);
			}
			if (answers[i] == people[1][i%people[1].length]) {
				list.set(1, list.get(1)+1);
			}
			if (answers[i] == people[2][i%people[2].length]) {
				list.set(2, list.get(2)+1);
			}
		}
		
		int max = Collections.max(list);
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			if(max==list.get(i)) {
				result.add(i+1);
			}
		}
		
		answer = new int[result.size()];

		for(int i=0;i<result.size();i++) {
			answer[i]=result.get(i);
		}
		
		
		return answer; */

/* 다른 풀이법 2  
 * int[] answer = {};
	        int[][] method= {
	        		{1, 2, 3, 4, 5},
	        		{2, 1, 2, 3, 2, 4, 2, 5},
	        		{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
	        };
	        int len = method.length;
	        int[][] grades = new int[3][2];
	        for(int i= 0; i<len;i++) { 
	        	grades[i][0]=i+1;
	        	grades[i][1]=scoring(answers, method[i]); 	
	        }
	        for(int i= 0; i<3;i++) {  
	        	System.out.println(grades[i][1]+" "+grades[i][1]);
	        
        }
	        if(grades[1][1]>grades[0][1]&&grades[1][1]>grades[2][1])
	        	swap(grades, 1,2);
	        else if(grades[2][1]>grades[1][1]&&grades[2][1]>grades[2][1])
	        	swap(grades, 1,3);
	        if(grades[2][1]>grades[2][1])
	        	swap(grades, 2,3);
	        for(int i= 0; i<3;i++) {  
		        	System.out.println(grades[i][1]+" "+grades[i][1]);
		        
	        }
	        if(grades[0][1]>grades[1][1]) {
	        	answer = new int[1];
	        	answer[0] = grades[1][0];
	        }else if(grades[1][1]>grades[2][1]) {
	        	answer = new int[2];
	        	answer[0] = grades[0][0];
	        	answer[1] = grades[1][0];
	        }else {
	        	answer = new int[3];
	        	answer[0] = grades[0][0];
	        	answer[1] = grades[1][0];
	        	answer[2] = grades[2][0];
	        }
	       
	        return answer;
	    }
	   public static int scoring(int[] answers, int[] method) {
		   int grade = 0, len=method.length;
		   for(int i = 0; i<answers.length;i++) 
			   if(answers[i]==method[i%len])
				   grade++;
		   
		   return grade;
	   }
	   public static void swap(int[][] grades, int i, int j) {
		   int temp;
		   temp = grades[i][0];
		   grades[i][0] = grades[j][0];
		   grades[j][0] = temp;
		   temp = grades[i][1];
		   grades[i][1] = grades[j][1];
		   grades[j][1] = temp;
	   }
} */ 
