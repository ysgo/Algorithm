package programmers;

import java.util.ArrayList;
import java.util.Collections;

// �봽濡쒓렇�옒癒몄뒪 怨좊뱷�젏kit �젙�젹 1踰덉㎏ 臾몄젣
public class KthNumber {
	/*諛곗뿴 array�쓽 i踰덉㎏ �닽�옄遺��꽣 j踰덉㎏ �닽�옄源뚯� �옄瑜닿퀬 �젙�젹�뻽�쓣 �븣, k踰덉㎏�뿉 �엳�뒗 �닔瑜� 援ы븯�젮 �빀�땲�떎.

	�삁瑜� �뱾�뼱 array媛� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�씠�씪硫�

	array�쓽 2踰덉㎏遺��꽣 5踰덉㎏源뚯� �옄瑜대㈃ [5, 2, 6, 3]�엯�땲�떎.
	1�뿉�꽌 �굹�삩 諛곗뿴�쓣 �젙�젹�븯硫� [2, 3, 5, 6]�엯�땲�떎.
	2�뿉�꽌 �굹�삩 諛곗뿴�쓽 3踰덉㎏ �닽�옄�뒗 5�엯�땲�떎.
	諛곗뿴 array, [i, j, k]瑜� �썝�냼濡� 媛�吏� 2李⑥썝 諛곗뿴 commands媛� 留ㅺ컻蹂��닔濡� 二쇱뼱吏� �븣, 
	commands�쓽 紐⑤뱺 �썝�냼�뿉 ���빐 �븵�꽌 �꽕紐낇븳 �뿰�궛�쓣 �쟻�슜�뻽�쓣 �븣 �굹�삩 寃곌낵瑜� 諛곗뿴�뿉 �떞�븘 return �븯�룄濡� solution �븿�닔瑜� �옉�꽦�빐二쇱꽭�슂.

	�젣�븳�궗�빆
	array�쓽 湲몄씠�뒗 1 �씠�긽 100 �씠�븯�엯�땲�떎.
	array�쓽 媛� �썝�냼�뒗 1 �씠�긽 100 �씠�븯�엯�땲�떎.
	commands�쓽 湲몄씠�뒗 1 �씠�긽 50 �씠�븯�엯�땲�떎.
	commands�쓽 媛� �썝�냼�뒗 湲몄씠媛� 3�엯�땲�떎.
	�엯異쒕젰 �삁
	array					commands							return
	[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
	�엯異쒕젰 �삁 �꽕紐�
	[1, 5, 2, 6, 3, 7, 4]瑜� 2踰덉㎏遺��꽣 5踰덉㎏源뚯� �옄瑜� �썑 �젙�젹�빀�땲�떎. [2, 3, 5, 6]�쓽 �꽭 踰덉㎏ �닽�옄�뒗 5�엯�땲�떎.
	[1, 5, 2, 6, 3, 7, 4]瑜� 4踰덉㎏遺��꽣 4踰덉㎏源뚯� �옄瑜� �썑 �젙�젹�빀�땲�떎. [6]�쓽 泥� 踰덉㎏ �닽�옄�뒗 6�엯�땲�떎.
	[1, 5, 2, 6, 3, 7, 4]瑜� 1踰덉㎏遺��꽣 7踰덉㎏源뚯� �옄由낅땲�떎. [1, 2, 3, 4, 5, 6, 7]�쓽 �꽭 踰덉㎏ �닽�옄�뒗 3�엯�땲�떎.
	*/	
		public static void main(String[] args) {
			ArrayList<Integer> st = null;
			int[] arrIn = {1, 5, 2, 6, 3, 7, 4};
			int[][] comIn = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
			int[] result = new int[comIn.length];
			for(int i=0; i<comIn.length; i++) {
				st = new ArrayList<Integer>();	// copyOfRange(원본배열, 복사할 시작인덱스, 복사할 끝 인덱스)
				for(int j=comIn[i][0]; j<=comIn[i][1]; j++) {
					st.add(arrIn[j-1]);
				}
				Collections.sort(st);			
				System.out.println(st);
				result[i] = st.get(comIn[i][2]-1);
			}
			for(int data : result)
				System.out.println(data);
		}
}
