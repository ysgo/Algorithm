package hard.string;

public class Example273 {
	public static void main(String[] args) {
		String Motors = "Hyundai,Kia,BMW,Bentz";
		String[] arr = Motors.split(",");
		for(String e : arr) {
			System.out.printf("%s ", e);
		}
		System.out.println();
		
		String str_M = String.join("-", arr);
		System.out.println(str_M);
	}
}
