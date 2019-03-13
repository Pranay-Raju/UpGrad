import static java.lang.System.*;
import java.util.*;
class Main{
	static public void main(String ... args){
		Scanner sc = new Scanner(in);
		int entries = sc.nextInt();
		List<Student> list = new ArrayList<Student>();
		Comparator<Student> comparator = new Comparator<Student>(){
			public int compare(Student student1,Student student2){
				return student1.compareTo(student2);
			}
		};
		for(int i=1;i<=entries;i++){
			String query = sc.next();
			if(query.equals("SERVED")){
				list.remove(0);
			}
			else{
				String name = sc.next();
				float cgpa = sc.nextFloat();
				int token = sc.nextInt();
				list.add(new Student(name,cgpa,token));
				list.sort(comparator);
			}
		}
		for(Student student : list){
			out.println(student.getName());
		}
	}
}
class Student implements Comparable<Student>{
	private String name;
	private Float cgpa;
	private Integer token;

	public Student(String name, float cgpa, int token){
		this.name = name;
		this.cgpa = new Float(cgpa);
		this.token = new Integer(token);
	}
	public String toString(){
		return "Student [ name = " + this.name + ", cgpa = " + this.cgpa + ", token = " + this.token + " ]";
	}
	public String getName(){
		return this.name;
	}
	public Integer getToken(){
		return this.token;
	}
	public Float getCGPA(){
		return this.cgpa;
	}
	public int compareTo(Student student){
		int compareResult = (this.cgpa).compareTo(student.getCGPA()) * -1;
		if(compareResult == 0){
			compareResult = (this.name).compareTo(student.getName());
		}
		if(compareResult == 0){
			compareResult = (this.token).compareTo(student.getToken());
		}
		return compareResult;
	}
}
