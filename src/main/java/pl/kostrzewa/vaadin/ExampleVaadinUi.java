//package pl.kostrzewa.vaadin;
//
//
//
//import com.vaadin.server.VaadinRequest;
//import com.vaadin.spring.annotation.SpringUI;
//import com.vaadin.ui.*;
//import org.springframework.web.client.RestTemplate;
//
//@SpringUI
//public class ExampleVaadinUi extends UI {
//
//    public VerticalLayout restLayout;
//
//    public ExampleVaadinUi() {
//        restLayout = new VerticalLayout();
//        setContent((restLayout));
//    }
//
//    public ExampleVaadinUi(Component content) {
//        super(content);
//    }
//
//    @Override
//    protected void init (VaadinRequest vaadinRequest){
////        VerticalLayout verticalLayout = new VerticalLayout();
//        TextField tf = new TextField("Your Name ");
//        Button button = new Button("Action");
//
//        button.addClickListener(x -> Notification.show(tf.getValue())) ;
//        restLayout.addComponents(tf, button);
//
//        Button button2 = new Button("Call rest service ", event -> callRestService());
//        restLayout.addComponents(button2);
//
//        //klikniecie
//
//
//        //dodaje
////        verticalLayout.addComponents(tf, button);
////        setContent(verticalLayout);
//    }
//
//    private void callRestService() {
//        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject("http://localhost:8080/rest", String.class);
//        Notification.show(result);
//    }
//
//
//}
