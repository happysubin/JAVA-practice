
/*
class Point {
int x, y;
public Point(int x, int y) {
this.x = x; this.y = y;
}
public boolean equals(Point obj) {
if(obj.x == x && obj.y == y) return true; // obj.x, obj.y
else return false;
	}

}


public class Example {
public static void main(String[] args) {
Point a = new Point(2,3);
Point b = new Point(2,3);
Point c = new Point(3,4);
c=b;
if(a == b) System.out.println("a==b"); //a==b�� �ּ� ���� �ٸ��Ƿ� ��¹��� ����˴ϴ�. ��� ������ ���� �����ϴ�.
if(c == b) System.out.println("a==c"); //c�� a�� �ּ� ���� �����Ƿ� �� ��¹��� ����˴ϴ�.
if(a.equals(b)) System.out.println("a is equal to b"); //�����ϴ� ��� ������ ���Ƽ� ��¹��� ����˴ϴ�. ��ü�� ������ �����Ͱ� ����.
if(a.equals(c)) System.out.println("a is equal to c"); //�����ϴ� ��� ������ ���Ƽ� ��¹��� ����˴ϴ�. ��ü�� ������ �����Ͱ� ����.
	}
}

*/



import java.util.Scanner;

public class Example{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		
		System.out.println("��ǥ�� �Է��ϼ���");
		int pointA=sc.nextInt();
		int pointB=sc.nextInt();

		System.out.println("��ǥ�� �Է��ϼ���");
		int pointX=sc.nextInt();
		int pointY=sc.nextInt();

		double distanceY=Math.pow((pointY-pointB),2);
		double distanceX=Math.pow((pointX-pointA),2);

		double pointDistance1=Math.sqrt(distanceX);
		double pointDistance2=Math.sqrt(distanceY);

		if(pointDistance1==pointDistance2) {
			System.out.println("�Ÿ��� ����.");
		}else {
			System.out.println("�Ÿ��� �ٸ���.");
		}

	}
}