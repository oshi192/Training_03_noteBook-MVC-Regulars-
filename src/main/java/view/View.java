package view;

public class View {
    private static final String LINE_WITH_HASHES = "##################################################";
    public static final String PLEASE_ENTER = "please enter ";
    public static final String SPACE = " ";
    public static final String INVALID_VALUE = "invalid value, ";

    public void printMessages(String ... strings) {
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
