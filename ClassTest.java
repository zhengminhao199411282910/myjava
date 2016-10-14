import java.io.*;
import java.lang.reflect.*;
import java.util.*;
public class ClassTest{
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("D:/abc.txt")));
		String str="";
		Scanner scan=new Scanner(System.in);
		while((str=br.readLine())!=null){
			System.out.println(str);
			System.out.println("输入姓名");
			String name=scan.next();
			System.out.println("输入年龄");
			int age=scan.nextInt();
			Class[] types=new Class[]{String.class,int.class};
			Object[] params=new Object[]{name,age};
			Object o=getInstance(str,types,params);
			System.out.println(o);
			System.out.println("--------------------------");
			Field[] fie=getField(str);
			for (Field f: fie) {
				System.out.println(f);
			}
			System.out.println("-------------------------");
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
	public static Field[] getField(String className)throws Exception{
		Class clazz=Class.forName(className);
		return clazz.getDeclaredFields();
	}
}
class Student{
	String name;
	int age;
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
class Teacher{
	String name;
	int age;
	int sex;
	public Teacher(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void teach(){
		System.out.println("上课");
	}
	public String toString(){
		return name+","+age;
	}
}