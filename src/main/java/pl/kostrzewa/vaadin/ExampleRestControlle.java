package pl.kostrzewa.vaadin;

import org.springframework.web.bind.annotation.RequestMapping;

public class ExampleRestControlle {

    @RequestMapping("/rest")
    public String get() {
        return "Hello! :)";
    }
}
