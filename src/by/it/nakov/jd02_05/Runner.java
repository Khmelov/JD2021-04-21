package by.it.nakov.jd02_05;

import java.util.Locale;

public class Runner {
    public static void main(String[] args) {
        ResMan resMan = ResMan.INSTANCE;
        if (args.length == 2) {
            Locale locale = new Locale(args[0], args[1]);
            resMan.set(locale);
        }
        System.out.println(resMan.get(Messages.WELCOME));
        System.out.println(resMan.get(Messages.QUESTION));
        System.out.println(resMan.get(User.FIRST_NAME));
        System.out.println(resMan.get(User.LAST_NAME));
    }
}
