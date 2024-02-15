package app.model;

import app.entitis.UserEntiti;

import java.util.ArrayList;

public class DataProvider {

    public ArrayList<UserEntiti> getData(){
        ArrayList<UserEntiti> users =new ArrayList<>();
        users.add(new UserEntiti("Petro","petro@gmail.com"));
        users.add(new UserEntiti("Andry","andry@gmail.com"));
        users.add(new UserEntiti("Pavlo","pavlo@gmail.com"));
        users.add(new UserEntiti("Serhii","serhii@gmail.com"));
        users.add(new UserEntiti("Alex","alex@gmail.com"));
        return users;
    }


    public UserEntiti getUserByIndex(int index, ArrayList<UserEntiti> userEntitiArrayList){
     return userEntitiArrayList.get(index);
    }
}
