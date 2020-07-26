package Calculator;

public class CalculatorData2 {
	double calculate(int op1, int op2, String opr)
	{
    	double ans=0;
    	switch (opr)
    	{
    	   case "+": 
    		        ans=(double)(op1+op2); 
    		        break;
    	   case "-":  
    		        ans=(double)(op1-op2); 
    		        break;
    	   case "*":  
    		        ans=(double)(op1*op2); 
    		        break;
    	   case "/": 
    		        ans=(double)(op1/op2); 
    		        break;
    	   default: 
    		 
    	}
    	
       return ans;
    }

}
