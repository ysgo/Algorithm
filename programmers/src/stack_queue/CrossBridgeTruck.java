package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class CrossBridgeTruck {
	public static void main(String[] args) {
		SolutionCrossBridgeTruck su = new SolutionCrossBridgeTruck();
//		int bridge_length = 2;
//		int weight = 10;
//		int[] truck_weights = {7, 4, 5, 6};	// 8
//		int bridge_length = 100;
//		int weight = 10;
//		int[] truck_weights = {10};	// 101
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};	// 110
		System.out.println("answer : " + su.solution(bridge_length, weight, truck_weights));
	}
}
class SolutionCrossBridgeTruck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Truck> wait = new LinkedList<>();
        Queue<Truck> cross = new LinkedList<>();
        
        // 대기열 트럭을 생성 
        for(int data : truck_weights)
        	wait.add(new Truck(data, 0));
        
        // 트럭 출발
        int bridgeWeight = wait.peek().weight;
        cross.add(wait.poll());
        
        int time = 0;
        while(!cross.isEmpty()) {
        	time++;
        	
        	// 트럭이 다리위를 지나감
        	for(Truck data : cross)
        		data.idx++;
        	
        	// 트럭이 다리 끝에 도달
        	if(cross.peek().idx > bridge_length)
        		bridgeWeight -= cross.poll().weight;
        	
        	// 다음 트럭 출발 = 대기하던 트럭이 출발
        	if(!wait.isEmpty() && wait.peek().weight + bridgeWeight <= weight) {
        		bridgeWeight += wait.peek().weight;
        		wait.peek().idx++;
        		cross.add(wait.poll());
        	}
        }
        answer = time;
        return answer;
    }
}
class Truck {
	int weight;
	int idx;
	public Truck(int weight, int idx) {
		this.weight = weight;
		this.idx = idx;
	}
}
