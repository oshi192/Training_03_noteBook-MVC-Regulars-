package controller;

import static controller.Resources.*;

public enum Regulars {
    NAME,
    SURNAME,
    SECOND_NAME,
    ZIP,
    CITY,
    STREET,
    HOUSE_NUMBER,
    FLAT_NUMBER,
    HOUSE_PHONE_NUMBER,
    CELL_PHONE_NUMBER,
    SECOND_CELL_PHONE_NUMBER,
    EMAIL,
    SKYPE,
    COMMENT,
    NICK_NAME;

    public final String name;
    public final String value;
    public final String descryption;

    Regulars() {
        this.name = bundle.getString(this.name()+DOT+VAR_NAME);
        this.value = bundle.getString(this.name()+DOT+VAR_VALUE);
        this.descryption = bundle.getString(this.name()+DOT+VAR_DESCRYPTION);
    }
}

