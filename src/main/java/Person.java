public class Person {
    private String name;
    private String lastName;
    private Integer age;

    public Person(String _name, String _lastName, Integer _age) {
        this.name = _name;
        this.lastName = _lastName;
        this.age = _age;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Integer getAge() {
        return this.age;
    }
}
