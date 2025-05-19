package bank;

public class importTest {
    public static void main(String[] args) {
        bank.Account account1 = new bank.Account();
        account1.name = "saif"; // imported name from Bank class 
        System.out.println(account1.name);
    }
}
