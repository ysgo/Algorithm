package dynamic;
// DP(동적 프로그래밍) 사용의 유용한 예제
// 메모이제이션 : 한 번 해를 구한 함수를 두 번 사용하지 않고 공간을 할당하여 두 번 함수를 사용하지 않는 기법

public class Stealing {
	public static void main(String[] args) {
		SolutionStealing su = new SolutionStealing();
		int[] money = {1, 2, 3, 1};
//		int[] money = {1, 2, 3, 1, 5};
		System.out.println(su.solution(money));
	}
}
class SolutionStealing {
    public int solution(int[] money) {
        // 첫번째 집 털기
//    	List<Integer> list = new ArrayList<>();
    	int[] sum = new int[money.length];
        int first = money[0];
        int max=0;
        for(int i=2; i<money.length-1; i++) {
//        	int sum = first+money[i];
//        	if(max < sum)
//        		max = sum;
        	if(first + sum[i] < sum[i]) {
        		
        	}
        }
        // 두번째 집 털기
        first = money[1];
        for(int i=3; i<money.length; i++) {
//        	int sum = first+money[i];
//        	if(max < sum)
//        		max = sum;
        }
        return max;
    }
}