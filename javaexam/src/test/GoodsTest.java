package test;
public class GoodsTest {
	public static void main(String[] args) {
		// "PRD-0001", "��ũ��ǻ��", 10000, 'N' ���� ��ü ����
		// "PRD-0002", "�ν���ǻ��", 20000 ���� ��ü ����
        // ������ ��ü ���� getGoodsInfo()�� ȣ���ϰ� ���ϰ���� ����մϴ�.
		Goods[] gs = new Goods[2];
		gs[0] = new Goods("PRD-0001", "��ũ��ǻ��", 10000, 'N');
		gs[1] = new Goods("PRD-0002", "�ν���ǻ��", 20000);
		for(Goods data : gs)
			System.out.println(data.getGoodsInfo());
	}
}
// �����
// ��ǰID : PRD-0001, ��ǰ�� : ��ũ��ǻ��, ���� : 10,000��, AS���ɿ��� : �Ұ�
// ��ǰID : PRD-0002, ��ǰ�� : �ν���ǻ��, ���� : 20,000��, AS���ɿ��� : ����
