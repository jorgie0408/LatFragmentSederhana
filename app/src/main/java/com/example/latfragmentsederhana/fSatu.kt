package com.example.latfragmentsederhana

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class fSatu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_f_satu,
            container,
            false
        )
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        val btnOpenFSatu =
            view.findViewById<Button>(R.id.btnOpenFSatu)

        btnOpenFSatu.setOnClickListener {

            val fragmentManager = parentFragmentManager

            val fragmentTransaction =
                fragmentManager.beginTransaction()

            val fragmentDua = fDua()

            fragmentTransaction.replace(
                R.id.fragment_container,
                fragmentDua
            )

            fragmentTransaction.commit()
        }
    }
}
