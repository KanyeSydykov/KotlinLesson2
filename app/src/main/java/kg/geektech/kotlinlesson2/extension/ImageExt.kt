package kg.geektech.kotlinlesson2.extension

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide


fun View.syncImage(image: String) {
    Glide.with(this).load(image).into(this as ImageView)

}