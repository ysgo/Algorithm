package hash;
// 실패한 코드 
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class BestAlbum {
	public static void main(String[] args) {
		SolutionBestAlbum su = new SolutionBestAlbum();
//		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
//		int[] plays = {500, 600, 150, 800, 2500};
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 600};
//		String[] genres = {"classic", "classic", "classic"};
//		int[] plays = {500, 150, 800};
//		String[] genres = {"classic"};
//		int[] plays = {500};
		for(int data : su.solution(genres, plays))
			System.out.println(data);
	}
}
class SolutionBestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map1 = new HashMap<>();	// 장르 합 
        HashMap<Integer, String> map2 = new HashMap<>();	// 인덱스 + 장르
        HashMap<Integer, Integer> map3 = new HashMap<>();	// 인덱스 + 횟수 
        for(int i=0; i<genres.length; i++) {	// 장르별 최종 합 구하기 
        	map2.put(i, genres[i]);
        	map3.put(i, plays[i]);
        	if(map1.containsKey(genres[i])) {	// .getOrDefault(genres[i], plays[i])+plays[i]);
        		map1.put(genres[i], map1.get(genres[i])+plays[i]);
        	} else {
        		map1.put(genres[i], plays[i]);
        	}
        }
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);
        // 장르 순위대로 정렬 
        ArrayList<Integer> list = new ArrayList<>(map1.values());
        ArrayList<String> list2 = new ArrayList<>();
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
        ListIterator<Integer> iter1 = list.listIterator();
        while(iter1.hasNext()) {
        	int value = iter1.next();
        	for(Map.Entry<String, Integer> data : map1.entrySet()) {
        		if(value == data.getValue()) {
        			if(!list2.contains(data.getKey())) {
        				list2.add(data.getKey());
        			}
        		}
        	}
        }
        System.out.println(list2 + "?");
        ArrayList<Integer> result = new ArrayList<>();
        ListIterator<String> iter2 = list2.listIterator();
        while(iter2.hasNext()) {
        	String key = iter2.next();
        	int count=0;
        	for(int i=0; i<map3.size(); i++) {
        		if(key.equals(map2.get(i))) {
        			result.add(i);
        			count++;
        		}
        		if(count==2)
        			break;
        	}
        }
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++)
        	answer[i] = result.get(i);
        return answer;
    }
}