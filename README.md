# Repository Praktikum Mobile Programming

## Identitas Mahasiswa

- Nama: AZHIS FAUZAN PRASETIYO
- NIM: 2305101010
- Kelas: 7B
- Program Studi: TEKNIK INFORMATIKA
- Mata Kuliah: Mobile Programming
- Tahun Akademik: 2026/2027

## Deskripsi

Repository ini berisi source code, dokumentasi,
dan screenshot hasil praktikum Mobile Programming
selama satu semester.

## Daftar Praktikum

| Pertemuan | Topik | Source Code dan Screenshot |
|---|---|---|
| 01 | [Arsitektur Android](./pertemuan-01/) | [modul-1](https://github.com/AzhisFauzan/2305101010_AzhisFauzanP_7B/tree/main/modul-01) |
| 02 | [Layout Android](./pertemuan-02/) | [modul-2](https://github.com/AzhisFauzan/2305101010_AzhisFauzanP_7B/tree/main/modul-02) |
| 03 | [Gaya dan Tema Android](./pertemuan-03/) | [modul-3](https://github.com/AzhisFauzan/2305101010_AzhisFauzanP_7B/tree/main/modul-03) |
| 03 | [Activity Android](./pertemuan-04/) | [modul-4](https://github.com/AzhisFauzan/2305101010_AzhisFauzanP_7B/tree/main/modul-04) |
| 03 | [Intent Android](./pertemuan-05/) | [modul-5](https://github.com/AzhisFauzan/2305101010_AzhisFauzanP_7B/tree/main/modul-05) |

## Cara Menjalankan Aplikasi

Proyek ini dikembangkan menggunakan **Android Studio** dengan sistem build **Gradle 9.6.0 (Kotlin DSL)**, bahasa pemrograman **Java & Kotlin**, serta menargetkan **Android SDK 37**. 

Ikuti langkah-langkah berikut untuk menjalankan aplikasi di perangkat lokal Anda:

### 1. Prasyarat (Prerequisites)
Pastikan perangkat komputer Anda telah terinstal:
- **Android Studio** (versi terbaru).
- **Java Development Kit (JDK)** minimal versi 17.
- **Android SDK Platform 37** (dapat diunduh melalui *SDK Manager* di Android Studio).
- **Git**.

### 2. Clone Repositori
Buka terminal atau Git Bash, lalu jalankan perintah berikut untuk mengunduh proyek:
```bash
git clone [https://github.com/AzhisFauzan/2305101010_AzhisFauzanP_7B.git](https://github.com/AzhisFauzan/2305101010_AzhisFauzanP_7B.git)
cd praktikum-mobile-programming
```

### 3. Buka Proyek di Android Studio
Setiap modul merupakan proyek Android mandiri. Buka proyek sesuai modul yang ingin dijalankan:
1. Buka **Android Studio**, lalu pilih menu **File > Open**.
2. Arahkan ke salah satu folder proyek modul di dalam repositori:
   - `modul-01/prak_modul_1` *(Kotlin & Jetpack Compose - Min SDK 26)*
   - `modul-02/prak_modul_2` *(Kotlin/Java & XML Layout - Min SDK 28)*
   - `modul-03/prak_modul_3` *(Java & XML Views - Min SDK 28)*
   - `modul-04/prak_modul_4` *(Java & XML Views - Min SDK 28)*
   - `modul-05/prak_modul_5` *(Java & XML Views - Min SDK 28)*
3. Klik **OK** dan tunggu hingga proses **Gradle Sync** selesai mengunduh seluruh *dependencies* (pastikan terhubung ke internet).

### 4. Siapkan Perangkat (Emulator / Perangkat Fisik)
- **Menggunakan Emulator (AVD):**
  1. Buka **Tools > Device Manager** di Android Studio.
  2. Buat atau jalankan *Virtual Device* dengan minimal **Android 9.0 (API 28)**.
- **Menggunakan Perangkat Fisik (HP Android):**
  1. Aktifkan **Opsi Pengembang (Developer Options)** dan **USB Debugging** di pengaturan ponsel Anda.
  2. Hubungkan ponsel ke komputer menggunakan kabel USB, lalu izinkan akses *debugging*.

### 5. Build dan Jalankan Aplikasi
1. Pastikan modul **`app`** dan perangkat tujuan sudah terpilih pada *toolbar* bagian atas Android Studio.
2. Klik tombol **Run 'app'** (ikon segitiga hijau ▶️) atau tekan **`Shift + F10`** (Windows/Linux) / **`Ctrl + R`** (macOS).
3. Tunggu proses kompilasi selesai hingga aplikasi terbuka secara otomatis di perangkat Anda.

## Referensi
