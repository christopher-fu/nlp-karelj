import kareltherobot.*;
import static kareltherobot.Directions.*;

public class TestRobot {
    public static void main(String args[]) {
        UrRobot karel = new UrRobot(2, 2, East, 0);
        karel.turnLeft();
        karel.move();
        karel.move();
    }

    static {
        World.reset();
        World.readWorld("MyFirstRobot.kwld");
        World.setDelay(50);
        World.setVisible(true);
    }
}