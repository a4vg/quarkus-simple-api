public class Person {
    private String name;
    private String lastName;
    private Integer age;
    private Address address;

    public Person(String _name, String _lastName, Integer _age, Address _address) {
        this.name = _name;
        this.lastName = _lastName;
        this.age = _age;
        this.address = _address;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
