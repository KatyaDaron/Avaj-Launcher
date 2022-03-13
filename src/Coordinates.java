public class Coordinates {

    private int longitude;
    private int latitude;
    private int height;

    protected Coordinates(int longitude, int latitude, int height) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }

    public int getLongitude() {
        return longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getHeight() {
        return height;
    }

    public void changeLongitude(int lon) {
        this.longitude += lon;
    }

    public void changeLatitude(int lat) {
        this.latitude += lat;
    }

    public void changeHeight(int h) {
        if ((this.height + h) <= 0) {
            this.height = 0;
        }
        else if ((this.height + h) > 100) {
            this.height = 100;
        }
        else {
            this.height += h;
        }
    }
}
