package ioreadwritebytes.temperatures;

public class Temperatures {

    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public double getYearAverage() {
        double temperaturesSum = 0;
        for (byte temperature: data) {
            temperaturesSum += new Double(temperature);
        }
        return temperaturesSum / data.length;
    }

    public double getMonthAverage() {
        double temperaturesSum = 0;
        for (int i =0; i <30; i++) {
            temperaturesSum += data[i];
        }
        return temperaturesSum / 30;
    }

}
