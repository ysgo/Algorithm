package Conjugation2.ex115;

public class OddMagicSquare {
	private int[][] magic;
	private int n;
	
	public int[][] getMagic() {
		return magic;
	}
	
	public OddMagicSquare(int n) {
		magic = new int[n][n];
		this.n = n;
	}
	
	public OddMagicSquare() {
		this(3);
	}
	
	public void make() {
		int x = 0;
		int y = n/2;
		for(int i=1; i<=n*n; i++) {
			int temX = x;
			int temY = y;
			//System.out.printf("(%d, %d)\t", x, y);
			magic[x][y] = i;
			if(x-1<0) {
				x = n-1;
			} else {
				x--;
			}
			if(y-1<0) {
				y = n-1;
			} else {
				y--;
			}
			if(magic[x][y] != 0) {
				x = temX + 1;
				y = temY;
			}
		}
	}
	
	public void print() {
		System.out.println();
		System.out.println(n + " is magic : " + isMagic());
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(magic[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	private int sumRow(int row) {
		int tot = 0;
		for(int i=0; i<n; i++) {
			tot += magic[row][i];
		}
		return tot;
	}
	
	private int sumCol(int col) {
		int tot = 0;
		for(int i=0; i<n; i++) {
			tot += magic[i][col];
		}
		return tot;
	}
	
	private int sumDia() {
		int tot = 0;
		for(int i=0; i<n; i++) {
			tot += magic[i][n-1-i];
		}
		return tot;
	}
	
	private int sumReverseDia() {
		int tot = 0;
		for(int i=0; i<n; i++) {
			tot += magic[i][i];
		}
		return tot;
	}
	
	private boolean isMagic() {
		boolean isM = true;
		int[] m = new int[2*n+2];
		for(int i=0; i<n; i++) {
			m[i] = sumRow(i);
			m[i+n] = sumCol(i);
		}
		m[2*n] = sumReverseDia();
		m[2*n+1] = sumDia();
		for(int i=1; i<m.length; i++) {
			if(m[0]==0 || m[0]!=m[i]) {
				isM = false;
				break;
			}
		}
		return isM;
	}
}
