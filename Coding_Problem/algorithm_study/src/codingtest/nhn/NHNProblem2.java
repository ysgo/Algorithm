package codingtest.nhn;
// 제출
import java.io.*;
import java.util.*;

/* 12
enqueue 1
enqueue 2
enqueue 1
enqueue 2
enqueue 3
enqueue 2
enqueue 4
dequeue
dequeue
dequeue
dequeue
dequeue
	
12
enqueue 1
enqueue 2
enqueue 2
enqueue 1
enqueue 2
dequeue
dequeue
dequeue
dequeue
dequeue
enqueue 7
dequeue
 */
public class NHNProblem2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<String> qu = new LinkedList<>();
		HashMap<String, Integer> map = new HashMap<>();
		int dequ = 0;
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String token = st.nextToken();
			String value="";
			if(token.equals("enqueue")) {
				value = st.nextToken();
				qu.add(value);
				if(map.containsKey(value))
					map.put(value, map.get(value)+1);
				else
					map.put(value, 1);
			} else {
				dequ++;
			}
		}
//		System.out.println(qu);
//		System.out.println(map);
		StringBuilder sb = new StringBuilder();
		Object maxEntry = null;
		for(int i=0; i<dequ; i++) {
			maxEntry = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
			if(map.get(maxEntry) != 1) {
//				System.out.println(maxEntry);
				if(qu.remove(maxEntry)) {
					if(i==dequ-1)
						sb.append(maxEntry);
					else
						sb.append(maxEntry + " ");
					map.put(String.valueOf(maxEntry), map.get(maxEntry)-1);
//					System.out.println(map);
				}
			}
			else {
				String peek = qu.peek();
				map.put(peek, map.get(peek)-1);
				if(i==dequ-1)
					sb.append(peek);
				else
					sb.append(peek + " ");
				qu.poll();
			}
		}
//		System.out.println(qu);
//		System.out.println(map);
		System.out.println(sb.toString());
	}
}
