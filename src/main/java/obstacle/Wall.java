package obstacle;


import participant.Human;
import participant.Participant;
import participant.Robot;

public class Wall extends Obstacle {
    private String material;
    private int height;
    private boolean isSuccessful = false;

    public Wall(String name, String material, int height) {
        super(name);
        this.material = material;
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean overcome(String name, Participant participantType) {
        super.overcome(name, participantType);
        System.out.println(name + " is about to jump over wall that " +
                height + " metres height!");
        if (height <= 1 || (participantType.getClass().equals(Robot.class) && ((Robot)
                participantType).getModelVersion() >= 5.0)
                || (participantType.getClass().equals(Human.class)
                && ((Human) participantType).isAthlete())) {
            System.out.println(name + " successfully jumped over the wall!");
            isSuccessful = true;
        } else {
            System.out.println("Oops! It's seems that the obstacle is too hard for " + name);
            isSuccessful = false;
        }
        return isSuccessful;
    }
}
