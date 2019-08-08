package dfs_bfs;
/*두 개의 단어 begin, target과 단어의 집합 words가 있습니다. 
 * 아래와 같은 규칙을 이용하여 begin에서 target으로 변환하는 가장 짧은 변환 과정을 찾으려고 합니다.

1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
2. words에 있는 단어로만 변환할 수 있습니다.
예를 들어 begin이 hit, target가 cog, words가 [hot,dot,dog,lot,log,cog]라면 
hit -> hot -> dot -> dog -> cog와 같이 4단계를 거쳐 변환할 수 있습니다.

두 개의 단어 begin, target과 단어의 집합 words가 매개변수로 주어질 때,
 최소 몇 단계의 과정을 거쳐 begin을 target으로 변환할 수 있는지 return 하도록 solution 함수를 작성해주세요.

제한사항
각 단어는 알파벳 소문자로만 이루어져 있습니다.
각 단어의 길이는 3 이상 10 이하이며 모든 단어의 길이는 같습니다.
words에는 3개 이상 50개 이하의 단어가 있으며 중복되는 단어는 없습니다.
begin과 target은 같지 않습니다.
변환할 수 없는 경우에는 0를 return 합니다.
입출력 예
begin		target		words								return
hit			cog			[hot, dot, dog, lot, log, cog]		4
hit			cog			[hot, dot, dog, lot, log]			0 		*/
import java.util.HashMap;

public class StringTransfer {
	public static void main(String[] args) {
		SolutionStringTransfer su = new SolutionStringTransfer();
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};	// return 4;
//		String begin = "hit";
//		String target = "cog";
//		String[] words = {"hot", "dot", "dog", "lot", "log"};	// return 0;
		System.out.println(su.solution(begin, target, words));
	}
}
class SolutionStringTransfer {
	static int answer = 0;
		public int solution(String begin, String target, String[] words) {
        int dep=0;
        boolean[] check = new boolean[words.length];
        HashMap<String, Integer> map = new HashMap<>();
        for(String data : words)
        	map.put(data, 1);
        if(!map.containsKey(target)) {
        	return 0;
        } else {
	        answer = dfs(begin, target, words, check, dep);
        }
        return answer;
    }
    static int dfs(String begin, String target, String[] words, boolean[] check, int dep) {
    	StringBuilder s;
    	String tmp = begin;
    	if(tmp.equals(target)) {									// target문자로 변환이 됬을 경우 
    		return answer = dep;									// 깊이의 값을 최종 반환 
    	} else {
	    	for(int i=0; i<words.length; i++) {
	    		s = new StringBuilder();
	    		if(check[i] == false) {								// 확인한 단어인지 체크 
	    			int count=0;
		    		for(int j=0; j<tmp.length(); j++) {				// 노드위치 단어길이만큼 체크 
		    			s.append(words[i].charAt(j));  				// 다음 begin으로 정할 단어 준비 
		    			if(tmp.charAt(j) != words[i].charAt(j)) {	// 문자 비교 
		    				count++;								// 다를시 카운트+1 
		    			}
		    			if(count > 1) {								// 카운트가 2이상이면 비교하는 문자는 통과 
		    				break;
		    			} else {
			    			if(j == tmp.length()-1)					// 다음 begin으로 사용할 문자로 저장 
			    				tmp = s.toString();
		    			}
		    		}
		    		if(count == 1) {								// 한번에 바꿀 수 있는 문자는 1개 조건 만족할 시 
		    			check[i] = true;							// 현재 위치의 문자를 확인했으니 true로 check 
		    			dfs(tmp, target, words, check, dep+1);		// 바뀐 begin 문자로 재귀 반복 (깊이는 1씩 증가) 
		    		}												// lot log 로 바뀌면 재귀반복으로 cog로 변환 안됨 
	    		}													// dog 재귀로 돌아와 cog로 변환되면 최종 결과 리턴 
	    	}
    	}
    	return answer;
    }
}

/* 노드를 이용한 문제 해결 풀이법 
	class Solution {
	    static class Node {
	        String next;
	        int edge;
	        
	        public Node(String next, int edge) {
	            this.next = next;
	            this.edge = edge;
	        }
	    }
	
	    public int solution(String begin, String target, String[] words) {
	        int n = words.length, ans = 0;
	
	        // for (int i=0; i<n; i++)
	        //  if (words[i] != target && i == n-1) return 0;
	
	        Queue<Node> q = new LinkedList<>();
	
	
	        boolean[] visit = new boolean[n];
	        q.add(new Node(begin, 0));
	
	        while(!q.isEmpty()) {
	            Node cur = q.poll();
	            if (cur.next.equals(target)) {
	                ans = cur.edge;
	                break;
	            }
	
	            for (int i=0; i<n; i++) {
	                if (!visit[i] && isNext(cur.next, words[i])) {
	                    visit[i] = true;
	                    q.add(new Node(words[i], cur.edge + 1));
	                }
	            }
	        }
	        return ans;
	    }
	
	    static boolean isNext(String cur, String n) {
	        int cnt = 0;
	        for (int i=0; i<n.length(); i++) {
	            if (cur.charAt(i) != n.charAt(i)) {
	                if (++ cnt > 1) return false;
	            }
	        }
	        return true;
	    }    
	}  */