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
		PersonX pu,ph;
		
		PersonX p=new PersonX("�Ϲ���");
		underGraduate uG=new underGraduate("���л�");
		highSchool hS=new highSchool("����л�");
		
		pu=uG; //��ĳ���� �߻�. ���� uG�� ���� �������̵�� �Լ��� ��밡��.
		
		ph=hS;//��ĳ���� �߻�. ���� hS�� ���� �������̵�� �Լ��� ��밡��.
		//ph=(PersonX)hS;
		
		System.out.println(uG.name); //���� ����
		pu.work();
				
		//hS=(highSchool)ph;
		System.out.println(hS.name);//���� ����
		ph.work();
		
		//p=(PersonX)ph;
		System.out.println(p.name);//���� ����
		p.work();
	}
}
