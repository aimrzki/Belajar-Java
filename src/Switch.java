public class Switch {
    public static void main(String[] args) {
        var nilai = "D";

        switch (nilai){
            case "A":
                System.out.println("Anda lulus dengan nilai sangat baik");
                break;
            case "B":
                System.out.println("Anda lulus dengan nilai baik");
                break;
            case "C":
                System.out.println("Anda lulus dengan nilai Cukup");
                break;
            default:
                System.out.println("Anda belum lulus");
        }
    }
}
