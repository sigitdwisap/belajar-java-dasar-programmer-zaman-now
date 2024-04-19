public class OperasiBoolean {
    public static void main(String[] args) {
        boolean benar = true;
        boolean salah = false;

        System.out.println(benar && benar);
        System.out.println(benar || benar);
        System.out.println(salah && salah);
        System.out.println(salah || salah);
        System.out.println(benar && salah);
        System.out.println(benar || salah);
        System.out.println(!benar);
        System.out.println(!salah);

        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.print("Lulus: ");
        System.out.println(lulus);
    }
}
