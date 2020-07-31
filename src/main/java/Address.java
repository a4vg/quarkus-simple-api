import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;

public class Address {
    private Long personId;
    private String country;
    private String city;
    private String avenue;
    private String number;

    public Address(){}; // needed by JSON serializer

    @JsonbCreator
    public Address (
            @JsonbProperty("personId") Long _personId,
            @JsonbProperty("country") String _country,
            @JsonbProperty("city") String _city,
            @JsonbProperty("avenue") String _avenue,
            @JsonbProperty("number") String _number
    ) {
        this.personId = _personId;
        this.country = _country;
        this.city = _city;
        this.avenue = _avenue;
        this.number = _number;
    }

    // Getters and setters
    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
