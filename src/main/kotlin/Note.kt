 data class Note (val heading : String) : Data(){
     private var content : String = ""

     fun addCont(text: String ) {
         text.also { content = it }
     }
     override fun toString(): String = heading
     fun showCont() = println("Заметка - $heading\n\n$content")
 }