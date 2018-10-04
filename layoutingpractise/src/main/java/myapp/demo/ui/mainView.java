package myapp.demo.ui;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import myapp.demo.model.studentModel;

import java.util.ArrayList;
import java.util.List;

@SpringUI
public class mainView extends UI {
    VerticalLayout mainLayout ;
    HorizontalLayout header;
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setMainLayout();
        setHeader();
        setViewContainer();


    }

    private void setViewContainer() {
        HorizontalLayout mainContent= new HorizontalLayout();
        mainLayout.addComponent(mainContent);
        mainContent.setSizeFull();
        mainLayout.setExpandRatio(mainContent,1);

        VerticalLayout sidemenu = new VerticalLayout();
        mainContent.addComponent(sidemenu);
        sidemenu.setWidthUndefined();
        sidemenu.setMargin(false);
        sidemenu.setHeight(100,Unit.PERCENTAGE);
        Button link1 = new Button("SignIn");
        link1.setStyleName(ValoTheme.BUTTON_BORDERLESS);
        Button link2 = new Button("SignOut");
        link2.setStyleName(ValoTheme.BUTTON_BORDERLESS);
        Button link3 = new Button("Customers");
        link3.setStyleName(ValoTheme.BUTTON_BORDERLESS);
        Button link4 = new Button("Admin");
        link4.setStyleName(ValoTheme.BUTTON_BORDERLESS);

        sidemenu.addComponents(link1,link2,link3,link4);

        sidemenu.setStyleName(ValoTheme.MENU_ROOT);
        sidemenu.setExpandRatio(link2,1);
        sidemenu.setExpandRatio(link3,1);
        sidemenu.setExpandRatio(link4,1);
        //sidemenu.setStyleName(ValoTheme.MENU_ITEM);

        Panel panel = new Panel();
        mainContent.addComponent(panel);
        panel.setSizeFull();
        //panel.setStyleName(ValoTheme.PANEL_BORDERLESS);
        mainContent.setExpandRatio(panel,1);
        //mainContent.setExpandRatio(panel,2);
    }



    private void setLogo() {

    }

    private void setMainLayout() {
       mainLayout = new VerticalLayout();
        mainLayout.setSizeFull();
       // mainLayout.setMargin(false);
        setContent(mainLayout);
    }

    public void setHeader(){
        header = new HorizontalLayout();
        mainLayout.addComponent(header);
        header.setWidth(100,Unit.PERCENTAGE);

        Label logo = new Label("LOGO");
        //logo.setStyleName(ValoTheme.LABEL_H3);
        header.addComponent(logo);

        Button logInButton = new Button("Login");
        logInButton.setIcon(VaadinIcons.PLUS);
        logInButton.setStyleName(ValoTheme.BUTTON_LINK);
        header.addComponent(logInButton);
        header.setComponentAlignment(logInButton,Alignment.TOP_RIGHT);
    }
    public List<studentModel> getAll(){
        studentModel s = new studentModel(2,"Kamrul");
        studentModel s1 = new studentModel(1,"Shamim");
        List<studentModel> list = new ArrayList<>();
        list.add(s);
        list.add(s1);

        return list;
    }
}
