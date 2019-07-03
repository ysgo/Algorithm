package hash;

import java.util.HashMap;
import java.util.Iterator;

public class BestAlbum {
	public static void main(String[] args) {
		SolutionBestAlbum su = new SolutionBestAlbum();
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		for(int data : su.solution(genres, plays))
			System.out.println(data);
	}
}
class SolutionBestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<genres.length; i++) {
        	if(map.get(genres[i]) == null) {
        		map.put(genres[i], plays[i]);
        	} else {
        		map.put(genres[i], map.get(genres[i])+plays[i]);
        	}
        }
        System.out.println(map);
        
        Iterator<String> iter = map.keySet().iterator();
        while(iter.hasNext()) {
        	int value = Integer.parseInt(iter.next());
        	System.out.println(value);
        }
        return answer;
    }
}