import java.util.Scanner;

/**
 * Kelas BookStoreRefactored menyimulasikan program penjualan buku sederhana.
 * Program ini memungkinkan pengguna untuk memasukkan detail buku, termasuk judul dan harga,
 * kemudian menampilkan semua buku yang dibeli beserta total harga.
 */
public class BookStoreRefactored {

    /**
     * Meminta input dari pengguna mengenai judul dan harga buku.
     *
     * @param input Scanner yang digunakan untuk mengambil input dari pengguna.
     * @return Array String yang berisi judul buku dan harga buku dalam bentuk string.
     */
    public static String[] getBookInput(Scanner input) {
        System.out.print("Masukkan judul buku: ");
        String title = input.nextLine();
        System.out.print("Masukkan harga buku: ");
        double price = input.nextDouble();
        input.nextLine(); // Membuang newline agar tidak mengganggu input berikutnya
        return new String[]{title, String.valueOf(price)};
    }

    /**
     * Menampilkan daftar buku yang dibeli beserta harga masing-masing dan total harga.
     *
     * @param books Array dua dimensi yang menyimpan data buku berupa judul dan harga.
     */
    public static void displayBooks(String[][] books) {
        System.out.println("Buku yang dibeli:");
        double totalPrice = 0;
        for (int i = 0; i < books.length; i++) {
            String title = books[i][0];
            double price = Double.parseDouble(books[i][1]);
            System.out.println((i + 1) + ". " + title + " - Rp" + price);
            totalPrice += price;
        }
        System.out.println("Total harga: Rp" + totalPrice);
    }

    /**
     * Metode utama yang memulai program penjualan buku.
     * Menginisialisasi array buku dan memproses input pengguna.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Toko Buku!");

        String[][] books = new String[2][2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Input buku ke-" + (i + 1) + ":");
            books[i] = getBookInput(input);
        }

        displayBooks(books);
    }
}
