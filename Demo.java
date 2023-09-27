package studyopedia;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		
		Scanner scannner = new Scanner(System.in);
		//variable declaration
		int score1,score2,score3,score4;
		String code1,code2,code3,code4;
		System.out.print("Enter Unit Code for Unit 1: ");
		code1= scannner.nextLine();
		System.out.print("Enter Unit Code for Unit 2: ");
		code2= scannner.nextLine();
		System.out.print("Enter Unit Code for Unit 3: ");
		code3= scannner.nextLine();
		System.out.print("Enter Unit Code for Unit 4: ");
		code4= scannner.nextLine();
		System.out.print("Enter Score for Unit 1: ");
		score1= scannner.nextInt();
		System.out.print("Enter Score for Unit 2: ");
		score2= scannner.nextInt();
		System.out.print("Enter Score for Unit 3: ");
		score3= scannner.nextInt();
		System.out.print("Enter Score for Unit 4: ");
		score4= scannner.nextInt();
		int sum = score1+score2+score3+score4;
		double avrg= (double) sum/4;
		char grade='D';
		if((avrg<=100)&&(avrg>=70)) {
			grade='A';
		}else if ((avrg<70)&&(avrg>=60)) {
			grade='B';
		}else if ((avrg<60)&&(avrg>=50)) {
			grade='C';
		}else if ((avrg<50)&&(avrg>=40)) {
			grade='D';
		}else if (avrg<40) {
			grade='F';
		}
		System.out.print("\n\n");
		//output
		System.out.println("                                      Department of Computer Science");
		System.out.println("                                           End Semester Results");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Name: James Gatheru             |Roll_No: C026-01-0906/2022               Semester: 2.2");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Unit Code                          |Unit Name:                               Score");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|"+code1+"                            |Database                                |"+score1+"\n");
		System.out.println("|"+code2+"                            |Systems                                 |"+score2+"\n");
		System.out.println("|"+code3+"                            |Algorithm                               |"+score3+"\n");
		System.out.println("|"+code4+"                            |Statistics                              |"+score4);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Total                                                                       |"+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Average                                                                     |"+avrg);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Grade                                                                       |"+grade);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("|Recommendation                                                              |Recommend Pass");
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("Grading Criteria                                            Overall Grade(A-D)");
		System.out.println("70-100         A");
		System.out.println("60-70          B");
		System.out.println("50-60          C");
		System.out.println("40-50          D");
		System.out.println("Below 40       F");
		System.out.println("-------------------------------------------------------------------------------------------------");
			    }

	}

