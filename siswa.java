import java.util.*;

public class siswa {
    static Scanner input = new Scanner(System.in);

    ArrayList<String>namaSiswa = new ArrayList<String>();
    ArrayList<String>alamatSiswa = new ArrayList<String>();
    ArrayList<String>teleponSiswa = new ArrayList<String>();
    ArrayList<Boolean>statusSiswa = new ArrayList<Boolean>();
    ArrayList<Integer>idSiswa = new ArrayList<Integer>();

    public siswa(){

        this.namaSiswa.add("Nayla");
        this.alamatSiswa.add("Jl. Gading No. 37");
        this.teleponSiswa.add("085156378705");
        this.idSiswa.add(1);
        this.statusSiswa.add(true);

        this.namaSiswa.add("Danish");
        this.alamatSiswa.add("Jl. Banyuwangi No. 10");
        this.teleponSiswa.add("081032981029");
        this.idSiswa.add(2);
        this.statusSiswa.add(true);

        this.namaSiswa.add("Mikaela");
        this.alamatSiswa.add("Jl. Bunga Gardenia No. 77");
        this.teleponSiswa.add("089182918397");
        this.idSiswa.add(3);
        this.statusSiswa.add(true);

        this.namaSiswa.add("Hirotaka");
        this.alamatSiswa.add("Jl. Soekarno Hatta No. 41");
        this.teleponSiswa.add("089091218278");
        this.idSiswa.add(4);
        this.statusSiswa.add(true);       
    }

    public void getSiswa() {
        System.out.print("Masukkan ID anda: ");
        int id = input.nextInt();
 
        boolean idFound = false;

        for (int i = 0; i < idSiswa.size(); i++) {
            if (id == idSiswa.get(i)) {
                System.out.println("Nama: " + namaSiswa.get(i));
                System.out.println("Alamat: " + alamatSiswa.get(i));
                System.out.println("No Telepon: " + teleponSiswa.get(i));

                idFound = true;
                break;
            }
        }

        if (!idFound) {
            System.out.println("ID tidak ditemukan");
        }
    }
}  
