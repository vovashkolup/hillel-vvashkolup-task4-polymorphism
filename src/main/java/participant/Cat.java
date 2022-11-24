package participant;

public class Cat extends Participant{
    private String breed;


    public Cat(String name, int legs, String breed) {
        super(name, legs);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
