import java.util.Scanner;

public class Janken {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pemain pertama pilih batu, gunting, kertas");
        String pemainPertama = input.next();
        System.out.println("Pemain kedua pilih batu, gunting, kertas");
        String pemainKedua = input.next();

        if (pemainPertama.equalsIgnoreCase("batu") && pemainKedua.equalsIgnoreCase("gunting")){
            System.out.println("Pemain pertama menang");
        } else if (pemainPertama.equalsIgnoreCase("gunting") && pemainKedua.equalsIgnoreCase("kertas")){
            System.out.println("Pemain pertama menang");
        } else if (pemainPertama.equalsIgnoreCase("kertas") && pemainKedua.equalsIgnoreCase("batu")) {
            System.out.println("Pemain pertama menang");
        }
    }
}
