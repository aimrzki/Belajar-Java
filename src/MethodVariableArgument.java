public class MethodVariableArgument {
    public static void main(String[] args) {
        sayCongrats("Aimar Rizki",90,90,90,90,95);
    }

    static void sayCongrats (String name, int... values){
        int total = 0;
        for(var value : values){
            total += value;
        }

        int finalValues = total/values.length;

        if (finalValues>=75){
            System.out.println("Selamat " + name + " " + "Anda Lulus");
        }else {
            System.out.println("Maaf " + name + " " + "Anda Tidak Lulus");
        }
    }
}
