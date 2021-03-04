package com.iew.cstudio.joinline

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_edit_menu.*


class EditMenuActivity : AppCompatActivity() {

    private  lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_menu)
        supportActionBar?.hide()



        navController = findNavController(R.id.nav_menu_fragment)
        navController.setGraph(R.navigation.menu_navigation)

       // val menu: Menu = nav_menu_view.getMenu()
       // menu.add(Menu.NONE,1 , Menu.NONE, "自訂33123").setIcon(R.drawable.icon_history).setShowAsAction(
      //      MenuItem.SHOW_AS_ACTION_IF_ROOM);



        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_ItemOfficialMenu, R.id.navigation_ItemCustomMenu
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)




        //nav_menu_view.menu.findItem(R.id.navigation_ItemCustomMenu).isVisible = false



        nav_editMenu_view.setupWithNavController(navController)



       /* drawerView_comple.initCategory()

        imageView.setOnClickListener { myDrawer.openDrawer(GravityCompat.START)}*/
    }

    override fun onDestroy() {
        super.onDestroy()
       // drawerView_comple.onDestroy()
    }


}