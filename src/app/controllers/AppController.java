package app.controllers;

import app.model.DataProvider;
import app.view.AppView;

public class AppController {
    public AppController() {
        run();
    }

    void run(){
        AppView appView=new AppView();
        DataProvider dataProvider=new DataProvider();


        switch (appView.choiceOption()){
            case "1"-> appView.outputAllUsers(dataProvider.getData());

            case "2"-> appView.outputOneUser(
                        dataProvider.getUserByIndex(
                                appView.choiceUserIndex(),
                                dataProvider.getData()));

        }
    }




}
