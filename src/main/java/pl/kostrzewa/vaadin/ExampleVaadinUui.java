package pl.kostrzewa.vaadin;



import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.web.client.RestTemplate;


public class ExampleVaadinUui extends VerticalLayout implements View {

    public VerticalLayout restLayout;

    public ExampleVaadinUui() {
        TextField tf = new TextField("Your Name ");
        Button button = new Button("Action");

        button.addClickListener(x -> Notification.show(tf.getValue())) ;
        addComponents(tf, button);



        Button button2 = new Button("Call rest service ", event -> callRestService());

        Button button3 = new Button("Show grid list ", event -> {
                getUI().getNavigator().navigateTo("grid");
        });

        addComponents(button2, button3);


    }


    private void callRestService() {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://localhost:8080/rest", String.class);
        Notification.show(result);
    }


}
