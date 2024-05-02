
import java.util.*;

public class pegawai {  
    public static void Staff() {

        ArrayList<String>namaPegawai = new ArrayList<String>();
        namaPegawai.add("Hiiragi Shinya");
        namaPegawai.add("Gojo Satoru");
        namaPegawai.add("Okkotsu Yuta");
        namaPegawai.add("Naoi Rei");

        ArrayList<String>alamatPegawai = new ArrayList<String>();
        alamatPegawai.add("Jl. Raya Tidar No. 10");
        alamatPegawai.add("Jl. Jakarta No. 1");
        alamatPegawai.add("Jl. Surabaya No. 36");
        alamatPegawai.add("Jl. Raya Dieng No. 18");

        ArrayList<String>teleponPegawai = new ArrayList<String>();
        teleponPegawai.add("081030172382");
        teleponPegawai.add("088902875367");
        teleponPegawai.add("086518290124");
        teleponPegawai.add("081629621035");
        
        System.out.println("Nama Pegawai: " + namaPegawai.get(0));
        System.out.println("Alamat: " + alamatPegawai.get(0));
        System.out.println("No Telepon: " + teleponPegawai.get(0));
    }
}