package Conjugation2.ex116;

public class FourMagicSquare {
	private int[][] magic;
	private int n;
	
	public int[][] getMagic() {
		return magic;
	}
	public FourMagicSquare(int n) {
		magic = new int[n][n];
		this.n = n;
	}
	public FourMagicSquare() {
		this(4);
	}
	public void make() {
		makeA();
		makeR();
	}
	private void makeR() {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if((i>=0 && i<n/4) || (i>=n/4*3 && i<n)) {
					if(j>=n/4 && j<n/4*3) {
						magic[i][j] = n * n - (i * n + j);
					}
				} else {
					if((j>=0 && j<n/4) || (j>=n/4*3 && j<n)) {
						magic[i][j] = n * n - (i * n + j);
					}
				}
			}
		}
	}
	private void makeA() {
		for(int i=0; i<n*n; i++) {
			magic[i/n][i%n] = i + 1;
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
