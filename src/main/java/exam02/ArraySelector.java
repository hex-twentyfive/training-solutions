package exam02;

public class ArraySelector {

    public String selectEvens(int[] numbers) {

        if (numbers.length == 0) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            if (i % 2 == 0 ) {
                stringBuilder.append(", " + numbers[i]);
            }
        }

        stringBuilder.append("]");
        return stringBuilder.toString();
    }

}
