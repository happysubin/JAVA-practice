//���� ���ڿ� ������

//�ƽ�Ű �ڵ�
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        System.out.print((int)a);
    }
}
*/

/*������ ��
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String[] str=sc.next().split("");
        int sum=0;
        for(int i=0;i<num;i++){
            sum=sum+Integer.parseInt(str[i]);
        }
        System.out.print(sum);
    }
}
*/
// �ڹٴ� int �迭�� �����ϸ� �ʱⰪ�� 0�̰� string �迭�� �ʱⰪ�� null�̴�.

//���� ���ڿ��ݺ� 2675
/*
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int cnt=0;
		
		for(int i=0;i<num;i++) {
			cnt=sc.nextInt();
			String[] arr=sc.next().split("");
			
			for(int j=0;j<arr.length;j++) {
				for(int z=0;z<cnt;z++) {
					System.out.print(arr[j]);
				}
			}
			System.out.println();
		}
		
	}
}
*/
/*
import java.util.Scanner;
//�ҹ��ڸ� ó���� ���� �ε����� ǥ��
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next(); //�̸��� �޴´�
        int[] cnt=new int[26]; // ���ĺ��� ���� �迭
        
        for(int i=0;i<cnt.length;i++){
            cnt[i]=-1; //������� ���� ���ĺ��� -1�� ����ϹǷ� -1�� �ʱ�ȭ
        }
        for(int i=0;i<name.length();i++){
            char content=name.charAt(i); //�̸� ���ڿ��� ���ڵ��� �ٲ�����
            if(cnt[content-'a']==-1) { //�ʱ�ȭ�� ���� �ƴϸ� ���� �������� �ʴ´�.
            	cnt[content-'a']=i;
            }// a�� �������� �ҹ��ڸ� ���ǹǷ� a�� ���� �ε����� ��� b�� �ε����� 1 c�� 2 �̷� �� 
            //���� �ڸ��� i�� ���� ��Ÿ���Ƿ� i�� �迭�� �ε��� ��ҷ� ����.
        }
        for(int i=0;i<cnt.length;i++){
            System.out.print(cnt[i]+" ");
        }
        
    }
}
*/
// ����1157 �ܾ� �����̴�
/*import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word=sc.next().toUpperCase();
		sc.close();
		int[] arr=new int[26];
		int max;
		for(int i=0;i<word.length();i++) {
			arr[word.charAt(i)-'A']++;//���ڿ��� ���ڷ� �ٲٰ� �ҹ��ڷ� ����ϸ� ������Ŵ.
		}
		max=0;
		//max=arr[0]�̶� �ߴٰ� ��� Ʋ�Ⱦ���. ������ �����ϱ�..?
		//�ٷ� ã�Ҵ�. a�� ��� ������ �߻��Ѵ�. i+'A' ���� i�� 0�� �������� �ʱ� �����̴�!!!����!
		char answer='?';
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				answer=(char)(i+'A');
			}else if(max==arr[i]) {
				answer='?';
			}
		}
		System.out.print(answer);
	}
}
*/

//���� 1152 �ܾ� �������ϱ�
/*
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] arr=sc.nextLine().trim().split(" ");
		// ���Ⱑ ����� split�� �迭�� �ٲ㼭 ������ ����. ������ 1�� �ִ°Ŵ�.
		//���⸸�ϸ� �迭��ҿ� �ƹ��͵� ���� �ʾҴ�. �׷��� �װ� üũ�ϰ� �ٸ����� ���������� ������
		if(arr[0].equals("")) {
			System.out.print(0);
		}else {
			System.out.print(arr.length);
		} 
		
	}
}
*/

