package android.example.com.adipurnomo_1202154134_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailMinuman extends AppCompatActivity {

        private Button btnAdd, btnMin; //Membuat object dari class Button
        private ImageView progress, lblImg; //Membuat object dari class ImageView
        private TextView lblJudul, lblDesc, lblStats; //Membuat object dari class TextView
        private int level =0; //inisiasi int

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail_minuman);

            btnAdd = findViewById(R.id.btnIsiTambah); //Memanggil ID Button
            btnMin = findViewById(R.id.btnIsiKurang); //Memanggil ID Button
            progress = findViewById(R.id.isibotol); //Memanggil ID isibotol

            lblJudul = findViewById(R.id.JudulDetail); //Memanggil ID TextView
            lblDesc = findViewById(R.id.DeskripsiDetail); //Memanggil ID TextView
            lblImg = findViewById(R.id.logomerk); //Memanggil ID TextView
            lblStats = findViewById(R.id.Status); //Memanggil ID TextView

            Intent in = getIntent();
            String title=in.getStringExtra("etitle");
            String description=in.getStringExtra("edesc");
            if(description.length()<1){description="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin ut tincidunt dui. Etiam et tincidunt dolor. Phasellus eu rhoncus sem. Suspendisse laoreet dolor eu nisi dictum congue id ut ipsum. Etiam sagittis sodales urna. Sed condimentum arcu at pretium laoreet. Nam venenatis leo sit amet sodales malesuada. Morbi quis convallis lorem, quis malesuada elit. Integer suscipit mauris et ex finibus, id aliquam nisi maximus. Quisque lacinia suscipit ipsum, in posuere elit eleifend vel. Vestibulum vehicula, est ac interdum tristique, elit odio volutpat ex, eu eleifend erat dolor a mauris.\nInterdum et malesuada fames ac ante ipsum primis in faucibus. Nunc sagittis sagittis orci, a mollis justo ultrices id. Vestibulum a neque eget magna ultricies posuere eget ut sem. Nunc egestas vestibulum metus. Praesent et mi quis dolor pellentesque mattis quis eu turpis. Nunc convallis quis elit vitae ornare. Sed venenatis sed lorem eget posuere. Nam lobortis diam dui, et sollicitudin velit faucibus quis. Donec sit amet neque non diam aliquam imperdiet.\n";}
            int imgRes = in.getIntExtra("eimg",0);

            // membuat fungsi untuk menampilkan judul dan gambar minuman
            setTitle(title);
            lblJudul.setText(title);
            lblDesc.setText(description);
            lblImg.setImageResource(imgRes);

            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tambahIsi();
                }
            }); // memberikan action ketika ImageButton di klik
            btnMin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    kurangIsi();
                }
            }); // memberikan action ketika ImageButton di klik
        }

        // menambahkan fungsi pada onClik ImageButton
        public void tambahIsi(){
            status();
            if(level==6){
                Toast.makeText(this,"Air Penuh",Toast.LENGTH_SHORT).show();return;} // menampilkan toas
            progress.setImageLevel(++level); // membuat fungsi untuk mengurangi isi air
        }

        // menambahkan fungsi pada onClik ImageButton
        public void kurangIsi(){
            status();
            if(level==0){Toast.makeText(this,"Air Sedikit",Toast.LENGTH_SHORT).show();return;} // menampilkan toas
            progress.setImageLevel(--level); // membuat fungsi untuk mengurangi isi air
        }

        public void status(){
            lblStats.setText(""+level+"L");
        }
    }