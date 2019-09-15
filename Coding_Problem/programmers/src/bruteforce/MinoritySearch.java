package bruteforce;

import java.util.HashSet;
import java.util.Set;

public class MinoritySearch {
	public static void main(String[] args) {
		SolutionMinoritySearch su = new SolutionMinoritySearch();
//		String numbers = "17";	// 3
//		String numbers = "011";	// 2
		String numbers = "1234";	// 14
		System.out.println("answer : " + su.solution(numbers));
	}
}
class SolutionMinoritySearch {
    public int solution(String numbers) {
        int answer = 0;
        int[] arr = new int[numbers.length()];
        for(int i=0; i<arr.length; i++)
        	arr[i] = numbers.charAt(i) - '0';
        // 만들수 있는 모든 순열 조합 찾아 Set 객체에 중복없이 저장
        Set<Integer> set = new HashSet<>();
        for(int i=1; i<=arr.length; i++) {
        	permutation(set, arr, 0, i);
        }
//        System.out.println(set);
        // 소수에 해당하는 숫자만 false로 저장 후 개수 세기
        boolean[] primes = prime();
        for(int num : set) {
        	answer = primes[num] ? answer : answer+1;
//        	System.out.println("num : " + num + ", primes[num] : " + primes[num]);
        }
        return answer;
    }
    static boolean[] prime() {
    	boolean[] primes = new boolean[10000000];
    	primes[0] = primes[1] = true;
    	for(int i=2; i<primes.length; i++) {
    		if(!primes[i]) {
    			for(int j=2; j*i<primes.length; j++) {
    				primes[i*j] = true;
    			}
    		}
    	}
    	return primes;
    }
    static void permutation(Set<Integer> set, int[] arr, int index, int r) {
    	if(index == r)
    		set.add(createInteger(arr, r));
    	else {
    		for(int i=0; i+index < arr.length; i++) {
    			swap(arr, index, index+i);
    			permutation(set, arr, index+1, r);
    			swap(arr, index, index+i);
    		}
    	}
    }
    static int createInteger(int[] arr, int r) {
    	StringBuilder sb = new StringBuilder();
    	for(int i=0; i<r; i++)
    		sb.append(arr[i]);
    	return Integer.parseInt(sb.toString());
    }
    static void swap(int[] arr, int a, int b) {
    	int tmp = arr[a];
    	arr[a] = arr[b];
    	arr[b] = tmp;
    }
}