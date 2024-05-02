import java.util.Scanner;
import java.util.ArrayList;

public class peminjaman implements buku {
    Scanner input = new Scanner(System.in);

    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<String> kategori = new ArrayList<String>();
    private ArrayList<Integer> nomor = new ArrayList<Integer>();
    private ArrayList<String> isbn = new ArrayList<String>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();

    public peminjaman() {
        this.nomor.add(1);
        this.namaBuku.add("Keajaiban Toko Kelontong Namiya");
        this.kategori.add("Novel Fantasy");
        this.isbn.add("9786020648293");
        this.stok.add(3);

        this.nomor.add(2);
        this.namaBuku.add("Komet");
        this.kategori.add("Novel Sci-Fi");
        this.isbn.add("9786239987817");
        this.stok.add(5);

        this.nomor.add(3);
        this.namaBuku.add("Jujutsu Kaisen 11");
        this.kategori.add("Manga Action");
        this.isbn.add("9786230049651");
        this.stok.add(7);

        this.banyak.add(0);
        this.banyak.add(0);
        this.banyak.add(0);
    }

    @Override
    public void dataBuku() {
        System.out.println("=== BOOK DATA ==");
        System.out.println("");
        for (int i = 0; i < namaBuku.size(); i++) {
            System.out.println("Book's Number: " + nomor.get(i));
            System.out.println("Title: " + namaBuku.get(i));
            System.out.println("Category: " + kategori.get(i));
            System.out.println("ISBN: " + isbn.get(i));
            System.out.println("Stock: " + stok.get(i));
            System.out.println("");
        }
    }

    @Override
    public void pinjamBuku() {
        dataBuku();
        System.out.println("=== BOOK LENDING ===");
        System.out.println("");
        System.out.println("Input book's number that you want to borrow: ");
        int id = input.nextInt();
        System.out.println("How much book you want to borrow: ");
        int Banyak = input.nextInt();
        System.out.println("Book that you borrowed: " + namaBuku.get(id));
        System.out.println("Book's category: " + kategori.get(id));
        System.out.println("Book's stock now: " + stok.get(id));
        System.out.println("Are you sure to borrow this book? (Yes/No)");

        String jawab = input.next();
        if (jawab.equalsIgnoreCase("Yes") && Banyak <= stok.get(id)) {
            System.out.println("Book has successfully been borrowed with amount of " + banyak + " books and students are prohibited to borrow another book until these books are returned.");
            System.out.println("Book's stock update: " + (stok.get(id) - Banyak));
            stok.set(id, stok.get(id) - Banyak);
            banyak.set(id, Banyak);
        }
        
        else if (jawab.equalsIgnoreCase("No")) {
            System.out.println("Transaction cancelled.");
        }
        
        else if (Banyak > stok.get(id)) {
            System.out.println("Low stocks. Books cannot be borrowed.");
        }
    }

    @Override
    public void kembalikanBuku() {
        System.out.println("");
        System.out.println("Input book's number you want to return: ");
        int id = input.nextInt();
        System.out.println("How much book you want to return: ");
        int Banyak = input.nextInt();
        System.out.println("Book that you returned: " + namaBuku.get(id));
        System.out.println("Book's category: " + kategori.get(id));
        System.out.println("Book's stock now: " + stok.get(id));
        System.out.println("Are you sure to return this book? (Yes/No)");
        String jawab = input.next();

        if (jawab.equalsIgnoreCase("Yes")) {
            System.out.println("Books has successed to be returned: " + Banyak + " books");
            System.out.println("Book's stock after returned: " + (stok.get(id) + Banyak));
            stok.set(id, stok.get(id) + Banyak);
            banyak.set(id, 0);
        }
    }

    @Override
    public void daftarBuku() {
        System.out.println("=== BOOKS IN THE LIBRARY ==");
        System.out.println("");
        for (int i = 0; i < namaBuku.size(); i++) {
            System.out.println("Book's Number: " + nomor.get(i));
            System.out.println("Title: " + namaBuku.get(i));
            System.out.println("Category: " + kategori.get(i));
            System.out.println("ISBN: " + isbn.get(i));
            System.out.println("Stock: " + stok.get(i));
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        peminjaman perpustakaan = new peminjaman();
        int pilihan = 0;

        do {
            System.out.println("=== LIBRARY MENU ===");
            System.out.println("1. Show Books");
            System.out.println("2. Book Lending");
            System.out.println("3. Return Book");
            System.out.println("4. Log Out");

            System.out.println("Masukkan pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    perpustakaan.daftarBuku();
                    break;
                case 2:
                    perpustakaan.pinjamBuku();
                    break;
                case 3:
                    perpustakaan.kembalikanBuku();
                    break;
                case 4:
                    System.out.println("Thank you for using our library's facility.");
                    break;
                default:
                    System.out.println("Choice unvalid.");
            }
        } while (pilihan != 4);
    }
}