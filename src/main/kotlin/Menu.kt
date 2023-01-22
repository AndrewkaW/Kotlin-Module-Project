
fun <T : Data> menu(name: String, list: MutableList<T>) {

    println(name)
    println("0. Создать")
    if(list.isEmpty()) println("Список пуст")
    list.forEachIndexed{index, element -> println("${index + 1}. $element")}
    println("${list.size + 1}. Выход")
}
fun createArchive(list: MutableList<Archive>){
    println("Введите название архива")
    val scanner : String = scanText()
    list.add(Archive(scanner))
}
fun createNote(list: MutableList<Note>){
    println("Введите название заметки")
    //val scanner : String = Scanner(System.`in`).nextLine()
    val newNote = Note(scanText())
    println("Введите текст заметки")
    newNote.addCont(scanText())
    list.add(newNote)
}
fun showNote(note: Note){
    note.showCont()
    println("0. Изменить текст заметки")
    println("1. Выход")
}
fun changeNoteCont(note: Note){
    println("Введите изменненный текст заметки ${note.heading}")
    note.addCont(scanText())
}