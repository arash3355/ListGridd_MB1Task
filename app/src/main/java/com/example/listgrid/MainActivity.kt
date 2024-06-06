package com.example.listgrid

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

val recycleView = findViewById<RecyclerView>(R.id.recycler_view)
//                recycleView.layoutManager = LinearLayoutManager( this)
        recycleView.layoutManager = GridLayoutManager(this, 2)
        recycleView.setHasFixedSize(true)

        val itemList = listOf(

            ItemList(  "Kantong",  "Kantong untuk menyimpan perlengkapan",
                "https://target.scene7.com/is/image/Target/GUEST_b6df4243-05c0-4a59-a718-6c97832212a9?wid=488&hei=488&fmt=pjpeg"),
            ItemList( "Topi", "Topi untuk melindungi kepala dari panas",
                "https://m.media-amazon.com/images/I/81yhndDMvfL._AC_UY1000_.jpg"),
            ItemList( "waist bag", "waist bag untuk menyimpanan perlengkapan kecil",
                "https://torch.id/cdn/shop/products/sokchohitam2.jpg?v=1679311669"),
            ItemList( "Jaket", "jaket untuk melindungi badan dari panas atau dingin",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSaY_CSeMLb3NHJkRvH7dgMzEO3OScHnRMmjQ&s")

        )
        val adapter= AdapterList(itemList)
        recycleView.adapter = adapter
    }
}