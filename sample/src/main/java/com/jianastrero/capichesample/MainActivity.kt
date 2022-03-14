package com.jianastrero.capichesample

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.jianastrero.capiche.doIHave
import com.jianastrero.capiche.iNeed

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doIHave(
            Manifest.permission.CAMERA,
            onGranted = {
                findViewById<TextView>(R.id.tvCameraStatus).setText(R.string.camera_enabled)
            },
            onDenied = {
                findViewById<TextView>(R.id.tvCameraStatus).setText(R.string.camera_disabled)
            }
        )
    }

    fun requestCamera(view: View) {
        iNeed(
            Manifest.permission.CAMERA,
            onGranted = {
                findViewById<TextView>(R.id.tvCameraStatus).setText(R.string.camera_enabled)
            },
            onDenied = {
                findViewById<TextView>(R.id.tvCameraStatus).setText(R.string.camera_disabled)
            }
        )
    }
}