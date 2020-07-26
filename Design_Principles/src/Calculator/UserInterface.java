package Calculator;
import java.util.*;

public class UserInterface {
	public static void main(String args[]) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter input1 and input2");
		   int ip1=sc.nextInt();
		   int ip2=sc.nextInt();
		   
		   System.out.println("Enter operand");
		   String op=sc.next();
		   
		   CalculatorData ob=new CalculatorData(ip1,ip2,op);
		   
		   CalculatorData2 cl=new  CalculatorData2();
		   double result=cl.calculate(ip1,ip2,op);
		   
		   System.out.println("The result is:"+ result);
		   
		   sc.close();
	   }
	


}
