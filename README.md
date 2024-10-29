# BookStoreRefactored

Program ini adalah aplikasi konsol sederhana yang memungkinkan pengguna untuk memasukkan data buku yang akan dibeli di sebuah toko buku. Program ini meminta pengguna untuk memasukkan judul dan harga buku, kemudian menampilkan daftar buku yang telah dimasukkan beserta total harga dari semua buku.

## Fitur

- Meminta input judul dan harga buku dari pengguna.
- Menampilkan daftar buku yang telah dimasukkan beserta harga setiap buku.
- Menghitung dan menampilkan total harga dari semua buku yang dibeli.

## Prasyarat

- Java Development Kit (JDK) versi 8 atau lebih baru harus sudah terpasang di sistem.

## Cara Menjalankan Proyek

1. **Kloning repositori ini** atau **salin file `BookStoreRefactored.java`** ke dalam folder proyek lokal Anda.
2. **Buka terminal** dan navigasikan ke folder tempat file `BookStoreRefactored.java` disimpan.
3. **Kompilasi program** dengan perintah:
    ```bash
    javac BookStoreRefactored.java
    ```
4. **Jalankan program** dengan perintah:
    ```bash
    java BookStoreRefactored
    ```

## Cara Menggunakan Program

1. Setelah menjalankan program, Anda akan diminta untuk memasukkan informasi buku yang ingin dibeli.
2. Untuk setiap buku, masukkan **judul** dan **harga** buku sesuai instruksi yang muncul di terminal.
3. Setelah semua buku dimasukkan, program akan menampilkan daftar buku beserta harga masing-masing dan total harga dari semua buku.

## Contoh Output

Selamat datang di Toko Buku! Input buku ke-1: Masukkan judul buku: Pemrograman Java Masukkan harga buku: 50000 Input buku ke-2: Masukkan judul buku: Struktur Data Masukkan harga buku: 60000 Buku yang dibeli:

    Pemrograman Java - Rp50000.0
    Struktur Data - Rp60000.0 Total harga: Rp110000.0

## Catatan Penting

- Saat ini, program ini terbatas pada masukan untuk dua buku. Jika ingin memperluas jumlah buku, Anda dapat mengubah ukuran array `books` pada baris yang sesuai di kode (`String[][] books = new String[2][2];`).
- Program ini menggunakan `Scanner` untuk mengambil input dari pengguna. Pastikan input yang dimasukkan sesuai format yang diminta.

## Lisensi

Proyek ini dapat digunakan dan dimodifikasi secara bebas.
