import java.util.*;

class welcomepage {
    pegawai pg = new pegawai();

    public void hello() {
        System.out.println("=== Welcome to Our Library ===");
        System.out.println("");
        System.out.print("Our staff now: ");

        pegawai.Staff();
    }
}

public class perpustakaan {
    private static int pilihan;

    public static void main(String[] args) {

        welcome Welcome = new welcome();
        siswa Siswa = new siswa();
        peminjaman Peminjaman = new peminjaman();
        pegawai Pegawai = new pegawai();

        Welcome.setWelcome("HOME");
        Scanner input = new Scanner(System.in);
        int menuPilihan;
        
        do {
            System.out.println("");
            System.out.println("=== LIBRARY MENU ===");
            System.out.println("1. Show Books");
            System.out.println("2. Book Lending");
            System.out.println("3. Return Book");
            System.out.println("4. Log Out");
            System.out.println();

            System.out.println("=== INPUT YOUR CHOICE ===");
            menuPilihan = input.nextInt();

            switch (menuPilihan) {
                case 1:
                    Siswa.getSiswa();
                    System.out.println("");
                    Peminjaman.dataBuku();
                    break;
                case 2:
                    Siswa.getSiswa();
                    System.out.println("");
                    Peminjaman.pinjamBuku();
                    break;
                case 3:
                    Siswa.getSiswa();
                    System.out.println("");
                    Peminjaman.daftarBuku();
                    Peminjaman.kembalikanBuku();
                    break;

                case 4:
                    System.out.println("Thank you for using our library's facility.");
                    break;

                default:
                    System.out.println("Choice unvalid.");
                    break;
            }
        } while (menuPilihan != 4);
    }
}