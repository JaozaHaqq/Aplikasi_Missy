package com.example.missy
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.missy.Fragment.CalenderFragment
import com.example.missy.Fragment.HomeFragment
import com.example.missy.Fragment.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.FirebaseApp

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this)
        setContentView(R.layout.activity_main)

        val homefragment = HomeFragment()
        val calender = CalenderFragment()
        val profileFragment = ProfileFragment()

        val navbar = findViewById<BottomNavigationView>(R.id.Navbar)
        makecurrentfragment(homefragment)

        navbar.setOnNavigationItemReselectedListener{
            when(it.itemId){
                R.id.home ->makecurrentfragment(homefragment)
                R.id.myCalendar ->makecurrentfragment(calender)
                R.id.profile ->makecurrentfragment(profileFragment)
            }
            true
        }
    }

    private fun makecurrentfragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.framenavbar, fragment)
            commit()
        }


    }
}