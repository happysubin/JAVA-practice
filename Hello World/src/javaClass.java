
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


/*
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

*/


class Disk  {
	public int width=5;
	public Disk(){};
}

class Disk1 extends Disk{
	protected int height=6;
	public int width=10; // ���⿡ A��Ʈ �߰�
	public Disk1() {};
	public int area(Disk2 d) { //���⿡ C��Ʈ ����
		return d.width*d.height; 
	}
}

class Disk2 extends Disk1{
	private int depth=7;
	public int width=15; //���⿡ B��Ʈ �߰�
	public Disk2(int depth) {
		this.depth=depth;
	}
	public void setdepth(int dep) {
		this.depth=dep;
	}
	public int getdepth() {
		return depth;
	}
	public int vol() {
		return area(this)*depth; //���⿡ D��Ʈ ����
	}
}

class javaClass{
	public static void main(String[] args) {
		Disk2 d=new Disk2(8);
	System.out.println("d width = "+d.width);
	System.out.println("dheight="+d.height+",area="+d.area(d)); //���⿡ E��Ʈ ����
	d.setdepth(9);
	System.out.println("ddepth="+d.getdepth()+",vol="+d.vol());
	}
}

//���� 1 
/*

d width = 5
dheight=6,area=30
ddepth=9,vol=270

*/

//���� 2 (A,B)

/*
d width = 15  ���� �������� �� �Ҵ�� width. Disk2���� �Ҵ�.

dheight=6,area=60 height �� Disk1���� �� �Ҵ�.
area �޼ҵ尡 ��ũ1�� width height�� ���� ���� 6�� 10 �̴�. ���� 60

ddepth=9,vol=540 9�� 60�� ���Ѵ�.

*/

//���� 3 (A,B,C,D,E)

/*


d width = 15 ���� �������� �� �Ҵ�� width. Disk2���� �Ҵ�.
dheight=6,area=90 �̹����� Disk1�� ���� �ƴ� ���ڷ� ���� ��ü�� width�� height�� ���Ѵ�.
15�� 6�� ���ؼ� 90
ddepth=9,vol=810 90���ϱ� 9 depth�� set�Լ��� �̿��ؼ� ������ ������ �� ���� 810.



*/


