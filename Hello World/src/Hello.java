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

//1026
/*
import java.util.Scanner;

public class Hello{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] str;
        str=sc.next().split(":");
        System.out.printf("%s",str[1].equals("00")?'0':str[1]);
    }
} 00:00:00 �ú��� ���� ����ϴµ� ���� 00 �̸� 0�� ���.
equal �޼ҵ�� ���� ��!!! ==�� �ּҰ��� ���Ѵٰ� �Ѵ�.
*/

//1027
/*
import java.util.Scanner;
public class Hello{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] str;
        str=sc.next().split("\\."); .�� �������� ���ڿ��� ������
        System.out.printf("%s-%s-%s",str[2],str[1],str[0]);
        
    }
}
*/

//1028
/*
import java.util.Scanner;
public class Hello{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a; long int ���� ����
        a=sc.nextLong(); long int ���� �޴´�
        System.out.printf("%d", a);
    }
}
*/
//1029
/*
import java.util.Scanner;
public class Hello{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a; 
        a=sc.nextDouble(); 
        System.out.printf("%.11f", a);
    }
}
   �ڹٴ� %lf �� ���� %.11f �̷��� �ڸ����� ��Ÿ���� �� �����Ѵ�.
*/

//1030

/*

import java.util.Scanner;
public class Hello{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a; 
        a=sc.nextLine(); 
        System.out.printf("%s", a);
    }}
    
*/
//1031
/*import java.util.Scanner;
public class Hello{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a; 
        a=sc.nextInt(); 
        System.out.printf("%o", a); 8������ ���
    }}
    */

//1032
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a; 
        a=sc.nextInt(); 
        System.out.printf("%x", a); 16���� ��� ���ĺ��� �ҹ����̴�.
    }}
    

*/

//1033
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a; 
        a=sc.nextInt(); 
        System.out.printf("%X", a.); 16�������� ��� ���ĺ��� �빮���̴�.
    }
  }
    */

//1034
/*
import java.util.Scanner;
public class Hello{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a;
        int b;
        a=sc.next();
        b=Integer.valueOf(a, 8); ���ڿ��� ���ڿ��� �޾Ƽ� ���ڿ��� 8������ �ٲ۴�.
        System.out.printf("%d", b);
        
    }
}
//1035
 /*
 import java.util.Scanner;
public class Hello{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a;
        int b;
        a=sc.next();
        b=Integer.valueOf(a, 16); ���ڿ��� ���ڷ� �޾Ƽ� 16������ �ٲ۴�
        System.out.printf("%o", b); 16������ 8������ ���
        
    }
}
//1036
 //charAt�� �ڹٿ� ���ڿ��� index���� ���� ���ڸ� �о���� �Լ�
  /*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char a;
        int b;
        a=sc.next().charAt(0);  ���ڿ����� 0�ε����� ������ ���ڸ� �����´�  (�ѹ��ڸ� �Էµ�)
        b=(int)a; ���ڸ� int������ �ٲ۴�. ���⼭ ������ ���� �ٲ�� ������ ���� �ƽ�Ű�ڵ��̴�.
        System.out.printf("%d", b);
    }}
    
  */
/*
 import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char a;
        a=sc.next().charAt(0);
        int b=a; char���� int���� �ھƵ� �׳� ����ȴ�!1
        System.out.printf("%d", b);
    }}
    
*/
//1037

/*

 import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        char b=(char)a; �Ȱ��� �׳� ���ڸ� char������ �ٲٸ� �ƽ�Ű�ڵ� ������ �ٲ��.
        System.out.printf("%c", b);
    }}
    /*

//1038 1039

/*
 import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a,b;
        a=sc.nextDouble();
        b=sc.nextDouble();
        
        System.out.printf("%.0f",a+b); //�̷��� �Ҽ��� �Ʒ��� ��������ʴ´�!!!
        
    }}
    */

//1040
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        System.out.printf("%d", -a);
    }
}
*/
//1041
/*
 * import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char a;
        a=sc.next().charAt(0);
        System.out.printf("%c", a+1); a�� �Է��ϸ� b�� ��µ˴ϴ�.
    }
}
 */

//1042
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.printf("%d", a/b);
    }
}
*/

//1043
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.printf("%d", a%b);
    }
}
*/

//1044
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a;
        a=sc.nextInt();
        System.out.printf("%d", ++a);
    }
}
*/

//1045

