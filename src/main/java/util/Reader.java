package util;

import java.util.Scanner;

public class Reader {
    private static Scanner scanner;

    private Reader(){
        throw new IllegalStateException("Cannot create example from class util.Reader");
    }
    public static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static String readString() {
        return getScanner().nextLine();
    }
}
