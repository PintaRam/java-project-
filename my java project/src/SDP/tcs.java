import java.util.*;
public class tcs{
    public static String estimate(int wt)
    {
        if(wt<=2000 && wt>=0)
        {   if(wt == 0)
            {
                return "0";
            }
            return "25";
        
        }else if(wt>2000 && wt <=4000)
        {
            return "35";
        }
        else if(wt > 4000 && wt <=7000)
        {
            return "45";
        }
        else if(wt>7000)
        {
            return "Overloaded" ;
        }
        else{
            return "Invalid";
        }
    
       
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int wt = sc.nextInt();
        System.err.println(estimate(wt));
    }
}