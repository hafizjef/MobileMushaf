package com.hafizjef.mobilemushaf.ui.main

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.dekoservidoni.omfm.OneMoreFabMenu
import com.hafizjef.mobilemushaf.R
import com.hafizjef.mobilemushaf.ui.fragment.MainFragment
import com.hafizjef.mobilemushaf.ui.fragment.ReportFragment
import com.hafizjef.mobilemushaf.utils.replaceFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener, OneMoreFabMenu.OptionsClick {

    override fun onOptionClick(optionId: Int?) {
        var text = ""
        when(optionId) {
            R.id.capture_from_camera -> text = "Camera Clicked"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(this, drawer_layout, toolbar, R.string.navigation_drawer_open,
                                                    R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        val navigationView = nav_view
        navigationView.setNavigationItemSelectedListener(this)

        fab.setOptionsClick(this@MainActivity)

        replaceFragment(MainFragment.newInstance(), R.id.fragment_container)
    }


    override fun onBackPressed() {
        val drawer = drawer_layout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val id = item.itemId
        when (id) {
            R.id.nav_verify -> replaceFragment(MainFragment.newInstance(), R.id.fragment_container)
            R.id.nav_report -> replaceFragment(ReportFragment.newInstance(), R.id.fragment_container)
            R.id.nav_setting -> {}
        }

        val drawer = drawer_layout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
}
