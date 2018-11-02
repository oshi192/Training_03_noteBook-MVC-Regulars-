package web;

import controller.Regulars;
import model.Model;
import model.entity.Address;
import model.entity.Contacts;
import model.entity.Names;
import model.exceptions.NotUniqueLoginException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MyForm")
public class Main extends HttpServlet {
    static Model model=new Model();
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        model.createNewEntity();
        setNamesParameterToModel(request);
        setAddressParameterToModel(request);
        setContactsParameterToModel(request);
        model.getTmpEntity().setComment(request.getParameter("comment"));
        model.getTmpEntity().setGroup(request.getParameter("group"));
        model.getTmpEntity().setNickName(request.getParameter("nickName"));
        try {
            model.saveEntity();
        } catch (NotUniqueLoginException e) {
            e.printStackTrace();
        }

        response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        pw.write("<h2> added <h2> <br>");

    }
    private void setNamesParameterToModel(HttpServletRequest request) {
        model.getTmpEntity().setNames(
                new Names.Builder()
                        .name(request.getParameter("name"))
                        .surname(request.getParameter("surname"))
                        .secondName(request.getParameter("secondName"))
                        .build()
        );
    }

    /**
     * fill fields "Contacts" field in Entity
     */
    private void setContactsParameterToModel(HttpServletRequest request) {
        model.getTmpEntity().setContacts(
                new Contacts.Builder()
                        .housePhoneNumber(request.getParameter("housePhoneNumber"))
                        .cellPhoneNumber(request.getParameter("cellPhoneNumber"))
                        .secondCellPhoneNumber(request.getParameter("secondCellPhoneNumber"))
                        .email(request.getParameter("email"))
                        .skype(request.getParameter("skype"))
                        .build()
        );
    }

    /**
     * fill fields "Address" field in Entity
     */
    private void setAddressParameterToModel(HttpServletRequest request) {
        model.getTmpEntity().setAdress(
                new Address.Builder().zip(request.getParameter("zip"))
                        .city(request.getParameter("city"))
                        .street(request.getParameter("street"))
                        .houseNumber(request.getParameter("houseNumber"))
                        .flatNumber(request.getParameter("flatNumber"))
                        .build()
        );
    }
}