/*

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a,b;
        a=sc.nextDouble();
        b=sc.nextDouble();
        System.out.printf("%.0f\n", a+b); �Ҽ������� �Ⱥ����ش� �� �����ڸ��� ������!!!
        System.out.printf("%.0f\n", a-b);
        System.out.printf("%.0f\n", a*b);
        System.out.printf("%.0f\n", a/b);
        System.out.printf("%.0f\n", a%b); 
        System.out.printf("%.2f", a/b);
    }
}


*/

//1046
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        System.out.printf("%.0f\n", a+b+c); 
        System.out.printf("%.1f", (a+b+c)/3);
      
    }
}
*/

//1047

/*

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
        
        System.out.printf("%d", a<<1);
        
	}
}
*/

//1048
/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b=sc.nextInt();
		sc.close();
        
        System.out.printf("%d", a<<b);
        
	}
}
*/
//1049
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.printf("%d",a>b?1:0);
    }
}


*/

//1050
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.printf("%d",a==b?1:0);
    }
}
*/
//1051
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.printf("%d",b>=a?1:0);
    }
}
*/

//1052
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.printf("%d",b!=a?1:0);
    }
}
*/

//1053

/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
    
        System.out.printf("%b",a==1?0:1);
    }
}

//1054
 /*
  * import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==1&&b==1){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        
    }
}
  */
//1055
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==1||b==1){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        
    }
}
*/

//1056
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if((a==1&&b==0)||(a==0&&b==1))System.out.println(1);
        else System.out.println(0);
    }
}

*/

//1057
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==b)System.out.println(1);
        else System.out.println(0);
    }
}

*/

//1058
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==0&&b==0)System.out.println(1);
        else System.out.println(0);
    }
}

*/

//1059
/*

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=~a; ��Ʈ������.
        System.out.println(b);
    }
}
*/

//1060

/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(a&b); and �� ������
    }
}
*/

//1061
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(a|b); or ������
    }
}
*/

//1062
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(a^b); xor ������.
    }
}
*/

//1063
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(a>b?a:b);
    }
}
*/

//1064

/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println((a<b?a:b)<c?(a<b?a:b):c);
    }
}
*/

//1065
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a%2==0) System.out.println(a);
        if(b%2==0) System.out.println(b);
        if(c%2==0) System.out.println(c);
        
    }
}

*/

//1066
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a%2==0) System.out.println("even");
        else System.out.println("odd");
        if(b%2==0) System.out.println("even");
        else System.out.println("odd");
        if(c%2==0) System.out.println("even");
        else System.out.println("odd");
        
    }
}
*/

//1067
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(a>=0){
            System.out.println("plus");
            if(a%2==0)System.out.println("even");
            else System.out.println("odd");
        }
        else{
            System.out.println("minus");
            if(a%2==0)System.out.println("even");
            else System.out.println("odd");
        }
        
    }
}

*/

//1068

/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(a>=90){
            System.out.println('A');
        }
        else if(a>=70){
            System.out.println('B');
        }
        else if(a>=40){
            System.out.println('C');
        }
        else{
            System.out.println("D");
        }
        
    }
}
*/

//1069
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.next();
        switch(str){
            case "A":
                System.out.println("best!!!");
                break;
            case "B":
                System.out.println("good!!");
                break;
            case "C":
                System.out.println("run!");
                break;
            case "D":
                System.out.println("slowly~");
                break;
            default :
                System.out.println("what?");
            
        }
    }
}

*/
//1070
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        switch(a){
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;
        }
    } 
}
//1071
 
 /*
  * import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a!=0){
            System.out.println(a);
            a=sc.nextInt();
        }
        
    }
}
  */
//1072

/*
import java.util.Scanner;

public class Hello{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        
        for(int i=0;i<a;i++ ){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++ ){
            System.out.println(arr[i]);
        }
    }
}
*/

//1073
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        while(a!=0){
            System.out.println(a);
            a=sc.nextInt();
        }
    }
}
*/

//1074
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        while(a>0){
            System.out.println(a);
            --a;
        }
    }
}
*/

//1075
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        while(a>0){
            --a;
            System.out.println(a);
            
        }
    }
}
*/
//1076
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0); ���ڿ��� ���ڷ� �����(1�� ���ڸ� �޴´�)
        int b=(int)'a';   a�� �ƽ�Ű�ڵ尪�� �����ͼ� ���Ѵ�.
        do{
            System.out.println((char)b);  a���� ���
            b++; �ƽ�Ű�ڵ� �� �������� ���Ѵ�.
        }while(b<=(int)a); a�� �Էµ� ������ �ƽ�Ű �ڵ� ������ �۴ٸ�
    }
}

