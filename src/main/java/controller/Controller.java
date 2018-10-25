package controller;

import model.exceptions.*;
import model.Model;
import model.entity.Address;
import model.entity.Contacts;
import model.entity.Names;
import util.Reader;
import view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * create entity in model? fill its fields? and after that save it into model.
     */
    public void run() {
        model.createNewEntity();
        setNamesParameterToModel();
        setAddressParameterToModel();
        setContactsParameterToModel();
        model.getTmpEntity().setComment(checkWords(Regulars.COMMENT));
        saveEntity();
        view.printMessages(model.getNoteBook().get(model.getNoteBook().size() - 1).toString());
    }

    void saveEntity(){
        boolean isSaved = false;
        while (!isSaved){
            try {
                model.getTmpEntity().setNickName(checkWords(Regulars.NICK_NAME));
                model.saveEntity();
                isSaved = true;
            } catch (NotUniqueLoginException e) {
                view.printMessages(View.INVALID_VALUE,e.getMessage());
            }
        }
    }
    /**
     * Reads string from user and check it with regular expression,
     *
     * @param regulars - Enum with regular expression to check with
     * @return string that has passed comparing regular expression
     */
    private String checkWords(Regulars regulars) {
        String input;
        do {
            view.printMessages(View.PLEASE_ENTER + regulars.name + View.SPACE + regulars.descryption);
            input = Reader.readString();
            if (!input.matches(regulars.value)) {
                view.printMessages(View.INVALID_VALUE + regulars.descryption);
            }
        } while (!input.matches(regulars.value));
        return input;
    }

    /**
     * fill fields "Names" field in Entity
     */
    private void setNamesParameterToModel() {
        model.getTmpEntity().setNames(
                new Names.Builder()
                        .name(checkWords(Regulars.NAME))
                        .surname(checkWords(Regulars.SURNAME))
                        .secondName(checkWords(Regulars.SECOND_NAME))
                        .build()
        );
    }

    /**
     * fill fields "Contacts" field in Entity
     */
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

    /**
     * fill fields "Address" field in Entity
     */
    private void setAddressParameterToModel() {
        model.getTmpEntity().setAdress(
                new Address.Builder().zip(checkWords(Regulars.ZIP))
                        .city(checkWords(Regulars.CITY))
                        .street(checkWords(Regulars.STREET))
                        .houseNumber(checkWords(Regulars.HOUSE_NUMBER))
                        .flatNumber(checkWords(Regulars.FLAT_NUMBER))
                        .build()
        );
    }
}
