package com.netease.course;




public class Service1 {
	private Student[] Student;
	public Service1(Student[] Student) {
		this.Student=Student;
	}
	public void printName() {
		for (Student student2 : Student) {
			System.out.println(student2.getName()+"  "+student2.getAge()+"  "+student2.getStates());
		}
	}
	public void query(String name) {
		for (Student Student2 : Student) {
			if (name.equals(Student2.getName())) {
				System.out.println("���ҵ�" + Student2.getName() + "����Ϊ" + Student2.getAge());
			}
			else System.out.println("��������ȷ��������");
		}
	}
	public void update(String name,String age) {
		for (Student Student2 : Student) {
			if (name.equals(Student2.getName())) {
				System.out.println("---------�޸�ǰ������"+Student2.getAge());
				Student2.setAge(age);
				System.out.println("---------�޸ĺ������"+Student2.getAge());
			}
			else {
				System.out.println("��������ȷ��������");
			}
		}
	}
	public void deleted(String name) {
		for (Student Student2 : Student) {
			if(name.equals(Student2.getName())){
				Student2.setStates("ʧЧ");
			}
		}
	}
	public void insert(String name,String age ,String states){
		System.out.println("��ӳɹ�");
	}
	
}
