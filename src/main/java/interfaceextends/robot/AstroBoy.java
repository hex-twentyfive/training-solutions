package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();

    public final static long ALTITUDE = 5;

    public AstroBoy(Point position) {
        this.position = position;
    }

    public void walkTo(Point position) {
        this.position = position;
        path.add(position);
    }

    public void flyTo(Point position) {
        this.position = position;
        path.add(position);
    }

    @Override
    public void liftTo(long altitude) {
        Point liftedPosition = new Point(this.position.getX(), this.position.getY(), altitude);
        this.position = liftedPosition;
        path.add(liftedPosition);
    }

    @Override
    public void moveTo(Point position) {
        walkTo(position);
    }

    @Override
    public void fastMoveTo(Point position) {
        Point fastMoveToPosition = new Point(position.getX(), position.getY(), this.ALTITUDE);
        liftTo(this.ALTITUDE);
        moveTo(fastMoveToPosition);
        liftTo(0);
    }

    @Override
    public void rotate(int angle) {
        this.angle = angle;
    }

    @Override
    public List<Point> getPath() {
        return this.path;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public long getAltitude() {
        return this.position.getZ();
    }

}
