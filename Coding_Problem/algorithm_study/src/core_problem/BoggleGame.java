package core_problem;

public class BoggleGame {
	static char[][] alphabet = {{'T', 'W', 'I', 'C', 'E'}, {'I', 'S', 'C', 'U', 'B'},
			{'L', 'E', 'M', 'O', 'N'}, {'U','F', 'M', 'O', 'A'}, {'S', 'O', 'I', 'T', 'U'}};
	static String word = "SO";
	public static void main(String[] args) {
		String result = "";
//		String word = "TWICE";
//		String word = "IS";
//		String word = "BEAUTIFUL";
		int x=0; int y=0; int cnt=0;
		String[] loc = location(x,y,cnt).split("");
		x = Integer.parseInt(loc[0]);
		y = Integer.parseInt(loc[1]);
		System.out.println(search(word, x, y, ++cnt));
	}
	static String location(int x, int y, int cnt) {
		String loc = "";
		end:for(int i=x; i<alphabet.length; i++) {
			for(int j=y; j<alphabet[0].length; j++) {
				if(alphabet[i][j] == word.charAt(cnt)) {
					loc += Integer.toString(i);
					loc += Integer.toString(j);
					break end;
				}
			}
		}
		return loc;
	}
	static boolean search(String word, int i, int j, int cnt) {
		if(!(i>=0 && i<5 && j>=0 && j<5))
			return false;
		// 현재 위치
		if(alphabet[i][j] == word.charAt(0)) {
			search(word, i, j, cnt+1);
		}
		
		// 위 방향 ( i 감소 )
		if(alphabet[i-1][j] == word.charAt(cnt)) {
			
		}
		
		// 아래 방향( i 증가 )
		if(alphabet[i+1][j] == word.charAt(cnt)) {
			
		}
		
		// 왼쪽 방향( j 감소 )
		if(alphabet[i][j-1] == word.charAt(cnt)) {
			
		}
		
		// 오른쪽 방향( j 증가 )
		if(alphabet[i][j+1] == word.charAt(cnt)) {
			
		}
		
		// 왼쪽 위( i, j 감소 )
		if(alphabet[i-1][j] == word.charAt(cnt)) {
			
		}
		
		// 왼쪽 아래( i 증가, j 감소 )
		if(alphabet[i-1][j] == word.charAt(cnt)) {
			
		}
		
		// 오른쪽 위( i 감소, j 증가 ) 
		if(alphabet[i-1][j-1] == word.charAt(cnt)) {
			
		}
		
		// 오른쪽 아래( i, j 증가 )
		if(alphabet[i+1][j+1] == word.charAt(cnt)) {
			
		}
		return false;
	}
}
