package controller;

import java.util.ResourceBundle;

public interface Resources {
    ResourceBundle bundle = ResourceBundle.getBundle("regulars");
    String VAR_NAME = "name";
    String VAR_VALUE = "value";
    String VAR_DESCRYPTION = "descryption";
    String DOT = ".";
}
