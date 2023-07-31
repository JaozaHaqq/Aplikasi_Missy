package com.example.missy.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.missy.DataModel
import com.example.missy.Deskripsi
import com.example.missy.R
import com.example.misy.adapter_grid


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    val Datamahasiswa = listOf<DataModel>(
        DataModel(
            image = R.drawable. artikel1,
            from = "HealthArticle",
            gambar1 = "Haid",
            gambar2 = "Hormon",
            sumber = "From Alodocter, the free encyclopedia",
            title = "Perbedaan Telat Haid dengan Hamil",
            desc = "Terlambat menstruasi memang memiliki tanda yang hampir serupa dengan awal kehamilan. Namun, tidak semua terlambat menstruasi merupakan kehamilan, " +
                    "Berikut beberapa perbedaan telat haid dengan hamil yang penting untuk kamu ketahui:\n " +
                    "\n1. Pendarahan " +
                    "\nSaat terlambat menstruasi, maka wanita tidak akan mengalami perdarahan meskipun dalam jumlah yang sedikit. Sedangkan saat hamil, biasanya akan muncul flek-flek darah akibat adanya proses implantasi. Biasanya flek muncul dalam 1-2 minggu setelah proses pembuahan.\n " +
                    "\n2. Nafsu Makan " +
                    "\nSaat mengalami keterlambatan menstruasi, kondisi ini terjadi dengan peningkatan nafsu makan. Biasanya, wanita yang tengah hamil jarang mengalami peningkatan nafsu makan di awal kehamilan. Umumnya, justru mereka akan rentan mengalami mual dan penurunan nafsu makan. \n" +
                    "\n3. Kebiasaan Makan " +
                    "\nUmumnya, wanita yang sedang terlambat menstruasi tidak akan memiliki keinginan untuk mengonsumsi makanan tertentu. Namun, pada wanita hamil, di awal kehamilan sangat normal jika mereka menginginkan mengonsumsi makanan tertentu. \n" +
                    "\n4. Perubahan Payudara " +
                    "\nWanita hamil akan mengalami perubahan pada puting payudara. Areola akan menjadi lebih besar dan menjadi lebih hitam. \n" +
                    "\n5. Kram Perut " +
                    "\nUmumnya, keterlambatan menstruasi jarang menyebabkan kram perut. Namun, saat memasuki pramenstruasi, maka bisa merasakan kram perut dari 1-2 hari sebelum menstruasi. Kram perut yang terjadi juga terasa ringan hingga parah. Kondisi ini biasanya terjadi dalam waktu yang cukup lama hingga mengalami menstruasi. ",
        ),
        DataModel(
            R.drawable. artikel2,
            gambar1 = "Darah",
            gambar2 = "Perbedaan",
            title = "4 Perbedaan Darah Implantasi dan Darah Menstruasi",
            from = "HealthArticle",
            sumber = "From Wikipedia, the free encyclopedia",
            desc = "Darah implantasi dan darah haid sering kali mirip, sehingga banyak wanita yang sulit membedakannya. Namun, ada beberapa ciri yang membedakan keduanya, yaitu: \n" +
                    "\n1. Warna Darah " +
                    "\nDarah yang keluar saat pendarahan implantasi terlihat lebih cerah dibandingkan darah menstruasi. \n" +
                    "\n2. Jumlah Darah " +
                    "\nDarah yang keluar saat pendarahan implantasi biasanya hanya berupa bercak dan tidak berbentuk seperti gumpalan. Hal ini berbeda dengan darah menstruasi yang semakin lama justru keluar semakin deras dan berbentuk gumpalan. \n" +
                    "\n3. Kram " +
                    "\nTerkadang wanita yang mengalami perdarahan implantasi juga bisa merasakan kram di perut yang menyerupai kram saat menstruasi. \n" +
                    "\n4. Jeda Waktu " +
                    "\nBerbeda dengan darah menstruasi yang keluar terus-menerus selama sekitar 4–7 hari, pendarahan implantasi tidak muncul secara berkelanjutan.\n" +
                    "Contohnya, bercak darah muncul pada pagi hari, kemudian berhenti beberapa saat, dan bisa muncul lagi pada malam harinya. " +
                    "Pada umumnya, pendarahan implantasi juga hanya berlangsung selama 1–3 hari.",
        ),
        DataModel(
            R.drawable. artikel3,
            from = "HealthArticle",
            gambar1 = "Haid",
            gambar2 = "Hamil",
            sumber = "From Alodocter, the free encyclopedia",
            title = "Telat Haid Bukan Berarti Kamu Hamil!",
            desc =  "Telat haid bukan karena sebagai tanda kita hamil namun juga disebabkan oleh beberapa kondisi kesehatan. Misalnya perubahan berat badan stres, efek samping obat, hingga dimulainya masa perimenopause.\n " +
                    "\n1. Stress " +
                    "Dilansir dari Healthline, stres dapat menghambat keseimbangan kadar hormon pada tubuhmu, hingga mengubah rutinitas harian.  \n" +
                    "Bahkan, stres juga dapat memengaruhi bagian otak yang berfungsi untuk mengatur siklus haid, yaitu hipotalamus.  " +
                    "Di samping itu, stres juga dapat memicu berbagai penyakit, kenaikan atau penurunan berat badan secara tiba-tiba. " +
                    "Kedua kondisi tersebut juga dapat mengganggu siklus menstruasi seorang wanita sehingga menjadi tidak teratur. \n" +
                    "\n2. Kondisi Berat Badan" +
                    "Mengalami kelebihan berat badan (obesitas), dan kekurangan berat badan juga dapat menjadi penyebab telat haid. \n" +
                    "Seperti misalnya kondisi obesitas yang dapat memengaruhi regulasi estrogen dan progesteron atau bahkan menyebabkan masalah kesuburan. " +
                    "Sebab, indeks massa tubuh (BMI) yang sangat tinggi telah banyak dikaitkan dengan keterlambatan menstruasi. \n" +
                    "Sementara itu, tubuh yang terlalu kurus juga dapat mengganggu siklus menstruasi yang teratur. " +
                    "Pasalnya, ketika tubuh kekurangan lemak dan nutrisi lainnya, fungsi tubuh dalam memproduksi hormon yang berkaitan dengan menstruasi akan terhambat. \n" +
                    "\n3. Efek Samping Obat" +
                    "Beberapa jenis obat seperti antipsikotik, antidepresan, obat tiroid, antikonvulsan dan obat kemoterapi tertentu, juga dapat menjadi penyebab telat haid. \n" +
                    "Di samping itu, penggunaan pil kontrasepsi hormonal seperti Depo-Provera yang mengandung progesteron juga dapat memengaruhi siklus menstruasi. \n" +
                    "\n4. Indikasi  Gangguan Kesehatan " +
                    "Terlambatnya haid atau menstruasi bisa jadi disebabkan oleh indikasi akan adanya gangguan kesehatan yang serius. \n" +
                    "Sebab, beberapa penyakit kronis dapat memengaruhi siklus menstruasi. " +
                    "Contohnya seperti penyakit tiroid, sindrom ovarium polikistik (PCOS), tumor hipofisis (baik yang bersifat kanker maupun non kanker), kista ovarium, disfungsi hati, hingga diabetes. \n" +
                    "\n5. Memasuki Fase Perimenopause " +
                    "Fase perimenopause sendiri merupakan masa peralihan antara usia reproduktif ke usia non-reproduktif. \n" +
                    "Jika seorang wanita sudah memasuki masa perimenopause, persediaan sel telur pada tubuh akan semakin menipis. \n" +
                    "Akibatnya siklus haid akan terpengaruh sehingga menyebabkan haid terlambat atau tidak teratur. \n" +
                    "Kondisi tersebut akan berlangsung hingga pada akhirnya seorang wanita tidak lagi mengalami haid, sebagai tanda bahwa tubuhnya telah memasuki fase menopause.",
        ),
        DataModel(
            R.drawable. artikel4,
            from = "HealthArticle",
            gambar1 = "Haid",
            gambar2 = "Keram",
            sumber = "From detikhealth, the free encyclopedia",
            title = "Alasan Kamu Keram Tapi Gak Lagi Haid",
            desc =  "Keram atau nyeri haid merupakan hal yang umum dialami sebelum dan saat siklus bulanan menstruasi.\n" +
                    "Keram ini biasanya dirasakan diperut bagian bawah dan bagi beberapa orang hal ini sangat tidak nyaman dan mengganggu aktivitas.\n" +
                    "Rasa keram disebabkan saat prostaglandin atau hormon lipis menyebabkan kontraksi otot rahim untuk melepaskan telur yang belum dibuahi. \n" +
                    "Namun tak semua rasa keram diperut disebabkan oleh haid pada wanita. " +
                    "Ada beberapa alasan yang bisa jadi penyebabnya antara lain: \n" +
                    "\n1.Endometriosis " +
                    "Endometriosis merupakan kondisi medis dimana jaringan yang mirip dengan dinding rahim tumbuh di luar rahim. \n" +
                    "Pengidap endometriosis pada umumnya mengalami keram seperti saat sedang haid.\n" +
                    "\n2. Penyakit Inflamasi Pelvis" +
                    "Pelvic Inflammatory Disease (PID) atau penyakit inflamasi pelvis merupakan infeksi bakteri di organ reproduksi.\n" +
                    "Infeksi ini terjadi karena bakteri menular seksual yang biasa menyebar dari vagina ke rahim. \n" +
                    "\n3. Radang Usus " +
                    "Inflammatory Bowel Disease (IBS) atau radang usus yang terjadi karena adanya inflamasi kronis di saluran pencernaan. \n" +
                    "\n4. Kista Ovarium Pecah " +
                    "Kista Ovarium adalah kantung berisi cairan yang di dalam ovarium atau indung telur.\n" +
                    "Kebanyakan kista ini akan hilang dengan sendirinya, namun terkadang bisa menyebabkan masalah sewaktu-waktu dan memerlukan penanganan yang tepat. \n" +
                    "\n5. Intoleransi Laktosa " +
                    "Intoleransi Laktosa merupakan kondisi medis umum dimana tubuh menolak untuk mencerna laktosa, dimana laktosa adalah karbohidrat utama yang ditemukan dalam produk susu. \n" +
                    "Apabila mengidap seperti ini biasanya akan mengalami keram perut, muntah, diare, dan kembung.",
        ),
        DataModel(
            R.drawable. artikel5,
            from = "HealthArticle",
            gambar1 = "Menstruasi",
            gambar2 = "Tanda",
            sumber = "From Jurnal ITTP, the free encyclopedia",
            title = "Inilah Tanda Kamu Minggu Ini Mens!",
            desc =  "Selama siklus menstruasi, kadar hormon di dalam tubuh wanita akan mengalami perubahan. \n" +
                    "Hal ini dapat berpengaruh terhadap kondisi fisik dan emosi wanita selama beberapa hari sebelum menstruasi. \n" +
                    "Gejala ini dikenal dengan sebutan sindrom pramenstruasi atau premenstrual syndrome (PMS). \n" +
                    "Beberapa tanda dan gejala yang kerap muncul ketika memasuki masa pramenstruasi antara lain: \n" +
                    "\n- Sakit Kepala " +
                    "\n- Nyeri pada Payudara " +
                    "\n- Muncul Jerawat " +
                    "\n- Perut terasa kembung " +
                    "\n- Suasana hati yang mudah berubah (mood swing) " +
                    "\n- Mengalami perubahan terhadap gairah seks \n" +
                    "\nGejala Pramenstruasi ini bisa berlangsung selama 6 sampai 7 hari, yaitu selama 4 hari sebelum mentruasi dan 2 hingga 3 hari setelah menstruasi. ",
        ),
        DataModel(
            R.drawable. artikel6,
            from = "HealthArticle",
            gambar1 = "Rahim",
            gambar2 = "Wanita",
            sumber = "From Jurnal Pendidikan, the free encyclopedia",
            title = "Ciri-ciri Wanita Tanpa Rahim",
            desc =  "Syndrome MRKH adalah kepanjangan dari Sindrom Mayer Rokitansky Kuster Hauser. \n" +
                    "\nSindrom MRKH yaitu kelainan bawaan sejak lahir yang terjadi pada sistem reproduksi seorang wanita.\n" +
                    "\nKondisi ini menyebabkan vagina, leher rahim (serviks), dan rahim tidak berkembang sebagaimana mestinya pada seorang wanita. Bahkan ada yang tidak memiliki rahim sama sekali meskipun kondisi alat kelamin dari luar terlihat normal. \n" +
                    "\nMaka dari itu wanita yang mengalami sindrom MRKH ini biasanya tidak mengalami menstruasi karena tidak punya rahim.",
        ),
        DataModel(
            R.drawable. artikel7,
            from = "HealthArticle",
            gambar1 = "Perut Kembung",
            gambar2 = "Kista",
            sumber = "From Alodocter, the free encyclopedia",
            title = "Perut Kembung Tanda Gejala Kista",
            desc =  "Adanya kista dapat menyebabkan keluhan pada pencernaan, seperti perut kembung. \n" +
                    "\nSelain itu, perut juga bisa tampak agak bengkak dan terasa berat, jika kista terus membesar. ",
        ),
        DataModel(
            R.drawable. avocado,
            from = "HealthArticle",
            gambar1 = "Jus Alpukat",
            gambar2 = "Manfaat",
            sumber = "From Alodocter, the free encyclopedia",
            title = "Manfaat Minum Jus Alpukat Tiap Hari",
            desc =  "Kalori jus alpukat sebenarnya tergantung pada bahan apa saja yang jadi campuran. \n" +
                    "Meski jus alpukat adalah buah yang kaya akan nutrisi, ini bisa jadi minuman yang tidak sehat jika kamu mencampurnya dengan terlalu banyak gula, atau tambahan bahan lainnya. " +
                    "Berikut manfaat buah alpukat antara lain:\n " +
                    "\n- Melindungi Mata " +
                    "\nAlpukat mengandung lutein dan zeaxanthin, yang menyerap gelombang cahaya yang dapat merusak penglihatan. \n" +
                    "\n- Meningkatkan Mood " +
                    "\nOrang yang tidak mendapatkan cukup vitamin B ini bisa lebih rentan terhadap depresi, dan cenderung tidak merespons antidepresan dengan baik. \n" +
                    "\n- Membantu Menurunkan Berat Badan " +
                    "\nMeski kalori jus alpukat tidak tergolong kecil, tetatpi jus ini tetap bisa jadi menu diet. Sebab, alpukat kaya akan serat, yang akan membantu kamu merasa kenyang, sehingga kamu cenderung tidak makan berlebihan. \n" +
                    "\nSelain itu, meski alpukat tinggi lemak, itu adalah lemak tak jenuh tunggal yang sehat. \n" +
                    "\n- Memberi Energi Untuk Tubuh " +
                    "\nAlpukat juga mengandung berbagai jenis vitamin B, termasuk tiamin (B1), riboflavin (B2), dan niasin (B3). Ini membantu tubuh mengubah makanan yang kamu makan menjadi energi. \n" +
                    "\n- Baik Untuk Jantung " +
                    "\nUntuk kesehatan pembuluh darah, kamu perlu mengonsumsi lemak tak jenuh, seperti yang ada dalam alpukat. \n" +
                    "\nLemak sehat seperti dalam alpukat juga dapat membantu menurunkan kolesterol jahat, trigliserida, dan tekanan darah. \n",
        ),
        DataModel(
            R.drawable. artikel8,
            from = "HealthArticle",
            gambar1 = "Haid",
            gambar2 = "Hormon",
            title = "Kebiasaan yang Merusak Rahim",
            sumber = "From Alodocter, the free encyclopedia",
            desc =  "Bagi perempuan, rahim adalah organ yang sangat penting.\n" +
                    "\nIa diibaratkan sebagai tas yang menyimpan malaikat kecil dengan hati-hati di dalam tubuh ibu sampai bayi lahir. \n" +
                    "\nKebiasaan buruk terkait kebersihan daerah kewanitaan, hubungan seksual, dapat menjadi penyebab kerusakan rahim. \n" +
                    "\nHapus kebiasaan buruk segera untuk membantu rahim tetap sehat.",
        ),
        DataModel(
            R.drawable. artikel1,
            from = "HealthArticle",
            gambar1 = "Haid",
            gambar2 = "Hormon",
            title = "Ini Lho Penyebab Darah Menstruasi Menggumpal",
            sumber = "From Alodocter, the free encyclopedia",
            desc =  "Bagi wanita, haid memiliki arti penting karena menjadi tolak ukur masa kesuburan hingga kesehatan rahim.\n " +
                    "Penyebab darah haid menggumpal adalah sisa jaringan di dalam rahim. \n" +
                    "Gumpalan darah yang keluar saat menstruasi adalah hal yang wajar. \n" +
                    "Tetapi harus kamu waspadai jika gumpalan darah haid memenuhi seperempat bagian pembalut. Karena bisa menjadi tanda adanya masalah rahim lho. \n" +
                    "Berikut ini adalah beberapa penyebab darah haid keluar menggumpal: \n" +
                    "\n- Tanda Menjelang Menopause " +
                    "\nKeluarnya darah haid yang menggumpal bisa jadi tanda kamu memasuki waktu menopause. \n" +
                    "\n- Perubahan Hormon " +
                    "\nEstrogen & Progesteron adalah 2 hormon yang berperan menjaga siklus haid yang normal. \n" +
                    "\n- Infeksi dalam rahim " +
                    "\nSaat kamu memiliki infeksi pada saluran rahim menuju vagina, secara tidak sadar haid akan berlangsung lebih lama dari biasanya. \n" +
                    "\n- Miom (Tumor Jinak)  " +
                    "\nMiom/Fibroid adalah tumor jinak yang terdiri dari jaringan otot. Salah satu tanda miom adalah nyeri hebat saat sedang haid. \n" +
                    "\n-Endometriosis " +
                    "\nEndometriosis adalah kondisi ketika endometrium tumbuh diluar dinding rahim sehingga akan luruh bersama darah haid.",
        ),
        DataModel(
            R.drawable. artikel8,
            from = "HealthArticle",
            gambar1 = "Haid",
            gambar2 = "Hormon",
            title = "Batas Telat Haid yang Normal Berapa?",
            sumber = "From Alodocter, the free encyclopedia",
            desc =  "Karena telat datang bulan merupakan kondisi yang bisa dialami oleh semua wanita, hal ini sering diabaikan sebagai sesuatu yang wajar. \n" +
                    "\nNamun sangat penting untuk memahami kapan menstruasi terlambat dan apa yang perlu dilakukan. \n" +
                    "\nUntuk mencegah komplikasi besar, keterlambatan menstruasi yang disebabkan oleh masalah kesehatan memerlukan perhatian medis yang tepat dan cepat. \n" +
                    "\nUntuk mengetahui lebih jauh kondisi tubuh dan potensi penyebab terlambat haid, coba jadwalkan pemeriksaan dengan dokter spesialis kandungan atau Sp. OG. \n" +
                    "\nNantinya dokter akan memberikan saran apa yang harus dilakukan jika kamu mengalami kehamilan. \n" +
                    "\nPemeriksaan juga harus segera dimulai, apabila keterlambatan menstruasi akibat dari kehamilan. \n" +
                    "\nJika terlambat haid terjadi pada waktu yang tidak menentu, seperti lebih dari 90 hari, maka diperlukan kunjungan ke dokter. \n" +
                    "\nSelain itu, jika siklus menstruasi tidak normal, terjadi pendarahan yang signifikan atau menstruasi tiba-tiba berhenti, segera temui dokter.",
        ),
    )
    // TODO: Rename and change types of parameters
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        val tampil: RecyclerView = view.findViewById(R.id.recyclerView)
        tampil.layoutManager = GridLayoutManager(requireActivity(), 2)
        tampil.setHasFixedSize(true)
        val adapter = adapter_grid(requireActivity(), Datamahasiswa) { mhs ->
            val intent = Intent(requireActivity(), Deskripsi::class.java)
            intent.putExtra("foto", mhs.image)
            intent.putExtra("judul", mhs.title)
            intent.putExtra("from", mhs.from)
            intent.putExtra("gambar1", mhs.gambar1)
            intent.putExtra("gambar2", mhs.gambar2)
            intent.putExtra("sumber", mhs.sumber)
            intent.putExtra("deskripsi", mhs.desc)
            activity?.startActivity(intent)
        }
        tampil.adapter = adapter

    }


}

/*private fun ShowCardMahasiswa() {
    recyclerView.layoutManager = GridLayoutManager (requireActivity(), 2)
    val adapter = adapter_grid(requireActivity(), Datamahasiswa) { mhs ->
        val intent = Intent(requireActivity(), Deskripsi::class.java)
        intent.putExtra("foto", mhs.image)
        intent.putExtra("judul", mhs.title)
        intent.putExtra("deskripsi", mhs.desc)
        startActivity(intent)
    }
    recyclerView.adapter = adapter

}*/
