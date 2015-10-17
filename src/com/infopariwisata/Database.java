package com.infopariwisata;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Database {
	
	public static final int VERSI_DATABASE= 1;
	public static final String NAMA_DATABASE = "wisata.db";
	
	
	public static final String NAMA_TABEL = "wisataalam";
	public static final String NAMA_TABEL2 = "wisatabudaya";
	public static final String NAMA_TABEL3 = "wisatakuliner";
	
	
	public static final String FIELD_ID = "_id";
	public static final int POSISI_ID = 0;
	public static final String FIELD_JUDUL = "judul";
	public static final int POSISI_JUDUL = 1;
	public static final String FIELD_DESKRIPSI = "deskripsi";
	public static final int POSISI_DESKRIPSI = 2;
	public static final String FIELD_GAMBAR = "gambar";
	public static final int POSISI_GAMBAR = 3;
	
	public static final String FIELD_ID2 = "_id";
	public static final int POSISI_ID2 = 0;
	public static final String FIELD_JUDUL2 = "judul";
	public static final int POSISI_JUDUL2 = 1;
	public static final String FIELD_DESKRIPSI2 = "deskripsi";
	public static final int POSISI_DESKRIPSI2 = 2;
	public static final String FIELD_GAMBAR2 = "gambar";
	public static final int POSISI_GAMBAR2 = 3;
	
	public static final String FIELD_ID3 = "_id";
	public static final int POSISI_ID3 = 0;
	public static final String FIELD_JUDUL3 = "judul";
	public static final int POSISI_JUDUL3 = 1;
	public static final String FIELD_DESKRIPSI3 = "deskripsi";
	public static final int POSISI_DESKRIPSI3 = 2;
	public static final String FIELD_GAMBAR3 = "gambar";
	public static final int POSISI_GAMBAR3 = 3;
	
	public static final String[] FIELD_TABEL ={ Database.FIELD_ID, Database.FIELD_JUDUL, Database.FIELD_DESKRIPSI,Database.FIELD_GAMBAR };
	public static final String[] FIELD_TABEL2 ={ Database.FIELD_ID2, Database.FIELD_JUDUL2, Database.FIELD_DESKRIPSI2,Database.FIELD_GAMBAR2 };
	public static final String[] FIELD_TABEL3 ={ Database.FIELD_ID3, Database.FIELD_JUDUL3, Database.FIELD_DESKRIPSI3,Database.FIELD_GAMBAR3 };
	
	private Context crudContext;
	private SQLiteDatabase crudDatabase;
	private SqliteManagerHelper crudHelper;
	
	private static class SqliteManagerHelper extends SQLiteOpenHelper {

			private static final String BUAT_TABEL =
				"create table " + NAMA_TABEL + " (" +
				Database.FIELD_ID + " integer primary key autoincrement, " +
				Database.FIELD_JUDUL + " text not null, " +
				Database.FIELD_DESKRIPSI + " text not null," +	
				Database.FIELD_GAMBAR + " blob not null " +
				");";
			
			private static final String BUAT_TABEL2 =
					"create table " + NAMA_TABEL2 + " (" +
					Database.FIELD_ID2 + " integer primary key autoincrement, " +
					Database.FIELD_JUDUL2 + " text not null, " +
					Database.FIELD_DESKRIPSI2 + " text not null," +	
					Database.FIELD_GAMBAR2 + " blob not null " +
					");";
			
			
			private static final String BUAT_TABEL3 =
					"create table " + NAMA_TABEL3 + " (" +
					Database.FIELD_ID3 + " integer primary key autoincrement, " +
					Database.FIELD_JUDUL3 + " text not null, " +
					Database.FIELD_DESKRIPSI3 + " text not null," +	
					Database.FIELD_GAMBAR3 + " blob not null " +
					");";

			public SqliteManagerHelper(Context context) {
				super(context, NAMA_DATABASE, null, VERSI_DATABASE);
			}

			@Override
			public void onCreate(SQLiteDatabase database) {
				database.execSQL(BUAT_TABEL);
				database.execSQL(BUAT_TABEL2);
				database.execSQL(BUAT_TABEL3);
				
				ContentValues values = new ContentValues();
				values.put(Database.FIELD_ID, "1");
				values.put(Database.FIELD_JUDUL, "Agro Wisata Tambi");
				values.put(Database.FIELD_DESKRIPSI, "Terhampar luas di lereng Gunung Sindoro, dengan ketinggian lebih dari 1200-2000 m diatas permukaan laut. Suhu udara antara 15-24° C. Agro wisata Tambi terletak di perkebunan Tambi dengan kebun dan pabrik teh, pondok wisata, kolam pemancingan, lapangan tenis, taman bermain serta sarana outbound." );
				values.put(Database.FIELD_GAMBAR, R.drawable.agro_wisata_tambi);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "2");
				values.put(Database.FIELD_JUDUL, "Bukit Sikunir");
				values.put(Database.FIELD_DESKRIPSI, "Disinilah tempat terbaik untuk menikmati sunrise. Puncak Sikunir terdapat di Desa Sembungan, Kecamatan Kejajar, yang masih merupakan daerah kawasan dataran tinggi Dieng. Memakan waktu kurang lebih 30 menit untuk dapat sampai ke Puncak Sikunir dari Desa Sembungan. Di Puncak Sikunir kita bisa melihat Gunung Sindoro, Gunung Sumbing, Gunung Telomoyo, Gunung Merbabu, Gunung Merapi bahkan Gunung Slamet, bila cuaca mendukung atau tidak mendung dank abut. Sungguh pemandangan sunrise yang mengagumkan." );
				values.put(Database.FIELD_GAMBAR, R.drawable.bukit_sikunir);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "3");
				values.put(Database.FIELD_JUDUL, "Candi Hindu");
				values.put(Database.FIELD_DESKRIPSI, "Dieng berasal dari bahasa Sansekerta yaitu “di” yang berarti tempat yang tinggi dan “hyang” yang berarti kahyangan. Maka, “Dieng” bisa berarti daerah pegunungan tempat di mana para dewa dan dewi bersemayam. Terletak diatas ketinggian 2.093 DPL, mempunyai udara yang sejuk dengan suhu antara 10-15 derajat Celcius. Dieng juga dapat diartikan dalam bahasa jawa “Adi tur Aeng” yang artinya Indah dan Unik, dimana Dieng mempunyai kelebihan dan perbedaan tersendiri dibanding daerah tempat wisata lain. Disinilah terletak candi-candi Hindu tertua di Indonesia, yaitu Kawasan Candi Arjuna." );
				values.put(Database.FIELD_GAMBAR, R.drawable.candi_hindu);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "4");
				values.put(Database.FIELD_JUDUL, "Curug Winong");
				values.put(Database.FIELD_DESKRIPSI,"Sesuai dengan namanya, obyek wisata ini adalah berupa air terjun (curug) dan berlokasi di wilayah desa Winongsari, lebih tepatnya Dusun Temanggung, Desa Winongsari, Kecamatan Kaliwiro. Terletak di area hutan desa, Curug Winong tak hanya menawarkan keindahan air terjun yang berbentuk seluncur, namun juga menawarkan keindahan alam pegunungan khas Wonosobo yang sangat memanjakan mata. Kendati terletak di pedalaman hutan, namun akses menuju Curug Winong ini terbilang bagus. Untuk menuju gerbang desa Winongsari, terdapat jalan raya beraspal dan berkelok dengan pemandangan hutan pinus dan pegunungan di sisi kanan dan kiri jalan. Loket wisata Curug Winong berjarak sekitar setengah kilometer dari gerbang desa Winongsari. Namun jalan ini tidak semulus jalan yang dilewati sebelumnya. Hanya butuh sekitar 15 menit dengan berjalan kaki dari loket untuk sampai ke lokasi Curug Winong. Topografi turunan Curug Winong yang menyerupai seluncur dengan kemiringan tak lebih dari 70 derajat, membuat banyak pengunjung yang memberanikan diri untuk bisa memanjat naik. Selain pemandangan air terjun, pemandangan lain yang menarik adalah tiga buah batu besar yang oleh warga setempat disebut Watu Kelir.   ");
				values.put(Database.FIELD_GAMBAR, R.drawable.curug_winong);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "5");
				values.put(Database.FIELD_JUDUL, "Dieng Plateau Theater");
				values.put(Database.FIELD_DESKRIPSI, "Pusat interpretasi potensi alam dan budaya Kawasan Dataran Tinggi Dieng yang diberi nama Dieng Plateau Theater (DPT) dibangun atas prakarsa Gubernur Jawa Tengah, diharapkan wahana wisata tersebut dapat menjadi magnet yang kuat untuk mengembangkan pariwisata Jawa Tengah. DPT dilengkapi sarana audio visual dan film tentang Dieng Plateau serta aktifitas vulkanik Gunung Dieng. DPT berada dilereng bukit Sikendil Desa Dieng Kecamatan Kejajar Kabupaten Wonosobo." );
				values.put(Database.FIELD_GAMBAR, R.drawable.dieng_plateau_theater);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "6");
				values.put(Database.FIELD_JUDUL, "Gardu Pandang Tieng");
				values.put(Database.FIELD_DESKRIPSI, "Dalam perjalanan menuju Dataran Tinggi Dieng, panorama indah yang tidak dapat kita lewatkan adalah pemandangan di Gardu Pandang Tieng, dengan ketinggian 1.700 m di atas permukaan laut. Pemandangan spektakuler di pagi hari kita dapat menyaksikan matahari terbit dengan cahaya keemasan yang disebut “Golden Sunrise” dan matahari terbit yang kedua dengan cahaya keperak-perakan “Silver Sunrise” di Komplek Candi Arjuna." );
				values.put(Database.FIELD_GAMBAR, R.drawable.gardu_pandang_tieng);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "7");
				values.put(Database.FIELD_JUDUL, "Telaga Menjer");
				values.put(Database.FIELD_DESKRIPSI, "Telaga Menjer merupakan telaga alam yang terluas di Kabupaten Wonosobo, berada pada ketinggian 1.300 m di atas permukaan laut dengan luas 70Ha dan kedalaman air mencapai 50 m. Telaga Menjer terletak di Desa Maron Kecamatan Garung, 12 km sebelah utara Kota Wonosobo, berfungsi juga untuk pembangkit tenaga listrik." );
				values.put(Database.FIELD_GAMBAR, R.drawable.telaga_menjer);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "8");
				values.put(Database.FIELD_JUDUL, "Telaga Warna dan Goa");
				values.put(Database.FIELD_DESKRIPSI, "Telaga yang sangat indah yang memantulkan aneka warna hingga dinamakan Telaga Warna dan disampingnya terdapat telaga lain yang disebut Telaga Pengilon yang berkilau seperti cermin. Diantara telaga terdapat Gua Semar yang memiliki panjang 4 meter dengan dinding batu dan biasa digunakan untuk meditasi. Disekitar Gua Semar terdapat pula gua lain yaitu, Gua Sumur dan Gua Jaran. Di dalam Gua Sumur ini terdapat sumber air suci yang disebut “Tirta Perwitasari”. Di lokasi inilah umat Hindu sering mengadakan upacara ritual yang disebut Muspe/Mabakti atau Medhak Tirta." );
				values.put(Database.FIELD_GAMBAR, R.drawable.telaga_warna_dan_goa);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "9");
				values.put(Database.FIELD_JUDUL, "Tuk Bimo Lukar");
				values.put(Database.FIELD_DESKRIPSI, "Merupakan mata air yang keluar dari batu purba. Menurut cerita, nama Bimolukar dimaksudkan sebagai tempat dimana Sang Bima Sena mensucikan diri (melukar/melepas). Tuk Bimolukar juga merupakan mata air Sungai Serayu(Siro Ayu) dapat diyakini bisa menjadikan awet muda apabila seseorang mencuci mukanya di Tuk Bimolukar." );
				values.put(Database.FIELD_GAMBAR, R.drawable.tuk_bimo_lukar);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				values.put(Database.FIELD_ID, "10");
				values.put(Database.FIELD_JUDUL, "Waduk Wadaslintang");
				values.put(Database.FIELD_DESKRIPSI, "Waduk Wadaslintang terletak di dua wilayah yaitu Kabupaten Wonosobo dan Kabupaten Kebumen. Fungsi utama sebagai pembangkit listrik tenaga air, industri perikanan dan irigasi pertanian. Di Waduk Wadaslintang tidak hanya ikan, sesekali muncul reptil sejenis biawak di permukaan air waduk yang jernih. Di samping fungsi utama waduk Wadaslintang merupakan oyek wisata yang sangat menarik. Keindahan waduk dapat dinikmati melalui gardu pandang diatas bukit batu. Disekitar waduk Wadaslintang juga terdapat obyek wisata yang lain seperti Air Anget Somagede, tempat meditasi Indrokilo, dan Curug Winong" );
				values.put(Database.FIELD_GAMBAR, R.drawable.waduk_wadaslintang);
				database.insert(NAMA_TABEL, FIELD_ID,values);
				
				
				
				
				ContentValues values2 = new ContentValues();
				
				values2.put(Database.FIELD_ID2, "1");
				values2.put(Database.FIELD_JUDUL2, "Festival Balon Sapuran");
				values2.put(Database.FIELD_DESKRIPSI2,"Setiap bulan Juli masyarakat Wonosobo mempunyai tradisi unik yakni Festival Balon Tradisional. Ajang tahunan ini dipusatkan di Kecamatan Sapuran dengan peserta festival dari desa-desa di kota dingin itu. Menariknya selalu dipadati penonton dan wisatawan domestik dan luar negeri serta menjadi buruan para photographer. Festival Balon Tradisional biasanya dimulai pagi sekitar pukul 06:00 WIB, Para peserta festival dengan membawa balon serta berbagai palatal mempersiapkan diri. Sementara penonton terlihat mengerumuni para peserta yang mencoba menerbangkan balon berwarna-warni tersebut. Balon yang terbuat dari kertas pilos atau kertas sampul diterbangkan dengan cara tradisional, prosesnya memanasi bagian mulut balon menggunakan asap dari pembakaran jerami atau kayu. Asap yang masuk ke dalam balon berfungsi untuk mengembangkan balon, ketika pengasapan dirasa sudah cukup balon dilepaskan terbang ke angkasa. Saat balon terbang, penonton pun bersorak sambil tepuk tangan.Sementara para photografer dari berbagai daerah serta wisatawan manca negara sibuk mengabadikan moment tersebut menggunakan kameranya. Sajian ini semakin mempesona, langit biru dalam sekecap dihiasi balon warna-warni dengn ukuran besar-besar. Festival balon tradisional diselenggarakan setiap tahun untuk meramaikan Hari Jadi Kabupaten Wonosobo sekaligus sebagai salah satu upaya untuk meningkatkan daya tarik pariwisata. Selain mengelola potensi alam, untuk mengembangkan pariwisata melalui tradisi lokal. Tradisi melepas balon telah bagi masyarakat Wonosobo terpelihara sejak dahulu dan menjadi ajang hiburan dan pesta rakyat. Biasanya tradisi ini dilakukan kala lebaran, usai panen raya hasil pertanian serta acara merdi desa disejumlah desa di Wonosobo.");
				values2.put(Database.FIELD_GAMBAR2, R.drawable.balon_sapuran);
				database.insert(NAMA_TABEL2, FIELD_ID2,values2);
				
				
				values2.put(Database.FIELD_ID2, "2");
				values2.put(Database.FIELD_JUDUL2, "Larung Sukerto");
				values2.put(Database.FIELD_DESKRIPSI2,"Malam satu syura, atau dalam sistem kelenderisasi hijriyah merupakan malam perpindahan tahun, diyakini oleh warga Dusun Sruni Kelurahan Jaraksari Wonosobo sebagai malam yang sakral. Pada malam perpindahan tahun ini, para warga menggelar ritual Larung Sukerto ( melarung sungai) di Kali Semagung dengan serangkain acara diantaranya melarung sesaji serta padusan pada tengah malam. Proses ritual Larung Sukerto dimulai pukul 20.00 WIB hingga pukul 01.00 WIB. Sebelum melarung sesaji dan padusan pada tengah malam. Para warga berkumpul di halaman rumah milik warga setempat. Deretan perangkat sudah disiapkan, diantaranya gemelan, obor, deretan sesaji jajanan pasar serta puluhan tumpeng dan lauk pauk. Menariknya lagi, hampir semua warga yang mengikuti prosesi ritual mengenakan pakain ada jawa dari anak-anak hingga manula. Acara dibuka dengan sambutan sesepuh desa yang menegaskan tentang makna bulan syura dan awal hijriyah. Setelah itu, pagelaran seni meliputi lengger dan deretan tarian lain digelar. Tak hanya itu, keragaman budaya dan agama juga terasa kental dalam ritual tersebut. Sebab, di dusun tersebut terdapat beragam kelompok seni serta tumbuh beragam pemeluk agama. Sehingga sepanjang malam menunggu pukul 00.00 diisi dengan tarian seni warga serta dagelan jawa. Usai pertunjukan seni, acara kemudian dilanjutkan dengan doa antar agama dan antar iman. Ratusan warga mengepung deretan sesaji jajanan pasar serta tumpeng dan dimulai doa oleh para pemimpin agama. Syahdan, tumpeng dimakan bersama, sedangkan jajanan pasar ditata rapi untuk dilarungkan disungai Semagung.Proses larung sesaji tersebut dimulai pukul 23.30 WIB. Para warga dengan menggunakan penerang obor berjalan secara beriringan menuju sungai Semagung yang jaraknya sekitar 2 kilometer dari Dusun Sruni. Sepanjang perjalanan semua warga berdiam sembari menatap lurus ke depan hingga sekitar pukul 00.00 WIB sampai di tepi sungai Semagung,dipimpin sesepuh dusun tersebut deretan sesaji dilarung bersama, kemudian dilanjutkan dengan padusan bersama sebagai penolak balak dan mencari berkah memasuki awal tahun. Larung Sikerto dimaksudkan sebagai bentuk rasa syukur sekaligus instropeksi hubungan antara warga Sruni dengan tetangga, tuhan serta lingkungannya. Makna larung sukerto juga untuk merekatkan hubungan antar warga. diantaranya melakukan makan bersama serta doa bersama melintasi batas iman dan kepercayaan. Sebagai wujud kedamaian, harapannya pada tahun mendatang hubungan antar warga semakin guyub dan rukun.");
				values2.put(Database.FIELD_GAMBAR2, R.drawable.larung_sukerto);
				database.insert(NAMA_TABEL2, FIELD_ID2,values2);
				
				values2.put(Database.FIELD_ID2, "3");
				values2.put(Database.FIELD_JUDUL2, "Ruwat Rambut Gembel");
				values2.put(Database.FIELD_DESKRIPSI2, "Merupakan tradisi yang hidup di sekitar Kecamatan Kejajar, 17 Km sebelah utara Kota Wonosobo. Di daerah ini banyak anak kecil yang berambut gembel yang dianggap 'balak' dan harus diruwat melalui upacara tradisi 'Ruwatan'. Upacara dilaksanakan setelah anak mengajukan permintaan langsung atau jejaluk (Bahasa Jawa) kepada orang tuanya. Anehnya, bila upacara tradisi Ruwatan bagi anak gembel tidak dilaksanakan atas permintaannya sendiri, maka sekalipun sudah dicukur akan tumbuh gembel kembali");
				values2.put(Database.FIELD_GAMBAR2, R.drawable.rambut_gembel);
				database.insert(NAMA_TABEL2, FIELD_ID2,values2);
				
				values2.put(Database.FIELD_ID2, "4");
				values2.put(Database.FIELD_JUDUL2, "Tari Lengger");
				values2.put(Database.FIELD_DESKRIPSI2, "Lengger berasal dari kata 'LE' panggilan untuk anak laki-laki dan 'GER' yang membuat geger atau ramai. Pada awalnya tari lengger dibawakan oleh laki-laki yang dirias menjadi wanita. Tari lengger terdiri dari 9 babak, yaitu Gameyong(Tarian selamat datang), Sulasih(Tarian mengundang roh bidadari), Kinayakan(Tarian yang dibawakan dengan perasaan halus), Bribil(Menggambarkan rasa terima kasih), Samiran(Menggambarkan wanita bersolek karena rindu), Rangu-rangu(Pada tarian ini, biasanya penari kemasukan roh jahat), Kebo Giro(Tarian bersifat ganas dan kasar), Kembang Jeruk(Menggambarkan penari kemasukan roh mirip kera), Gonos(Tarian bersifat lucu).");
				values2.put(Database.FIELD_GAMBAR2, R.drawable.tari_lengger);
				database.insert(NAMA_TABEL2, FIELD_ID2,values2);
				
				values2.put(Database.FIELD_ID2, "5");
				values2.put(Database.FIELD_JUDUL2, "Tenongan Giyanti");
				values2.put(Database.FIELD_DESKRIPSI2, "Muharam atau Syura dalam kalenderisasi Jawa diyakini masyarakat Dusun Giyanti, Desa Kadipaten, Selomerto, Wonosobo, sebagai hari jadi dusunnya. Kemarin (23/12) Warga dusun yang dikenal sebagai akar lahirnya kesenian tari Lengger di wilayah Wonosobo itu merayakannya dengan acara nyadran (pesta) tenongan. Para penduduk di dusun ini hampir semuanya keluar dari rumah masing-masing. Mereka memadati sepanjang jalan kampung. Tak hanya warga setempat, penduduk di luar Dusun Giyanti juga datang. Ibu-ibu dan anak-anak duduk berderet di sepanjang jalan desa. Mereka menata makanan yang terdiri atas jajanan pasar dan buah-buah atau disebut tarakan di dalam tenong yang sudah dirias dengan kertas warna-warni.Menariknya, semua warga mengenakan pakain batik dan pakaian adat jawa. Tak jauh dari tempat tersebut, puluhan grup kesenian yang terdiri lengger, barongan, dan kuda lumping (emblek) juga beraksi. Sebagian tengah berdandan. Beberapa yang lain menata seperangkat gamelan serta topeng. Ya, mereka sedang menyiapkan acara nyadran (pesta) tenongan. Tradisi itu, bagi masyarakat Dusun Giyanti, merupakan kegiatan yang wajib dilakukan tiap bulan Muharam atau syura. Selain dipercaya sebagai bulan yang penuh kemuliaan, Muharam diyakini sebagai bulan lahirnya Dusun yang melahirkan banyak seniman Lengger Khas Wonosobo itu. Prosesi upacara nyadran tenongan diawali ziarah ke makam sesepuh desa Adipati Mertoloyo yang dipercaya sebagai pembuka Dusun Giyanti. Pemberangkatan ke makam melalui prosesi panjang. Ratusan warga mengenakan pakaian khas Jawa serta memboyong seluruh kesenian yang ada di desa tersebut. Namun, yang paling unik adalah warga memikul dua boneka yang disebut sebagai perwujudan Adipati Mertoloyo dan Kiai Monyet sebagai wujud penghormatan terhadap sesepuh pendiri dusun tersebut. Dua boneka itu diusung ke makam desa, kemudian mengikuti proses doa. Rombongan warga dan seniman Dusun Giyanti membawa dua boneka tersebut keliling dan menyisir seluruh jalan dusun yang sudah dipadati makanan dalam tenong. Harapannya, dua boneka yang jadi simbol itu mampu memberikan berkah kepada makanan yang mereka usung dalam tenong. Lantas, satu per satu warga yang membawa tenong mengikuti barisan para peziarah berjalan keliling desa. Setelah semua sudut desa dikelilingi, mereka berkumpul di pesanggrahan kesenian yang didirikan pada 1960 oleh Ki Hadi Suwarno. Pesanggrahan itu dipercaya sebagai kawah candradimuka bagi para seniman yang akan belajar kesenian lengger, seni tari khas Wonosobo. Para warga meletakkan tenongnya di sepanjang jalan dan halaman pesanggrahan. Sesepuh desa dan satu penari lengger menata sesaji di sebelah pohon beringin yang terletak di pesanggrahan seni tersebut sambil membaca beberapa mantra menuju keselamatan. Setelah berdoa, di Pesanggrahan yang sudah dipadati para pengunjung disajikan tari asli lengger pada periode awal, yakni penari lengger laki-laki tetapi berdandan ala perempuan. Setelah tarian lengger, seorang cucuk lampah sesepuh desa tersebut, Sosro Wardoyo, menjelaskan silsilah kelahiran Dusun Giyanti.");
				values2.put(Database.FIELD_GAMBAR2, R.drawable.tenongan_giyanti);
				database.insert(NAMA_TABEL2, FIELD_ID2,values2);
				
				
				
				
				
				ContentValues values3 = new ContentValues();
				values3.put(Database.FIELD_ID3, "1");
				values3.put(Database.FIELD_JUDUL3, "Carica");
				values3.put(Database.FIELD_DESKRIPSI3, "Buah carica masuk dalam keluarga pepaya. Bedanya, jika pepaya biasa lebih dikenal sebagai tumbuhan tropis yang memerlukan banyak panas dan matahari, maka carica termasuk keluarga pepaya yang hanya bisa tumbuh di tempat tinggi, memerlukan temperatur yang cukup dingin, dan banyak hujan. Kondisi tersebut sangat cocok dengan iklim Dataran Tinggi Dieng di Wonosobo. Nama latin buah carica ini adalah Carica Pubescens atau Carica Candamarcensis, atau kadang dikenal sebagai Mountain Papaya, atau di antara penduduk setempat dikenal sebagai gandul Dieng. Menjadi petani buah carica tidak terlalu sulit, karena usia pohon carica yang relatif panjang, bisa sampai 20 tahun bahkan lebih. Pohon carica yang saat ini dipanen oleh petani di Pegunungan Dieng sudah ditanam sejak tahun 1980an. Kurang lebih satu tahun setelah dipanen, pohon carica tersebut sudah bisa menghasilkan buah yang baik. Jika mutu buah sudah mulai menurun, biasanya setelah enam bulan, petani tinggal memangkas pohon tersebut. Dari pucuk-pucuknya akan tumbuh tunas baru yang segera menghasilkan buah yang lebih baik. Proses pemasakan carica oleh semua produsen adalah serupa, bahkan serupa juga dengan pemasakan buah lain dalam sirup, seperti buah salak, mangga dan nanas. Oleh karena itu, untuk bisa bertahan dalam bisnis tersebut, mereka bersaing dalam hal harga dan rasa. Karena kemudahan-kemudahan inilah, maka sampai saat ini di Wonosobo terdapat kurang lebih 20 industri kecil yang memproduksi buah carica. Oleh-oleh ini dapat dijumpai di berbagai toko oleh-oleh di Wonosobo.");
				values3.put(Database.FIELD_GAMBAR3, R.drawable.carica);
				database.insert(NAMA_TABEL3, FIELD_ID3,values3);
				
				values3.put(Database.FIELD_ID3, "2");
				values3.put(Database.FIELD_JUDUL3, "Kacang Babi");
				values3.put(Database.FIELD_DESKRIPSI3, "Mungkin bagi yang pertama kali mendengar istilah kacang babi (kacang Dieng) terasa asing ataupun aneh, padahal kacang babi (kacang dieng) sama sekali tidak ada sangkut pautnya dengan binatang babi. Kacang babi (kacang dieng) berasal dari tumbuh-tumbuhan sejenis kacang-kacangan yang hanya tumbuh dengan baik di dataran tinggi dieng, kacang ini memiliki bentuk yang unik, tidak seperti jenis kacang-kacangan lain. Bentuknya besar dan melebar dengan congor ditengah yang berwarna hitam. Masyarakat dataran tinggi dieng dan sekitarnya lebih sering menyebut dengan istilah kacang babi, sedangkan dikalangan wisatawan kacang babi lebih dikenal dengan istilah kacang dieng, makanan ringan asli, dalam arti setiap wisatawan yang membeli kacang babi (kacang dieng) tak lupa dengan kripik jamur.  Kacang babi (kacang dieng) menjadi primadona dikalangan wisatawan, disamping harganya yang terjangkau kacang babi (Kacang Dieng) cocok untuk oleh-oleh atau sekedar untuk cemilan di perjalanan. Makanan ini dapat didapatkan di toko oleh-oleh di sekitar tempat wisata di Wonosobo.");
				values3.put(Database.FIELD_GAMBAR3, R.drawable.kacang_babi);
				database.insert(NAMA_TABEL3, FIELD_ID3,values3);
				
				values3.put(Database.FIELD_ID3, "3");
				values3.put(Database.FIELD_JUDUL3, "Mie Ongklok");
				values3.put(Database.FIELD_DESKRIPSI3, "Mengunjungi kota dingin Wonosobo tak lengkap rasanya jika belum mencoba makanan yang memiliki nama unik satu ini, yaitu Mie Ongklok. Makanan spesifik dari Wonosobo berupa mie, kobis dan kucai yang direbus setengah matang dengan cara dicelupkan ke dalam air mendidih disiram dengan 'lo' semacam saus gurih beraroma ebi (udang kering). Mie ongklok paling nikmat dimakan hangat-hangat dengan sate sapi khas Wonosobo disiram bumbu kacang atau dengan tahu dan tempe bacem. Biasanya mie ongklok ini dijual berkeliling menggunakan gerobak di sekitar Kota Wonosobo. Beberapa warung mie ongklok yang terkenal di Wonosobo antara lain, Mie Ongklok Pak Muhadi, Mie Ongklok Bu Umi Kauman, Mie Ongklok Longkrang.");
				values3.put(Database.FIELD_GAMBAR3, R.drawable.mie_ongklok);
				database.insert(NAMA_TABEL3, FIELD_ID3,values3);
				
				values3.put(Database.FIELD_ID3, "4");
				values3.put(Database.FIELD_JUDUL3, "Purwaceng");
				values3.put(Database.FIELD_DESKRIPSI3, "Dikenal sebagai ginseng Dieng. Tanaman yang dianggap berkhasiat sebagai obat tradisional dan dipercaya dapat menambah vitalitas ini biasanya disajikan dengan cara diseduh seperti teh maupun dicampur dengan kopi. Di Dieng banyak ditemui warung-warung penjual kopi purwaceng. Apabila anda berminat untuk membawa pulang, banyak tersedia purwaceng yang sudah diolah dan dikemas dalam kemasan plastik maupun karton berbentuk daun kering, teh atau kopi.");
				values3.put(Database.FIELD_GAMBAR3, R.drawable.purwaceng);
				database.insert(NAMA_TABEL3, FIELD_ID3,values3);
				
				values3.put(Database.FIELD_ID3, "5");
				values3.put(Database.FIELD_JUDUL3, "Sagon");
				values3.put(Database.FIELD_DESKRIPSI3, "Sagon, salah satu makanan khas Wonosobo yang unik, terbuat dari tepung ketan dan parutan kelapa yang berbentuk bulat dan cekung di tengahnya. Pembuatannya pun di bakar di atas bara. Di Wonosobo makanan ini banyak dijual di lantai dua pasar induk wonosobo, banyak penjual yang menempati hampir satu los dari lantai dua ini untuk menjual makanan yang satu ini. Dalam sehari rata-rata setiap penjual dapat menghabiskan 30-40 kg tepung ketan. Makanan ini selain berbahan dasar tepung ketan dan parutan kelapa, juga biasanya ditambahkan gula dan vanili sebagai perasa tambahan. Selain harganya murah, sagon ini juga banyak diminati oleh banyak wisatawan karena rasanya yang manis dan gurih. Bagi anda yang ingin menikmati makanan ini bisa langsung kunjungi pasar induk Wonosobo, disana anda dapat melihat langsung keunikan cara pengolahan makanan yang satu ini, sagon-sagon dibakar di atas bara arang, juga menjadi atraksi yang cukup menarik. Racikan Sagon mentah yang terdiri atas tepung ketan, parutan kelapa, gula pasir dan vanili itu ditempatkan dalam satu cetakan aluminium berbentuk bulat. Lalu, Sagon dalam cetakan itu dibakar dengan bara arang dari dua sisi : bawah dan atas. Tak sampai lima menit, makanan ini saat panas dan beraroma harus itu sudah matang dan siap disantap.");
				values3.put(Database.FIELD_GAMBAR3, R.drawable.sagon);
				database.insert(NAMA_TABEL3, FIELD_ID3,values3);
				
				
			}


			@Override
			public void onUpgrade(SQLiteDatabase db, int oldVersion,
					int newVersion) {
				// TODO Auto-generated method stub
				
			}
		}
	
	public Database(Context context) {
		crudContext = context;
	}
	
	

	public void bukaKoneksi() throws SQLException {
		crudHelper = new SqliteManagerHelper(crudContext);
		crudDatabase = crudHelper.getWritableDatabase();
	}
	
	public SQLiteDatabase data()
	{
		crudDatabase = crudHelper.getWritableDatabase();
		return crudDatabase;
	}

	public void tutupKoneksi() {
		crudHelper.close();
		crudHelper = null;
		crudDatabase = null;
	}
	public long insertWisataAlam(ContentValues values) {
		return crudDatabase.insert(NAMA_TABEL, null, values);
	}
	
	public long insertWisataBudaya(ContentValues values) {
		return crudDatabase.insert(NAMA_TABEL2, null, values);
	}
	
	public long insertWisataKuliner(ContentValues values) {
		return crudDatabase.insert(NAMA_TABEL3, null, values);
	}
	
	public boolean updateWisataAlam(long rowId, ContentValues values) {
		return crudDatabase.update(NAMA_TABEL, values,
				Database.FIELD_ID + "=" + rowId, null) > 0;
	}
	
	public boolean updateWisataBudaya(long rowId, ContentValues values) {
		return crudDatabase.update(NAMA_TABEL2, values,
				Database.FIELD_ID2 + "=" + rowId, null) > 0;
	}
	
	public boolean updateWisataKuliner(long rowId, ContentValues values) {
		return crudDatabase.update(NAMA_TABEL3, values,
				Database.FIELD_ID3 + "=" + rowId, null) > 0;
	}
	
	public boolean hapusWisataAlam(long rowId) {
		return crudDatabase.delete(NAMA_TABEL,
				Database.FIELD_ID + "=" + rowId, null) > 0;
	}
	
	public boolean hapusWisataBudaya(long rowId) {
		return crudDatabase.delete(NAMA_TABEL2,
				Database.FIELD_ID2 + "=" + rowId, null) > 0;
	}
	
	public boolean hapusWisataKuliner(long rowId) {
		return crudDatabase.delete(NAMA_TABEL3,
				Database.FIELD_ID3 + "=" + rowId, null) > 0;
	}
	
	public Cursor bacaWisataAlam() {
		return crudDatabase.query(NAMA_TABEL,FIELD_TABEL,null, null, null, null,Database.FIELD_JUDUL + " ASC");
		
	}
	
	public Cursor bacaWisataBudaya() {
		return crudDatabase.query(NAMA_TABEL2,FIELD_TABEL2,null, null, null, null,Database.FIELD_JUDUL2 + " ASC");
		
	}
	
	public Cursor bacaWisataKuliner() {
		return crudDatabase.query(NAMA_TABEL3,FIELD_TABEL3,null, null, null, null,Database.FIELD_JUDUL3 + " ASC");
		
	}
	
	public Cursor bacaDataTerseleksi(long rowId) throws SQLException {
		Cursor cursor = crudDatabase.query(true, NAMA_TABEL,FIELD_TABEL,FIELD_ID + "=" + rowId,null, null, null, null, null);
		cursor.moveToFirst();
		return cursor;
	}
	
	public Cursor bacaDataTerseleksiterapi(long rowId) throws SQLException {
		Cursor cursor = crudDatabase.query(true, NAMA_TABEL2,FIELD_TABEL2,FIELD_ID2 + "=" + rowId,null, null, null, null, null);
		cursor.moveToFirst();
		return cursor;
	}

	public Cursor bacaDataTerseleksirawat(long rowId) throws SQLException {
		Cursor cursor = crudDatabase.query(true, NAMA_TABEL3,FIELD_TABEL3,FIELD_ID3 + "=" + rowId,null, null, null, null, null);
		cursor.moveToFirst();
		return cursor;
		
	}
		
	public ContentValues ambilWisataAlam(String tempat, String lat) {
		ContentValues values = new ContentValues();
		values.put(Database.FIELD_JUDUL, tempat);
		values.put(Database.FIELD_DESKRIPSI, lat);
		values.put(Database.FIELD_GAMBAR, R.drawable.agro_wisata_tambi);
		
		return values;
		
		}
	
	public ContentValues ambilWisataBudaya(String tempat, String lat) {
		ContentValues values = new ContentValues();
		values.put(Database.FIELD_JUDUL2, tempat);
		values.put(Database.FIELD_DESKRIPSI2, lat);
		values.put(Database.FIELD_GAMBAR2, R.drawable.rambut_gembel);
		
		return values;
		
		}
	
	public ContentValues ambilWisataKuliner(String tempat, String lat) {
		ContentValues values = new ContentValues();
		values.put(Database.FIELD_JUDUL3, tempat);
		values.put(Database.FIELD_DESKRIPSI3, lat);
		values.put(Database.FIELD_GAMBAR3, R.drawable.carica);
		
		return values;
		
	}
		    
		   
			
	
}
