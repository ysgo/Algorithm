package greedy;

import java.util.Arrays;

// 다른 깔끔한 풀이법
public class LifeBoat_Solution {

	public static void main(String[] args) {
		MainLifeBoat su = new MainLifeBoat();
		int[] people = { 70, 50, 80, 50, 40, 120,90, 50 };
//		int[] people = { 70, 80, 50 };
		int limit = 100;
		System.out.println(su.solution(people, limit));
	}
}
class MainLifeBoat {
	public int solution(int[] people, int limit) {
		// 1번째
		Arrays.sort(people);
        int i=0,  j = people.length-1;
        while(i<j) {
            if (people[i] + people[j] <= limit) i++;
            j--;
        }
        return people.length - i;
	}
}
