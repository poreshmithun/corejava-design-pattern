package immutableclass;

/**
 *
 */
public class Address {
    private String city;
    private String state;

    public Address() {
    }

    //copy constructor
    public Address(Address a) {
        this.city = a.city;
        this.state = a.state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
