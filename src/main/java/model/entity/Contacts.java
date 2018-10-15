package model.entity;

public class Contacts {
    private String housePhoneNumber;
    private String cellPhoneNumber;
    private String secondCellPhoneNumber;
    private String email;
    private String skype;

    private Contacts(Builder builder) {
        this.housePhoneNumber = builder.housePhoneNumber;
        this.cellPhoneNumber = builder.cellPhoneNumber;
        this.secondCellPhoneNumber = builder.secondCellPhoneNumber;
        this.email = builder.email;
        this.skype = builder.skype;
    }

    public static class Builder {
        private String housePhoneNumber;
        private String cellPhoneNumber;
        private String secondCellPhoneNumber;
        private String email;
        private String skype;

        public Builder housePhoneNumber(String value) {
            this.housePhoneNumber = value;
            return this;
        }

        public Builder cellPhoneNumber(String value) {
            this.cellPhoneNumber = value;
            return this;
        }

        public Builder secondCellPhoneNumber(String value) {
            this.secondCellPhoneNumber = value;
            return this;
        }

        public Builder email(String value) {
            this.email = value;
            return this;
        }

        public Builder skype(String value) {
            this.skype = value;
            return this;
        }

        public Contacts build() {
            return new Contacts(this);
        }
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "housePhoneNumber='" + housePhoneNumber + '\'' +
                ", cellPhoneNumber='" + cellPhoneNumber + '\'' +
                ", secondCellPhoneNumber='" + secondCellPhoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                '}';
    }
}
