# Sistem Pengelolaan Data Narapidana        

## 📌 Identitas
- **Nama** : Rivalio Chendra
- **NIM**  : 2509116039
- **Praktikum** : Pemrograman Berorientasi Objek
- **Kelas** : A

---
 
## 📖 Deskripsi Program
 
Sistem Pengelolaan Data Narapidana merupakan program yang digunakan untuk mengelola data narapidana dalam sebuah lembaga pemasyarakatan. Program ini memungkinkan admin untuk menyimpan, menampilkan, mengubah, dan menghapus data narapidana melalui menu yang tersedia.

### Data yang Dikelola

| Data | Keterangan |
|---|---|
| ID Narapidana | Identitas unik setiap narapidana |
| Nama | Nama narapidana |
| Kasus | Kasus atau tindak pidana yang dilakukan |
| Masa Tahanan | Lama masa tahanan dalam bulan |
| Nomor Sel | Nomor sel tempat narapidana ditempatkan |
| Blok Sel | Blok tempat sel narapidana berada |

Program memiliki beberapa kategori narapidana. Setiap kategori memiliki informasi tambahan yang berbeda sesuai dengan jenis kasusnya.

### Kategori Narapidana

| Kategori | Informasi Tambahan |
|---|---|
| Narkotika | Jenis rehabilitasi |
| Terorisme | Tingkat risiko |
| Korupsi | Uang pengganti |
| Pembunuhan | Kategori pembunuhan |
| Pencurian | Nilai kerugian |

### Fitur Program

| Menu | Fungsi |
|---|---|
| Tampilkan Narapidana | Menampilkan seluruh data narapidana yang tersimpan |
| Tambah Narapidana | Menambahkan data narapidana baru sesuai kategori |
| Update Nomor Sel | Mengubah nomor sel berdasarkan ID narapidana |
| Hapus Narapidana | Menghapus data narapidana berdasarkan ID |
| Keluar | Mengakhiri program |

---  


## 🗂️ Struktur Project   
Program menggunakan struktur MVC (Model-View-Controller) untuk memisahkan bagian data, tampilan, dan pengelolaan proses program.Berikut adalah struktur package program:    

```
Lapas [main]
└── Source Packages
    │
    ├── com.mycompany.lapas
    │   └── Main.java
    │
    ├── controller
    │   └── AdminLapas.java
    │
    ├── model
    │   ├── Narapidana.java
    │   ├── NarapidanaKorupsi.java
    │   ├── NarapidanaNarkotika.java
    │   ├── NarapidanaPembunuhan.java
    │   ├── NarapidanaPencurian.java
    │   └── NarapidanaTerorisme.java
    │
    └── view
        └── NarapidanaView.java
```
