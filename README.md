membuat project Masakan Khas Sunda menggunakan Pemrograman Berorientasi Objek (PBO). pada pembuatan ini menerapkan konser Class, Object, Property, Method, Overloading Constructor, dan Inheritance.

Struktur projek :
- UTSMasakanSunda.java : ini adalah main class untuk merunning project yang di dalam nya terdapat code untuk memasukan data kedalam class mieKocokBandung, Lotek, sateMaranggi dan memanggil fungsi infoResep() untuk menghasilkan output program.

- MasakanSunda.java : ini parent class untuk merepresentasikan resep masakan dengan atribut bahanUtama dan caraMembuat. fungsi getClass().getSimpleName() untuk mendapatkan nama child class yang memanggil class MasakanSunda.

- mieKocokBandung.java : ini child class yang terdapat atribut bahanKuah, bumbuHalus, bahanSambal, bahanPelengkap dan extends dari parent class (MasakanSunda) dan menggunakan kata kunci SUPER untuk mendapatkan atribut bahanUtama dan caraMembuat.

- Lotek.java : ini child class yang terdapat atribut bumbuHalus dan extends dari parent class (MasakanSunda) dan menggunakan kata kunci SUPER untuk mendapatkan atribut bahanUtama dan caraMembuat.

- sateMaranggi.java : ini child class yang terdapat atribut bumbuHalus, bahanSambal, bahanPelengkap dan extends dari parent class (MasakanSunda) dan menggunakan kata kunci SUPER untuk mendapatkan atribut bahanUtama dan caraMembuat.
