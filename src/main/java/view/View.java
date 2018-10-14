package view;

public class View {
    public void printMessages(String ... strings) {
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
