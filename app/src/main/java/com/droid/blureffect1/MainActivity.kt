package com.droid.blureffect1

import android.content.Context
import android.content.res.TypedArray
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import org.blurlibrary.BlurRelativeLayout
import org.blurlibrary.BlurRenderer
import java.security.AccessController.getContext


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val blrLayout = findViewById<BlurRelativeLayout>(R.id.blrlayout)
        val blurbtn = findViewById<ImageView>(R.id.btnBlur)
//        val TopView = findViewById<LinearLayout>(R.id.BlurView)


//    BlurRenderer(blurbtn).applyBlur()

        blrLayout.setBlurRadius(200)

//        BlurRenderer(blrLayout).applyBlur()

//    BlurRenderer(blrLayout).apply {
//
//        setBlurRadius(50)
//
//    }


    }

}



