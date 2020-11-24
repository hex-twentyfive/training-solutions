package enumtype.unit;

public class UnitConverterMain {

    public static void main(String[] args) {

        UnitConverter converter = new UnitConverter();

        System.out.println((converter.convert(2500.0000,LengthUnit.YARD,LengthUnit.METER)));

        System.out.println(converter.siUnits());

    }
}
