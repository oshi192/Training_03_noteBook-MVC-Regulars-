package controller;

public enum Regulars {
    NAME(" name ","[A-Za-z]+", "please enter only letters frop \'a\' to \'z\'"),
    SURNAME(" surname ","[A-Za-z]+", "please enter only letters frop \'a\' to \'z\'"),
    SECOND_NAME(" second name ","[A-Za-z]+", "please enter only letters frop \'a\' to \'z\'"),

    ZIP("City name","[A-Za-z]+", "please enter only letters frop \'a\' to \'z\'"),
    CITY("City name","[A-Za-z]+", "please enter only letters frop \'a\' to \'z\'"),
    STREET("City name","[A-Za-z]+", "please enter only letters frop \'a\' to \'z\'"),
    HOUSE_NUMBER("number","[0-9]+", "please enter only positive numbers frop \'0\' to \'9\'"),
    FLAT_NUMBER("number","[0-9]+", "please enter only positive numbers frop \'0\' to \'9\'"),

    HOUSE_PHONE_NUMBER(" house phone number ","[0-9]+", "please enter only positive numbers frop \'0\' to \'9\'"),
    CELL_PHONE_NUMBER(" cell phone number ","[0-9]+", "please enter only positive numbers frop \'0\' to \'9\'"),
    EMAIL(" email ","[0-9]+", "please enter only positive numbers frop \'0\' to \'9\'"),
    SKYPE(" your skype ","[0-9]+", "please enter only positive numbers frop \'0\' to \'9\'");

    public final String name;
    public final String value;
    public final String descryption;

    Regulars(String name, String value, String descryption) {
        this.name =name;
        this.value = value;
        this.descryption = descryption;
    }

}

