package hildatul.wardah.submission_dicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvChar: RecyclerView
    private var list: ArrayList<UniversityData> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionbar = supportActionBar
        actionbar!!.title = "University Top World"

        rvChar = findViewById(R.id.rv_char)
        rvChar.setHasFixedSize(true)


        list.addAll(DataUniversity.listData)
        rvChar.layoutManager = LinearLayoutManager(this)
        val listCharAdapter = ListCharAdapter(list)
        rvChar.adapter = listCharAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when(selectedMode)
        {
            R.id.about -> {
                val goAbout = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(goAbout)
            }

        }
    }
}