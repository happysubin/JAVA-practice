/*
 * a>>b
 * a�� �� ��Ʈ�� ���������� b�� ����Ʈ�Ѵ�. �ֻ��� ��Ʈ�� ���ڸ��� ����Ʈ ���� �ֻ��� ��Ʈ�� �ٽ� ä���.
 * ����� ������ ����Ʈ��� �Ѵ�.
 * 
 * a>>>b
 * a�� �� ��Ʈ�� ���������� b�� ����Ʈ�ϴ�. �׸��� �ֻ��� ��Ʈ�� ���ڸ��� 0���� ä���.��
 * ���� ������ ����Ʈ����Ѵ�.
 * 
 * a<<b
 * a�� �� ��Ʈ�� �������� b�� ����Ʈ�Ѵ�. �׸��� ������ ��Ʈ�� ���ڸ��� 0���� ä���.
 * ����� ���� ����Ʈ��� �Ѵ�.
 * 
 * �ǽ� 1 ����!
 */

import java.util.Scanner;

public class Example{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(Integer.toBinaryString(num));
		
		int num2=sc.nextInt();
		num=num>>>--num2;
		System.out.println(num2&1);
	}
}

