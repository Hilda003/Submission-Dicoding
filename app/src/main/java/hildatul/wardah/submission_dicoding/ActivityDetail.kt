package hildatul.wardah.submission_dicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class ActivityDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvCharNameUniv: TextView = findViewById(R.id.tvNameUniv)
        val tvScore: TextView = findViewById(R.id.tvScore)
        val tvDesc: TextView = findViewById(R.id.tvDesc)
        val tvImg: ImageView = findViewById(R.id.imgUniv)
       /*  val tvImgHilda: ImageView = findViewById(R.id.imgHilda)
        val tvMyName: TextView = findViewById(R.id.tvMyName)
        val btnShare: Button = findViewById(R.id.btnShare)
        var btn =false */


        val nameUniv = intent.getStringExtra(EXTRA_NAME)
        val score = intent.getStringExtra(EXTRA_SCORE)
        val desc = intent.getStringExtra(EXTRA_DESC)
        val img = intent.getIntExtra(EXTRA_IMG, 0)
      /*  val hli = intent.getIntExtra(EXTRA_HLI, 0)
        val myName = intent.getStringExtra(EXTRA_MYNAME)
        val shareBtn = intent.getStringExtra(EXTRA_SHARE) */

        tvCharNameUniv.text = nameUniv
        tvScore.text = score
        tvDesc.text = desc
        Glide.with(this)
            .load(img)
            .apply(RequestOptions())
            .into(tvImg)


     /*   btnShare.setOnClickListener{
           val shareBtn = Intent()
            shareBtn.action = Intent.ACTION_SEND
            startActivity(Intent.createChooser(shareBtn, "Share to: "))
        } */
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_SCORE = "extra_score"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_IMG = "extra_img"
      /*  const val EXTRA_HLI = "extra_hli"
        const val EXTRA_MYNAME = "extra_myname"
        const val EXTRA_SHARE = "extra_share" */
    }
}