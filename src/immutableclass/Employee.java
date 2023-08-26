package immutableclass;

/**
 * Writing Immutable Employee class
 */
public class Employee {

    private final String name;
    private final String eid;
    private final Address address;

    public Employee(String name, String eid, Address address) {
        this.name = name;
        this.eid = eid;
        this.address = new Address(address);
    }

    public String getName() {
        return name;
    }

    public String getEid() {
        return eid;
    }

    public Address getAddress() {
        return new Address(address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", eid='" + eid + '\'' +
                ", address=" + address +
                '}';
    }
}
