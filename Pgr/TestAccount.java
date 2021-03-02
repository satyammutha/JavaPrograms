public class TestAccount {
    public static void main(String args[]) {
        Account a = new Account();
        a.setAccno(1234567890L);
        a.setName("John");
        a.setEmail("abc@a.com");
        a.setAmount(20000.50f);
        System.out.println("Account No: " + a.getAccno() + " Name: " + a.getName() + " Email: " + a.getEmail()
                + " Amount: " + a.getAmount());
    }
}