package view;

import org.apache.log4j.Logger;

public class View {
    public static final String PLEASE_ENTER = "please enter ";
    public static final String SPACE = " ";
    public static final String INVALID_VALUE = "invalid value, ";
    Logger logger = Logger.getLogger(View.class);

    public void printMessages(String... strings) {
        for (String s : strings) {
            logger.info(s);
        }
    }
}
