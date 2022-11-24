package participant;

public class Robot extends Participant{
    private double modelVersion;

    public Robot(String name, int legs, double modelVersion) {
        super(name, legs);
        this.modelVersion = modelVersion;
    }

    public double getModelVersion() {
        return modelVersion;
    }
}
