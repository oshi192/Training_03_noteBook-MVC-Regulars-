package controller;

public enum Regulars {
    NAME(" name ",
            "[A-Za-z]{2,20}",
            " enter only letters, up to 20 letters, max length - 20, min - 2"),
    SURNAME(" surname ",
            "[\\-?\\.?A-Za-z]{2,20}",
            " enter only letters, up to 20 letters? can be \'.\' or \'-\', max length - 20, min - 2"),
    SECOND_NAME(" second name ",
            "[A-Za-z]{2,20}",
            " enter only letters frop \'a\' to \'z\', max length - 20, min - 2"),

    UKRAINE_LANG(" прізвище ",
            "[а-щА-ЩЬьЮюЯяЇїІіЄєҐґ']{1,20}",
            " може містити букви лише українського алфавіту, максимум 20"),

    ZIP(" zip code ",
            "[0-9]{5,10}",
            " enter only numbers, length from 5 to 10"),
    CITY(" City name ",
            "[\\-?\\.?A-Za-z]{1,25}",
            " enter only letters, up to 20 letters? can be \'.\' or \'-\', max length - 25"),
    STREET(" Street name ",
            "[\\-?\\.?A-Za-z0-9]{1,25}",
            "can be numbers, letters, \'-\' , \'.\', max length - 25"),
    HOUSE_NUMBER("house number",
            "[0-9]{1,6}",
            "enter only numbers, max length - 6"),
    FLAT_NUMBER(" flat number ",
            "[0-9]{1,6}",
            "enter only numbers, max length - 6"),

    HOUSE_PHONE_NUMBER(" house phone number ",
            "^(\\+)*[0-9]{5,12}",
            "enter only numbers also can be symbol \'+\' on start, max length - 12, min - 5"),
    CELL_PHONE_NUMBER(" cell phone number ",
            "^(\\+)*[0-9]{5,12}",
            "enter only numbers also can be symbol \'+\' on start, max length - 12, min - 5"),
    SECOND_CELL_PHONE_NUMBER(" second cell phone number ",
            "(^(\\+)*[0-9]{5,12})|()",
            "you can skip this line!" +
                    " or enter only numbers also can be symbol \'+\' on start, max length - 12, min - 5"),
    EMAIL(" email",
            "^(([a-z0-9_-]\\.){1,15})*[a-z0-9_-]{1,15}@[a-z0-9_-]{1,15}(\\.[a-z0-9_-]{2,6})*\\.[a-z]{2,6}$",
            "please enter only letters, numbers and symbols: \'.\' \'-\' \'_\' \'@\'"),
    SKYPE(" your skype",
            "(" + CELL_PHONE_NUMBER.value + ")|(" + EMAIL.value + ")",
            "enter only numbers, letters, and symbols: \'+\' \'_\' \'-\' \'.\' \'@\'"),

    COMMENT("comment", ".{1,255}", "max length 255"),
    NICK_NAME(" nickname ",
            "[A-Za-z0-9_-]{3,12}",
            "enter only numbers, letters and symbols: \'_\' \'-\'");

    public final String name;
    public final String value;
    public final String descryption;

    Regulars(String name, String value, String descryption) {
        this.name = name;
        this.value = value;
        this.descryption = descryption;
    }

}

