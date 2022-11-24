package obstacle;

import participant.Cat;
import participant.Human;
import participant.Participant;

public class Treadmill extends Obstacle {

    private int speed;
    private int distance;
    private boolean isSuccessful = false;

    public Treadmill(String name, int speed, int distance) {
        super(name);
        this.speed = speed;
        this.distance = distance;
    }


    public int getSpeed() {
        return speed;
    }


    public int getDistance() {
        return distance;
    }

    @Override
    public boolean overcome(String name, Participant participantType) {
        super.overcome(name, participantType);
        System.out.println(name + " is about to run treadmill for " +distance+ " metres for 10 minutes and " +
                speed + " speed!");
        if (!participantType.getClass().equals(Cat.class)) {
            System.out.println(name + " successfully ran treadmill!");
            isSuccessful = true;

        } else {
            System.out.println("Looks like it's a challenge for " + name + "!");
            isSuccessful = false;
        }
        return isSuccessful;
    }
}
