package hildatul.wardah.submission_dicoding

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UniversityData(
    var imgUniv: Int = 0,
    var nameUniv: String = "",
    var score: String = "",
    var desc: String = "",

   /* var imgHilda: Int = 0,
    var myName: String = "",
    var btnShare: String = "" */
) : Parcelable

