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
/*
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
*/

/*
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=num;i>0;--i) {
        	System.out.printf("%d\n",i);
        }
        
    }
}
*/

/*
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�������� ���� �߽��� �Է��ϼ���");
		int radius=sc.nextInt();
		int centerX=sc.nextInt();
		int centerY=sc.nextInt();
		
		System.out.println("��ǥ�� �Է��ϼ���");
		int pointX=sc.nextInt();
		int pointY=sc.nextInt();
		
		double distanceY=Math.pow((pointY-centerY),2);
		double distanceX=Math.pow((pointX-centerX),2);
		
		double pointDistance=Math.sqrt(distanceX+distanceY);
		
		if(pointDistance>radius) {
			System.out.println("�� �ۿ� �ֽ��ϴ�.");
		}else {
			System.out.println("�� �ȿ� �ֽ��ϴ�.");
		}
		
	}
}
*/

/*
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�Է� :");
		int num1=sc.nextInt();
		System.out.println(Integer.toBinaryString(num1));
		
		System.out.println("�Է� : bit�� ��ġ (1 �̻�)");
		int place=sc.nextInt();
		System.out.println("��� :" +((num1>>>--place)&1));
	}
}

*/

/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;  
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		//Buffer reader,writer �ֿܼ��� ����
		
		int num=Integer.parseInt(br.readLine());//�о� ���̰� ���������� ĳ����
		StringTokenizer st; //����ڰ� �����ϴ� ������ �������� ���ڿ���������.
		
		for(int i=0; i<num;i++) {
			st=new StringTokenizer(br.readLine()," "); //������ �а� ���� �������� ������
			bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n"); //���ۿ� �ۼ�
			//nextToken �޼ҵ�� ���ڿ����� ���� ��ū�� �����´�
		}
		bw.flush(); //�̰� �ؾ� ���ۿ� �ۼ��Ǿ��� �͵��� ��� ���´�.
		bw.close();
		br.close();
	}
}
*/

//���� 2741
/*
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(br.readLine());
		for(int i=1;i<=num;i++) bw.write(i+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
*/

/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
	public static void main(String args[])throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(br.readLine());
		for(int i=num;i>=1;i--)bw.write(i+"\n");
		
		
		bw.flush();
		bw.close();
		br.close();
	}
}
*/

/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num=Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		int a,b;
		for(int i=1;i<=num;i++) {
			st=new StringTokenizer(br.readLine()," ");
			a=Integer.parseInt(st.nextToken());
			b=Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
*/

/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
	public static void main(String args[])throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int num=Integer.parseInt(br.readLine());
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
*/

/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
	public static void main(String args[])throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num=Integer.parseInt(br.readLine());
		for(int i=1;i<=num;i++) {
			for(int j=num-i;j>=1;j--)bw.write(" ");
			for(int z=1;z<=i;z++)bw.write("*");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
*/
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[])throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int num=Integer.parseInt(st.nextToken());
		int max=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<num;i++) {
			int content=Integer.parseInt(st.nextToken());
			if(content<max)bw.write(content+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
*/
/*
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[])throws IOException{
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int first=Integer.parseInt(st.nextToken());
		int second=Integer.parseInt(st.nextToken());
		while(first!=0&&second!=0) {
			bw.write(first+second+"\n");
			st=new StringTokenizer(br.readLine()," ");
			first=Integer.parseInt(st.nextToken());
			second=Integer.parseInt(st.nextToken());
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
*/


/*
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[])throws IOException{
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		String str="";
	
		while((str=br.readLine())!=null) {
			st=new StringTokenizer(str," "); 
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			bw.write(a+b+"\n");
		}
		bw.flush();
		
		bw.close();
		br.close();
	}
}
*/

/*
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args)throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	
		int num=Integer.parseInt(br.readLine());
		
		int result=num;
		int cnt=0;
		
		while(true) {
			num=(( num % 10 ) * 10) + (((num / 10) + (num % 10)) % 10);
			//�Է��� �� num�� �ٲ����ϹǷ� result �� �ȵȴ�.
			cnt++;	
			if(num==result)break;
		}
		
		System.out.println(cnt);
	}
}
*/

//���� �迭 ������

/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num=Integer.parseInt(br.readLine());
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int content=Integer.parseInt(st.nextToken());
		int max=content;
		int min=content;
		for(int i=1;i<num;i++) { //�ѹ� �������� �� Ƚ������ 1���� ���δ�.
			content=Integer.parseInt(st.nextToken());
			if(max<content)max=content;
			if(min>content)min=content;
		}
		bw.write(min+" "+max);
		bw.flush();
		bw.close();
		br.close();
	}
}
*/

