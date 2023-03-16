import java.util.*;
import java.util.regex.*;
public class Validate
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Main m = new Main();
        if(m.validate(num))
            System.out.println("Valid");
        else
        System.out.println("Not Valid");
	}
	
	public boolean validate(int num)
	{
	    return Pattern.matches("^[1-9]{1}[0-9]{2}\\s{0, 1}[0-9]{3}$",Integer.toString(num));
	}
}
