package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    var numberList = mutableListOf<Int>()
    for (i in 1 .. 100) {
        if (i % 2 == 0)
            numberList.add(i)
    }
    println (numberList)


    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini
    val months = mapOf<String,String>(
      "jan" to "januari",
        "feb" to "februari",
        "mar" to "maret",
        "apr" to "april",
        "mei" to "mei",
        "jun" to "juni",
        "jul" to "juli",
        "agt" to "agustus",
        "sep" to "september",
        "okt" to "oktober",
        "nov" to "november",
        "des" to "desember")
        val monthNow = "feb"
    val birthMonth = "des"
    months.forEach { value ->
        println("$value")
    }
    println("It's {$monthNow} now, I was born in {$birthMonth}")



}