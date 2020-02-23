package pl.kostrzewa.vaadin.grid;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Grid;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;

import java.util.List;

public class GridView extends GridLayout implements View {
    private List<User> userList;

    public GridView() {
        if (!getUserList()) {
            addComponent(new Label("No data"));
            return;
        }
        Grid<User> grid = new Grid();
        // dodaje parent layout na całą szerokość urządzenia
        setSizeFull();
        grid.setSizeFull();
        grid.setItems(userList);
        grid.addColumn(User::getLogin).setCaption("Login");
        grid.addColumn(User::getPassword).setCaption("Passowrd");
        grid.addColumn(User::getEmail).setCaption("Email");
        addComponent(grid);
    }

    private boolean getUserList() {
        UserData userData = new UserData();
        userList = userData.getALL();
        return userList != null;
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        Notification.show("Welcome to the user list");
    }
}