//���� 2908 ���� ����� ū�� ã��
/*
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String[] numbers=sc.nextLine().split(" ");
		for(int i=0;i<2;i++) {
			StringBuffer sb=new StringBuffer(numbers[i]);
			numbers[i]=sb.reverse().toString(); 
			//sb��ü ������ ��밡���� reverse �޼ҵ带 �̿��ؼ� ������ Ÿ���� ���������� ���ڿ��� �ٲ۴�.
		}
		int a=Integer.parseInt(numbers[0]);
		int b=Integer.parseInt(numbers[1]);
		if(a>b) {
			System.out.print(a);
		}
		else {
			System.out.print(b);
		}
	}
}
*/

// ���ڿ����� ���ĺ��� ���� �� ���ĺ� �迭�� ������ ������ �ؾ��Ѵ�!!!

//�ڹ� 5622 ��ȭ�� ���� �̰� ��Ǯ��.
/*import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr=sc.next();
		int sum=0;
		for(int i=0;i<arr.length();i++) {
			switch(arr.charAt(i)){
			case'A':
			case'B':
			case'C':
				sum+=3;
				break;
			case'D':
			case'E':
			case'F':
				sum+=4;
				break;
			case'G':
			case'H':
			case'I':
				sum+=5;
				break;
			case'J':
			case'K':
			case'L':
				sum+=6;
				break;
			case'M':
			case'N':
			case'O':
				sum+=7;
				break;
			case'P':
			case'Q':
			case'R':
			case'S':
				sum+=8;
				break;
			case'T':
			case'U':
			case'V':
				sum+=9;
				break;
			case'W':
			case'X':
			case'Y':
			case'Z':
				sum+=10;
				break;
	
			}
		}
		System.out.print(sum);
	}
}
/*�̰� ���ͳݿ��� ã�� Ǯ�� ������ ��ȯ�� ���� ������.
�ƽ�Ű�ڵ尪�� �������� ������. �� �� �����..
��ü �ڵ� ���� ������ ������ �κи� �����Դ�.
			if(value < 68) count += 3;
			else if(value < 71) count += 4;
			else if(value < 74) count += 5;
			else if(value < 77) count += 6;
			else if(value < 80) count += 7;
			else if(value < 84) count += 8;
			else if(value < 87) count += 9;
			else count += 10;

*/

//��¥ ������ߴ�
//ũ�ξ�Ƽ�� ���ĺ� ����
/*
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next().trim();
		int cnt=0;
		int len=str.length();
		for(int i=0;i<len;i++) {
			cnt++;
			switch(str.charAt(i)) {
			case'c':
				if(i<len-1&&(str.charAt(i+1)=='='||str.charAt(i+1)=='-')) {
					i++;
				}
				break;
			case'd':
				if(i<len-2&&str.charAt(i+1)=='z'&&str.charAt(i+2)=='=') {
						 i+=2;
				}
				else if(i<len-1&&str.charAt(i+1)=='-') {
						 i++;
				}
				break;
			case'l':
			case'n':
				if(i<len-1&&str.charAt(i+1)=='j') {
						i++;
				}
				break;
			case's':
			case'z':
				if(i<len-1&&str.charAt(i+1)=='=') 
					{
						i++;
					}
				break;
			}
			
		}
		sc.close();
		System.out.print(cnt);
	}
}
*/
//������ �߻��ϴµ� ������ �ٷ� �������� c�����´ٰ� �����غ���.
//�׷��� c�� i+1�� �ϸ� ���� ���ڸ� ã�µ� ���ڿ��� �������̹Ƿ� �� ã�� ���ڰ� ���� ������ �߻��Ѵ�.
//�׷��Ƿ� ���ǹ��� ��ü������ �߰�����.
//����ġ���� �ش��ϴ� ���̽��� ã���� �����ϰ� break�� ������ �ؿ� ��츦 �����Ѵ�. ����



