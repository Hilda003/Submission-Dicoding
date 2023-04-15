package hildatul.wardah.submission_dicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val actionbar = supportActionBar
        actionbar!!.title = "About"
        actionbar.setDisplayHomeAsUpEnabled(true)


    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}