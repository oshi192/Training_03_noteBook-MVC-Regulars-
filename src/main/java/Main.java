import controller.Controller;
import model.Model;
import view.View;

import java.sql.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
//        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//        Connection connection = DriverManager. getConnection("jdbc:mysql://localhost/cursor1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","root");
//        PreparedStatement statement = connection.prepareStatement("select * from cars");
//        ResultSet resultSet =  statement.executeQuery();
//        if(resultSet.next())System.out.println(resultSet.getString(2));
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        controller.run();
    }
}

