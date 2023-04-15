package com.example.bossbirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val buttonclock = findViewById<Button>(R.id.btnclock)
        val buttonmemory = findViewById<Button>(R.id.btnmemory)
        val buttonmessage = findViewById<Button>(R.id.mssgbtn)

        buttonclock.setOnClickListener {
            replaceFrameWithFragment(Clock_Fragment())
        }

        buttonmemory.setOnClickListener {
            replaceFrameWithFragment(Memory_Fragment())
        }
        buttonmessage.setOnClickListener {
            replaceFrameWithFragment(Message_Fragment())
        }

    }



    private fun replaceFrameWithFragment(frag:Fragment) {

        val fragmanager = supportFragmentManager
        val fragTransaction = fragmanager.beginTransaction()
        fragTransaction.replace(R.id.framelayout,frag)
        fragTransaction.commit()
    }


}