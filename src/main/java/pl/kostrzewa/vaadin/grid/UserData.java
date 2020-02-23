package pl.kostrzewa.vaadin.grid;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserData {


    private static List<User> userList;


    public List<User> getALL() {
        if (userList == null) {
            User user1 = new User(1, "Adrian", "ADrian", "adri2an@mail.com", LocalDate.of(2012, 12, 12));
            User user2 = new User(2, "Adria2n", "ADria2n", "adria2n@mail.com", LocalDate.of(2012, 12, 12));
            User user3 = new User(3, "Adr3n", "ADr3n", "adr3n@mail.com", LocalDate.of(2012, 12, 12));
            userList = new ArrayList<>();
            userList.add(user1);
            userList.add(user2);
            userList.add(user3);

        }
        return userList;
    }


    public void addUser(User user) {
        userList.add(user);

    }


    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }



    public void updateUser (User user){
        User userTemp = getUserById(user.getId());
        userTemp.setEmail(user.getEmail());
        userTemp.setPassword(user.getPassword());
        userTemp.setLogin(user.getLogin());
        userTemp.setDate(user.getDate());

    }



    public User getUserById(int id) {
        return userList.stream().filter(f -> f.getId() == id).findFirst().get(); }


}


