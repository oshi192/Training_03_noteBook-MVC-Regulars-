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

    public static class Builder {
        private String zip;
        private String city;
        private String street;
        private String houseNumber;
        private String flatNumber;

        public Builder zip(String value) {
            this.zip = value;
            return this;
        }

        public Builder city(String value) {
            this.city = value;
            return this;
        }

        public Builder street(String value) {
            this.street = value;
            return this;
        }

        public Builder houseNumber(String value) {
            this.houseNumber = value;
            return this;
        }

        public Builder flatNumber(String value) {
            this.flatNumber = value;
            return this;
        }

        public Address build() {
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

    @Override
    public boolean equals(Object obj) {
        boolean result;
        if (this == obj) {
            result = true;
        } else if (obj == null) {
            result = false;
        } else if (getClass() == obj.getClass()) {
            Address tmpAddress = (Address) obj;
            result = this.zip.equals(tmpAddress.zip) &&
                    this.city.equals(tmpAddress.city) &&
                    this.street.equals(tmpAddress.street) &&
                    this.houseNumber.equals(tmpAddress.houseNumber) &&
                    this.flatNumber.equals(tmpAddress.flatNumber);
        } else {
            result = false;
        }
        return result;
    }

    @Override
    public int hashCode() {
        int code = 31 * zip.hashCode() + city.hashCode() + street.hashCode()
                + houseNumber.hashCode() + flatNumber.hashCode();
        return code;
    }
}
