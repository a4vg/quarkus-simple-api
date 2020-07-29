public class Address {
    public String country;
    public String city;
    public String avenue;
    public String number;

    public Address(){}; // needed by JSON serializer

    public Address (String _country, String _city, String _avenue, String _number) {
        this.country = _country;
        this.city = _city;
        this.avenue = _avenue;
        this.number = _number;
    }
}
