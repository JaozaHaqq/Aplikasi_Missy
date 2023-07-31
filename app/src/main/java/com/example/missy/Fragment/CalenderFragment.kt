package com.example.missy.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CalendarView
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.missy.MoodActivity
import com.example.missy.R
import com.google.firebase.database.FirebaseDatabase
import java.text.SimpleDateFormat
import java.util.Date

class CalenderFragment : Fragment() {
    // TODO: Rename and change types of parameters
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_calender, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val database = FirebaseDatabase.getInstance()
        val reference = database.reference.child("Data")

        val btnSimpan: Button = view.findViewById(R.id.buttonSave)
        val calendarView: CalendarView = view.findViewById(R.id.calendarView)

        btnSimpan.setOnClickListener {
            val inputSuasanaHati = view.findViewById<EditText>(R.id.inputSH).text.toString()
            val inputBeratBadan = view.findViewById<EditText>(R.id.inputBB).text.toString()

            if (inputSuasanaHati.isEmpty() || inputBeratBadan.isEmpty()) {
                Toast.makeText(context, "Isi Datamu Terlebih Dahulu", Toast.LENGTH_SHORT).show()
            } else {
                val key = reference.push().key ?: return@setOnClickListener
                val data = HashMap<String, Any>()
                data["keySH"] = inputSuasanaHati
                data["keyBB"] = inputBeratBadan

                val selectedDate = calendarView.date

                val dateFormat = SimpleDateFormat("dd/MM/yyyy")
                val formattedDate = dateFormat.format(Date(selectedDate))

                data["selectedDate"] = formattedDate

                reference.child(key).setValue(data)
                    .addOnSuccessListener {
//                        val intent = Intent(context, MoodActivity::class.java)
//                        startActivity(intent)
                    }
                    .addOnFailureListener {
                        Toast.makeText(context, "Failed to save data", Toast.LENGTH_SHORT).show()
                    }
            }
        }
    }
}
