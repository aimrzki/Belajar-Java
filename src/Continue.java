public class Continue {
    public static void main(String[] args) {
        for( var i =1;i<=100;i++){
            if (i%2==0){
                continue;
            }
            System.out.println("Nilai Ganjil : "+i);
        }
    }
}