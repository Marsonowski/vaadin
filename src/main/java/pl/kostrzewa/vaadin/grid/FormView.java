package pl.kostrzewa.vaadin.grid;
import com.vaadin.navigator.View;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.*;

import java.util.List;

public class FormView extends FormLayout implements View {
    private List<User> userList;



    public FormView(){

        setDefaultComponentAlignment(Alignment.TOP_CENTER);

        FormLayout formLayout = new FormLayout();

        formLayout.setSizeUndefined();


        FormLayout form = new FormLayout();
        TextField tf1 = new TextField("Login");
        tf1.setIcon(VaadinIcons.USER);
        tf1.setRequiredIndicatorVisible(true);
        form.addComponent(tf1);

        PasswordField tf2 = new PasswordField("Password");
        tf2.setIcon(VaadinIcons.PASSWORD);
        tf2.setRequiredIndicatorVisible(true);
        form.addComponent(tf2);

        TextField tf3 = new TextField("Email");
        tf3.setIcon(VaadinIcons.MAILBOX);
        tf3.setRequiredIndicatorVisible(true);
        form.addComponent(tf3);

        DateField dt = new DateField("Date");
        dt.setIcon(VaadinIcons.DATE_INPUT);
        dt.setRequiredIndicatorVisible(true);
        form.addComponent(dt);


        Button save = new Button();
        save.setSizeUndefined();
        save.setIcon(VaadinIcons.CHECK);





        Button button5 = new Button("Show List ", event -> {
            getUI().getNavigator().navigateTo("grid");
        });
        addComponent(form);
        addComponent(save);
        addComponent(button5);
        addComponent(formLayout);




    UserData userData = new UserData();
        save.addClickListener(event -> {
        User user = new User(userData.getALL().size() + 1, tf1.getValue(), tf2.getValue(), tf3.getValue(), dt.getValue());
        userData.addUser(user);
        Notification.show("Succes! You add a new user: " + user);
    });
}



}
