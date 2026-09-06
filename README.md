# SISTEM SEWA HANDPHONE

## <b>1. Deskripsi Singkat Program</b>

Sistem Sewa Handphone merupakan program berbasis Java yang digunakan untuk mengelola data handphone, data pelanggan, dan data penyewaan handphone. Program ini dijalankan melalui console dan menggunakan <b>ArrayList</b> untuk menyimpan data selama program berjalan.

Program memiliki tiga menu utama, yaitu:

- <b>Handphone</b>, digunakan untuk mengelola data handphone.
- <b>Pelanggan</b>, digunakan untuk mengelola data pelanggan.
- <b>Sewa</b>, digunakan untuk mengelola data penyewaan handphone.

Setiap menu memiliki fitur <b>CRUD (Create, Read, Update, Delete)</b>, yaitu menambah, melihat, mengubah, dan menghapus data.

---

## <b>2. Penjelasan Alur Program</b>

Ketika program dijalankan, sistem akan menampilkan <b>Menu Utama</b> yang terdiri dari menu Handphone, Pelanggan, Sewa, dan Keluar.

Pengguna dapat memilih menu dengan memasukkan angka sesuai dengan pilihan yang tersedia.

### <b>A. Menu Handphone</b>

Menu Handphone digunakan untuk mengelola data handphone yang tersedia untuk disewa.

Terdapat beberapa pilihan:

1. <b>Tambah Handphone</b>  
   Pengguna memasukkan kode HP, merk, tipe, dan harga sewa. Data kemudian disimpan ke dalam ArrayList.

2. <b>Lihat Handphone</b>  
   Sistem menampilkan seluruh data handphone yang telah tersimpan.

3. <b>Ubah Handphone</b>  
   Pengguna memilih data handphone yang ingin diubah, kemudian memasukkan data baru berupa merk, tipe, dan harga sewa.

4. <b>Hapus Handphone</b>  
   Pengguna memilih data handphone yang ingin dihapus, kemudian sistem menghapus data tersebut.

5. <b>Kembali</b>  
   Pengguna kembali ke Menu Utama.

### <b>B. Menu Pelanggan</b>

Menu Pelanggan digunakan untuk mengelola data pelanggan yang melakukan penyewaan handphone.

Terdapat beberapa pilihan:

1. <b>Tambah Pelanggan</b>  
   Pengguna memasukkan ID pelanggan, nama, dan nomor HP. Data kemudian disimpan ke dalam ArrayList.

2. <b>Lihat Pelanggan</b>  
   Sistem menampilkan seluruh data pelanggan yang telah tersimpan.

3. <b>Ubah Pelanggan</b>  
   Pengguna memilih data pelanggan yang ingin diubah, kemudian memasukkan nama dan nomor HP yang baru.

4. <b>Hapus Pelanggan</b>  
   Pengguna memilih data pelanggan yang ingin dihapus, kemudian sistem menghapus data tersebut.

5. <b>Kembali</b>  
   Pengguna kembali ke Menu Utama.

### <b>C. Menu Sewa</b>

Menu Sewa digunakan untuk mengelola data transaksi penyewaan handphone.

Terdapat beberapa pilihan:

1. <b>Tambah Sewa</b>  
   Pengguna memasukkan ID sewa, ID pelanggan, kode HP, dan lama sewa. Data kemudian disimpan ke dalam ArrayList.

2. <b>Lihat Sewa</b>  
   Sistem menampilkan seluruh data penyewaan yang telah tersimpan.

3. <b>Ubah Sewa</b>  
   Pengguna memilih data sewa yang ingin diubah, kemudian memasukkan lama sewa yang baru.

4. <b>Hapus Sewa</b>  
   Pengguna memilih data sewa yang ingin dihapus, kemudian sistem menghapus data tersebut.

5. <b>Kembali</b>  
   Pengguna kembali ke Menu Utama.

### <b>D. Keluar Program</b>

Jika pengguna memilih menu <b>0. Keluar</b> pada Menu Utama, sistem akan menampilkan pesan <b>"Program selesai."</b> dan program akan berhenti.

---

## <b>3. Dokumentasi Program</b>

### <b>A. Menu Data Handphone</b>

Screenshot berikut menunjukkan tampilan menu Data Handphone yang menyediakan fitur untuk menambah, melihat, mengubah, dan menghapus data handphone.

![Menu Data Handphone](<img width="928" height="242" alt="menu-handphone png" src="https://github.com/user-attachments/assets/4e9d6154-e317-4779-8428-580d4faf5b18" />
)

### <b>B. Menu Data Pelanggan</b>

Screenshot berikut menunjukkan tampilan menu Data Pelanggan yang digunakan untuk mengelola data pelanggan dengan fitur tambah, lihat, ubah, dan hapus.

![Menu Data Pelanggan](<img width="921" height="240" alt="menu-pelanggan png" src="https://github.com/user-attachments/assets/be5eda01-2105-4063-b8eb-0dace2de0710" />
)

### <b>C. Menu Data Sewa</b>

Screenshot berikut menunjukkan tampilan menu Data Sewa yang digunakan untuk mengelola data transaksi penyewaan handphone dengan fitur tambah, lihat, ubah, dan hapus.

![Menu Data Sewa](<img width="940" height="236" alt="menu-sewa png" src="https://github.com/user-attachments/assets/71039ce1-b11b-470c-9b17-4a6d7ff95a50" />
)


## <b>3. Implementasi Program</b>

### <b>3.1 Implementasi Menu Handphone</b>

<p>
Menu Handphone digunakan untuk mengelola data handphone yang tersedia untuk disewa. 
Pada menu ini terdapat fitur <b>Tambah Handphone</b>, <b>Lihat Handphone</b>, 
<b>Ubah Handphone</b>, dan <b>Hapus Handphone</b>.
</p>

<p align="center">
  <<img width="921" height="828" alt="implementasi-handphone png" src="https://github.com/user-attachments/assets/d353b77c-9fa9-4c6d-8c9d-0cb8908f625e" />>
</p>

<p align="center">
  <b>Gambar 1. Implementasi Menu Handphone</b>
</p>


### <b>3.2 Implementasi Menu Pelanggan</b>

<p>
Menu Pelanggan digunakan untuk mengelola data pelanggan. 
Pengguna dapat menambahkan, melihat, mengubah, dan menghapus data pelanggan 
yang tersimpan dalam sistem.
</p>

<p align="center">
  <img src="menu-pelanggan.png" width="600">
</p>

<p align="center">
  <b>Gambar 2. Implementasi Menu Pelanggan</b>
</p>


### <b>3.3 Implementasi Menu Sewa</b>

<p>
Menu Sewa digunakan untuk mengelola data transaksi penyewaan handphone. 
Pada menu ini pengguna dapat menambahkan, melihat, mengubah, dan menghapus 
data penyewaan.
</p>

<p align="center">
  <img src="menu-sewa.png" width="600">
</p>

<p align="center">
  <b>Gambar 3. Implementasi Menu Sewa</b>
</p>
