package com.example.documents

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.documents.databinding.ActivityMainBinding
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem

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
                    .withName("1")
                    .withSelectable(false),
                PrimaryDrawerItem()
                    .withIdentifier(101)
                    .withName("2")
                    .withSelectable(false),
                PrimaryDrawerItem()
                    .withIdentifier(102)
                    .withName("3")
                    .withSelectable(false),
                PrimaryDrawerItem()
                    .withIdentifier(103)
                    .withName("4")
                    .withSelectable(false),
                PrimaryDrawerItem()
                    .withIdentifier(104)
                    .withName("5")
                    .withSelectable(false),
                PrimaryDrawerItem()
                    .withIdentifier(105)
                    .withName("6")
                    .withSelectable(false),
                PrimaryDrawerItem()
                    .withIdentifier(106)
                    .withName("7")
                    .withSelectable(false)
            ).withOnDrawerItemClickListener(object : Drawer.OnDrawerItemClickListener {
                override fun onItemClick(
                    view: View?,
                    position: Int,
                    drawerItem: IDrawerItem<*>
                ): Boolean {
                    Toast.makeText(applicationContext, position.toString(), Toast.LENGTH_SHORT).show() // actions when click on menus elem
                    return false
                }
            }).build()
    }

    private fun initFields() {
        mToolbar = mBinding.mainToolbar
    }
}
