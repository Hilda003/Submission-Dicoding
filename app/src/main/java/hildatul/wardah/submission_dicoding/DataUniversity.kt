package hildatul.wardah.submission_dicoding

object DataUniversity {
    private val database = arrayOf(
        arrayOf(
            "University of Oxford, Inggris",
            "Score: 95.7 ",
            "Kampus yang dipercaya berdiri sejak 1096 ini membagi keilmuan yang diajarkan ke dalam empat divisi, yaitu Humanities, " +
                    "Mathematical, Physical and Life Sciences, Medical Sciences, dan Social Sciences. " +
                    "Totalnya, terdapat sekitar 100 jurusan yang dimiliki universitas yang didapuk sebagai " +
                    "kampus terbaik di dunia pada tahun 2022 oleh THE.",
                    R.drawable.oxford,

        ),
        arrayOf(
            "California Institute of Technology (Caltech), Amerika Serikat",
            "Score: 95 ",
            "Sesuai namanya, Caltech merupakan salah satu kampus teknologi yang kuat di bidang sains dan teknologi. " +
                    "Beberapa jurusan yang dimiliki kampus ini meliputi Biologi, Kimia dan Teknik Kimia, Teknik dan Sains Terapan, " +
                    "Ilmu Geologi dan ilmu Planet, Humaniora dan Ilmu Sosial, Fisika Matematika dan Astronomi.",
            R.drawable.california,

        ),
        arrayOf(
            "Harvard University, Amerika Serikat",
            "Score: 95.0",
            "Kampus yang menjadi tempat mantan presiden Amerika Serikat, Barack Obama menempuh pendidikan ini punya 40 departments.",
            R.drawable.harvard,

        ),
        arrayOf(
            "Stanford University, Amerika Serikat",
            "Score: 94.9",
            "Kampus yang berdiri sejak 1952 ini bahkan sudah memenangkan hadiah Nobel hingga 20 kali.",
            R.drawable.stanford
        ),
        arrayOf(
            "University of Cambridge, Inggris",
            "Score: 94.6",
            "Didirikan pada tahun 1209, University of Cambridge memiliki lebih dari 100 departments hingga saat ini.",
            R.drawable.cambridge
        ),
        arrayOf(
            "Massachusetts Institute of Technology, Amerika Serikat",
            "Score: 94.6",
            " MIT memiliki 5 departemen utama, yaitu The Department of Architecture, The Department of Urban Studies + Planning, " +
                    "The Media Laboratory, The Center for Real Estate dan The Program in Art, Culture and Technology.",
            R.drawable.massachusetts

        ),
        arrayOf(
            "Princeton University, Amerika Serikat",
            "Score: 93.6",
            " Kampus yang terletak di salah satu kota bersejarah ini menempati peringkat keempat perguruan tinggi paling tua di Amerika Serikat " +
                    "dengan dua program sarjana, yakni Bachelor of Science in Engineering (B.S.E.) dan Bachelor of Arts (A.B.)",
            R.drawable.princeton
        ),
        arrayOf(
            "University of California, Amerika Serikat",
            "Score: 92.2",
            "Beberapa jurusan yang populer pada UCLA yaitu Biology, Business Economics, Film & Televisions, Political Science, dan Psychology.",
            R.drawable.california
        ),
        arrayOf(
            "Yale University, Amerika Serikat",
            "Score: 90.8",
            "Kampus yang termasuk dalam Ivy League atau kampus bergengsi di Amerika Serikat ini memiliki lebih dari 100 departments.",
            R.drawable.yale
        ),
        arrayOf(
            "University of Chicago, Amerika Serikat",
            "Score: 89.8",
            "Kampus yang terletak di negara bagian Illinois ini memiliki 14 jurusan yang bisa Anda sesuai minat dan bakat.",
            R.drawable.chicago
        )
    )

    val listData: ArrayList<UniversityData>
        get() {
            val list = ArrayList<UniversityData>()
            for (data in database) {
                val universityData = UniversityData()
                universityData.imgUniv = data[3] as Int
                universityData.nameUniv = data[0] as String
                universityData.score = data[1] as String
                universityData.desc = data[2] as String
                list.add(universityData)
            }
            return list
        }


}