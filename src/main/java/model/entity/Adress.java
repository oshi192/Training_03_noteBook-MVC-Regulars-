package model.entity;

public class Adress {
    private String zip;
    private String city;
    private String street;
    private String houseNumber;
    private String flatNumber;

    private Adress(Builder builder) {
        this.zip = builder.zip;
        this.city = builder.city;
        this.street = builder.street;
        this.houseNumber = builder.houseNumber;
        this.flatNumber = builder.flatNumber;
    }
    public static class Builder{
        private String zip;
        private String city;
        private String street;
        private String houseNumber;
        private String flatNumber;

        public Builder zip(String value){
            this.zip =value;
            return this;
        }

        public Builder city(String value){
            this.city =value;
            return this;
        }

        public Builder street(String value){
            this.street =value;
            return this;
        }

        public Builder houseNumber(String value){
            this.houseNumber =value;
            return this;
        }

        public Builder flatNumber(String value){
            this.flatNumber =value;
            return this;
        }

        public Adress build(){
            return new Adress(this);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
