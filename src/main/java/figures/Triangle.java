package figures;

public class Triangle extends Figures implements Areable{
    private double height;
    private double base;

    public Triangle(double height, double base) {
        if (height > 0 && base > 0) {
            this.height = height;
            this.base = base;
        } else {
            System.out.println("\nCan't calculate Triangle area with negative numbers or zero!");
        }
    }

    @Override
    public double calculateArea() {
        return Math.round(0.5*base*height*100.0)/100.0;
    }
}
