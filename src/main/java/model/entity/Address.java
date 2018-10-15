package model.entity;

/**
 * class consists address values
 * class with builder template
 */
public class Address {
    private String zip;
    private String city;
    private String street;
    private String houseNumber;
    private String flatNumber;

    private Address(Builder builder) {
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

        public Address build(){
            return new Address(this);
        }
    }

    @Override
    public String toString() {
        return "Adress{" +
                " zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                '}';
    }
}
