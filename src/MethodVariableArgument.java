public class MethodVariableArgument {
    public static void main(String[] args) {
        sayCongrats("John Doe", 75, 70, 80, 81);
        sayCongrats("Doe John", 60, 70, 65, 75);
    }

    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var val : values) {
            total += val;
        }

        var finalVal = total / values.length;

        if (finalVal >= 75) {
            System.out.println("Selamat " + name + ", anda lulus");
        } else {
            System.out.println("Maaf " + name + ", anda tidak lulus");
        }
    }
}
