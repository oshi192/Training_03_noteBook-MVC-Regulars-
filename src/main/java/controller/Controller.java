package controller;

import model.Model;
import model.entity.Adress;
import model.entity.Contacts;
import util.Reader;
import view.View;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        model.createNewEntity();
        model.getLastEntity().setAdress(
                new Adress.Builder().zip(checkWords(Regulars.ZIP))
                        .city(checkWords(Regulars.CITY))
                        .flatNumber(checkWords(Regulars.FLAT_NUMBER))
                        .street(checkWords(Regulars.STREET))
                        .houseNumber(checkWords(Regulars.HOUSE_NUMBER))
                        .build()
        );
        model.getLastEntity().setContacts(
                new Contacts.Builder()
                        .housePhoneNumber(checkWords(Regulars.HOUSE_NUMBER))
                        .cellPhoneNumber(checkWords(Regulars.HOUSE_NUMBER))
                        .secondCellPhoneNumber(checkWords(Regulars.HOUSE_NUMBER))
                        .email(checkWords(Regulars.HOUSE_NUMBER))
                        .skype(checkWords(Regulars.HOUSE_NUMBER))
                        .build()
        );

    }

    String checkWords(Regulars regulars) {
        String input;
        do {
            view.printMessages("please enter " + regulars.name + " " + regulars.descryption);
            input = Reader.readString();
            if (!input.matches(regulars.value)) {
                System.out.println("invalid value, " + regulars.descryption);
            }
        } while (!input.matches(regulars.value));
        return input;
    }
}
