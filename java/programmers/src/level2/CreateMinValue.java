package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateMinValue {
	public static void main(String[] args) {
		SolutionCreateMinValue su = new SolutionCreateMinValue();
//		int[] A = {1, 4, 2};
//		int[] B = {5, 4, 4};	// 29
		int[] A = {1, 2};
		int[] B = {3, 4};		// 10
		System.out.println(su.solution(A, B));
	}
}

class SolutionCreateMinValue {
	public int solution(int[] A, int[] B) {
		int answer = 0;
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for(int i=0; i<A.length; i++) {
			list1.add(A[i]);
			list2.add(B[i]);
		}
		Collections.sort(list1);
		Collections.sort(list2);
		Collections.reverse(list2);
		System.out.println(list1);
		System.out.println(list2);
		for(int i=0; i<list1.size(); i++) {
			answer += list1.get(i)*list2.get(i);
		}
		return answer;
	}
	/*	정렬 방식을 퀵정렬 방식으로 정렬한 후에 값을 계산 후 출력
	 *  public int getMinSum(int []A, int []B)
    {
        int answer = 0;
        int length = A.length;


        quickSort(A, 0, A.length-1);
        quickSort(B, 0, B.length-1);

        //System.out.println(A[0]);
        //System.out.println(B[0]);

        for(int i = 0 ; i < length ; i++)
        {
            answer += A[i] * B[length-1-i];
        }



        return answer;
    }

    public static void quickSort(int[] arr, int left, int right)
    {
        int i, j, pivot, tmp;

        if (left < right) {
            i = left;
            j = right;
            pivot = arr[left];
            //분할 과정
            while (i < j) {
                while (arr[j] > pivot) j--;
                while (i < j && arr[i] <= pivot) i++;

                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            arr[left] = arr[i];
            arr[i] = pivot;
            //정렬 과정
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }
	 */
}