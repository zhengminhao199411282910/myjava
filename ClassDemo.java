import java.util.*;
import java.lang.reflect.*;
public class ClassDemo{
	public static void main(String[] args)throws Exception {
		// //1  每个类中有一个静态的属性叫做class
		// Class clazz=Student.class;
		// //2  通过对象的getClass()方法来获得；
		// Class clazz1=new Student().getClass();
		// //3  通过Class.forName()来获得
		// Class clazz2=Class.forName("Student");

		// System.out.println(clazz);
		// System.out.println(clazz1);
		// System.out.println(clazz2);
		Scanner scan=new Scanner(System.in);
		while(true){
			System.out.println("输入类名");
			String className=scan.next();
			System.out.println("输入姓名");
			String name=scan.next();
			System.out.println("输入年龄");
			int age=scan.nextInt();
			Class[] types=new Class[]{String.class,int.class};
			Object[] params=new Object[]{name,age};
			Object o=getInstance(className,types,params);
			System.out.println(o);

		}
	}
	public static Object getInstance(String className)throws Exception{
		Class clazz=Class.forName(className);
		return clazz.newInstance();
	}
	public static Object getInstance(String className,Class[] types,Object[] params)throws Exception{
		Class clazz=Class.forName(className);
		Constructor con=clazz.getConstructor(types);
		return con.newInstance(params);
	}
}
class Student{
	private String name="qwedfa";
	private String name2="qwfsage";
	private String name3="qwcvxze";
	private String name4="qggfawe";
	private int age;
	int sex;
	public Student(){}
	public Student(String name){
		this.name=name;
	}
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void study(){
		System.out.println("学习");
	}
	public void study(String str){
		System.out.println("学习"+str);
	}
	public String toString(){
		return name+","+age;
	}
}