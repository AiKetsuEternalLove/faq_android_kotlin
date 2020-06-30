package com.example.expandablerecyclerviewexample


object FaqModel {
    var items = arrayListOf(
        DataModel(
            "Apakah kuota produk akan otomatis bertambah apabila kuota produk outlet telah habis pada suatu periode lalu outlet melakukan penebusan kepada distributor pada periode tersebut ?",
            "Kuota akan bertambah pada periode selanjutnya."
        ),
        DataModel(
            "Apakah ketika melakukan scan QRCode pada partnership promo akan mengurangi kuota scan ?",
            "Tidak. Partnership promo tidak akan mengurangi scan QRCode."
        ),
        DataModel(
            "Apa Fungsi Menu Info Promo ?",
            "Menu ini digunakan untuk menampilkan setiap promo yang sedang berlangsung untuk aplikasi POWER."
        ),
        DataModel(
            "Apa Fungsi Menu Profil ?",
            "Menu ini digunakan untuk melihat detail dari user yang sedang login."
        ),
        DataModel(
            "Mengapa saya gagal dalam melakukan scan QRCode Produk dengan notifikasi \" This product not included in POWER promo \" ?",
            "Anda mendapatkan notifikasi tersebut karena QRCode yang tertera pada Produk tidak termasuk pada promo POWER."
        ),
        DataModel(
            "Mengapa saya gagal dalam melakukan scan QRCode Produk dengan notifikasi \" No More quota for Scanned Product \" ?",
            "Anda mendapatkan notifikasi tersebut karena Produk yang di scan tidak termasuk pada promo atau tidak ada quota penebusan dari outlet untuk produk tersebut ke distributor."
        ),
        DataModel(
            "Apakah yang akan terjadi pada point yang sudah dikumpulkan oleh owner maupun mekanik pada akhir periode promo jika point tersebut belum mencapai target reward ?",
            "Point yang belum mencapai target reward pada promo sebelumnya tidak akan hangus dan akan diakumulasikan untuk periode promo berikutnya."
        ),
        DataModel(
            "Bagaimana jika ditemukan indikasi kecurangan POIN ?",
            "Pertamina Lubricants akan melakukan suspend pada user tersebut dan outlet tersebut tidak dapat mengikuti seluruh promo dari Pertamina Lubricants."
        ),
        DataModel(
            "Mengapa saat saya melakukan scan QRCode produk dengan volume 0.8 L di history POIN tercatat dengan volume 1L ?",
            "Untuk produk dengan volume 0.8 L akan dianggap sebagai produk dengan volume 1L oleh sistem POWER."
        ),
        DataModel(
            "Apakah kuota produk bisa hangus dalam kurun periode tertentu ?",
            "Kuota tidak akan hangus kecuali Pertamina Lubricants memang ada program khusus dan pasti akan diinfokan kepada Anda."
        ),
        DataModel(
            "Bagaimana cara melihat jumlah POIN owner ?",
            "POIN owner hanya dapat dilihat pada user owner di menu outlet."
        ),
        DataModel(
            "Bagaimana outlet saya bisa menjadi outlet program partnership promo menggunakan POWER ?",
            "Silahkan daftar pada distributor Pertamina Lubricants di masing-masing wilayah atau PIC Pertamina Lubricants."
        ),
        DataModel(
            "Apa itu Kumpulkan Poin ?",
            "Menu ini digunakan untuk menampilkan jumlah poin yang telah diperoleh dan scan qrcode untuk memperoleh poin."
        ),
        DataModel(
            "Bagaimana jika owner outlet mempunyai lebih dari 1 outlet ?",
            "Apabila suatu owner memiliki lebih dari 1 outlet, maka owner tersebut harus mendaftar lagi dengan nomer dan kode outlet yang berbeda."
        ),
        DataModel(
            "Kapan penggantian klaim akan diganti oleh Pertamina Lubricants pada program PARTNERSHIP PROMO ?",
            "Klaim akan diberikan oleh Pertamina Lubricants  melalui Distributor Pelumas masing-masing setiap bulan sekali."
        ),
        DataModel(
            "Apakah semua user outlet (Owner & Mekanik) bisa melakukan proses scan dan verifikasi kode unik Pada menu Partnership Promo ?",
            "Bisa."
        ),
        DataModel(
            "Mengapa saya gagal dalam melakukan registrasi user dengan notifikasi \" Phone Number 08xxxxxxxxxx telah dipergunakan \" ?",
            "Anda mendapatkan notifikasi tersebut karena nomor sudah terdaftar sebagai user aplikasi. Apabila ingin registrasi coba dengan nomor yang lain atau hubungi admin aplikasi untuk perubahan data kode outlet."
        ),
        DataModel(
            "Mengapa saya gagal dalam melakukan scan QRCode Produk dengan notifikasi \" Your distance is detected 1 xxxx meters away from your outlet location . Allowed distance is 1xxxxx meters \" ?",
            "Anda mendapatkan notifikasi tersebut karena saat melakukan Scan QRCode berada di luar radius (jarak) yang ditentukan oleh masing-masing outlet."
        ),
        DataModel(
            "Apa Fungsi Menu Konfirmasi Redeem ?",
            "Menu ini digunakan untuk menampilkan informasi redeem yang telah dilakukan."
        ),
        DataModel(
            "Apa Fungsi Menu Riwayat Poin ?",
            "Menu ini digunakan untuk menampilkan informasi riwayat poin yang telah diperoleh oleh user berdasarkan kurun waktu tertentu."
        ),
        DataModel(
            "Bagaimana cara mendaftarkan user owner pada setiap outlet ?",
            "Cara untuk mendaftarkan user owner adalah dengan mengirim permintaan user owner dengan pengajuan ke APM."
        ),
        DataModel(
            "Bagaimana cara mengetahui outlet-outlet yang terdaftar mengikuti program partnership promo dengan GOJEK ?",
            "Silahkan cek di http://bit.ly/outletfastrongocar , http://bit.ly/outletendurogoride."
        ),
        DataModel(
            "Apa Fungsi Menu Partnership Promo ?",
            "Menu ini digunakan untuk program promo partnership dengan menggunakan verifikasi kode unik yang didapatkan oleh konsumen. Jenis promo tergantung pada program yang sedang berlangsung. Cara menggunakan menu ini adalah input nomor HP dari konsumen dan masukkan kode unik dari konsumen. Jika berhasil maka scan botol pelumas yang dibeli konsumen sampai sukses. Silahkan diberikan promo sesuai program yang diikuti oleh konsumen"
        ),
        DataModel(
            "Bagaimanakah perhitungan kuota pada setiap outlet ?",
            "Kuota akan ditambah setiap bulan (bulan berikutnya) sesuai penebusan tiap bulan dan kuota per outlet akan berkurang seiring jumlah scan QRCode yang dilakukan oleh user outlet (owner/mekanik)."
        ),
        DataModel(
            "Bagaimana agar aplikasi POWER bisa melihat fitur-fitur terbaru yang paling update ?",
            "Untuk auto update bisa dilakukan pengaturan pada google play yg ada di HP masing-masing pengguna."
        ),
        DataModel(
            "Apa Fungsi Menu Outlet ?",
            "Menu ini digunakan untuk menampilkan informasi detail dari outlet, jumlah user yang terdaftar, jumlah kuota produk dari outlet serta poin dan reward yang diperoleh dari user."
        ),
        DataModel(
            "Kapan hadiah diberikan oleh Pertamina untuk program POIN REWARDS ?",
            "Hadiah akan diberikan oleh Pertamina Lubricants  melalui Distributor Pelumas masing-masing maksimal 1 bulan setelah periode berakhir."
        )
    )
}


