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
import java.util.Scanner;

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
		max=arr[0];
		//max=arr[0]�̶� �ߴٰ� ��� Ʋ�Ⱦ���. ������ �����ϱ�..?
		//�ٷ� ã�Ҵ�. a�� ��� ������ �߻��Ѵ�. i+'A' ���� i�� 0�� �������� �ʱ� �����̴�!!!����!
		char answer='?';
		for(int i=1;i<arr.length;i++) {
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