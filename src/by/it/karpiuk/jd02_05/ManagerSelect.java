package by.it.karpiuk.jd02_05;

import java.util.Locale;
import java.util.ResourceBundle;

public enum ManagerSelect {
    INSTANCE;

    private final String LANGUAGE = "by.it.karpiuk.jd02_05.res.language";

    private ResourceBundle resourceBundle;

    ManagerSelect(){
        set(Locale.getDefault());
    }

    public void set(Locale locale) {
        resourceBundle = ResourceBundle.getBundle(LANGUAGE, locale);
    }
    public String get(String key){
        return resourceBundle.getString(key);
    }

}