//�� Ʋ�ȴ��� �����غ���
/*
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next().trim();
		int cnt=0;
		for(int i=0;i<str.length();i++) {
			switch(str.charAt(i)) {
			case'c':
				if(i<str.length()-1) {
					if(str.charAt(i+1)=='='||str.charAt(i+1)=='-') {
						i++;
					}
				}
				break;
			case'd':
				//���Ⱑ ��������.
//if���� �����ϸ� ���� else if ���� �ȵ�����. �׷��� �ܺ� if�� �����ϰ� ���� if �� �����Ѵٰ� �����ϸ�
// else if �� ���� ���� �ִµ� else if�� �� ���� ����. �׷��� �̷� ��츦 �����ϱ����� �ѹ��� üũ������Ѵ�.
				//���Ⱑ �������� �ذ�!!!!
				/*if(i<str.length()-1) {
					if(str.charAt(i+1)=='-') {
						 i++;
					}
				}	
				else if(i<str.length()-2) {
					if(str.charAt(i+1)=='z'&&str.charAt(i+2)=='=') {
						 i+=2;
					}
				}
				break;
				//���� �̰� �´�.
				
				if(i<str.length()-1&&str.charAt(i+1)=='-') {
						 i++;	
				}	
				else if(i<str.length()-2&&str.charAt(i+1)=='z'&&str.charAt(i+2)=='=') {
						 i+=2;
				}
				 break;
			case'l':
			case'n':
				if(i<str.length()-1) {
					if(str.charAt(i+1)=='j') {
						i++;
					}
				}
			break;
			case's':
			case'z':
				if(i<str.length()-1) {
					if(str.charAt(i+1)=='=') {
						i++;
					}
				}
				break;
			}
			cnt++;
		}
		sc.close();
		System.out.print(cnt);
	}
}
*/

//�Ǻ���ġ ����
/*
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int result=fibo(n);
		System.out.print(result);
	}
	public static int fibo(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return fibo(n-1)+fibo(n-2);
	}
}
*/


//���� 25 88
/*
import java.util.Scanner;

public class brute {
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	String[] num2=sc.next().split("");
	for(int i=2;i>=0;i--) {
			System.out.printf("%d\n", num*Integer.parseInt(num2[i]));
		}	
	String fin = String.join("",num2);
	System.out.printf("%d",num*Integer.parseInt(fin));
	}
}

*/
/*
import java.util.Scanner;
public class Main{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.printf("%d\n", a+b);
	System.out.printf("%d\n", a-b);
	System.out.printf("%d\n", a*b);
	System.out.printf("%d\n", a/b);
	System.out.printf("%d\n", a%b);
	}
}
*/

/*
import java.util.Scanner;
public class Main{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int A=sc.nextInt();
	int B=sc.nextInt();
	int C=sc.nextInt();
	System.out.printf("%d\n",(A+B)%C);
	System.out.printf("%d\n",((A%C)+(B%C))%C);
	System.out.printf("%d\n",(A*B)%C);
	System.out.printf("%d\n",((A%C)*(B%C))%C);
	
	}
}

*/
/*
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>b) System.out.println(">");
		else if(a<b) System.out.println("<");
		else System.out.println("==");
	}
}
*/

//���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
/*
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score>=90) System.out.println("A");
		else if(score>=80) System.out.println("B");
		else if(score>=70) System.out.println("C");
		else if(score>=60) System.out.println("D");
		else  System.out.println("F");
		
	}
	
	
}
*/

/*
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        
    }
}
*/

/*
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if (x>0&&y>0)System.out.println("1");
		else if (x<0&&y>0)System.out.println("2");
		else if (x>0&&y<0)System.out.println("4");
		else System.out.println("3");
	}
}
*/

//�˶��ð� ����
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int hour=sc.nextInt();
		int min=sc.nextInt();
		if(hour==0&&min<45) {
			int minus=45-min;
			System.out.printf("%d %d",23,60-minus);
		}
		else if(min<45) {
			int minus=45-min;
			System.out.printf("%d %d",hour-1,60-minus);
		}
		else {
			System.out.printf("%d %d",hour,min-45);
		}
	}
}