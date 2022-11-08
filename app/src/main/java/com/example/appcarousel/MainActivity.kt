package com.example.appcarousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.OnItemClickListener

class MainActivity : AppCompatActivity() {

    val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carousel: ImageCarousel = findViewById(R.id.carousel)

        list.add(CarouselItem("https://omargamboa.com/wp-content/uploads/2020/10/omargamboa-pikachu.jpg","Pikachu"))
        list.add(CarouselItem("https://assets.stickpng.com/images/580b57fcd9996e24bc43c32a.png", "escuartule"))
        list.add(CarouselItem("https://i.pinimg.com/originals/cd/69/3e/cd693e769495d644302de8592fcae7d0.gif", "charmander"))
        list.add(CarouselItem("https://i.pinimg.com/originals/3b/78/47/3b7847675982776e5219e12a680ecd84.png", "bolbasory"))
        list.add(CarouselItem("https://omargamboa.com/wp-content/uploads/2020/10/omargamboa-pikachu.jpg", "Pikachu"))
        list.add(CarouselItem("https://assets.stickpng.com/images/580b57fcd9996e24bc43c32a.png", "escuartule"))

        // Item click listener
        carousel.onItemClickListener = object : OnItemClickListener {
            override fun onClick(position: Int, carouselItem: CarouselItem) {
                Toast.makeText(this@MainActivity, "Imagen ${carouselItem.caption}", Toast.LENGTH_SHORT).show()
            }

            override fun onLongClick(position: Int, dataObject: CarouselItem) {
                // ...
            }

        }

        carousel.addData(list)

    }
}