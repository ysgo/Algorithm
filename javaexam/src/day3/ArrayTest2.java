package day3;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		int[] nums2 = new int[] {10,20,30,40,50};
			for(int i=0; i<nums2.length; i++) {
				System.out.print(nums2[i] + " ");
			}
			System.out.println();
		
			for(int i=nums2.length-1; i>=0; i--) {
				System.out.print(nums2[i] + " ");
			}
			System.out.println();
			
			// nums2�� �����ϴ� �迭�� ù ��° �����Ͱ��ϰ�
			// ������ ������ ���� �����Ͽ� ����� ����.
			
			System.out.printf("nums2[0] + nums2[%d] = %d\n", nums2.length-1, nums2[0]+nums2[nums2.length-1]);
			
			// nums2 �����ϴ� �迭�� ù��°, ����°, �ټ���° �����͸�
			// ����ϴ� for���� �ۼ��ϱ�
			
			for(int i=0; i<nums2.length; i+=2) {
				System.out.println(nums2[i]);
			}
	}
}
