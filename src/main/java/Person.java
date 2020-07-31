import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;

public class Person {
    private Long id;
    private String name;
    private String lastName;
    private Integer age;
    private Address address;

    public Person(){} // needed by JSON serializer

    @JsonbCreator
    public Person(
            @JsonbProperty("id") Long _id,
            @JsonbProperty("name") String _name,
            @JsonbProperty("lastName") String _lastName,
            @JsonbProperty("age") Integer _age,
            @JsonbProperty("address") Address _address
    ) {
        this.id = _id;
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
