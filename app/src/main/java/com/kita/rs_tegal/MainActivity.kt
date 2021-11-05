package com.kita.rs_tegal


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.adela,"Jl. Prof. Muh. Yamin No.77, Kudaile, Kec. Slawi, Tegal, Jawa Tengah","RS Adella Slawi",
            "Rumah sakit Adella adalah rumah sakit umum (RSU) milik swasta dan merupakan salah satu rumah sakit tipe D yang terletak di wilayah Slawi, Kabupaten Tegal. " +
                    "Rumah sakit ini memberikan pelayanan di bidang kesehatan yang didukung oleh layanan dokter spesialis serta ditunjang dengan fasilitas medis lainnya."))

        data?.add(DataModel(R.drawable.harse,"Jalan Gatot Subroto, Dukuhsalam, Slawi, Tegal, Jawa Tengah 52418","RS Harapan Sehat Slawi", "Rumah Sakit Harapan Sehat Slawi " +
                "berada dibawah naungan PT. Ati Sri Subekti Harapan Sehat dan berdiri pada tanggal 3 September 2019. Memiliki Visi menjadi Rumah Sakit terbaik dalam pelayanan kesehatan " +
                "paripurna di wilayah kabupaten Tegal dan sekitarnya. Dengan Misi memberikan pelayanan kesehatan yang berkualitas sesuai dengan standar profesi berbasis keselamatan pasien, " +
                "menyediakan pelayanan kesehatan yang mudah dijangkau oleh seluruh lapisan masyarakat,, menyelenggarakan tata kelola Rumah Sakit yang akuntable, efektif dan efisien, " +
                "meningkatkan kompetensi dan kinerja pegawai, membangun sistem informasi dan manajemen Rumah Sakit yang handal."))

        data?.add(DataModel(R.drawable.susilo,"Jl. DR. Soetomo, Slawi Kulon, Slawi Kulon, Kec. Slawi, Tegal, Jawa Tengah","RSUD Dr Soeselo", "RSUD Dr. Soeselo " +
                "Kabupaten Tegal merupakan Rumah Sakit milik Pemerintah Kabupaten Tegal yang berlokasi di Slawi, Kabupaten Tegal. RSUD Dr Soeselo memiliki Visi untuk menjadi rumah sakit " +
                "pilihan utama masyarakat, oleh karena itu RSUD Dr Soeselo terus melakukan upaya perbaikan baik dari segi pelayanan maupun prasarana agar dapat memberikan pelayanan terbaik " +
                "kepada masyarakat"))

        data?.add(DataModel(R.drawable.palaraya,"Jl. Pala Raya No.11A, Sibata, Mejasem Bar., Kec. Kramat, Tegal, Jawa Tengah","RSIA Pala Raya",
            "RSIA Pala Raya merupakan salah satu RS yang ada di Tegal yang berada di bawah naungan PT Delima Mitra Husada. Memiliki Visi Menjadi Rumah Sakit terpercaya. " +
                    "Dengan Misi Mengutamakan keselamatan dan kepuasan pasien, Selalu berupaya meningkatkan mutu pelayanan, Melakukan tarif Rumah Sakit yang efisien, serta Menciptakan " +
                    "suasana kerja yang nyaman, komunikatif, dan terintegrasi dengan baik."))

        data?.add(DataModel(R.drawable.pku,"KM 0,5, Jl. Raya Singkil, Kb. Baru, Adiwerna, Kec. Adiwerna, Tegal, Jawa Tengah","RS Islam PKU Muhammadiyah Tegal",
            "Rumah Sakit Islam PKU Muhammadiyah Tegal didirikan pada tanggal 24 Desember 1989. Rumah Sakit Islam PKU Muhammadiyah Tegal memiliki Visi menjadi Rumah Sakit yang " +
                    "terpercaya dan berkualitas. Dengan Misi memberi pelayanan secara profesional dan Islami, meningkatkan sumber daya insani, jejaring antar amal usaha kesehatan, dan" +
                    " mengoptimalkan perkembangan Rumah Sakit dan peduli dengan kaum Dhuafa."))

        data?.add(DataModel(R.drawable.mitra,"No.19, Jl. Pala Raya, Dampyak Tengah, Dampyak, Kec. Kramat, Tegal, Jawa Tengah","RS Mitra Siaga Tegal", "Rumah Sakit " +
                "Mitra Siaga Tegal beroperasi pada tanggal 29 Oktober 2004, dibawah naungan PT. Texin Permata Husada. Rumah Sakit Mitra Siaga Tegal melayani Poliklinik Bedah, Jantung dan " +
                "Pembuluh Darah, Kulit Kelamin, Saraf, Umum, Gigi, Penyakit Dalam, Paru, Anak, Mata, THT, Kandungan dan Kebidanan, Anestesi, Jiwa, Fisik dan Rehabilitasi, Radiologi, dan Laboratorium."))


        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("alamat", item?.alamat)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}