package Intermediate.ex42;
//Á¤¼ö-½Ç¼ö º¯È¯À¸·Î ¼·¾¾¸¦ È­¾¾·Î ¹Ù²Ù±â
public class Temperature {

	public static void main(String[] args) {
		for(int i=0; i<101; i++) {
			double fahrenheit = 9.0/5 * i + 32;
			System.out.printf("¼·¾¾ %dµµ = È­¾¾ %.2fµµ\n", i, fahrenheit);
		}
	}

}
