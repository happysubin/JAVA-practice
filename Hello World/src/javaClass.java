
/*

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
*/
//������ ���ڷ� 0�� ������ �ȵȴ�.

import java.util.Scanner;

class Book{
	String title,author,year;
	
	public Book(String title, String author) {
		this(title,author,"�߰��⵵�̻�");
	}
	public Book(String title, String author,String year) {
		this.title=title;
		this.author=author;
		this.year=year;
	}
}
	

public class javaClass{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book[] book=new Book[2];
		for(int i=0;i<book.length;i++) {
			System.out.println("����>>");
			String title=sc.nextLine();
			
			System.out.println("����>>");
			String author=sc.nextLine();
			
			System.out.println("�߰��⵵>>");
			String year=sc.nextLine();
			
			if(year=="") {
				book[i]=new Book(title,author);
			}
			else {
				book[i]=new Book(title,author,year);
			}
			
		}
		for(int i=0;i<book.length;i++) {
			System.out.print("(" + book[i].title + ", " + book[i].author+ ", " + book[i].year + ")");
		}
		sc.close();
		
	}
}