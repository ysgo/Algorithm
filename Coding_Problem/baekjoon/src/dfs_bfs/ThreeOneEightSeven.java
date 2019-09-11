package dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*	8 8
	.######.
	#..k...#
	#.####.#
	#.#v.#.#
	#.#.k#k#
	#k.##..#
	#.v..v.#
	.######.	*/
public class ThreeOneEightSeven {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int R = Integer.parseInt(str[0]);
		int C = Integer.parseInt(str[1]);
		String[][] arr = new String[R][C];
		for(int i=0; i<R; i++) {
			arr[i] = br.readLine().split(""); 
		}
		for(String[] datas : arr) {
			for(String data : datas)
				System.out.print(data + " ");
			System.out.println();
		}
		
	}
}
