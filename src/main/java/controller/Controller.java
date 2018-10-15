package controller;

import model.Model;
import model.entity.Adress;
import model.entity.Contacts;
import model.entity.Names;
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
        setNamesParameterToModel();
        setAdressParameterToModel();
        setContactsParameterToModel();

        model.getTmpEntity().setComment(checkWords(Regulars.COMMENT));
        model.getTmpEntity().setNickName(checkWords(Regulars.NICK_NAME));
        model.saveEntity();
        model.printLastEntity();
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

    private void setNamesParameterToModel() {
        model.getTmpEntity().setNames(
                new Names.Builder()
                        .name(checkWords(Regulars.NAME))
                        .surname(checkWords(Regulars.SURNAME))
                        .secondName(checkWords(Regulars.SECOND_NAME))
                        .build()
        );
    }

    private void setContactsParameterToModel() {
        model.getTmpEntity().setContacts(
                new Contacts.Builder()
                        .housePhoneNumber(checkWords(Regulars.HOUSE_PHONE_NUMBER))
                        .cellPhoneNumber(checkWords(Regulars.CELL_PHONE_NUMBER))
                        .secondCellPhoneNumber(checkWords(Regulars.SECOND_CELL_PHONE_NUMBER))
                        .email(checkWords(Regulars.EMAIL))
                        .skype(checkWords(Regulars.SKYPE))
                        .build()
        );
    }

    private void setAdressParameterToModel() {
        model.getTmpEntity().setAdress(
                new Adress.Builder().zip(checkWords(Regulars.ZIP))
                        .city(checkWords(Regulars.CITY))
                        .street(checkWords(Regulars.STREET))
                        .houseNumber(checkWords(Regulars.HOUSE_NUMBER))
                        .flatNumber(checkWords(Regulars.FLAT_NUMBER))
                        .build()
        );
    }
}
