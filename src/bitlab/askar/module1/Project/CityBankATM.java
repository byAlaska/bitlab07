package bitlab.askar.module1.Project;

import java.util.Scanner;

public class CityBankATM {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        BankAccount []accounts = Database.allAccounts;

        while (true){

            System.out.println("Hello there");
            System.out.println("Input your pin code");
            String piCode = in.next();
            System.out.println("Input your account number");
            String accountNumber = in.next();

            BankAccount account = null;
            for (int i=0;i<accounts.length;i++){
                if (accounts[i].getPinCode().equals(piCode) && accounts[i].getAccountNumber().equals(accountNumber)) {
                    account = accounts[i];
                }
            }

            if (account==null){
                System.out.println("You wrote wrong pin code or account number");
                continue;
            }

            while (true){

                if (account instanceof CityBankAccount) {
                    System.out.println(" PRESS [1] TO CASH WITHDRAWAL\n" +
                            "PRESS [2] TO VIEW BALANCE \n" +
                            "PRESS [3] TO CHANGE PIN CODE \n" +
                            "PRESS [4] TO CASH IN ACCOUNT\n" +
                            "PRESS [5] TO VIEW ACCOUNT DATA\n" +
                            "PRESS [6] TO EXIT");

                    int choice = in.nextInt();

                    if (choice == 1) {
                        System.out.println("Input credit");
                        int credit = in.nextInt();
                        account.creditBalance(credit);
                    } else if (choice == 2) {
                        System.out.println(account.totalBalance());
                    } else if (choice == 3) {
                        System.out.println("Input new pincode");
                        String pincode = in.next();
                        account.setPinCode(pincode);
                    } else if (choice == 4) {
                        System.out.println("Input debet");
                        int debet = in.nextInt();
                        account.debetBalance(debet);
                    } else if (choice == 5) {
                        System.out.println(account);
                    } else {
                        System.out.println("Good bye, sir!");
                        break;
                    }

                } else {
                    System.out.println(" PRESS [1] TO CASH WITHDRAWAL\n" +
                            "PRESS [2] TO VIEW BALANCE \n" +
                            "PRESS [6] TO EXIT");

                    int choice = in.nextInt();

                    if (choice==1){
                        System.out.println("Input debet");
                        int debet = in.nextInt();
                        account.debetBalance(debet);
                    }else if (choice==2){
                        System.out.println(account.totalBalance());
                    }
                    else break;
                }
            }
        }
    }
}
