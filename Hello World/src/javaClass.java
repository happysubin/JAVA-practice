
import java.util.Scanner;
import java.lang.ArithmeticException;
import java.util.InputMismatchException;

public class javaClass{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int beDividedNumber=1;
		int dividingNumber=0;
		int check=0;
		
		while(true) {
			
			try {
				if(beDividedNumber!=check) {
				System.out.println("�������� �Է��Ͻÿ�.");
				 beDividedNumber=sc.nextInt();
				}
			}
			
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				sc.next();
				continue;
			}
			
			try {
				System.out.println("�������� �Է��Ͻÿ�.");
				dividingNumber=sc.nextInt(); 
			}
			
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				check=beDividedNumber;
				sc.next();
				continue;
			}
			
			try {
				int result=beDividedNumber/dividingNumber;
				System.out.println(beDividedNumber+"�� "+dividingNumber+"�� ������ "+result+"�Դϴ�.");
				check=0;
			}
			catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�.");
				continue;
			}
			finally {
				
			}
		}
		
	}
}
//������ ���ڷ� 0�� ������ �ȵȴ�.