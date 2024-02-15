package app.view;

import app.entitis.UserEntiti;

import java.util.ArrayList;
import java.util.Scanner;

public class AppView {
    public String choiceOption(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("""
                Menu:
                1 if all users are required
                2 if one is required
                3 exit
                """);
        return scanner.nextLine();
    }

    public int choiceUserIndex(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("""
                Enter the user number
                """);
        return scanner.nextInt()-1;
    }

   public void outputAllUsers(ArrayList<UserEntiti> userEntitiArrayList){
        int count = 0;
        for (UserEntiti userEntiti : userEntitiArrayList) {
            count++;
            String output = count + ") " + userEntiti.getName()+" ,"+userEntiti.getEmail();
            System.out.println(output);
        }
    }

   public void outputOneUser(UserEntiti userEntiti){
        System.out.println(userEntiti.toString());
    }

}
