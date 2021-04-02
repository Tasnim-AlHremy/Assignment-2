//Q1
package snippet;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String a[]) {
		Scanner input=new Scanner (System.in);
		System.out.println("enter 4 digits number");
		int in1=input.nextInt();
		int ones=in1%10;
		int tens=(in1%100)/10;
		int hundrends=(in1%1000)/100;
		int thousends=(in1%10000)/1000;
		
		System.out.println("the ones =  " +ones);
		System.out.println("the tens =  " +tens);
		System.out.println("the hundreds =  " + hundrends);
		System.out.println("the thousends =  " + thousends);
		System.out.println();
		
	
		//Q2
	
		int fnum,snum,thnum,answer ;
		System.out.println("Insert first number: ");
		fnum =input.nextInt();
		System.out.println("Insert second number: ");
		snum =input.nextInt();
		System.out.println("Insert third number: ");
		thnum =input.nextInt();
		answer = fnum + snum +thnum;
		System.out.println(answer);
		
		
		
	}

}
	
	





