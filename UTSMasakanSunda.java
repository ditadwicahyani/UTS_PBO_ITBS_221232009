/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_OOP;

/**
 *
 * @author DITA
 */
public class UTSMasakanSunda {    
    public static void main(String[] args) {
        mieKocokBandung mieKocok = new mieKocokBandung("1. 2250 gr mie jenis lebar\n" + "2. 200 gr taoge\n" + "3. 500 gr daging tetelan sapi\n", 
                "1. 1500 cc air\n" + "2. 1 liter air mendidih\n", 
                "1. 4 siung bawang putih, haluskan\n" + "2. 5 butir kemiri, haluskan\n" + "3. 2 sdm irisan kucai\n" + "4. 2 sdm bawang goreng\n" + "5. 2 sdt garam\n", 
                "Sambal cabai rawit\n", 
                "1. Kerupuk merah\n" + "2. Kecap manis dan cuka, secukupnya\n", 
                "1. Rebus tetelan daging yang sudah ditaburi garam hingga lunak. Ambil bagian dagingnya, potong dadu. Lalu, masukkan kembali ke dalam kaldu.\n" + 
                "2. Masukkan bawang putih dan kemiri, tumis sampai harum. Lalu, masukkan ke dalam kaldu daging.\n" + 
                "3. Siram mie lebar dengan air mendidih hingga lemas. Lalu, rendam mie dan taoge di dalam wadah dengan air mendidih sampai lemas, tiriskan.\n" +
                "4. Masukkan mie dan taoge ke dalam wadah saji. Taburkan dengan bawang goeng, irisan kucai, dan kerupuk merah.\n Lalu, siram mie dengan kaldu panas beserta potongan daging.\n" + 
                "5. Sajikan selagi panas. Tambahkan cabai rawit, kecap manis, dan cuka sesuai selera.\n");
        Lotek lotek = new Lotek("1. 2 ikat kangkung\n" + "2. 1/4 kol\n" + "3. 1 buah labu siam\n" + "4. 2 ikat kacang panjang\n" + "5. 1/4 buah nangka muda\n" + "6. 100 gr taoge\n" + "7. 1/4 kg kentang, rebus sampai matang\n" + "8. 100 gr kacang tanah, sangrai\n", 
                "1. 5 buah cabai merah\n" + "2. 1 ruas kencur\n" + "3. 1 sdm air asam jawa\n" + "4. 1/2 sdt garam\n" + "5. 2 sdm gula merah\n" + "6. 1/2 sdt terasi\n",
                "1. Cuci bersih semua sayuran, lalu potong agak kasar.\n" + 
                "2. Rebus semua sayuran hingga matang. Sajikan di atas piring bersama dengan kentang rebus.\n" + 
                "3. Campurkan semua bumbu halus dengan sedikit air matang. Lalu, siramkan ke atas sayuran. Lotek siap disajikan.\n");
        sateMaranggi sateMaranggi = new sateMaranggi("1. 500 gr daging sapi, dipotong\n" + "2. 250 gr lemak sapi, potong kecil\n" + "3. Tusuk sate\n", 
                "1. 2 sdm asam jawa\n" + "2. 5 siung bawang merah\n" + "3. 3 siung bawang putih\n" + "4. 1 cm jahe\n" + "5. 1 cm lengkuas\n" + "6. 1 sdt ketumbar,disangrai\n" + "7. 1 sdt garam\n" + "8. 20 gr gula jawa, iris halus\n", 
                "1. Kecap\n" + "2. irisan cabai dan tomat\n" + "3. Kacang\n", 
                "Oncom\n", 
                "1. Campurkan semua bumbu halus dengan daging, remas-remas dan diamkan selama 30 menit hingga bumbu meresap.\n" +
                "2. Tusuk daging yang sudah dimarinasi. Lalu, bakar sate di bara api, sesekali balik sate agar matangnya merata.\n" + 
                "3. Sate siap disajikan. Tambahkan irisan cabai dan tomat sesuai selera.\n");

        mieKocok.infoResep();
        System.out.println();
        lotek.infoResep();
        System.out.println();
        sateMaranggi.infoResep();
    }
}
