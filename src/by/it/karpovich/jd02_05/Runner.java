package by.it.karpovich.jd02_05;

import by.it.karpovich.jd02_05.Messages;
import by.it.karpovich.jd02_05.ResMan;
import by.it.karpovich.jd02_05.User;

import java.util.Locale;

public class Runner {


    public static void main(String[] args) {
        by.it.karpovich.jd02_05.ResMan manager = ResMan.INSTANCE;
        if (args.length == 2) {
            Locale locale = new Locale(args[0], args[1]);
            manager.set(locale);
        }
        System.out.println(manager.get(by.it.karpovich.jd02_05.Messages.WELCOME));
        System.out.println(manager.get(Messages.QUESTION));
        System.out.println(manager.get(by.it._classwork_.jd02_05.User.FIRST_NAME));
        System.out.println(manager.get(User.LAST_NAME));

    }
}

