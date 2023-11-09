import java.util.Scanner;

public class NestedLoop_2341760051{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temps [][] = new double [5][7];
        for (int i =0; i<temps.length; i++){
            System.out.println("Kota ke -" + i);
            for (int j = 0; j< temps[0].length; j++){
                System.out.print("Hari ke-" + (j+1)+ ":");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        for ( int i = 0; i< temps.length; i++){
            System.out.print("Kota ke-" + (i + 1) + ":");
            double sum = 0.0; // Inisialisasi total suhu untuk kota tertentu
            for (double temp : temps[i]) {
                System.out.print(temp + " ");
                sum += temp; // Menambahkan suhu ke total
            }
            double average = sum / temps[i].length; // Menghitung rata-rata
            System.out.println("Rata-rata: " + average);
       
        }
    }
}