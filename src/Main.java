import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        while (true) {
            System.out.print("Masukkan nama ke-" + i + ": ");
            String nama = scanner.nextLine();

            if (nama.equalsIgnoreCase("Selesai")) {
                break;
            }

            try {
                if (nama.trim().isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                }
                mahasiswa.add(nama);
                i++;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nDaftar mahasiswa yang diinputkan:");
        for (String nama : mahasiswa) {
            System.out.println("- " + nama);
        }
    }
}
