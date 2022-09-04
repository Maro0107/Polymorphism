public class House extends Flat {
    protected float parcelSize;

    public House(float parcelSize) {
        this.parcelSize = parcelSize;
    }

    public House(String city, String street, float parcelSize) {
        super(city, street);
        this.parcelSize = parcelSize;
    }

    @Override
    public String toString() {
        return "House{" +
                "parcelSize=" + parcelSize +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public float getParcelSize() {
        return parcelSize;
    }

    public House setParcelSize(float parcelSize) {
        this.parcelSize = parcelSize;
        return this;
    }
}
