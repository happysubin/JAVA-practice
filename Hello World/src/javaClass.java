
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
	public Disk1() {};
	public int area() {
		return width*height;
	}
}

class Disk2 extends Disk1{
	private int depth=7;
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
		return area()*depth;
	}
}

class javaClass{
	public static void main(String[] args) {
		Disk2 d=new Disk2(8);
	System.out.println("d width = "+d.width);
	System.out.println("dheight="+d.height+",area="+d.area());
	d.setdepth(9);
	System.out.println("ddepth="+d.getdepth()+",vol="+d.vol());
	}
}

//���� 1 
/*

d width = 5
dheight=6,area=30
ddepth=9,vol=270

/*