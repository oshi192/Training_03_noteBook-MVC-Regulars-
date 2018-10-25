package model.entity;

/**
 * class consists names values
 * class with builder template
 */
public class Names {
    private final static String POINT = ".";
    private final static String SPACE = " ";
    private String name;
    private String surname;
    private String secondName;

    private Names(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.secondName = builder.secondName;
    }

    public static class Builder {
        private String name;
        private String surname;
        private String secondName;

        public Builder name(String value) {
            this.name = value;
            return this;
        }

        public Builder surname(String value) {
            this.surname = value;
            return this;
        }

        public Builder secondName(String value) {
            this.secondName = value;
            return this;
        }

        public Names build() {
            return new Names(this);
        }

    }

    @Override
    public String toString() {
        String result;
        result = surname.toUpperCase().charAt(0) +
                surname.toLowerCase().substring(1, surname.length() - 1) +
                SPACE +
                name.toUpperCase().charAt(0) +
                POINT +
                SPACE +
                secondName.toUpperCase().charAt(0) +
                POINT;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result;
        if (this == obj) {
            result = true;
        } else if (obj == null) {
            result = false;
        } else if (getClass() == obj.getClass()) {
            Names tmp = (Names) obj;
            result = this.name.equals(tmp.name) &&
                    this.surname.equals(tmp.surname) &&
                    this.secondName.equals(tmp.secondName);
        } else {
            result = false;
        }
        return result;
    }
}
