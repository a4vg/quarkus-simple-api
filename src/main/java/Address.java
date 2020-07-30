public class Address {
    private Long id;
    private String country;
    private String city;
    private String avenue;
    private String number;

    public Address(){}; // needed by JSON serializer

    public Address (String _country, String _city, String _avenue, String _number) {
        this.country = _country;
        this.city = _city;
        this.avenue = _avenue;
        this.number = _number;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
