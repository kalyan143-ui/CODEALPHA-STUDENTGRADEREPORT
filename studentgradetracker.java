package student;
import java.util.*;


public class studentgradetracker {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   ArrayList<Student> students = new ArrayList<>();

	        System.out.print("How many students? ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter student name: ");
	            String name = sc.next();

	            System.out.print("Enter marks: ");
	            int marks = sc.nextInt();

	            students.add(new Student(name, marks));
		   
		  
	        }
	        int total = 0;
	        int highest = Integer.MIN_VALUE;
	        int lowest = Integer.MAX_VALUE;

	        for (Student s : students) {
	            total += s.marks;

	            if (s.marks > highest) highest = s.marks;
	            if (s.marks < lowest) lowest = s.marks;
	        }

	        double average = (double) total / students.size();

	        System.out.println("\n Summary Report:");
	        System.out.println("Average Marks: " + average);
	        System.out.println("Highest Marks: " + highest);
	        System.out.println("Lowest Marks: " + lowest);
                
	        System.out.println("\n 2Student Details:");
	        for (Student s : students) {
	            System.out.println(s.name + " - " + s.marks);
	        }

	        sc.close();

	}

}
