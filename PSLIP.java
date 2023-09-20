package Input;
import java.util.Scanner;
public class Slip {

	public static void main(String[] args) {
		String employeeNo,name,designation,genDate;
		int daysWork=0,payRate=0;
		
		
		System.out.print("ENTER YOUR NAME:");
		Scanner nam=new Scanner(System.in);
		name=nam.next();
		
		System.out.print("Enter your designation");
		Scanner design=new Scanner(System.in);
		designation=design.next();
		
		System.out.print("Please enter your generation date");
		Scanner gen=new Scanner(System.in);
		genDate=gen.next();
		
		System.out.print("Enter the number of days worked");
		Scanner days=new Scanner(System.in);
		daysWork=days.nextInt();
		
		System.out.print("Please input the pay rate");
		Scanner pay=new Scanner(System.in);
		payRate=pay.nextInt();
		System.out.println("");
		System.out.println("");
		
		int basPay=(daysWork*payRate);
		int pf=basPay/10;
		final int profTax=(int)(0.2 * basPay);
		int deduct=pf+profTax;
		int net=basPay-deduct;
		
		System.out.print("ENTER THE EMPLOYEE NUMBER TO GENERATE PAYSLIP:");
		Scanner employee=new Scanner(System.in);
		employeeNo=employee.next();
		System.out.println("");
		System.out.println("                       SHREE KRISHNA CHEMISTS AND DRUGGIST");
		System.out.println("                             SALARY MONTH 9 2013");
		System.out.println("");
		System.out.println("EMP.NO.:"+employeeNo+"             EMP.NAME:"+name+"      DESIGNATION:"+designation);
		System.out.println("DAYS WORKED:"+daysWork+"        PAY RATE:"+payRate+"      GEN.DATE:"+genDate);
		System.out.println("__________________________________________________________________________________");
		System.out.println("EARNINGS         AMOUNT(RS.)            DEDUCTIONS         AMOUNT(RS.)");
		System.out.println("_________________________________________________________________________________");
		System.out.println("BASIC PAY        "+basPay+"                 P.F.               "+pf);
		System.out.println("                                        PROF.TAX           "+profTax);
		System.out.println("");
		System.out.println("______________________________________________________________________________________");
		System.out.println("GROSS EARN.      "+basPay+"                 TOTAL DEDUCT.      "+deduct);
		System.out.println("                                        NET PAY            "+net);
		System.out.println("_______________________________________________________________________________________");
		


	}

}
