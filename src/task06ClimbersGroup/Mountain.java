package task06ClimbersGroup;

public class Mountain {
    private String mountainName;
    private String country;
    private int height;

    public Mountain(String mountainName, String country, int height) {
        if (height < 100)
            throw new IllegalArgumentException("Гора должна быть выше 100 метров");
        if (mountainName.length() < 4)
            throw new IllegalArgumentException("Название должно быть не короче 4х символов");
        if (country.length() < 4)
            throw new IllegalArgumentException("Название страны должно быть не короче 4х символов");
        this.height = height;
        this.mountainName = mountainName;
        this.country = country;
    }

    public String getMountainName() {
        return mountainName;
    }

    public void setMountainName(String mountainName) {
        this.mountainName = mountainName;
    }
}
