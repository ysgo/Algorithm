package codingtest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Line1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Queue<Integer> msg = new LinkedList<>();
        Queue<Consumer> con = new LinkedList<>();
        for(int i=0; i<a; i++) {
        	msg.add(sc.nextInt());
        }
        for(int i=0; i<b; i++) {
        	
        }
	}
	static class Consumer {
		Queue<Integer> con;
		Consumer() {
			con = new LinkedList<>();
		}
	}
}
