package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class OneOneFiveNine {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			char lastName = br.readLine().charAt(0);
			if(map.containsKey(lastName))
				map.put(lastName, map.get(lastName)+1);
			else
				map.put(lastName, 1);
		}
		StringBuilder sb = new StringBuilder();
		for(Character data : map.keySet()) {
			if(map.get(data) >= 5) {
				sb.append(data);
			}
		}
		if(sb.length() == 0)
			System.out.println("PREDAJA");
		else
			System.out.println(sb.toString());
	}
}
