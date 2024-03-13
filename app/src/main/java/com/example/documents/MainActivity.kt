package com.example.documents

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.documents.databinding.ActivityMainBinding
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mDrawer: Drawer
    private lateinit var mToolbar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

    }

    override fun onStart() {
        super.onStart()
    initFields()
        initFunc()
    }

    private fun initFunc() {
        setSupportActionBar(mToolbar)
        createDrawer()
    }

    private fun createDrawer() {
        mDrawer = DrawerBuilder()
            .withActivity(this)
            .withToolbar(mToolbar)
            .withActionBarDrawerToggle(true) //burger
            .withSelectedItem(-1)
            .addDrawerItems( //elemets of menu
                PrimaryDrawerItem()
                    .withIdentifier(100)
                    .withName("First elem")
                    .withSelectable(false),
                PrimaryDrawerItem()
                    .withIdentifier(101)
                    .withName("First elem")
                    .withSelectable(false),
                PrimaryDrawerItem()
                    .withIdentifier(102)
                    .withName("First elem")
                    .withSelectable(false)
            ).build()
    }

    private fun initFields() {
        mToolbar = mBinding.mainToolbar
    }


}
