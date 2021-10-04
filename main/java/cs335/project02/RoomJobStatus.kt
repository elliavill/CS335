package cs335.project02

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RoomJobStatus : AppCompatActivity() {

    private lateinit var room_job: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roomjob)


        var whatever = intent.getBooleanExtra("roomJobStatus", true)

        room_job = findViewById(R.id.room_job)

        val data = Intent()
        data.putExtra("studentRoomJob", "Test")
        setResult(Activity.RESULT_OK, data)
    }

    companion object {
        fun newIntent (requestor: Context, answer: Boolean): Intent {
            return Intent(requestor, RoomJobStatus::class.java).apply {
                putExtra("ourMessage", answer)
            }
        }
    }
}