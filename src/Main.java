import java.util.Scanner;
import java.util.ArrayList;

class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        if (nim.length() != 15) throw new IllegalArgumentException("NIM harus 15 digit!");
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public static void tampilUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");
    }

    public void tampilDataMahasiswa() {
        System.out.println("Nama: " + nama + ", NIM: " + nim + ", Jurusan: " + jurusan);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>(); // list untuk menyimpan data mahasiswa

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");

            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
                scanner.nextLine();
                System.out.print("Masukkan nama mahasiswa: ");
                String nama = scanner.nextLine();

                System.out.print("Masukkan NIM mahasiswa: ");
                String nim = scanner.next();

                if (nim.length() != 15) {
                    System.out.println("NIM harus 15 digit!!");
                    continue;
                }

                scanner.nextLine();
                System.out.print("Masukkan jurusan mahasiswa: ");
                String jurusan = scanner.nextLine();

                Mahasiswa mhs = new Mahasiswa(nama, nim, jurusan);
                daftarMahasiswa.add(mhs); // buatt tambahkan mahasiswa ke list

                Mahasiswa.tampilUniversitas();

            } else if (pilihan == 2) {

                // buat nampilin semua data mahasiswa yang ada di list
                if (daftarMahasiswa.isEmpty()) {
                    System.out.println("Belum ada data mahasiswa!");
                } else {
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        mhs.tampilDataMahasiswa();
                    }
                }

            } else if (pilihan == 3){
                break;
            }
        }
    }
}
