class demo{
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "name";
		s.age = 30;
		System.out.println(s.name + "..." + s.age);
		s.study();
		s.sleep();
	}
}


class Student{
	String name;
	int age;
	String sex;

	public void study(){
		System.out.println("学生学习");
	}

	public void sleep(){
		System.out.println("学生睡觉");
	}
}