package model.entity;

public class Names {
    private final static String POINT = ".";
    private final static String SPACE = " ";
    private String name;
    private String surname;
    private String secondName;

    private Names(Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.secondName = builder.secondName;
    }

    public static class Builder{
        private String name;
        private String surname;
        private String secondName;

        public Builder name(String value){
            this.name = value;
            return this;
        }
        public Builder surname(String value){
            this.surname = value;
            return this;
        }
        public Builder secondName(String value){
            this.secondName = value;
            return this;
        }
        public Names build(){
            return new Names(this);
        }

    }
    @Override
    public String toString() {
        String result;
        result = surname +
                SPACE +
                name.toUpperCase().charAt(0) +
                POINT +
                SPACE +
                secondName.toUpperCase().charAt(0) +
                POINT;
        return result;
    }

}
