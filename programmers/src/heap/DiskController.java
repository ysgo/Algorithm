package heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DiskController {
	public static void main(String[] args) {
		SolutionDiskController su = new SolutionDiskController();
//		int[][] jobs = { { 0, 3 }, { 1, 9 }, { 2, 6 } }; // 9ms
		int[][] jobs = { { 0, 5 }, { 1, 2 }, { 5, 5 } }; // 6ms
//		int[][] jobs = {{0, 9}, {0, 4}, {0, 5}, {0, 7}, {0, 3}};	// 13ms
		System.out.println(su.solution(jobs));
	}
}

class SolutionDiskController {
	public int solution(int[][] jobs) {
		int answer = 0;
		Arrays.sort(jobs, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		PriorityQueue<Work> qu = new PriorityQueue<>();
		for (int i = 0; i < jobs.length; i++) {
			qu.add(new Work(jobs[i][0], jobs[i][1]));
		}
		int len = jobs.length;
		int curTime = 0;
		Work tmp;
		while (!qu.isEmpty()) {
			tmp = qu.poll();
			curTime += tmp.workTime;
			answer += curTime - tmp.start;
		}
//		while(true) {
//            while(idx < len && jobs[idx][0] <= current) {
//                pq.add(new Job(jobs[idx][0], jobs[idx][1]));
//                idx++;
//            }
//            if(pq.isEmpty()) {
//                if(idx == len){
//                    break;
//                }else {
//                    current++;
//                }
//            }else {
//                Job j = pq.poll();
//                current += j.time;
//                total += current - j.start;
//            }
//        }
		return answer / len;
	}
}

class Work implements Comparable<Work> {
	int start;
	int workTime;

	Work(int start, int workTime) {
		this.start = start;
		this.workTime = workTime;
	}

	public int compareTo(Work o) {
		return this.workTime - o.workTime;
	}

//	@Override
//	public int compareTo(Work o) {
//		if(this.workTime > o.workTime) {
//			return 1;
//		} else if(this.workTime < o.workTime) {
//			return -1;
//		} else {
//			if(this.start > o.start) {
//				return 1;
//			} else {
//				return -1;
//			}
//		}
//	}

	@Override
	public String toString() {
		return "Work{" + "start=" + start + ", workTime=" + workTime + "}";
	}
}