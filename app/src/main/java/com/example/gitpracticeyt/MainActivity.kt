package com.example.gitpracticeyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("This is CONTAINED in MY Second commit")

        println("Change 3 commit")
        println("After Changes 2.1")

        println("This line will be merged")

        println("Hello from your friend")
    }

}