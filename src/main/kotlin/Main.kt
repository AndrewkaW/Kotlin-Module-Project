


fun main() {

     val archiveList : MutableList <Archive> = mutableListOf() // ваш код начнется здесь
    // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости
    println("Привет")

    while(true) {
        menu(ConstText.ARCHIVE_MENU, archiveList)
        val click1 = input(archiveList.size + 1)
        when(click1){

            0 -> createArchive(archiveList)
            archiveList.size + 1 -> break
            else -> while(true){

                menu(ConstText.CHOICE_NOTE, archiveList[click1-1].notes)
                val click2 = input(archiveList[click1-1].notes.size + 1)
                when(click2) {

                    0 -> createNote(archiveList[click1-1].notes)
                    archiveList[click1-1].notes.size + 1 -> break
                    else -> while (true) {

                        showNote(archiveList[click1-1].notes[click2-1])
                        when(input(1)){
                            0 -> changeNoteCont(archiveList[click1-1].notes[click2-1])
                            1 -> break
                        }
                    }
                }
            }
        }
    }
    println("Досвидание!")
}
