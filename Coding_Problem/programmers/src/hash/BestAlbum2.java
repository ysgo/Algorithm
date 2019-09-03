package hash;

// 해결 완료 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class BestAlbum2 {
	public static void main(String[] args) {
		SolutionBestAlbum2 su = new SolutionBestAlbum2();
//		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
//		int[] plays = {500, 600, 150, 800, 2500};
		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 500, 600, 150, 800, 600 };
//		String[] genres = {"classic", "classic", "classic", "pop", "jazz"};
//		int[] plays = {500, 150, 800, 200, 500};
//		String[] genres = {"classic", "classic", "classic"};
//		int[] plays = {500, 150, 800};
//		String[] genres = {"classic"};
//		int[] plays = {500};
		for (int data : su.solution(genres, plays))
			System.out.println(data);
	}
}

class SolutionBestAlbum2 {
	public int[] solution(String[] genres, int[] plays) {
		HashMap<String, Integer> sumMap = new HashMap<>(); // 장르 합
		HashMap<Integer, String> genreMap = new HashMap<>(); // 인덱스 + 장르
		HashMap<Integer, Integer> playMap = new HashMap<>(); // 인덱스 + 횟수
		for (int i = 0; i < genres.length; i++) { // 장르별 최종 합 구하기
			genreMap.put(i, genres[i]);
			playMap.put(i, plays[i]);
			if (sumMap.containsKey(genres[i])) { // .getOrDefault(genres[i], plays[i])+plays[i]);
				sumMap.put(genres[i], sumMap.get(genres[i]) + plays[i]);
			} else {
				sumMap.put(genres[i], plays[i]);
			}
		}
		System.out.println(sumMap);
		System.out.println(genreMap);
		System.out.println(playMap);
		// 총 플레이횟수 내림차순 정렬
		ArrayList<String> list = new ArrayList<>();
		list.addAll(sumMap.keySet()); // 장르별 합 내림차순 위해 list 생성
		if (list.size() != 1) {
			Collections.sort(list, new Comparator<String>() {
				public int compare(String key1, String key2) {
					if (sumMap.get(key1) > sumMap.get(key2))
						return -1;
					else if (sumMap.get(key1) == sumMap.get(key2))
						return 0;
					else
						return 1;
				}
			});
		}
		System.out.println(list);
		// 장르별 많이 플레이된 노래 고유번호
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			for (int p1 : genreMap.keySet()) {
				if (list.get(i).equals(genreMap.get(p1))) {
					tmp.add(playMap.get(p1));
				}
			}
			if (tmp.size() != 1) {
				Collections.reverse(tmp);	 // 이걸 안해주면 동일한 값의 인덱스가 반대로 리턴됨
				Collections.sort(tmp);
				for (int j = tmp.size() - 1; j >= tmp.size() - 2; j--) {
					for (int p : playMap.keySet()) {
						if (tmp.get(j) == playMap.get(p)) {
//							System.out.println(p);
							result.add(p);
//							playMap.put(p, 0);
							break;
						}
					}
				}
			} else { 	// 장르의 곡이 한개일 경우
				for (int p : playMap.keySet()) {
					if (tmp.get(0) == playMap.get(p)) {
						result.add(p);
//						playMap.put(p, 0);
						break;
					}
				}
			}
		}
		int[] answer = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}
		return answer;
	}
//        ListIterator<String> iter = list.listIterator();
//        while(iter.hasNext()) {
//        	HashMap<Integer, Integer> sorting = new HashMap<>();
//        	String gnre = iter.next();
////        	ArrayList<Integer> sort = new ArrayList<>();
//        	System.out.println(gnre);
//        	
//        	Iterator<Integer> it2 = genreMap.keySet().iterator();
//        	Iterator<Integer> it3 = playMap.keySet().iterator();
//        	while(it2.hasNext()) {
//        		int key = it2.next();
//        		int index = it3.next();
//        		if(genreMap.get(key).equals(gnre)) {
//        			System.out.println(key + " " + genreMap.get(key) + " " + index);
//        			sorting.put(index, playMap.get(key));
//        		}
//        	}
//        	System.out.println(sorting);
//        	Iterator<Integer> it1 = sortByValue(sorting).iterator();
//        	while(it1.hasNext()) {
//        		int index = it1.next();
//        		result.add(index);
//        		if(result.size() == 2 || result.size() ==4 )
//        				break;
//        	}			ArrayList<Integer> tmp = new ArrayList<Integer>();        

//        }
//        int[] answer = new int[result.size()];
//        for(int i=0; i<result.size(); i++) {     		
//        	answer[i] = result.get(i);
//        }
//        return answer;
//    }
//    static List<Integer> sortByValue(HashMap<Integer, Integer> map) {
//    	List<Integer> list = new ArrayList<>();
//    	list.addAll(map.keySet());
//    	Iterator<Integer> it = map.keySet().iterator();
//    	while(it.hasNext()) {
//    		int key = it.next();
//    		if(list.contains(map.get(key))) {
//    			return list;
//    		} else {
//    			Collections.sort(list, new Comparator() {
//    				public int compare(Object o1, Object o2) {
//    					Object v1 = map.get(o1);
//    					Object v2 = map.get(o2);
//    					return ((Comparable) v1).compareTo(v2);
//    				}
//    			});
//    			Collections.reverse(list); 	    			
//    		}
//    	}
//    	return list;
//    }
}