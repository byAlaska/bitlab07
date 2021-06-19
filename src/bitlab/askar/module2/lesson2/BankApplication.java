package bitlab.askar.module2.lesson2;

public class BankApplication {

    public void createUser(String userName) throws UserShortNameException {
        if(userName.length()<5){
            throw new UserShortNameException();
        }else{
            System.out.println("User name " + userName + " is created successfully");
        }
    }

}

