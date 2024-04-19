public class ReturnMethod {
    public static void main(String[] args) {
        var result = sum(1, 2);
        System.out.println(result);

        result = sum(2, 3);
        System.out.println(result);

        System.out.println();

        result = hitung("+", 3, 4);
        System.out.println(result);
        result = hitung("-", 3, 4);
        System.out.println(result);
        result = hitung("*", 3, 4);
        System.out.println(result);
        result = hitung("/", 3, 4);
        System.out.println(result);
    }

    static int sum(int val1, int val2) {
        return val1 + val2;
    }

    static int hitung(String operasi, int val1, int val2) {
        switch (operasi) {
            case "+":
                return val1 + val2;
            case "-":
                return val1 - val2;
            case "*":
                return val1 * val2;
            case "/":
                return val1 / val2;
            default:
                return 0;
        }
    }
}