/*
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int max=0,cnt=1;
		for(int i=1;i<=9;i++) {
			int num=Integer.parseInt(br.readLine());
			if(num>max) {
				max=num;
				cnt=i;
			}
		}
		bw.write(max+"\n"+cnt);
		bw.flush();
		bw.close();
		br.close();
		
	}
}

*/

/*

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=Integer.parseInt(br.readLine());
		int num=a*b*c;
		int[] arr=new int[10];
		
		String[] element=String.valueOf(num).split("");
		for(int i=0;i<element.length;i++) {
			int x=Integer.parseInt(element[i]);//1�̾�
			arr[x]++;
		}
		for(int i=0;i<arr.length;i++) {
			bw.write(arr[i]+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
*/

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int num=Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			String[] str=br.readLine().split(" ");
			int sum=0;
			int cnt=Integer.parseInt(str[0]);
			int moreThanAverage=0;
			
			for(int j=1;j<=cnt;j++) {
				sum+=Integer.parseInt(str[j]);
			}
			
			int average=sum/cnt;

			for(int j=1;j<=cnt;j++) {
				if(average<Integer.parseInt(str[j]))moreThanAverage++;
			}
			System.out.printf("%.3f%%\n",((double)moreThanAverage/cnt)*100);
		}
		br.close();
	}
}
*/

//1193

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			String[] str=br.readLine().split("X");//X�� �������� ����
			int score=0;
			for(int j=0;j<str.length;j++) {// ���� ������ŭ �ݺ�
				if(str[j]!="") {
					String[] Olength=str[j].split(""); //�� ���� O�� �ִ� �� �ٽ� ����.
					//���� ��� OOXXOXXOOO  OO   O OOO �̷��� 3���� ��������.
					//�׷��� X�������� ""�̷� ������.��� �̰͵� üũ�ؾ���
					for(int z=1;z<=Olength.length;z++) {
						score+=z; //���̰� 1�̸� 1�� ���� 2�̸� 1 2 3�̸� 1 2 3!!!
					}
				}	
			}
			System.out.println(score);
		}
		
	}
}
*/

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine()); //�� ���� ������ ����
		double sum=0;
		
		String[] scores=br.readLine().split(" "); //������ �ް� ����� ����
		double max=Double.parseDouble(scores[0]);
		for(int i=1;i<num;i++) {
			double score=Double.parseDouble(scores[i]);
			if(max<score)max=score; //�ִ밪�� ����
			
		}
		
		for(int i=0;i<num;i++) {
			double score=Double.parseDouble(scores[i]);
			double newScore=score/max*100;
			scores[i]=String.valueOf(newScore);
		}
		
		for(int i=0;i<num;i++) {
			
			sum+=Double.parseDouble(scores[i]);
			
		}
		System.out.printf("%.2f",sum/num);
	}
}
*/

/*
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] arr=new int[42];
		int cnt=10;
		
		for(int i=0;i<10;i++) {
			int num=Integer.parseInt(br.readLine())%42;
			if(arr[num]==1) {
				cnt--;
				continue;
			}else {
				arr[num]=1;
				
			}
		}
		System.out.println(cnt);
	}
}
*/

