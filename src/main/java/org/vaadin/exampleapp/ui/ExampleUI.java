package org.vaadin.exampleapp.ui;


import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

@SpringUI(path = "/")
@Title("bug minimal example")
@Theme("theme")
public class ExampleUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        setContent(new CssLayout());

        Window window = new Window();
        window.setCaption("Example window");
        window.setHeight("400px");
        window.setWidth("600px");
        window.setDraggable(true);
        addWindow(window);
    }
}
