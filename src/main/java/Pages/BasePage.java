package Pages;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {
    protected final static String BASE_URL="https://the-internet.herokuapp.com";
    public final static String ADD_PAGE_URL = BASE_URL + "/add_remove_elements/";

    public static AddElementPage openAddElementPage(){
        open(ADD_PAGE_URL);
        return new AddElementPage();
    }
}
