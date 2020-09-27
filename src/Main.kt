import java.lang.Exception

fun main() {
    var admin = DigitalHouseManager()

    admin.registrarCurso("Android", 1, 40)
    admin.registrarCurso("Java", 2, 2)
    admin.registrarCurso("Javascript", 3, 20)

    println(admin.listaDeCursos)

    admin.excluirCurso(3)
    println(admin.listaDeCursos)

    admin.registrarProfessorTitular("Felipe", "Medeiros", 1,"Android")
    admin.registrarProfessorAdjunto("Lucas", "Gabriel", 2,20)
    admin.registrarProfessorTitular("Misha", "Polonov", 3, "Java")
    println(admin.listaDeProfessores)

    admin.excluirProfessor(3)
    println(admin.listaDeProfessores)

    admin.matricularAluno("Gabriel", "Araujo",1)
    admin.matricularAluno("Nykolle", "Malone", 2)
    admin.matricularAluno("Misha", "Stalin", 3)
    println(admin.listaDeAlunos)

    try {
        admin.matricularAluno(1,1)
        admin.matricularAluno(1,2)
        admin.matricularAluno(2,2)
        println(admin.listaDeCursos)
    } catch (e: Exception) {
        return println(e.message)
    }

    try {
        admin.alocarProfessores(1,1,2)
        println(admin.listaDeCursos[0])

    } catch(e: Exception) {
        return println(e.message)
    }
}