package account;
public class Test {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(72897324L, "Lalit Patel", 9617843787L, "15/jul/2001", 943435.34);
        System.out.println("Name : " + sa.getName());
        sa.closeAccount();
        sa.withDraw();
        sa.deposite();
        sa.fixedDeposite();
        System.out.println("=========================================");
        
        LoanAccount la = new LoanAccount(4223324L, "Kunal muchhala", 8827729125L, "23/July/2002", 143435.34);
        System.out.println("Name : " + la.getName());
        
        la.closeAccount();
        la.payEMI();
        la.repayment();
        la.topUpLoan();
    }
}
