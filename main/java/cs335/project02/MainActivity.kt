package cs335.project02

// import android.content.ClipData.newIntent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var radioGroup : RadioGroup
    private lateinit var radioButton1: RadioButton
    private lateinit var radioButton2: RadioButton
    private lateinit var radioButton3: RadioButton
    private lateinit var radioButton4: RadioButton
    private lateinit var radioButton5: RadioButton
    private lateinit var nextButton: Button
    private val roomJob = RoomJobStatus()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById(R.id.radioGroup2)
        radioButton1 = findViewById(R.id.radioButton1)
        radioButton2 = findViewById(R.id.radioButton2)
        radioButton3 = findViewById(R.id.radioButton3)
        radioButton4 = findViewById(R.id.radioButton4)
        radioButton5 = findViewById(R.id.radioButton5)
        nextButton = findViewById(R.id.nextButton)

        // only test to see if it's working
        radioGroup.setOnCheckedChangeListener { group, checkedId->

            if (checkedId == R.id.radioButton1)
                Toast.makeText(this, radioButton1.text.toString(), Toast.LENGTH_SHORT).show()

            if (checkedId == R.id.radioButton2)
                Toast.makeText(this, radioButton2.text.toString(), Toast.LENGTH_SHORT).show()

            if (checkedId == R.id.radioButton3)
                Toast.makeText(this, radioButton3.text.toString(), Toast.LENGTH_SHORT).show()

            if (checkedId == R.id.radioButton4)
                Toast.makeText(this, radioButton4.text.toString(), Toast.LENGTH_SHORT).show()

            if (checkedId == R.id.radioButton5)
                Toast.makeText(this, radioButton5.text.toString(), Toast.LENGTH_SHORT).show()
        }

        nextButton.setOnClickListener{ view: View ->
            val x = RoomJobStatus.newIntent(this, true)
            startActivity(x)


        }
    }

    override fun onStart(){
        super.onStart()
        Log.d("Villyani", "onStart()")
    }

    override fun onResume(){
        super.onResume()
        Log.d("Villyani", "onResume()")
    }

    override fun onPause(){
        super.onPause()
        Log.d("Villyani", "onPause()")
    }

    override fun onStop(){
        super.onStop()
        Log.d("Villyani", "onStop()")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d("Villyani", "onDestroy()")
    }
}