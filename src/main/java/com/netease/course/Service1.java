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
				System.out.println("我找到" + Student2.getName() + "年龄为" + Student2.getAge());
			}
			else System.out.println("请输入正确的人名称");
		}
	}
	public void update(String name,String age) {
		for (Student Student2 : Student) {
			if (name.equals(Student2.getName())) {
				System.out.println("---------修改前的年龄"+Student2.getAge());
				Student2.setAge(age);
				System.out.println("---------修改后的年龄"+Student2.getAge());
			}
			else {
				System.out.println("请输入正确的人名称");
			}
		}
	}
	public void deleted(String name) {
		for (Student Student2 : Student) {
			if(name.equals(Student2.getName())){
				Student2.setStates("失效");
			}
		}
	}
	public void insert(String name,String age ,String states){
		System.out.println("添加成功");
	}
	
}
