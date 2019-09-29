package codingtest;
// 제출
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

/* 5
 * ant bee dragonfly ant bee	Y 6 3
 * 3
 * ant bee dragonfly			Y 3 3
 * 4
 * ant bee drangonfly ant		N 4 3
 * 3
 * ant bee ant					Y 4 2
 */
public class NHNProblem1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			String card = st.nextToken();
			if(!map.containsKey(card)) {
				map.put(card, 1);
			} else {
				map.put(card, map.get(card)+1);
			}
		}
//		System.out.println(map);
		Integer max = Collections.max(map.values());
		Entry<String, Integer> maxEntry = null;
		for(Entry<String, Integer> entry : map.entrySet()) {
	        Integer value = entry.getValue();
	        if(null != value && max == value) {
	            maxEntry = entry;
	        }
	    }
//		Object maxEntry = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
		int cnt=0;
		int fullCnt = 0;
		for(String data : map.keySet()) {
			if(!data.equals(maxEntry.getKey())) {
				cnt += maxEntry.getValue() - map.get(data);
			}
			fullCnt += map.get(data);
		}
		char check;
		if(cnt == 1 || cnt == 0) {
			check = 'Y';
			if(cnt == 1) fullCnt++;
		} else {
			check = 'N';
		}
		int length = map.size();
		System.out.println(check);
		System.out.println(fullCnt);
		System.out.println(length);
	}
}
