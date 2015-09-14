package Lab1;
import org.apache.poi.ss.formula.functions.FinanceLib;
import java.util.Scanner;
public class Lab1code {

	public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number for years retired:");
       int yearsRetired = input.nextInt();
       System.out.print("Enter a number for annual return while retired:"); 
       double annualReturn1 = input.nextDouble();
       System.out.print("Enter a number for required monthly income while retired:");
       double income = input.nextDouble();
       System.out.print("Enter a number for monthly SSI:");
       double monthlySSI = input.nextDouble();
       System.out.print("Enter a number for years to work:");
       int workYear = input.nextInt();
       System.out.print("Enter a number for annual return while working:");
       double annualReturn2 = input.nextDouble();
       
       double r;
       double n;
       double y;
       double p;
       double f;
       boolean t;
       double PV;
      
       
       r = (annualReturn1/12);
       n = yearsRetired*12;
       y = income-monthlySSI;
       f = 0;
       t = false;
       
       PV = FinanceLib.pv(r, n, y, f, t);
       System.out.printf("What the user need saved = %.2f", PV);
       
       double PMT;
       r = (annualReturn2/12);
       n = workYear*12;
       p = 0;
       f = PV;
       t = false;
    		
       PMT = FinanceLib.pmt(r,n,p,f,t);
       System.out.printf("What you need to save each month = %.2f", PMT); 
    		   
	}

}
