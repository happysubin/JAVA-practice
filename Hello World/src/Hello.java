//�ڵ�� 100�� 1001��     ��Ŭ������ Ŭ������ �����̸��� ���ƾ��Ѵ�!
/*
public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello");

	}

}*/

//1002
/*public class Hello{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
*/

//1003
/*public class Hello{
    public static void main(String[] args){
        System.out.println("Hello \nWorld");
    }
}*/

//1004
/*
 public class Hello{
    public static void main(String[] args){
        System.out.println("\'Hello\'");  \' ���� ��ǥ�� ����
    }
} 
 */
 //1005
/* public class Hello{
    public static void main(String[] args){
        System.out.println("\"Hello World\"");  
    }
} 
*/
//1006
/*
public class Main{
    public static void main(String[] args){
        System.out.println("\"!@#$%^&*()\"");
    }
}
*/
//1007
/*
public class Main{
    public static void main(String[] args){
        System.out.println("\"C:\\Download\\hello.cpp\"");
    }
}
*/
//1008
/*public class Hello{
	public static void main(String[] args) {
		System.out.println("\u250C\u252C\u2510\n");
	}
}*/

//1010
/*
 import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        System.out.println(num);
    }
}
 */

//1011
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.next();  sc.nextLine�� ������ �� �޴´�
        System.out.println(s);
    }
}
//1012
 * 
 import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float n;
        n=sc.nextFloat();
        System.out.printf("%f",n);  //printf �� �ε��Ҽ��� ǥ������. c���� �ſ� ����غ��δ�.
    }
    
}
 */

//1013

/* 
 * import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.printf("%d %d",a,b);
    }
}
 */
//1014

/*
 import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a,b;
        a=sc.next();
        b=sc.next();
        System.out.println(b+" "+a);
    }
}

//1015
 /*
  import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a;
        a=sc.nextDouble();
        System.out.printf("%.2f",a);
        
    }
}
*/


//1017
  /*
   import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        System.out.printf("%d %d %d",a,a,a);
        
    }
}
   * */
 
//1018
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a;
        a=sc.next();
        System.out.println(a);
    }
}
*/

//1019
/*
 import java.util.Scanner;
public class Hello{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str;
		int a,b,c;
		str=sc.next().split("\\.");
		a=Integer.parseInt(str[0]);
		b=Integer.parseInt(str[1]);
		c=Integer.parseInt(str[2]);
		System.out.printf("%04d.%02d.%02d",a,b,c); //�̷��� ǥ���ϴ°� �߿��ߴ�!!!
		 split("\\.") �̷����� .�� �������� �迭�� �����. ����ǥ�����̶��ؼ� 
 \.�ϴٰ� ������ �ʹ� ���� ���Դ�..
	}
}
 */

//1020
/*import java.util.Scanner;
public class Hello{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] a;
        a=sc.next().split("-");
        
        System.out.println(a[0]+a[1]);
    }
}
 �ڹٴ� �迭�� ���ڿ��� c�� �ٸ���. ���ڿ��� �迭�� �ٸ��Ƿ� ���ڿ��� �ڸ��� �迭�̹Ƿ� Ÿ���� ���ڿ��� ������ ����
 �Ҵ��� �� ����.

*/

//1021

/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a;
        a=sc.next();
        System.out.println(a);
    }
}
*/

//1022
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a;
        a=sc.nextLine();
        System.out.println(a);
    }
}
*/
//1023
/*
import java.util.Scanner;

public class Hello{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a;
        String[] str;
        a=sc.nextDouble();
        str = Double.toString(a).split("\\."); ĳ�����ϰ� ���ڿ��� ������ ���ڿ� �迭�� �Ҵ�
        System.out.printf("%s %s",str[0],str[1]);
    }
}
*/

//1024

/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] str;
        str=sc.next().split(""); //�̷��� ��� ���ڿ��� ���� 1���� ������. js ���� �ٸ���..
        for(int i=0;i<str.length;i++) {
        	System.out.printf("\'%s\'\n",str[i]);
        }
    }
}*/

//1025

/*
import java.util.Scanner;
public class Hello{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] a;
        int j=0;
        a=sc.next().split(""); ���� ���ڹ��ڿ��� �� ������
        for(int i=10000; i>=1;i=i/10){
            System.out.printf("[%d] \n", Integer.parseInt(a[j++])*i);
            //���� ���� ���ϸ鼭 �迭�� �ε����� �������� �ش��ϴ� �ε����� �°� ���Ѵ�
        }
    }
}
*/