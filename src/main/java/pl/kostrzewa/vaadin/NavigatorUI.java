package pl.kostrzewa.vaadin;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

import lombok.Getter;
import pl.kostrzewa.vaadin.grid.GridView;


@SpringUI
public class NavigatorUI  extends UI {

    @Getter
    private Navigator navigator;

    @Override
    protected void init (VaadinRequest request){
        navigator = new Navigator(this, this);
        setNavigator(navigator);
        navigator.addView("", (View) new ExampleVaadinUui());
        navigator.addView("grid", new GridView());
    }
}