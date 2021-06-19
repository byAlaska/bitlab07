package bitlab.askar.module1.Project;

public interface BankAccount {
    String getAccountNumber();
    String getPinCode();
    void setPinCode(String pinCode);
    int totalBalance();
    void creditBalance(int credit);
    void debetBalance(int debet);
}
