import java.util.Scanner;

public class Marksheet {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        // Get the number of students
	        System.out.println("Enter the number of students: ");
	        int numStudents = sc.nextInt();
	        // Create an array to store the students' data
	        String[][] students = new String[numStudents][7];
	        // Get the students' data
	        for (int i = 0; i < numStudents; i++) {
	            System.out.println("Enter the following information for student " + (i + 1) + ":");
	            System.out.println("Student Name: ");
	            students[i][0] = sc.next();
	            System.out.println("Sub1: ");
	            students[i][1] = sc.next();
	            System.out.println("Sub2: ");
	            students[i][2] = sc.next();
	            System.out.println("Sub3: ");
	            students[i][3] = sc.next();
	            System.out.println("Sub4: ");
	            students[i][4] = sc.next();
	            System.out.println("Sub5: ");
	            students[i][5] = sc.next();
	        }
	        // Compute the total for each student
	        for (int i = 0; i < numStudents; i++) {
	            int total = 0;
	            for (int j = 1; j < 6; j++) {
	                total += Integer.parseInt(students[i][j]);
	            }
	            students[i][6] = String.valueOf(total);
	        }
	        // Compute the average for each student
	        double[] averages = new double[numStudents];
	        for (int i = 0; i < numStudents; i++) {
	            averages[i] = Double.parseDouble(students[i][6]) / 5;
	        }
	        // Compute the average for each unit
	        float[] unitAverages = new float[5];
	        for (int i = 0; i < 5; i++) {
	            float unitAverage = 0;
	            for (int j =0; j < numStudents; j++) {
	                unitAverage += Double.parseDouble(students[j][i + 1]);
	            }
	            unitAverages[i] = unitAverage / numStudents;
	        }
	        System.out.println("Welcome to Student Mark List Application");
	        System.out.println("");
	        System.out.println("__________________________________________________________");
	        System.out.println("Student Name\tSub1\tSub2\tSub3\tSub4\tSub5\tTotal\tAverage");
	        System.out.println("");
	        System.out.println("__________________________________________________________");
	        System.out.println("Student Name\tSub1\tSub2\tSub3\tSub4\tSub5\tTotal\tAverage");
	        
	    for (int i = 0; i < numStudents; i++) {
	            System.out.println(students[i][0] + "\t" + students[i][1] + "\t" + students[i][2] + "\t" + students[i][3] + "\t" + students[i][4] + "\t" + students[i][5] + "\t" + students[i][6] + "\t" + averages[i]);
	        }
	       System.out.print("Average");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("   " + (i + 1) + "" + unitAverages[i]);
	        }
	    }
	}
	
		
		
		
		

