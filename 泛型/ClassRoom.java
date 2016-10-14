import java.util.*;
public class ClassRoom{
	public static void main(String[] args) {
		HashMap<String,TreeSet<Student>> hm=new HashMap<String,TreeSet<Student>>();
		TreeSet<Student> ts=new TreeSet<Student>();
		ts.add(new Student("学生1",20,new int[]{50,60,70}));
		ts.add(new Student("学生2",21,new int[]{60,70,80}));
		ts.add(new Student("学生3",22,new int[]{70,80,90}));

		TreeSet<Student> ts1=new TreeSet<Student>();
		ts1.add(new Student("学生4",23,new int[]{50,60,70}));
		ts1.add(new Student("学生5",24,new int[]{60,70,80}));
		ts1.add(new Student("学生6",25,new int[]{70,80,90}));

		// TreeSet ts2=new TreeSet();
		// ts2.add(new Student("学生7",26,new int[]{50,60,70}));
		// ts2.add(new Student("学生8",27,new int[]{60,70,80}));
		// ts2.add(new Student("学生9",28,new int[]{70,80,90}));
		hm.put("教室1",ts);
		hm.put("教室2",ts1);
		//hm.put("教室3",ts2);
		Set<Map.Entry<String,TreeSet<Student>>> se=hm.entrySet();
		Iterator<Map.Entry<String,TreeSet<Student>>> it=se.iterator();
		while(it.hasNext()){
			Map.Entry<String,TreeSet<Student>> me=it.next();
			String key=me.getKey();
			System.out.println(key);
			TreeSet<Student> tst=me.getValue();
			Iterator<Student> it1=tst.iterator();
			while(it1.hasNext()){
				Student std=it1.next();
				System.out.println(std);
			}
		}
		// System.out.println("请选择要加入的班级：教室1或2");
		// Scanner input=new Scanner(System.in);
		// String newroom=input.next();
		// System.out.println("请输入姓名和年龄");
		// String newname=input.next();
		// int newage=input.nextInt();
		// if (newroom.equals("教室1")) {
		// 	ts.add(new Student(newname,newage,new int[3]));
		// 	System.out.println(ts);
		// }
		// if (newroom.equals("教室2")) {
		// 	ts1.add(new Student(newname,newage,new int[3]));
		// 	System.out.println(ts1);
		// }
	}
}
class Person{
	String name;
	int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
}
class Student extends Person implements Comparable{
	int[] score=new int[3];
	public Student(String name,int age,int[] score){
		super(name,age);
		this.score=score;
	}
	public String toString(){
		return "("+name+","+age+","+average(score)+")";
	}
	public int compareTo(Object o){
		Student s=(Student)o;
		if (this.average(score)==s.average(score)) {
			return this.name.compareTo(s.name);
		}
		return this.average(score)-s.average(score);
	}
	public int average(int[] score){
		int sum=0;
		for (int i=0;i<score.length ;i++ ) {
			sum=sum+score[i];
		}
		int ave=sum/score.length;
		return ave;
	}
}