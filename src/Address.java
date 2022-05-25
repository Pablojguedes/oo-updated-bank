import java.util.Objects;

public class Address {

    private String street;
    private int number;
    private String complement;
    private String state;
    private String city;

    public Address(String street, int number, String complement, String state, String city) {
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.state = state;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return number == address.number && Objects.equals(street, address.street) && Objects.equals(complement, address.complement) && Objects.equals(state, address.state) && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, number, complement, state, city);
    }

    @Override
    public String toString() {
        return  "Street: " + street + "\n" +
                "Number: " + number + "\n" +
                "Complement: " + complement + "\n" +
                "State: " + state + "\n" +
                "City: " + city + "\n";
    }
}
