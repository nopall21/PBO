package aplikasidatamahasiswa;

import java.util.ArrayList;
import java.util.Scanner;

public class AplikasiDataMahasiswa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Menu mn = new Menu();
        int pilihan;
        String nama, nim;
        float ipk;
        
        ArrayList<Mhs> listMhs = new ArrayList<>();
        
        do {            
            
            mn.Menu();
            System.out.print("Pilihan Anda [1-6]: ");
            pilihan = sc.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("\nTambah Data");
                    System.out.print("Nim : ");
                    sc.nextLine();
                    nim = sc.nextLine();
                    System.out.print("Nama : ");
                    nama = sc.nextLine();
                    System.out.print("Ipk : ");
                    ipk = sc.nextFloat();
                    Mhs m = new Mhs(nim, nama, ipk);
                    listMhs.add(m);
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("\nPrint Daftar Mhs");
                    for (int i = 0; i < listMhs.size(); i++) {
                        listMhs.get(i).printInfo();
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("\nCari Data (NIM)");
                    System.out.print("nim: ");
                    sc.nextLine();
                    nim = sc.nextLine();
                    for (int i = 0; i < listMhs.size(); i++) {
                        if(listMhs.get(i).nim.equals(nim)){
                            System.out.println("Mahasiswa dengan nim " + nim + " ada di list\n");
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nHapus Data (NIM)");
                    System.out.print("nim: ");
                    sc.nextLine();
                    nim = sc.nextLine();
                    for (int i = 0; i < listMhs.size(); i++) {
                        if(listMhs.get(i).nim.equals(nim)){
                            listMhs.remove(i);
                            System.out.println("Mahasiswa dengan nim " + nim + " terhapus dari list\n");
                        }
                    }
                    break;
                case 5:
                    System.out.println("\nHapus Data Semua");
                    listMhs.clear();
                    System.out.println("List Clear\n");
                    break;
                default:
                    System.out.println("keluar dari aplikasi");
            }
            
        } while (pilihan != 6);
        System.out.println("Program selesai...");
        
    }
    
}
