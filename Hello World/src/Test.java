import java.util.Scanner; 

public class Test {

public static void main(String[] args) {

       int a=64, b, c, d;

       b = ~a;              

       c = (a & 64) >>>6 ;     

       d = (b & 64) >>>6;     

       System.out.println(Integer.toBinaryString(a)); 
       for(int i=0;i<10;i++) {
    	   if(a>>>i==1)System.out.println(i+1);
       }
       
       System.out.println(Integer.toBinaryString(b));
    
       System.out.println(c);

       System.out.println(d);

       int bitOpLSB;

       String strBinary="";

       int movedRight = a;

       for(int i=0;i<8;i++){

               bitOpLSB = (movedRight & 0x1);   //AND���� �����ڸ� ���� 0���� 1���� �����س�

               System.out.print(bitOpLSB); 

               strBinary =  String.valueOf(bitOpLSB) + strBinary;

               movedRight = movedRight >>> 1;

               }
       }
}

/*

1000000

11111111111111111111111110111111

1

0

00000010

1)   ���� ���� ����� �ǵ��� ���� __�� ä��� �� ������ �����Ͻÿ�.

  	c = (a & 64) >>>6 ;     
    d = (b & 64) >>>6; 

2)   �� ��� �� 00000010�� ���� ������ �����Ͻÿ�.


3)  �� ù�� ° ��� 1000000�� ���������κ��� 1�� ��ġ�� 7�� ����ϱ� ���� �ڵ�� ����� ���� �����Ͻÿ�.

 	for(int i=0;i<10;i++) {
    	   if(a>>>i==1)System.out.println(i+1);
       }

*/