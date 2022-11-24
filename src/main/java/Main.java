import figures.*;
import obstacle.Obstacle;
import obstacle.Treadmill;
import obstacle.Wall;
import participant.Cat;
import participant.Human;
import participant.Participant;
import participant.Robot;


public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 5);
        Circle circle = new Circle(5);
        Square square = new Square(3);

        Areable[] figures = new Areable[]{triangle, circle, square};
        System.out.println("\nArea for triangle is: "+ triangle.calculateArea()+"\n"+
                "Area for circle is: "+ circle.calculateArea()+"\n"+
                "Area for square is: "+ square.calculateArea()+"\n"
                +"Sum of all figures is: "+Figures.sum(figures) + "\n");

        Participant cat = new Cat("Ice", 4, "Mein Kun");
        Participant human = new Human("Volodymyr", 2, true);
        Participant robot = new Robot("G-101", 2, 4.99);

        Participant[] participants = new Participant[]{cat, human, robot};

        Obstacle shortWall = new Wall("wall", "brick", 1);
        Obstacle treadmill = new Treadmill("treadmill", 4, 50);
        Obstacle highWall = new Wall("wall", "brick", 5);

        Obstacle[] obstacles = new Obstacle[]{shortWall, treadmill, highWall};

        for (int i = 0; i < participants.length; i++) {
            int counter = 0;
            for (int j = 0; j < obstacles.length; j++) {
                System.out.print(++counter + ") ");
                if (obstacles[j].overcome(participants[i].getName(), participants[i])) {
                    if (counter == 3) {
                        System.out.println("\nCONGRATULATIONS!\nParticipant " + participants[i].getName()
                                + " completed all " + counter + " challenges!\n");
                    }
                } else {
                    System.out.println("\nParticipant " + participants[i].getName() + " is out of competition with "
                            + (counter - 1) + " completed challenges!\n");
                    break;
                }
            }

        }
    }
}
