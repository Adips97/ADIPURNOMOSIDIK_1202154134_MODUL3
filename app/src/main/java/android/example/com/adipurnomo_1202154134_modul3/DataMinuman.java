package android.example.com.adipurnomo_1202154134_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


    public class DataMinuman {
        //inisiasi String dan int
        private String nama, info, deskripsi;
        private int gambar;

        public DataMinuman(String nama, String info, String deskripsi, int gambar) {
            this.nama = nama;
            this.info = info;
            this.deskripsi = deskripsi;
            this.gambar = gambar;
        }

        public static Intent toClick(Context context, String title, String desc, @DrawableRes int img){
            Intent in = new Intent(context, DetailMinuman.class); // pindah ke activity DetailMinuman
            in.putExtra("EXTRA_TITLE",title); // menampilkan judul minuman di DetailMinuman
            in.putExtra("EXTRA_DESC",desc); // menampilkan Deskripsi minuman di DetailMinuman
            in.putExtra("EXTRA_IMG",img);  // menampilkan Gambar minuman di DetailMinuman
            return in;
        }

        // Method untuk menampilkan nilai dari Nama
        public String getNama() {
            return nama;
        }
        //method untuk mengembalikan atau mengubah nilai dari Nama
        public void setNama(String nama) {
            this.nama = nama;
        }
        // Method untuk menampilkan nilai
        public String getInfo() {
            return info;
        }
        //method untuk mengembalikan atau mengubah nilai
        public void setInfo(String info) {
            this.info = info;
        }
        // Method untuk menampilkan nilai
        public String getDeskripsi() {
            return deskripsi;
        }
        //method untuk mengembalikan atau mengubah nilai
        public void setDeskripsi(String deskripsi) {
            this.deskripsi = deskripsi;
        }
        // Method untuk menampilkan nilai
        public int getGambar() {
            return gambar;
        }
        //method untuk mengembalikan atau mengubah nilai
        public void setGambar(int gambar) {
            this.gambar = gambar;
        }
    }