package hildatul.wardah.submission_dicoding

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions



class ListCharAdapter(private val listChar: ArrayList<UniversityData>) : RecyclerView.Adapter<ListCharAdapter.ListViewHolder>(){
   inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       var name: TextView = itemView.findViewById(R.id.tvNameUniv)
       var picture: ImageView = itemView.findViewById(R.id.imgUniv)
       var score: TextView = itemView.findViewById(R.id.tvScore)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
       return listChar.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val context = holder.itemView.context
        val universityDate = listChar[position]
        Glide.with(holder.itemView.context)
            .load(universityDate.imgUniv)
            .apply(RequestOptions())
            .into(holder.picture)
        holder.name.text = universityDate.nameUniv
        holder.score.text = universityDate.score
        holder.itemView.setOnClickListener{
            val passItem = Intent(context, ActivityDetail::class.java)
            passItem.putExtra(ActivityDetail.EXTRA_NAME, universityDate.nameUniv)
            passItem.putExtra(ActivityDetail.EXTRA_IMG, universityDate.imgUniv)
            passItem.putExtra(ActivityDetail.EXTRA_SCORE, universityDate.score)
            passItem.putExtra(ActivityDetail.EXTRA_DESC, universityDate.desc)
            context.startActivity(passItem)
         /*   passItem.putExtra(ActivityDetail.EXTRA_HLI, universityDate.imgHilda)
            passItem.putExtra(ActivityDetail.EXTRA_MYNAME, universityDate.myName)
            passItem.putExtra(ActivityDetail.EXTRA_SHARE, universityDate.btnShare) */
        }
    }
}


