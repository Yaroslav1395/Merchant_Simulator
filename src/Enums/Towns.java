package Enums;

public enum Towns {
    MOSCOW,
    BERLIN,
    ROME,
    KIEV,
    PARIS,
    MADRID;

    private int distanceToCity;

    Towns() {
    }

    public int getDistanceToCity() {
        return distanceToCity;
    }

    public void setDistanceToCity(int distanceToCity) {
        this.distanceToCity = distanceToCity;
    }
}
