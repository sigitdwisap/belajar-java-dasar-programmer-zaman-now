public class BreakContinueLoop {
    public static void main(String[] args) {
        var counter = 1;
        while (true) {
            System.out.println("Perulangan " + counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }

        System.out.println("Perulangan berhenti");
        System.out.println();

        for (counter = 1; counter <= 100; counter++) {
            if (counter % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan ganjil " + counter);
        }
    }
}
