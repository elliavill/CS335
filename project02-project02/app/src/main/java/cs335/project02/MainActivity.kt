package cs335.project02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var BradleyTower : Button
    private lateinit var Coberly : Button
    private lateinit var DixonTower : Button
    private lateinit var RiceTower : Button
    private lateinit var YoungTower : Button
    private val Building = Building()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("myLastName", "onCreate()")




        setContentView(R.layout.activity_main)

        BradleyTower = findViewById(R.id.Bradley)
        Coberly = findViewById(R.id.Coberly)
        DixonTower = findViewById(R.id.Dixon)
        RiceTower = findViewById(R.id.Rice)
        YoungTower = findViewById(R.id.Young)

        BradleyTower.setOnClickListener{View ->

        }


        Coberly.setOnClickListener{View ->

        }


        DixonTower.setOnClickListener{View ->

        }

        RiceTower.setOnClickListener{View ->

        }


        YoungTower.setOnClickListener{View ->

        }




    }

    override fun onStart() {
        super.onstart()
        Log.d("myLastName", "onStart()")
    }

    override fun onPause() {
        super.onResume()
        Log.d("myLastName", "onResume()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("myLastName", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("myLastName", "onDestroy()")
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState("", )
    }




}