package participant;

public class Human extends Participant{
    private boolean isAthlete;

    public Human(String name, int legs, boolean isAthlete) {
        super(name, legs);
        this.isAthlete = isAthlete;
    }

    public boolean isAthlete() {
        return isAthlete;
    }
}
