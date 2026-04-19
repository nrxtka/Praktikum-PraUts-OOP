# Proyek Praktikum Pemrograman Berorientasi Objek 

Repositori ini berisi kumpulan tugas dan latihan praktikum Java yang mencakup konsep-konsep dasar OOP (Object-Oriented Programming) seperti Class, Object, Encapsulation, Inheritance, dan Polymorphism.

## 📂 Struktur Folder

Proyek ini dibagi menjadi beberapa folder berdasarkan topik materi untuk memudahkan navigasi:

- **1. Class**: Dasar pembuatan kelas, atribut, constructor, dan instansiasi objek sederhana.
- **2. Object**: Penggunaan metode *setter* dan manipulasi data pada objek yang sudah ada.
- **3. Encapsulation**: Penerapan hak akses `private` dan penggunaan *getter/setter* untuk keamanan data.
- **4. Inheritance**: Implementasi pewarisan sifat dari kelas induk (*Parent*) ke kelas turunan (*Child*).
- **5. Polymorphism**: Praktik mengenai *method overriding* dan penggunaan tipe data yang dinamis.
- **6. StudyCase**: Implementasi mandiri berdasarkan studi kasus Mahasiswa (Tugas 1).

## 📝 Daftar File dan Deskripsi

### 1. Folder: Class
- `Motor.java`: Definisi class Motor dengan atribut warna dan merk.
- `MotorBeraksi.java`: Class utama untuk menjalankan dan menampilkan info objek Motor.

### 2. Folder: Object
- `Motor2.java`: Pengembangan class Motor dengan tambahan metode *setter* warna dan merk.
- `Motor2Beraksi.java`: Demonstrasi perubahan nilai atribut secara dinamis.

### 3. Folder: Encapsulation
- `Mahasiswa.java`: Implementasi enkapsulasi pada data mahasiswa (Nama & jumlah SKS).
- `Sks.java`: Class utama untuk mengelola dan memvalidasi data SKS mahasiswa.

### 4. Folder: Inheritance
- `Pewarisan.java`: Berisi struktur hierarki class `Orang` (Induk), `Mahasiswa` (Anak), dan `Dosen` (Anak).
- `Main.java`: Class untuk menjalankan simulasi pewarisan atribut dan metode.

### 5. Folder: Polymorphism
- `Hewan.java`: Berisi hierarki class Hewan, Herbivora, Karnivora, dan Kelinci dengan metode `suara()`.
- `HewanPolimor.java`: Demonstrasi polimorfisme saat memanggil metode yang sama dari berbagai tipe objek.

### 6. Folder: StudyCase (Tugas 1)
- `Mahasiswa.java`: Template class mahasiswa dengan atribut Nama, NIM, dan metode olahraga.
- `MahasiswaBeraksi.java`: Implementasi pembuatan 3 objek mahasiswa dengan data berbeda.

## 🚀 Cara Menjalankan
1. Pastikan Anda telah menginstal **JDK (Java Development Kit)**.
2. Buka terminal atau command prompt di direktori file.
3. Compile file Java:
   ```bash
   javac NamaFile.java
