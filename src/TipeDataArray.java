public class TipeDataArray {
    public static void main(String[] args) {
       String[] siswa;
       siswa = new String[3];
       siswa[0] = "Gilang";
       siswa[1] = "Aimar";
       siswa[2] = "Rafi";

        System.out.println(siswa[0]);
        System.out.println(siswa[1]);
        System.out.println(siswa[2]);


        int[] nilai = {80,70,75,90,95};
        System.out.println(nilai[4]);

        System.out.println(nilai.length);

        String[][] members = {
                {"Budi","Joko","heru"},
                {"Ahok","Gunawan"},
                {"Kentir","Alif"},
        };

        String[] members1 = members[1];
        System.out.println(members1[0]);

        System.out.println(members[0][0]);
    }
}
