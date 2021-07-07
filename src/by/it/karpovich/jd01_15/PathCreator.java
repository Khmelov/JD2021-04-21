package by.it.karpovich.jd01_15;

import java.io.File;

public class PathCreator {

    private static final String USER_DIR = "user.dir";
    private static final String SRC = "src";

    private PathCreator() {
    }

    static String getFilePath(String filename, Class<?> currentStructure) {
        String rootProject = System.getProperty(USER_DIR);
        String src = rootProject + File.separator + SRC + File.separator;
        String relatedDir = currentStructure
                .getName()
                .replace(currentStructure.getSimpleName(), "")
                .replace(".", File.separator);
        return src + relatedDir + filename;
    }
}
