import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
// Create the Student and Priorities classes below.
class Student{
    private int id;
    private String name;
    private double cgpa;
    
    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCGPA(){
        return this.cgpa;
    }
}

class Priorities{
    public List<Student> getStudents(List<String> events){
        
        Comparator<Student> comparator = Comparator
            .comparing(Student::getCGPA, Comparator.reverseOrder())
            .thenComparing(Student::getName)
            .thenComparing(Student::getID);             
        
        PriorityQueue<Student> queue = new PriorityQueue<>(comparator);
        for(String event: events){
            if(event.contains("SERVED")){
                // SERVED
                if(!queue.isEmpty()){
                    queue.poll();
                }
            }else{
                // ENTER
                String[] data = event.split(" ");
                queue.add(new Student(Integer.parseInt(data[3]), data[1], Double.parseDouble(data[2])));
            }
        }
            
        List<Student> result = new ArrayList<>();
        while(!queue.isEmpty()){
            result.add(queue.poll());
        }
        return result;
    }
}
// Create the Student and Priorities classes above.

public class Solution046 {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}