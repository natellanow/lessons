package task06ClimbersGroup;

public class Group {
    private Mountain mountain;
    private boolean isOpen = true;
    private Climber[] climbers;


    public Group(Mountain mountain, boolean isOpen) {
        this.mountain = mountain;
        this.isOpen = isOpen;
        this.climbers = new Climber[3];
    }

    public void addClimber(Climber climber) {
        if (isOpen == true) {
            for (int i = 0; i < climbers.length; i++) {
                if (climbers[i] == null) {
                    climbers[i] = climber;
                    break;
                }
            }
        } else {
            for (int i = 0; i < climbers.length; i++) {
                if (climbers[i] == null) {
                    climbers[i] = climber;
                    break;
                }
            }
        }
    }

    public Climber[] getClimbers() {
        return climbers;
    }

    public boolean isOpen() {
        return isOpen;
    }


}
