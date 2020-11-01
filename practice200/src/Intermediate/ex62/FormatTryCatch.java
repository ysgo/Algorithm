package Intermediate.ex62;
//정수를 입력받을 때 발생할 수 있는 예외 처리하기
public class FormatTryCatch {

	public static void main(String[] args) {
		String sNum = "123";
		String nNum = "h";
		try {
			int a = Integer.parseInt(sNum);
			System.out.println(a);
		} catch(NumberFormatException ee) {
			System.out.println("int인지 확인해봐!!!");
			System.err.println(ee.getMessage());
		} catch(Exception ee) {
			System.out.println("야 잘좀 넣어");
		} finally {
			System.out.println("난 수행되어야만 해!!!!");
		}
	}

}
