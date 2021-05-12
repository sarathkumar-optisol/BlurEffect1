package com.droid.blureffect1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.blurlibrary.BlurRelativeLayout


class MainActivity : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val blurRelativeLayoutXml = findViewById<BlurRelativeLayout>(R.id.blrlayout)


        blurRelativeLayoutXml.setBlurRadius(250)

    }


}



