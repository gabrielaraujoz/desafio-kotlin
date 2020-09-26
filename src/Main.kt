fun main() {
    var admin = DigitalHouseManager()

    admin.registrarCurso("Android", 1, 40)
    admin.registrarCurso("Java", 2, 2)
    println(admin.listaDeCursos)

    admin.excluirCurso(2)
    println(admin.listaDeCursos)

    admin.registrarProfessorTitular("Felipe", "Medeiros", 1,"Android")
    admin.registrarProfessorAdjunto("Lucas", "Gabriel", 2,20)
    admin.registrarProfessorTitular("Misha", "Polonov", 3, "Java")
    println(admin.listaDeProfessores)

    admin.excluirProfessor(3)
    println(admin.listaDeProfessores)

    admin.registrarAluno("Gabriel", "Araujo",1)
    admin.registrarAluno("Nykolle", "Malone", 2)
    println(admin.listaDeAlunos)

}