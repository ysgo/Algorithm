package day4;
public class TwoArrayTest2 {
	public static void main(String[] args) {		
		int nums[][] = {
				{ 10, 20, 30, 40 },
				{ 11, 21, 31, 41 },
				{ 12, 22, 32, 42 },
				{ 13, 23, 33, 43 },
		};
		// 2�� 3���� �����͸� ���
		//System.out.println(nums[1][2]);
		// 3�ุ ����� ����.
		for(int i=0; i<nums[2].length; i++) {
			System.out.print(nums[2][i] + " ");
		}
			System.out.println();
		for(int data : nums[2]) {
			System.out.print(data + " ");
		}
		System.out.println();
		// 4���� ���
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i][3] + " ");
		}
		System.out.println();
		// ���� �밢���� �ش��ϴ� �����͸� ����Ѵ�. for��
		// 10 21 32 43
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				if(i==j) {
					System.out.print(nums[i][j] + " ");
				}
			}
		}
		System.out.println();
		// ������ �밢���� �ش��ϴ� �����͸� ���. for��
		// 40 31 22 13
		for(int i=0; i<nums.length; i++) {
			for(int j=nums.length; j>0; j--) {
				if(i + j == 4) {
					System.out.print(nums[i][j-1] + " ");
				}
			}
		}
		System.out.println();
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				if(i + j == (nums.length-1)) {
					System.out.print(nums[i][j] + " ");
				}
			}
		}
	}
}
