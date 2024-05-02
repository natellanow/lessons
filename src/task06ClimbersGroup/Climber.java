package task06ClimbersGroup;

public class Climber {
    private String climberName;
    private String address;

    public Climber(String name, String address) {
        if (name.length() < 3)
            throw new IllegalArgumentException("Имя должно содержать более 3 символов");
        if (address.length() < 5)
            throw new IllegalArgumentException("Адрес должен содержать более 5 символов");
        this.climberName = name;
        this.address = address;
    }

}
}
