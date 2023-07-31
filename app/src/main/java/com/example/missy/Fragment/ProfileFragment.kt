package com.example.missy.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.missy.MainActivity
import com.example.missy.R
import com.google.firebase.auth.FirebaseAuthException
import com.google.firebase.database.FirebaseDatabase

class ProfileFragment : Fragment() {

    private lateinit var authException: FirebaseAuthException

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val database = FirebaseDatabase.getInstance()
        val reference = database.reference.child("Profil")

        val btnSimpan = view.findViewById<Button>(R.id.button)

        btnSimpan.setOnClickListener{
            val contentNama = view.findViewById<EditText>(R.id.inputnama).text.toString()
            val contentAlamat = view.findViewById<EditText>(R.id.inputalamat).text.toString()
            val contentTglLahir = view.findViewById<EditText>(R.id.inputtanggallahir).text.toString()
            val contentNotelp = view.findViewById<EditText>(R.id.inputtelepon).text.toString()
            val contentEmail = view.findViewById<EditText>(R.id.inputemail).text.toString()

            if(contentNama.equals("") || contentAlamat.equals("") || contentTglLahir.equals("") || contentNotelp.equals("") || contentEmail.equals("")){
                Toast.makeText(context, "Isi Data Terlebih Dahulu", Toast.LENGTH_SHORT).show()
            }else{
                val key = reference.push().key ?: return@setOnClickListener
                val data = HashMap<String, Any>()
                data["keyNama"] = contentNama
                data["keyAlamat"] = contentAlamat
                data["keyTglLahir"] = contentTglLahir
                data["keyNoTelp"] = contentNotelp
                data["keyEmail"] =  contentEmail

                Toast.makeText(context, "Simpan Berhasil", Toast.LENGTH_SHORT).show()
//                findNavController().navigate(R.id.action_home2_to_profile, bundle)

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