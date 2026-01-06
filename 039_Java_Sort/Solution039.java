import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//My code is below
class Comp implements Comparator<Student>{
    public int compare(Student a, Student b){
        if(a.getCgpa()<b.getCgpa()){
            return 1;
        }else if(b.getCgpa()<a.getCgpa()){
            return -1;
        }else{
            if(a.getFname().compareTo(b.getFname())<0){
                return -1;
            }else if(0<a.getFname().compareTo(b.getFname())){
                return 1;
            }else{
                if(a.getId()<b.getId()){
                    return 1;
                }else{
                    return -1;
                }
            }
        }
    }
}
//My code is above

//Complete the code
public class Solution039
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = sc.nextInt();
			String fname = sc.next();
			double cgpa = sc.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);			
			testCases--;
		}
        
        //My code is below
        Collections.sort(studentList, new Comp());
        //My code is above
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}