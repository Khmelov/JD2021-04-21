package by.it.karpiuk.jd02_06;

import java.io.File;

 class PathCreator {

    private static final String USER_DIR = "user.dir";
    private static final String SRC ="src";

    private PathCreator(){

    }

     static String getfileName(Class<?> aClass, String fileName) {
        String root = System.getProperty(USER_DIR);
        String path = aClass
                .getName()
                .replace(aClass.getSimpleName(),"")
                .replace(".", File.separator);
        return root + File.separator + SRC +File.separator+path+fileName;
    }
}
