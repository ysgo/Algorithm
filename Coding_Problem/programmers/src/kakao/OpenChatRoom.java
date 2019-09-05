package kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OpenChatRoom {
	public static void main(String[] args) {
		SolutionOpenChatRoom su = new SolutionOpenChatRoom();
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo",
				"Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		for(String data : su.solution(record))
			System.out.println(data);
	}
}

class SolutionOpenChatRoom {
	public String[] solution(String[] record) {
		HashMap<String, String> map = new HashMap<>();
		List<User> uList = new ArrayList<>();
		String[] uArray;
		for(int i=0; i<record.length; i++) {
			uArray = record[i].split(" ");
			if(uArray[0].equals("Enter")) {
				map.put(uArray[1], uArray[2]);
				uList.add(new User(uArray[0], uArray[1]));
			} else if(uArray[0].equals("Leave")) {
				uList.add(new User(uArray[0], uArray[1]));
			} else {
				map.put(uArray[1], uArray[2]);
			}
		}
		
		String[] answer = new String[uList.size()];
		User user = null; String uid = null;
		for(int i=0; i<answer.length; i++) {
			user = uList.get(i);
			uid = map.get(user.uid);
			answer[i] = user.toString(uid);
		}
		return answer;
	}
}
class User {
	String command;
	String uid;
	
	User(String command, String uid) {
		this.command = command;
		this.uid = uid;
	}
	
	public String toString(String uname) {
		if(command.equals("Enter")) {
			return uname + "님이 들어왔습니다.";
		} else {
			return uname + "님이 나갔습니다.";
		}
	}
}