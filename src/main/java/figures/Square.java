package figures;

public class Square extends Figures implements Areable {

    private double side;

    public Square(double side) {
        if (side > 0) {
            this.side = side;
        } else {
            System.out.println("\nCan't calculate Square area with negative numbers or zero!");
        }
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.pow(side,2.0)*100.0)/100.0;
    }
}
