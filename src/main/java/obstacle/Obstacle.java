package obstacle;

import participant.Participant;

public class Obstacle {
    private String name;
    private boolean isSuccessful=false;

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }

    public Obstacle(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean overcome(String name, Participant participantType){
       return true;
    }

}
