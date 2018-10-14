import controller.Controller;
import controller.Regulars;
import model.Model;
import view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        System.out.println("asd#".matches(Regulars.COMMENT.value));
      /* Controller controller = new Controller(model, view);
        controller.run();*/
    }
}
