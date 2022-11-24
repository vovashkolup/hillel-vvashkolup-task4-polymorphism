package figures;


public class Figures {

    public static double sum(Areable[] figures) {
        double result = 0;
        for (int i = 0; i < figures.length; i++) {
            result += figures[i].calculateArea();
        }
        return Math.round(result*100.0)/100.0;
    }
}
