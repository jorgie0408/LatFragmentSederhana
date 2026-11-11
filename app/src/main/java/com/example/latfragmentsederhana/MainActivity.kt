package com.example.latfragmentsederhana

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnFragmentSatu: Button
    private lateinit var btnFragmentDua: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referensi Button
        btnFragmentSatu = findViewById(R.id.btnFragmentSatu)
        btnFragmentDua = findViewById(R.id.btnFragmentDua)

        // Default Fragment
        if (savedInstanceState == null) {
            replaceFragment(fSatu())
        }

        // Membuka Fragment Satu
        btnFragmentSatu.setOnClickListener {
            replaceFragment(fSatu())
        }

        // Membuka Fragment Dua
        btnFragmentDua.setOnClickListener {
            replaceFragment(fDua())
        }
    }

    // Fungsi untuk mengganti Fragment
    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager

        val fragmentTransaction =
            fragmentManager.beginTransaction()

        fragmentTransaction.replace(
            R.id.fragment_container,
            fragment
        )

        fragmentTransaction.addToBackStack(null)

        fragmentTransaction.commit()
    }
}
