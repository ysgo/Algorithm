package greedy;

import java.util.ArrayList;

/*
 * 점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 
 * 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 
 * 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 
 * 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 
 * 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.

전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 
여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 
체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.

제한사항
전체 학생의 수는 2명 이상 30명 이하입니다.
체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 
남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
입출력 예
n	lost	reserve		return
5	[2, 4]	[1, 3, 5]	5
5	[2, 4]	[3]			4
3	[3]		[1]			2 */
public class GymClothes {
	public static void main(String[] args) {
		SolutionGymClothes su = new SolutionGymClothes();
		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = {1, 3, 5};	// 5
//		int n = 5;
//		int[] lost = { 2, 4 };
//		int[] reserve = { 3 };	// 4
//		int n = 3;
//		int[] lost = { 3 };
//		int[] reserve = { 1 };	// 2
		System.out.println(su.solution(n, lost, reserve));
	}
}
class SolutionGymClothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;	// 현재 수업 가능한 인원 수 
        ArrayList<Integer> lo = new ArrayList<>();
        ArrayList<Integer> re = new ArrayList<>();
        for(int data : lost)
        	lo.add(data);
        for(int data : reserve)
        	re.add(data);
//        System.out.print(lo + " ");
//        System.out.print(re + " ");
        if(!lo.isEmpty()) {	// 체육복을 잃어버렸지만 여벌이 있는사람 
        	for(int i=0; i<lo.size(); i++) {
        		for(int j=0; j<re.size(); j++) {
        			if(lo.get(i) == re.get(j)) {
        				lo.remove(i);
        				re.remove(j);
        				i--;
        				answer++;
        				break;
        			}
        		}
        	}
        }
        if(!lo.isEmpty()) {	// 체육복이 여분이 있어 잃어버린 사람에게 빌려줄수 있는 사람 
        	for(int i=0; i<lo.size(); i++) {
        		for(int j=0; j<re.size(); j++) {
        			if(lo.get(i)-1 == re.get(j) || lo.get(i)+1 == re.get(j)) {
        				re.remove(j);
        				answer++;
        				break;
        			}
        		}
        	}
        }
        /* HashSet으로 해결(HashMap도 key에 대한 value값으로 0,1,2 비교하는 방식으로 해결) 
         *  int answer=n-lost.length;
        HashSet<Integer> ko = new HashSet<Integer>();
        for(int k : reserve) {
            ko.add(k);
        }
        for(int i =0;i<lost.length;i++) {
            if(ko.contains(lost[i])) {
                answer++;
                ko.remove(lost[i]);
                lost[i]=-1;
            }
        }


        for(int i =0;i<lost.length;i++) {
            //System.out.println(i);

            if(ko.contains(lost[i]-1)) {
                answer++;
                ko.remove(lost[i]-1);
            }else if(ko.contains(lost[i]+1)) {
                answer++;
                ko.remove(lost[i]+1);
            }
        }         */
        return answer;
    }
}