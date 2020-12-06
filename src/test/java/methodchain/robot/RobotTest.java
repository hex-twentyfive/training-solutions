package methodchain.robot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {

    @Test
    public void testGoAndRotate() {
        Robot robot = new Robot();

        robot.go(10).rotate(45).go(10).rotate(45).go(10).rotate(-45);

        assertEquals(30, robot.getDistance());
        assertEquals(45, robot.getAzimut());
    }

    @Test
    public void testRegisterNavigationPoint() {
        Robot robot = new Robot();

        robot.go(10).rotate(45).registerNavigationPoint()
                .go(10).rotate(45).registerNavigationPoint()
                .go(10).rotate(-45).registerNavigationPoint();

        System.out.println(robot.getMovementsList().toString());

        assertEquals("[Curent distance --> 10   Current azimut --> 45\n" +
                ", Curent distance --> 20   Current azimut --> 90\n" +
                ", Curent distance --> 30   Current azimut --> 45\n" +
                "]", robot.getMovementsList().toString());

    }

}
