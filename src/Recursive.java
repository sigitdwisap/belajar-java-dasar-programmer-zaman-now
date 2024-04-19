public class Recursive {
    public static void main(String[] args) {
        var result = factorialLoop(5);
        System.out.println(result);
        result = factorialRecursive(5);
        System.out.println(result);
    }

    static int factorialLoop(int value) {
        var result = 1;
        for (int counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }

    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }
}
