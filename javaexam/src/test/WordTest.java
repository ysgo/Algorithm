package test;

public class WordTest {
	public static void main(String[] args) {
		WordCount a = new WordCount();
		System.out.println("��� 1  : "+a.counter("java jdbc sql html5 css javascript", true));
		System.out.println("��� 2  : "+a.counter("java jdbc sql html5 css javascript", false));
	}
}
//- word = true �� ��� => �ܾ��� ������ �����Ѵ�.
//- word = false �� ��� => ���ڿ��� ������ �����Ѵ�.(���鵵 ����)
class WordCount {	
	int counter(String text, boolean word){
	// �����ϼ���.
		String[] s = text.split(" ");
		if(word == true) 
			return s.length;
		 else
			return text.length();
	}	
}
