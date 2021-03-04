package com.iew.cstudio.joinline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_history.*



class HistoryActivity : AppCompatActivity() {

    private  lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        supportActionBar?.hide()

        navController = findNavController(R.id.nav_history_fragment)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_ItemOrderHistory, R.id.navigation_ItemActivityHistory, R.id.navigation_ItemQuestionnaireHistory
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)

        nav_history_view.setupWithNavController(navController)






    }



}