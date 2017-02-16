package model;

/**
 * Created by Victor on 4/2/17.
 */
public class Address {

    private final String street;
    private final String city;
    private final String country;
    private final int number;
    private final int floor;
    private final Character letter;
    private final int ZIPCode;

    public Address(String street, String city, String country, int number, int floor, Character letter, int ZIPCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.number = number;
        this.floor = floor;
        this.letter = letter;
        this.ZIPCode = ZIPCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getNumber() {
        return number;
    }

    public int getFloor() {
        return floor;
    }

    public Character getLetter() {
        return letter;
    }

    public int getZIPCode() {
        return ZIPCode;
    }

    @Override
    public boolean equals(Object o){
        Address address = (Address)o;
        return address.street.equals(this.street) &&
        address.city.equals(this.city) &&
        address.country.equals(this.country) &&
        address.number == this.number &&
        address.floor == this.floor &&
        address.letter.equals(this.letter) &&
        address.ZIPCode == ZIPCode;
    }
}
