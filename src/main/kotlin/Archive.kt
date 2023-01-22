data class Archive (val name : String) : Data() {
    var notes : MutableList<Note> = mutableListOf()

    override fun toString(): String  = name.toString()
}