package day4;

public class TwoArrayLab3{

	public static void main(String[] args) {
		char play[][] = { 
				{ 'X', 'X', 'X', 'R', 'X', 'R'},
				{ 'R', 'X', 'X', 'X', 'X', 'X'},
				{ 'X', 'X', 'R', 'X', 'X', 'X'},
				{ 'R', 'X', 'X', 'F', 'X', 'X'},
				{ 'X', 'R', 'X', 'R', 'X', 'R'},
				{ 'X', 'R', 'X', 'X', 'X', 'R'},
				};
		
		int catchNum = 0;
		/*
		 * R�� �䳢�̰� F�� �����
		 * ������ ��ġ�� ������ �ְ� 
		 * ������ ��ġ���� �밢���� �������θ� �̵� �����ϴ�. 
		 * ���� ���� 2���� �迭 �����Ϳ���
		 * �䳢�� ��� ��ڴ°�?
		 */
		int fPosi = 0;
		int fPosj = 0;
		
		// ����
		hunt : for(int i=0; i<play.length; i++) {
			for(int j=0; j<play.length; j++) {
				if(play[i][j] == 'F') {
					fPosi = i;
					fPosj = j;
					break hunt;
				} 
			}
		}
		System.out.println("������ ��ġ : (" + fPosi + "," + fPosj+")");
		int count = 0;
		
		// ����	
	       for(int i=0; i<play.length; i++) {
	        	if(play[fPosi][i] == 'R') {
	        		catchNum++;
	        		count++;
	        	}
	        }
	        System.out.println("�� �������� ���� �䳢 �� : " + count);
	        
	        count=0;
	        for(int i=0; i<play.length; i++) {
	        	if(play[i][fPosj] == 'R') {
	        		catchNum++;
	        		count++;
	        	}
	        }
	        System.out.println("�� �������� ���� �䳢 �� : " + count);
	        
	        count=0;
	        for(int i=fPosi-1; i>=0; i--) { // ���� ��
	            for(int j=fPosj-1; j>=0; j--) {
	            	if(fPosi - fPosj == i - j) {
		            	if(play[i][j] == 'R') {
		                    catchNum++;
		            		count++;
	            		}
	            	}
	            }
	        }
	        // int i=fPosi;
	        // int j=fPosj;
	        // while(i >= 0 && j >= 0) {
	        //	if(play[i][j] == 'R')
	        //		catchNum++;
	        //		i--, j--;
			//}
	        System.out.println("���� �� ���� ���� �䳢 �� : " + count);
	        
	        count=0;
	        for(int i=fPosi+1; i<play.length; i++) {	// ���� �Ʒ�
	            for(int j=fPosj-1; j>=0; j--) {
	            	if(fPosi + fPosj == i + j) {
		                if(play[i][j] == 'R') {
		                    catchNum++;
		                    count++;
		               }
	            	}
	            }
	        }
	        System.out.println("���� �Ʒ� ���� ���� �䳢 �� : " + count);
	        
	        count=0;
	        for(int i=fPosi-1; i>=0; i--) { // ���� ��
	        	for(int j=fPosj+1; j<play.length; j++) {
	        		if(fPosi + fPosj == i + j) {
	        			if(play[i][j] == 'R') {
	        				catchNum++;
	        				count++;
	        			}
	        		}
	        	}
	        }
	        System.out.println("���� �� ���� ���� �䳢 �� : " + count);
	        
	        count=0;
	        for(int i=fPosi+1; i<play.length; i++) {	// ���� �Ʒ�
	        	for(int j=fPosj+1; j<play.length; j++) {
	        		if(fPosi - fPosj == i - j) {
		        		if(play[i][j] == 'R') {
		        			catchNum++;
		        			count++;
		        		}
	        		}
	        	}
	        }
	        System.out.println("���� �Ʒ� ���� ���� �䳢 �� : " + count);
	        
//	        count=0;
//	        for(int i=0; i<play.length; i++) { // /�밢�� ����
//	            for(int j=0; j<play.length; j++) {
//	            	if(fPosi + fPosj == i + j) {
//	            	if(play[i][j] == 'R') {
//	                    catchNum++;
//	            		count++;
//	            		}
//	            	}
//	            }
//	        }
//	        System.out.println("/�밢�� ���� ���� �䳢 �� : " + count);
//	        count=0;
//	        for(int i=0; i<play.length; i++) {	// \�밢�� ����
//	            for(int j=0; j<play.length; j++) {
//	            	if(fPosi - fPosj == i - j ) {
//	                    if(play[i][j] == 'R') {
//	                        catchNum++;
//	                        count++;
//	                    }
//	            	}
//	            }
//	        }
//	        System.out.println("\\�밢�� �������� ���� �䳢 �� : " + count);

		System.out.printf("����� �䳢�� %d ���� ��´�.", catchNum);		
	}
}


