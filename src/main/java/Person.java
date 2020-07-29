public class Person {
    public String name;
    public String lastName;
    public Integer age;
    public Address address;

    public Person(){} // needed by JSON serializer

    public Person(String _name, String _lastName, Integer _age, Address _address) {
        this.name = _name;
        this.lastName = _lastName;
        this.age = _age;
        this.address = _address;
    }
}
