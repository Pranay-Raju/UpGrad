import static java.lang.System.*;
import java.util.*;
class Main{
	static public void main(String ... args){
		Scanner sc = new Scanner(in);
		int entries = sc.nextInt();
		List<Student> list = new ArrayList<Student>();
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
			}
		}
		for(Student student : list){
			out.println(student);
		}
	}
}
class Student{
	private String name;
	private float cgpa;
	private int token;

	public Student(String name, float cgpa, int token){
		this.name = name;
		this.cgpa = cgpa;
		this.token = token;
	}
	public String toString(){
		return "Student [ name = " + this.name + ", cgpa = " + this.cgpa + ", token = " + this.token + " ]";
	}
}
