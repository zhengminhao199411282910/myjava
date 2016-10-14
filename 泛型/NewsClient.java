import java.util.*;
public class NewsClient{
	public static void main(String[] args) {
		HashMap<String,ArrayList<Cirtle>> ha=new HashMap<String,ArrayList<Cirtle>>();
		ArrayList<Cirtle> al=new ArrayList<Cirtle>();
		al.add(new Cirtle("文章1",20));
		al.add(new Cirtle("文章2",30));
		al.add(new Cirtle("文章3",40));

		ArrayList<Cirtle> al1=new ArrayList<Cirtle>();
		al1.add(new Cirtle("文章4",30));
		al1.add(new Cirtle("文章5",40));
		al1.add(new Cirtle("文章6",50));

		ArrayList<Cirtle> al2=new ArrayList<Cirtle>();
		al2.add(new Cirtle("文章7",40));
		al2.add(new Cirtle("文章8",50));
		al2.add(new Cirtle("文章9",60));

		ha.put("军事",al);
		ha.put("娱乐",al1);
		ha.put("体育",al2);
		//System.out.println(ha);
		Set<Map.Entry<String,ArrayList<Cirtle>>> se=ha.entrySet();
		Iterator<Map.Entry<String,ArrayList<Cirtle>>> i=se.iterator();
		while(i.hasNext()){
			Map.Entry<String,ArrayList<Cirtle>> me=i.next();
			String key=me.getKey();
			System.out.println(key);
			ArrayList<Cirtle> ts=me.getValue();
			Iterator<Cirtle> i1=ts.iterator();
			while(i1.hasNext()){
				Cirtle c=i1.next();
				System.out.println(c.name+","+c.num);
			}
		}
	}
}
class Cirtle{
	String name;
	int num;
	public Cirtle(String name,int num){
		this.name=name;
		this.num=num;
	}
	public String toString(){
		return "("+name+","+num+")";
	}
}