/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		bw.write((int) (Math.pow(2, n) - 1) + "\n");
		hanoi(n,1,2,3);
		bw.flush();
		bw.close();
		br.close();
	}
	public static void hanoi(int n,int a, int b, int c) throws IOException{
		if(n==1) {
			bw.write(a+" "+c+"\n");
			return;
		}
		else {
			hanoi(n-1,a,c,b); //n-1 ���� a���� b�� �̵�
			bw.write(a+" "+c+"\n");//1���� a���� c�� �̵�
			hanoi(n-1,b,a,c); //n-1���� b���� c�� �̵�
		}
	}
}
*/

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int cnt=0;
		
		String[] str=br.readLine().split(" ");
		for(int i=0;i<num;i++) {
			int checkingNum=Integer.parseInt(str[i]);
			int check=0;
			if(checkingNum==1)continue;
			
			for(int j=2;j<=checkingNum;j++) {
				if(checkingNum%j==0) {
					check++;
				}
			}
			if(check==1) {
				cnt++;
			}
			
		}
		System.out.println(cnt);
		br.close();
	}
}
*/

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		int low=Integer.parseInt(br.readLine()); 
		int high=Integer.parseInt(br.readLine()); 
		int min=high;
		for(int i=low; i<=high;i++) { //���� ���� ��ü ������ ������.
			int cnt=0;
			
			if(i==1)continue;
			
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			
			if(cnt==1) {
				sum+=i;
				if(i<min)min=i;
			}
		}	
		
		
		if(sum !=0) {
			System.out.println(sum);
			System.out.println(min);
		}
		else {
			System.out.println(-1);
		}
	}
}
*/

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		while(true) {
			String[] arr=br.readLine().split(" ");
			int a=Integer.parseInt(arr[0]);
			int b=Integer.parseInt(arr[1]);
			int c=Integer.parseInt(arr[2]);
			if(a==0||b==0||c==0)break;
			if(Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2))System.out.println("right");
			else if(Math.pow(a, 2)+Math.pow(c, 2)==Math.pow(b, 2))System.out.println("right");
			else if(Math.pow(c, 2)+Math.pow(b, 2)==Math.pow(a, 2))System.out.println("right");
			else System.out.println("wrong");
		}
	}
}

*/

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] a=br.readLine().split(" ");
		String[] b=br.readLine().split(" ");
		String[] c=br.readLine().split(" ");
	
		if(Integer.parseInt(a[0])==Integer.parseInt(b[0])) System.out.print(c[0]);
		else if(Integer.parseInt(b[0])==Integer.parseInt(c[0])) System.out.print(a[0]);
		else System.out.print(b[0]);
		
		if(Integer.parseInt(a[1])==Integer.parseInt(b[1])) System.out.print(" "+c[1]);
		else if(Integer.parseInt(b[1])==Integer.parseInt(c[1])) System.out.print(" "+a[1]);
		else System.out.print(" "+b[1]);
		
		
	}
}

*/

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int cnt=num;
		for(int i=0;i<num;i++) {
			String arr=br.readLine();
			int check[]=new int[26];
			for(int j=1;j<arr.length();j++) {
				char content=arr.charAt(j);
					char beforeContent=arr.charAt(j-1);
					if(content==beforeContent&&check[beforeContent-'a']==0)continue;
					else if(check[beforeContent-'a']==0&&content!=beforeContent){
						check[beforeContent-'a']=1;
					}
					else if(check[beforeContent-'a']==1) {
						cnt--;
						break;
					}
					if(j==arr.length()-1&&check[content-'a']==1) {
						cnt--;
						break;
					}		
			}	
		}
		System.out.println(cnt);
	}
}
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int[] arr=new int[num];
		
		for(int i=0;i<num;i++) {
			int element=Integer.parseInt(br.readLine());
			arr[i]=element;
		}
		
		int i,j,key;
		
		for( i=1;i<num;i++) {
			key=arr[i];
			
			for( j=i-1; j>=0&&arr[j]>key ; j--) { //�ڹٴ� ���� &&���� �տ��� �����̸� �ڿ����� Ȯ������ �ʴ´�.
				//�׷��� ������ �������ϴ� �� ����.
				arr[j+1]=arr[j];
			}
			arr[j+1]=key;
		}
		
		for( i=0;i<num;i++) {
			System.out.println(arr[i]);
		}
		
	}
}