*/

//1077
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0;
        do{
            System.out.println(b);
            b++;
        }while(b<=a);
    }
}
*/
//1078
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0,sum=0;
        while(num>=a){
            sum=sum+a;
            a=a+2;
        }
        System.out.println(sum);
    }
}

*/

//1079
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char str=sc.next().charAt(0);
        while(str!='q'){
            System.out.println(str);
            str=sc.next().charAt(0);
        }
        System.out.println(str);
    }
}
*/

//1080
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0,i=1;
        do{
            sum=sum+i;
            ++i;
        } while(sum<num);
        System.out.println(i-1);
    }
}

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=0; i<num;i++){
            sum=sum+i;
            if(sum>=num){
                System.out.println(i);
                break;
            }
        }
        
    }
}
*/
//1081
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=1; i<=a;i++){
            for(int j=1; j<=b;j++){
                System.out.printf("%d %d\n",i,j);
            }
            
        }
    }
}
*/

//1082
//sc.nextInt(16)�� �̿��� 16������ �޴´�. %X�� �̿��� 16������ ���
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(16);
        for(int i=1;i<16;i++){
            System.out.printf("%X*%X=%X\n",num,i,num*i);
        }
    }
}
*/

//1083
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(num>=i){
            if(i%3==0)System.out.printf("%c ",'X');
            else System.out.printf("%d ",i);
            i++;
        }
    }
}
*/

//1085
/*
 * import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		long a=Integer.valueOf(str[0]);
		long b=Integer.valueOf(str[1]);
		long c=Integer.valueOf(str[2]);
		long d=Integer.valueOf(str[3]);
		double result=((((a*b*c*d)/8)/Math.pow(2, 10))/Math.pow(2, 10));
		System.out.printf("%.1f MB",result);
	}
}
*/

//1086
/*
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		long a=Integer.valueOf(str[0]);
		long b=Integer.valueOf(str[1]);
		long c=Integer.valueOf(str[2]);
		double result=((((a*b*c)/8)/Math.pow(2, 10))/Math.pow(2, 10));
		System.out.printf("%.2f MB",result);
	}
}
*/

//1087

/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(); 
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
            if(sum>=num){
                System.out.printf("%d", sum);
                break;
            }
        }
    }
}
*/

//1088
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<=num;i++){
            if(i%3!=0) System.out.printf("%d ",i);
        }
    }
}
*/

//1089
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] str=sc.nextLine().split(" ");
        int a=Integer.valueOf(str[0]);
        int b=Integer.valueOf(str[1]);
        int c=Integer.valueOf(str[2]);
        System.out.printf("%d", a+b*(c-1));
    }
}
*/

//1090
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String[] str=sc.nextLine().split(" ");
        int a=Integer.valueOf(str[0]);
        int b=Integer.valueOf(str[1]);
        int c=Integer.valueOf(str[2]);
        System.out.printf("%.0f", a*Math.pow(b,c-1));
    }
}
*/

//1091
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] str=sc.nextLine().split(" ");
        long a=Integer.valueOf(str[0]);
        long b=Integer.valueOf(str[1]);
        long c=Integer.valueOf(str[2]);
        long d=Integer.valueOf(str[3]);
        for(int i=1;i<d;i++ ){
            a=(a*b)+c;
        }
        System.out.printf("%d", a);
    }
} �����Ѽ��� 1��° �����̴� ������� 13�� �ݺ��̸� 12�� ������Ѵ�.
*/

//1092
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] str=sc.nextLine().split(" ");
        int a=Integer.valueOf(str[0]);
        int b=Integer.valueOf(str[1]);
        int c=Integer.valueOf(str[2]);
        int day=1;
        while((day%a!=0)||(day%b!=0)||(day%c!=0))day++; �ּҰ������ whle���� ����ٰ� ����.
        System.out.println(day);
    }
}
*/

//1093
/*

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[23];
        int num=0;
        
        // �� �κ��� �߿��ߴ�.
        for(int i=0;i<a;i++){
            num=sc.nextInt();
            arr[num-1]+=1;
        }      
        //
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
*/

//1094
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int [] arr=new int[num];
    for(int i=0; i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=arr.length-1; i>=0;i--){
        System.out.printf("%d ",arr[i]);
    }
    
    }
}
*/
//1096