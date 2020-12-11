package methodpass.troopers;

public class Trooper {

    private String name;
    private Position position;

    public Trooper(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Entering an empty name is not allowed!");
        }
        this.name = name;
        this.position = new Position(0,0);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position target) {
        this.position = target;
    }

    public double distanceFrom(Position target) {
        return this.position.distanceFrom(target);
    }

}
