package day10;

@SuppressWarnings("serial") // ���� ���Ƿ� �Ѱ�
class DuplicateException extends Exception {
    DuplicateException() {
    	super("�ߺ��� �ζ� ��ȣ�� �߻��߽��ϴ�.");
    }
}
class LottoMachine {
	private int[] nums;
	LottoMachine() {
		nums = new int[6];
	}
	public void createLottoNum() {
		for(int i=0; i<nums.length; i++)
			nums[i] = (int)(Math.random()*20) + 1;
		/*
		 Random rnd = new Random(); // import �ʼ�
		 for(int i=0; i<nums.length; i++)
			nums[i] = rnd.nextInt(20) + 1;
		 */
	}
	public void checkLottoNum() throws DuplicateException {
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] == nums[j]) {
					throw new DuplicateException();
				}				
			}
		}
	}
	public int[] getNums() {
		return nums;
	}
}

public class LottoGame {
	public static void main(String[] args) {
		LottoMachine lm = new LottoMachine();
		lm.createLottoNum();
		int arr[] = lm.getNums();
		try {
			lm.checkLottoNum();
			System.out.print("(");
			for(int i=0; i<arr.length; i++) {
				if(i == arr.length-1) {
					System.out.printf("%d)\n", arr[i]);
				} else {
					System.out.printf("%d, ", arr[i]);
				}
			}
		} catch (DuplicateException e) {
			System.out.println(e.getMessage());
			System.exit(-1);
			// return; main������ return ���� JVM���� ���ư��� ��
		}
	}
}
