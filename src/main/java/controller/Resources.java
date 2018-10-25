package controller;

import java.util.Locale;
import java.util.ResourceBundle;

public interface Resources {
    ResourceBundle bundle = ResourceBundle.getBundle("regulars",new Locale("en"));
    String VAR_NAME = "name";
    String VAR_VALUE = "value";
    String VAR_DESCRYPTION = "descryption";
    String DOT = ".";
}
