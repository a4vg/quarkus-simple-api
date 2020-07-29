public class Address {
    private String country;
    private String city;
    private String avenue;
    private String number;

    public Address (String _country, String _city, String _avenue, String _number) {
        this.country = _country;
        this.city = _city;
        this.avenue = _avenue;
        this.number = _number;
    }


    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getAvenue() {
        return avenue;
    }

    public String getNumber() {
        return number;
    }
}
