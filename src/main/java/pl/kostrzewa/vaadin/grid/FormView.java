package pl.kostrzewa.vaadin.grid;
import com.vaadin.navigator.View;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.ViewChangeListener;
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






        Button button5 = new Button("Add ", event -> {
            getUI().getNavigator().navigateTo("grid");
        });
        addComponent(form);
        addComponent(button5);
        addComponent(formLayout);

    }


}
