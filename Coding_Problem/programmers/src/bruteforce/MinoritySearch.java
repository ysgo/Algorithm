package bruteforce;

import java.util.ArrayList;

public class MinoritySearch {
	public static void main(String[] args) {
		SolutionMinoritySearch su = new SolutionMinoritySearch();
//		String numbers = "17";	// 3
		String numbers = "011";	// 2
//		String numbers = "1234567";	// 
		System.out.println("answer : " + su.solution(numbers));
	}
}
class SolutionMinoritySearch {
    public int solution(String numbers) {
        int answer = 0;
        String[] str = numbers.split("");
        int len = str.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        for(String data : str) {
        	int tmp = Integer.parseInt(data);
        	if(tmp == 1 || tmp == 0) continue;
        	list.add(tmp);
        }
//        System.out.println(list);
        StringBuffer bf;
        for(int i=0; i<len; i++) {
        	bf = new StringBuffer();
        	int tmp;
        	bf.append(str[i]);
        	for(int j=0; j<len; j++) {
        		if(i==j) continue;
        		bf.append(str[j]);
        		tmp = Integer.parseInt(bf.toString());
        		if(tmp == 0 || tmp == 1 || tmp%2 == 0 || tmp%3 == 0 || tmp%5 == 0) continue;
        		if(!list.contains(tmp))
        			list.add(tmp);
        	}
        }
        System.out.println(list);
        answer = list.size();
        return answer;
    }
}