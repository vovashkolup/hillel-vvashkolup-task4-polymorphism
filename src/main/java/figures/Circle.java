package figures;

public class Circle extends Figures implements Areable {
    private double radius;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("\nCan't calculate Circle area with negative numbers or zero!");
        }
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.PI*(Math.pow(radius,2.0))*100.0)/100.0;
    }
}
