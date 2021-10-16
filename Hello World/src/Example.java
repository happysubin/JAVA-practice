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
 * 
 * 
 */
//4-11 �߿�


import java.util.Scanner;
/*
public class Example{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(Integer.toBinaryString(num));
		int num2=sc.nextInt();
		System.out.println(num>>>--num2&1);
	}
}
*/

/*
import java.lang.ArithmeticException;
import java.util.InputMismatchException;

public class Example{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dividing=0,divided=0;
		
		while(true) {
			try {
			System.out.println("�������� �Է��Ͻÿ�");
			divided=sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("���ڰ� �ƴմϴ�. ���ڸ� �Է��ϼ���.");
				sc.next();
				continue;
			}
			while(true) {
				try {
					System.out.println("�������� �Է��Ͻÿ�");
					 dividing=sc.nextInt();
					}
					catch(InputMismatchException e) {
						System.out.println("���ڰ� �ƴմϴ�. ���ڸ� �Է��ϼ���.");
						sc.next();
						continue;
					}
				try {
						int result=divided/dividing;
						System.out.println(divided+"�� "+dividing+"�� ������ "+result+"�Դϴ�.");
						
						break;
					}
					catch(ArithmeticException e) {
						System.out.println("0���� ���� �� �����ϴ�.");
						continue;
					}
			}
		}
	}
}
*/

class Book{
	String year,author,title;
	Book(String author, String title, String year){
		this.author=author;
		this.title=title;
		this.year=year;
	}
	Book(String author, String title){
		this(author,title,"���۳⵵ �̻�");
	}
}

public class Example{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book[] book=new Book[2];
		for(int i=0;i<book.length;i++) {
			System.out.println("���� �Է��Ͻÿ�.");
			String author=sc.nextLine();
			System.out.println("���� �Է��Ͻÿ�.");
			String title=sc.nextLine();
			System.out.println("���۳⵵ �Է��Ͻÿ�.");
			String year=sc.nextLine();
			
			if(year!="") {
				book[i]=new Book(author,title,year);
			}else {
				book[i]=new Book(author,title);
			}
		}
		for(int i=0;i<book.length;i++) {
			System.out.print("(" + book[i].title + ", " + book[i].author+ ", " + book[i].year + ")");
		}
		sc.close();
	}
}