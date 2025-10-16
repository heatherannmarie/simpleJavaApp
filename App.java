public class App {

    public static int add(int input1, int input2) {
        int output = input1 + input2;
        System.out.println(output);
        return output;
    }

    public static int subtract(int input1, int input2) {
        int output = input1 - input2;
        System.out.println(output);
        return output;
    }

    public static int multiply(int input1, int input2) {
        int output = input1 * input2;
        System.out.println(output);
        return output;
    }

    public static int divide(int input1, int input2) {
        int output = input1 / input2;
        System.out.println(output);
        return output;
    }

    public static void main(String[] args) throws Exception {
        int input1 = 8;
        int input2 = 4;

        add(input1, input2);

        subtract(input1, input2);

        multiply(input1, input2);

        divide(input1, input2);
    }
}
