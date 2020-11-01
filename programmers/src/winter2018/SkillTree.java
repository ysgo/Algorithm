package winter2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SkillTree {
	public static void main(String[] args) {
		SolutionSkillTree su = new SolutionSkillTree();
		String skill = "CBD";
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };
		System.out.println("answer : " + su.solution(skill, skill_trees));
		System.out.println("answer2 : " + su.solution2(skill, skill_trees));
	}
}

class SolutionSkillTree {
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		Queue<String> qu = new LinkedList<>();
		for (String data : skill_trees)
			qu.add(data);
		System.out.println(qu);

		while (!qu.isEmpty()) {
			boolean ck = true;
			int k = 0;
			String str = qu.poll();
			for (int i = 0; i < str.length(); i++) {
				if (k < skill.indexOf(str.charAt(i))) {
					ck = false;
					break;
				} else if (k == skill.indexOf(str.charAt(i))) {
					k++;
				}
			}
			if(ck)
				answer++;
		}
		return answer;
	}
	public int solution2(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        //ArrayList<String> skillTrees = new ArrayList<String>();
        Iterator<String> it = skillTrees.iterator();

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
        }
        answer = skillTrees.size();
        return answer;
    }
}