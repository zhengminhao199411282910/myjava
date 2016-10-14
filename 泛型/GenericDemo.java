public class GenericDemo{
	public static void main(String[] args) {
		Teacher t=new Teacher("老师");
		Student s=new Student("学生");
		Util<Person> u=new Util<Person>();
		u.setElement(t);
		u.setElement(s);
	}
}
class Util<T extends Person>{
	T t;
	public Util(){}
	public Util(T t){
		this.t=t;
	}
	public T get(){
		return t;
	}
	public void setElement(T t){
		this.t=t;
		System.out.println("--------");
	}
}
class Person{
	String name;
	public Person(String name){
		this.name=name;
	}
}
class Teacher extends Person{
	public Teacher(String name){
		super(name);
	}
	public void teach(){
		System.out.println("上课");
	}
}
class Student extends Person{
	public Student(String name){
		super(name);
	}
	public void study(){
		System.out.println("学习");
	}
}