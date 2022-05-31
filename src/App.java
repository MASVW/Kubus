import java.util.Scanner;
import model.Kubus;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Penghitung Luas Kubus by Samuel Zakaria H");
        System.out.println("==============================================");
        Scanner keyboard = new Scanner (System.in);

        Kubus kubus1 = new Kubus();
        System.out.print ("Masukkan Angka = ");
        kubus1.s = keyboard.nextInt();
        kubus1.luasKubus();
    }
}
