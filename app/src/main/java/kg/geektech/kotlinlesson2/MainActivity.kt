package kg.geektech.kotlinlesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import kg.geektech.kotlinlesson2.extension.syncImage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var listOfImages = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addImages()
        generateImages()
        randomImage()
    }

    private fun randomImage() {
        url_random_button.setOnClickListener {
            url_image_activity_main.syncImage(listOfImages.random())
        }
    }

    private fun generateImages() {
        url_generate_button.setOnClickListener {
            val url = url_editText.text.toString()
            if (Patterns.WEB_URL.matcher(url).matches()) {
                listOfImages.add(url)
                url_image_activity_main.syncImage(url)
            }else Toast.makeText(this, getString(R.string.warning), Toast.LENGTH_LONG).show()

        }
    }


    private fun addImages() {
        listOfImages.add("https://p.bigstockphoto.com/vVu7XprxSayr867oA3KQ_bigstock-Colorful-fruit-pattern-of-fres-282127069.jpg")
        listOfImages.add("https://cdn.arstechnica.net/wp-content/uploads/2016/02/5718897981_10faa45ac3_b-640x624.jpg")
        listOfImages.add("https://tinypng.com/images/social/website.jpg")
        listOfImages.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ9R6WVd7lIJePzBBD2MiZRy511oh9ONh0H_w&usqp=CAU")
        listOfImages.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQoAEssp5xBCP420VJTAkFru3VTpDnHVnXzjg&usqp=CAU")
    }

}