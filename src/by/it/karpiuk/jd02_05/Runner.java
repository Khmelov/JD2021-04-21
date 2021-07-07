package by.it.karpiuk.jd02_05;

import java.util.Locale;

public class Runner {
    public static void main(String[] args) {
        ManagerSelect manager = ManagerSelect.INSTANCE;
        if (args.length == 2){
            Locale locale = new Locale(args[0], args[1]);
            manager.set(locale);
        }
        System.out.println(manager.get(Messages.WELCOME));
        System.out.println(manager.get(Messages.QUESTION));
        System.out.println(manager.get(MyNameIs.FIRST_NAME));
        System.out.println(manager.get(MyNameIs.LAST_NAME));

    }
}
