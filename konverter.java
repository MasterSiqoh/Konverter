import java.util.Scanner;

public class konverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = 0;
        int pil = 0;
        int pilihan = 0;
        do {
            System.out.print("pilih jenis, 1.desimal 2.biner 3.octal 4.hexadesimal 5.exit : ");
            String hasil = "";
            pil = input.nextInt();
            if (pil == 1) {
                System.out.print("pilih opsi konversi 1.biner 2.octal 3.hexadesimal : ");
                pilihan = input.nextInt();
                if (pilihan == 1) {
                    System.out.println("masukkan angka : ");
                    angka = input.nextInt();
                    hasil = Integer.toBinaryString(angka);
                    System.out.println("Bilangan binernya adalah : " + hasil);
                }
                if (pilihan == 2) {
                    System.out.println("masukkan angka : ");
                    angka = input.nextInt();
                    hasil = Integer.toOctalString(angka);
                    System.out.println("Bilangan octalnya adalah : " + hasil);
                }
                if (pilihan == 3) {
                    System.out.println("masukkan angka : ");
                    angka = input.nextInt();
                    hasil = Integer.toHexString(angka);
                    System.out.println("Bilangan hexanya adalah : " + hasil);
                }
            }
            if (pil == 2) {
                System.out.print("pilih opsi konversi 1.desimal 2.octal 3.hexadesimal : ");
                pilihan = input.nextInt();
                if (pilihan == 1) {
                    System.out.println("masukkan angka : ");
                    int biner = Integer.parseInt(input.next(), 2);
                    System.out.println("Bilangan desimalnya adalah : " + biner);
                }
                if (pilihan == 2) {
                    System.out.println("masukkan angka : ");
                    int biner = Integer.parseInt(input.next(), 2);
                    hasil = Integer.toOctalString(biner);
                    System.out.println("Bilangan octalnya adalah : " + hasil);
                }
                if (pilihan == 3) {
                    System.out.println("masukkan angka : ");
                    int biner = Integer.parseInt(input.next(), 2);
                    hasil = Integer.toHexString(biner);
                    System.out.println("Bilangan hexanya adalah : " + hasil);
                }
            }
            if (pil == 3) {
                System.out.print("pilih opsi konversi 1.desimal 2.biner 3.hexadesimal : ");
                pilihan = input.nextInt();
                if (pilihan == 1) {
                    System.out.println("masukkan angka : ");
                    int biner = Integer.parseInt(input.next(), 8);
                    System.out.println("Bilangan desimalnya adalah : " + biner);
                }
                if (pilihan == 2) {
                    System.out.println("masukkan angka : ");
                    int biner = Integer.parseInt(input.next(), 8);
                    hasil = Integer.toBinaryString(biner);
                    System.out.println("Bilangan binernya adalah : " + hasil);
                }
                if (pilihan == 3) {
                    System.out.println("masukkan angka : ");
                    int biner = Integer.parseInt(input.next(), 8);
                    hasil = Integer.toHexString(biner);
                    System.out.println("Bilangan hexanya adalah : " + hasil);
                }
            }
            if (pil == 4) {
                System.out.print("pilih opsi konversi 1.desimal 2.biner 3.octal : ");
                pilihan = input.nextInt();
                if (pilihan == 1) {
                    System.out.println("masukkan angka : ");
                    int biner = Integer.parseInt(input.next(), 16);
                    System.out.println("Bilangan desimalnya adalah : " + biner);
                }
                if (pilihan == 2) {
                    System.out.println("masukkan angka : ");
                    int biner = Integer.parseInt(input.next(), 16);
                    hasil = Integer.toBinaryString(biner);
                    System.out.println("Bilangan binernya adalah : " + hasil);
                }
                if (pilihan == 3) {
                    System.out.println("masukkan angka : ");
                    int biner = Integer.parseInt(input.next(), 16);
                    hasil = Integer.toOctalString(biner);
                    System.out.println("Bilangan octalnya adalah : " + hasil);
                }
            }

        } while (pil != 5);
    }
}
