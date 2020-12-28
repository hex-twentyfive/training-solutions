package interfaceextends.robot;

public class Point {

    final private long X;
    final private long Y;
    final private long Z;

    public Point(long x, long y, long z) {
        this.X = x;
        this.Y = y;
        this.Z = z;
    }

    public long getX() {
        return X;
    }

    public long getY() {
        return Y;
    }

    public long getZ() {
        return Z;
    }

}
