import java.util.regex.*;
import java.util.*;

public class regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the passwords :  ");
        String str = sc.nextLine();
        Pattern p = Pattern.compile("[a-z A-Z 0-9]*@gmail.com"); // return the instance of the pattern
        Matcher m = p.matcher(str); // matches the input string with the pattern
        // all can also be writtrn as boolean m =
        // pattern.compile.("sai").matcher("sai").matches
        // or boolean m = pattern.matches("sasi " ,"sai");
        String[] str3 = str.split("sai", 2);// split the string
        System.out.println(Arrays.toString(str3));
        while (!m.matches()) // return boolean if pattern matches
        {
            System.out.println("invlaid re enter :   ");
            String str2 = sc.nextLine();
            m = p.matcher(str2);

        }
        System.out.println(m.start()); // give the starting index of matches
        System.out.println(m.end()); // give the end index of matches
        System.out.println(m.groupCount()); // coount the total number of matches
        System.out.println(m.find(m.start()));
        System.out.println("successfully  email id  created....... ");
    }
}
