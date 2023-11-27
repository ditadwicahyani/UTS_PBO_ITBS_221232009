membuat project Masakan Khas Sunda menggunakan Pemrograman Berorientasi Objek (PBO). pada pembuatan ini menerapkan konser Class, Object, Property, Method, Overloading Constructor, dan Inheritance.

Struktur projek :
- UTSMasakanSunda.java : ini adalah main class untuk merunning project yang di dalam nya terdapat code untuk memasukan data kedalam class mieKocokBandung, Lotek, sateMaranggi dan memanggil fungsi infoResep() untuk menghasilkan output program.

- MasakanSunda.java : ini parent class untuk merepresentasikan resep masakan dengan atribut bahanUtama dan caraMembuat. fungsi getClass().getSimpleName() untuk mendapatkan nama child class yang memanggil class MasakanSunda.

- mieKocokBandung.java : ini child class yang terdapat atribut bahanKuah, bumbuHalus, bahanSambal, bahanPelengkap dan extends dari parent class (MasakanSunda) dan menggunakan kata kunci SUPER untuk mendapatkan atribut bahanUtama dan caraMembuat.

- Lotek.java : ini child class yang terdapat atribut bumbuHalus dan extends dari parent class (MasakanSunda) dan menggunakan kata kunci SUPER untuk mendapatkan atribut bahanUtama dan caraMembuat.

- sateMaranggi.java : ini child class yang terdapat atribut bumbuHalus, bahanSambal, bahanPelengkap dan extends dari parent class (MasakanSunda) dan menggunakan kata kunci SUPER untuk mendapatkan atribut bahanUtama dan caraMembuat.

![ss1](https://github.com/ditadwicahyani/UTS_PBO_ITBS_221232009/assets/33852935/05b4831c-3df2-4160-812e-369ccfeafbf1)

![ss2](https://github.com/ditadwicahyani/UTS_PBO_ITBS_221232009/assets/33852935/37083287-96e7-4798-83d5-f0064b0035d7)

![ss3](https://github.com/ditadwicahyani/UTS_PBO_ITBS_221232009/assets/33852935/8dee94c8-b5e7-4637-9a5d-3c664ed25ed8)
