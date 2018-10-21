package tmp;

public class MainSecond {
    public static void main(String[] args) {
        Parrent parrent = new Parrent();
        Chield chield = new Chield();
        ChieldChield chieldChield = new ChieldChield();
        ChieldSecond chieldSecond = new ChieldSecond();
        System.out.println("chield instanceof Parrent" + (chield instanceof Parrent));
        System.out.println("chieldChield instanceof Parrent" + (chieldChield instanceof Parrent));
//        System.out.println("chield instanceof Parrent" + (chieldChield instanceof ChieldSecond));
    }
}
