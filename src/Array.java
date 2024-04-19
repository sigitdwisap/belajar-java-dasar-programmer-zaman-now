public class Array {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Eko";
        arrayString[1] = "Kurniawan";
        arrayString[2] = "Khannedy";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "Budi";

        System.out.println(arrayString[0]);

        String[] arrayName = {"Eko", "Kurniawan", "Khannedy"};
        arrayName = new String[]{"a", "b", "c", "d"};
        String[] arrayNameNewString = new String[]{"Eko", "Kurniawan", "Khannedy"};
        int[] arrayInt = {1, 2, 3};
        int[] arrayIntNewInt = new int[]{1, 2, 3};

        System.out.println(arrayName.length);

        String[][] members = {
                {"a", "b"},
                {"c", "d"},
                {"e", "f"},
        };

        System.out.println(members[0][0]);
    }
}
