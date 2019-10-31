package graph;

import java.util.HashSet;
import java.util.Iterator;

public class Ranking {
	public static void main(String[] args) {
		SolutionRanking su = new SolutionRanking();
		int n = 5;
		int[][] results = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};	// 2
		System.out.println(su.solution(n, results));
	}
}
class SolutionRanking {
    public int solution(int n, int[][] results) {
        int answer = 0;
        // 그래프 생성을 위한 공간 할당
        Graph[] graph = new Graph[n+1];
        for(int i=1; i<n+1; i++) {
        	graph[i] = new Graph();
        }
        // 이긴 사람 명단과 진 사람 명단에 대한 그래프 생성
        for(int i=0; i<results.length; i++) {
        	graph[results[i][0]].win.add(results[i][1]);
        	graph[results[i][1]].lose.add(results[i][0]);
        }
//        for(int i=1; i<n+1; i++) {
//        	System.out.println(graph[i].toString());
//        }
        boolean[] winner;
        boolean[] loser;
        int w_c;
        int l_c;
        for(int i=1; i<n+1; i++) {
        	w_c = 0;
        	l_c = 0;
        	winner = new boolean[n+1];
        	loser = new boolean[n+1];
        	winner = findWinner(graph, i, winner);
        	loser = findLoser(graph, i, loser);
        	for(int j=1; j<n+1; j++) {
        		if(i != j && winner[j])
        			w_c++;
        		if(i != j && loser[j])
        			l_c++;
        	}
        	if(w_c + l_c == n-1)
        		answer++;
//			System.out.println("winner : " + w_c + ", loser : " + l_c);
//			System.out.println("========================   " + i);
        }
        return answer;
    }
    public boolean[] findWinner(Graph[] graph, int curr, boolean[] check) {
    	if(!check[curr]) {
    		check[curr] = true;
//			System.out.println("winner curr : " + curr);
    		for(Iterator<Integer> i = graph[curr].win.iterator(); i.hasNext();) {
    			int temp = Integer.parseInt(i.next().toString());
    			check = findWinner(graph, temp, check);
    		}
    	}
    	return check;
    }
    public boolean[] findLoser(Graph[] graph, int curr, boolean[] check) {
    	if(!check[curr]) {
    		check[curr] = true;
    		for(Iterator<Integer> i = graph[curr].lose.iterator(); i.hasNext();) {
    			int temp = Integer.parseInt(i.next().toString());
    			check = findLoser(graph, temp, check);
    		}
    	}
    	return check;
    }
}

class Graph {
	HashSet<Integer> win;
	HashSet<Integer> lose;
	
	Graph() {
		win = new HashSet<Integer>();
		lose = new HashSet<Integer>();
	}
	
	@Override
	public String toString() {
		return "Graph [win=" + win + ", lose=" + lose + "]";
	}
}