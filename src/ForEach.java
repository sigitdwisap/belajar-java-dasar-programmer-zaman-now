public class ForEach {
    public static void main(String[] args) {
        String[] names = {"Eko", "Kurniawan", "Khannedy", "Pemgrogramman", "Zaman", "Now"};

        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println();

        for (var name : names) {
            System.out.println(name);
        }
    }
}
