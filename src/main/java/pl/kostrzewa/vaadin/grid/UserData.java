package pl.kostrzewa.vaadin.grid;


import pl.kostrzewa.vaadin.grid.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {


    List <User> userList;


    public List<User> getALL(){
        User user = new User(1, "Adrian", "ADrian", "adri2an@mail.com");
        User user2 = new User(1, "Adria2n", "ADria2n", "adria2n@mail.com");
        User user3 = new User(1, "Adr3n", "ADr3n", "adr3n@mail.com");
        userList = new ArrayList<>();
        userList.add(user);
        userList.add(user2);
        userList.add(user3);
        return userList;


    }

    public UserData(List<User> userList) {
        this.userList = userList;
    }

    public UserData() {

    }



    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
