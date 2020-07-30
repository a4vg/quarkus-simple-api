public class Person {
    private Long id;
    private String name;
    private String lastName;
    private Integer age;
    private Address address;

    public Person(){} // needed by JSON serializer

    public Person(String _name, String _lastName, Integer _age, Address _address) {
        this.name = _name;
        this.lastName = _lastName;
        this.age = _age;
        this.address = _address;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
