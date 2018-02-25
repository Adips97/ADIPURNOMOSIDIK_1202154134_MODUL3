package android.example.com.adipurnomo_1202154134_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMinuman extends AppCompatActivity {

    //inisiasi class
    private RecyclerView recyclerView;
    private MinumanAdapter mAdapter;

    //inisiasi Array
    public static ArrayList<DataMinuman> DATAS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        DATAS = isi();
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList1); //Memanggil ID RecyclerView

        // menampilkan class MinumanAdapter
        mAdapter = new MinumanAdapter(DATAS);
        recyclerView.setAdapter(mAdapter);

        // membuat block block untuk daftarminuman
        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));
    }

    // membuat isi Array
    public ArrayList<DataMinuman> isi(){
        ArrayList<DataMinuman> data = new ArrayList<>();
        data.add(new DataMinuman("Aqua","Ini adalah AMDK merk AQUA","Aqua adalah air minum kemasan yang didirikan oleh Tirto Utomo, warga asli Wonosobo pada 1973. Tirto mendirikan pabrik pertamanya di Pondok Ungu, Bekasi, dengan nama Golden Missisippi. Kapasitas awal pabrik itu enam juta liter per tahun. Tirto sempat ragu dengan nama Golden Missisippi akhirnya mengganti dengan nama Aqua karena cocok terhadap label air minum dalam botol serta tidak sulit untuk diucapkan. ",R.drawable.aqua));
        data.add(new DataMinuman("Amidis","Ini adalah AMDK merk AMIDIS","",R.drawable.amidis));
        data.add(new DataMinuman("Cleo","Ini adalah AMDK merk CLEAO","",R.drawable.cleo));
        data.add(new DataMinuman("Club","Ini adalah AMDK merk CLUB","Club adalah produk perusahaan Grup Tirta Bahagia (TB) yang berdiri sejak akhir 80an. Saat ini, perusahaan itu telah di akuisisi oleh  PT Indofood CBP Sukses Makmur Tbk (ICBP) melalui dua anak usahanya PT Tirta Makmur Perkasa (TMP) dan PT Tirta Sukses Perkasa (TSP) sebesar Rp 2,2 triliun. Air minum ini awalnya hanya di pasarkan di Jawa Timur, Sekarang kita bisa melihatnya dimana-mana.",R.drawable.club));
        data.add(new DataMinuman("Equil","Ini adalah AMDK merk EQUIL","Equil adalah air minum yang cukup terkenal di kalangan menengah atas dan ekspatriat. Morgen Sutanto adalah pendiri  PT. Equilindo Lestari dan memulai usahanya tahun 1997. Ia melihat potensi air mineral murni cukup luas terbuka lebar. Para produsen lokal saat itu hanya bermain dalam produk air minum dalam kemasan (AMDK). Untuk air mineral premium masih dikuasai produk impor. Indonesia kaya akan mata air, akan sangat ironis kalau air pun harus mengimpor. Sekarang kita bisa melihat Equil hadir di meja restoran, hotel bintang lima, hingga meja Istana Negara saat rapat kabinet.",R.drawable.equil));
        data.add(new DataMinuman("Evian","Ini adalah AMDK merk EVIAN","",R.drawable.evian));
        data.add(new DataMinuman("Le Minerale","Ini adalah AMDK merk LE MINERALE","",R.drawable.leminerale));
        data.add(new DataMinuman("Nestle","Ini adalah AMDK merk NESTLE","Dulu Nestle PureLife bernama Aberfoyle Springs karena diproduksinya oleh Aberfoyle Springs sejak tahun 1993. Namun pada 2002, Nestle membelinya dan mengganti namanya menjadi pun dilakukan menjadi Nestle Pure Life Natural Spring Water. Penjualan produk ini mencapai 5 juta air per hari. Hal yang menarik dari Nestle adalah dari proses pemurnian airnya. Begitupun dengan botol-botolnya, hingga mengalami 12 langkah pemurnian dan peningkatan kualitas.",R.drawable.nestle));
        data.add(new DataMinuman("Pristine","Ini adalah AMDK merk PRISTINE","",R.drawable.pristine));
        data.add(new DataMinuman("Vit","Ini adalah AMDK merk VIT","",R.drawable.vit));
        return data;
    }
}