public class SwitchLambda {
    public static void main(String[] args) {
        var nilai = "D";

        switch (nilai){
            case "A" -> System.out.println("Anda lulus dengan sangat baik");
            case "B","C" -> System.out.println("Anda lulus");
            default -> {
                System.out.println("Anda salah jurusan");
            }
        }
    }
}
