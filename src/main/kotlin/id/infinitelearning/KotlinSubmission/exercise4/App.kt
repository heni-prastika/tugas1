package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    try {
        validation("heni")
        validation("")
    } catch (eror: Exception) {
        println("${eror.message}")
    }
}

 fun validation (name: String) {
     if (name. isBlank()){
         throw Exception ("Name tidak boleh kosong") }
     else {
         println ("hello $name")

     }}


