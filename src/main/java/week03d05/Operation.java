package week03d05;

public class Operation {

    private int leftOperand;
    private int rightOperand;

    public Operation(String receivedAddition) {
        String[] split = receivedAddition.split("\\+");
        this.leftOperand = Integer.parseInt(split[0]);
        this.rightOperand = Integer.parseInt(split[1]);
    }

    public int getResult() {
        return leftOperand + rightOperand;
    }


    public static void main(String[] args) {

        String testAdditionString = "68+12";

        Operation operation = new Operation(testAdditionString);

        System.out.println(operation.getResult());

    }

}
