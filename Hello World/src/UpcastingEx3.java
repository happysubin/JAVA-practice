class PersonX{
	String name="Person";
	String id;
	String grade;
	public PersonX(String name){
		this.name=name;
	}
	public void work() {
		System.out.println("�ູ�ϰ� �ǹ��ִ� ��");
	}
}

class underGraduate extends PersonX{
	
	String name="Under graduate";
	String grade;
	String department;
	public underGraduate (String name) {
		super(name);
	}
	
	public void work() {
		System.out.println("����Ž��");
	}
}

class highSchool extends PersonX{
	String name="High School";
	String grade;
	String department;
	public highSchool(String name) {
		super(name);
	}
	
	public void work() {
		System.out.println("������ ������ �´� ���� Ž��");
	}
}

public class UpcastingEx3 {
	   public static void main(String[] args) {
	       PersonX  pu, ph;
	       PersonX p = new PersonX("Person");
	       underGraduate uG = new underGraduate("���л�");
	       highSchool hS = new highSchool("����л�");
	       pu = uG; // ��ĳ���� �߻�
	       //pu = (PersonX) uG;
	       ph = hS; // ��ĳ���� �߻�
	       //System.out.println(pu.name); // ���� ����
	       System.out.println(uG.name); // ���� ����
	        pu.work();
	         //System.out.println(ph.name); // ���� ����
	        System.out.println(hS.name); // ���� ����
	        ph.work();
	        //hS.work();
	        uG = (underGraduate) pu; // �ٿ�ĳ���� �߻�
	        System.out.println(p.name); // ���� ����
	        p.work();
	        }
	    }
