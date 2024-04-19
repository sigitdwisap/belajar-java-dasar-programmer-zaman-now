public class Switch {
    public static void main(String[] args) {
        var nilai = 'C';
        switch (nilai) {
            case 'A':
                System.out.println("Anda lulus dengan baik");
                break;
            case 'B':
                System.out.println("Anda lulus dengan cukup baik");
                break;
            case 'C':
                System.out.println("Anda lulus dengan cukup baik");
                break;
            case 'D':
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Anda sangat tidak lulus");
        }

        switch (nilai) {
            case 'A' -> System.out.println("Anda lulus dengan baik");
            case 'B', 'C' -> {
                System.out.println("Anda lulus dengan cukup baik");
                System.out.println("Tingkatkan nilai anda!");
            }
            case 'D' -> System.out.println("Anda tidak lulus");
            default -> System.out.println("Anda sangat tidak lulus");
        }

        String ucapan = switch (nilai) {
            case 'A':
                yield "Anda lulus dengan baik";
            case 'B', 'C':
                yield "Anda lulus dengan cukup baik";
            case 'D':
                yield "Anda tidak lulus";
            default:
                yield "Anda sangat tidak lulus";
        };
        System.out.println(ucapan);
    }
}
