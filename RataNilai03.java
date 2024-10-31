import java.util.Scanner;

public class RataNilai03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int i, j;
        float nilai, totalNilai, RataNilai;

        i=1;
        while(i<=5){
            totalNilai=0;
            System.out.println("Input nilai mahasiswa ke-"+i);
            for(j=1; j<=5; j++){
                System.out.print("Masukkan nilai ke-"+j+" = ");
                nilai=sc.nextFloat();
                totalNilai+=nilai;
            }
            RataNilai=totalNilai/5;
            System.out.println("Rata-rata nilai mahasiswa ke-"+i+" adalah "+RataNilai);
            i++;
        }
        
    }
}
