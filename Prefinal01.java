
import java.util.*;


public class Prefinal01

{

    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    String onesarray[] = {" ","one","two","three","four","five", "six",
                      "seven", "eight", "nine", "ten", "eleven", "twelve",
                      "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                      "eighteen", "nineteen" }; 
                     
             String secondvalue[] = {" ", "ten", "twenty", "thirty", "fourty", "fifty",
                      "sixty", "seventy", "eighty", "ninety" };
                     
             System.out.println("Enter a number: ");
    int num = scan.nextInt();
   
    if(num <=19)
{

    int firstnum = Integer.parseInt(Integer.toString(num).substring(0,1));
   
    System.out.println(onesarray[num]);
    }
    else if(num <= 99)
    {
   
    int firstnum = Integer.parseInt(Integer.toString(num).substring(0,1));
    int secondnum = Integer.parseInt(Integer.toString(num).substring(1,2));
    System.out.println(secondvalue[firstnum]+" "+onesarray[secondnum]);
    }
    else if(num <=999)
    {
    
    int firstnum = Integer.parseInt(Integer.toString(num).substring(0,1));
    int secondnum = Integer.parseInt(Integer.toString(num).substring(1,2));
    int third = Integer.parseInt(Integer.toString(num).substring(2,3));
 
    System.out.println(onesarray[firstnum]+" "+"hundred"+ " " +secondvalue[secondnum]+" "+ onesarray[third]);
    }
    else
    {
    int firstnum = Integer.parseInt(Integer.toString(num).substring(0,1));
   
    System.out.println(onesarray[firstnum]+" "+"thousand");
    }
    }
   
   
}
