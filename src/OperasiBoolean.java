import java.util.Date;

public class OperasiBoolean {
    public static void main(String[] args) {
        var absen = 75;
        var nilaiAkhir = 80;

        var lulusAbsen = absen>=75;
        var lulusNilai = nilaiAkhir>=75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);

        double aValue = 8933.234;

        aValue++;
        System.out.println(aValue);

        System.out.println("Hello World");
        Date date = new Date();
        System.out.println(date);
    }
}
