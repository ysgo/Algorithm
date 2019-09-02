package hard.string;

public class Example274 {
	public static void main(String[] args) {
		String[] names = {"DORI", "DOOLI", "DOMI"};
		int[] scores = {97, 78, 83};
		
		String[] datas = new String[3];
		for(int i=0; i<3; i++) {
			datas[i] = String.format("%s의 점수 : %d", names[i], scores[i]);
		}
		for(String data : datas)
			System.out.println(data);
	}
}
