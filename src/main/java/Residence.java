public class Residence extends House{
    protected float garageSize;

    @Override
    public String toString() {
        return "Residence{" +
                "garageSize=" + garageSize +
                ", parcelSize=" + parcelSize +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public float getGarageSize() {
        return garageSize;
    }

    public Residence setGarageSize(float garageSize) {
        this.garageSize = garageSize;
        return this;
    }
//
//    public Residence(float parcelSize, float garageSize) {
//        super(parcelSize);
//        this.garageSize = garageSize;
//    }

    public Residence(String city, String street, float parcelSize, float garageSize) {
        super(city, street, parcelSize);
        this.garageSize = garageSize;
    }
}
