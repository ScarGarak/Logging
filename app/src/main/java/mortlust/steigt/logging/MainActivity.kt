package mortlust.steigt.logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import mortlust.steigt.logging.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var B: ActivityMainBinding
    private var ausgabe = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        B = ActivityMainBinding.inflate(layoutInflater)
        setContentView(B.root)

        for(number in 1 .. 6) {
            Log.d("onCreate()", "Number: $number")
            outputNumber(number)
        }
        B.tvOutput.text = ausgabe
    }

    private fun outputNumber(i: Int) {
        if(i % 2 == 0) {
            Log.d("outputNumber()", "% == 0")
            outputStraight()
        } else {
            Log.d("outputNumber()", "% != 0")
            outputOdd()
        }
    }

    private fun outputStraight() {
        Log.d("outputStraight()", "straight")
        ausgabe += "straight\n"
    }

    private fun outputOdd() {
        Log.d("outputOdd()", "odd")
        ausgabe += "odd\n"
    }
}