import java.util.*;
public class CISI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter P : ");
        double principle = sc.nextDouble();
        System.out.print("Enter R : ");
        double rate = sc.nextDouble();
        System.out.print("Enter T : ");
        double time = sc.nextDouble();
        
        double SI = (principle*rate*time)/100;
        System.out.println("Simple Interest = " + SI);
        
        double compound_interest = principle * (Math.pow((1 + rate / 100), time)) - principle;
        System.out.println("Compound Interest = " + compound_interest);
    }
}
