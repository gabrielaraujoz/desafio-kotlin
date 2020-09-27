class Curso(val nome: String,
            val codigoCurso: Int,
            val maxAlunos: Int,
            var alunosMatriculados: MutableList<Aluno> = mutableListOf() ) {

    var professorTitular: ProfessorTitular?
    var professorAdjunto: ProfessorAdjunto?

    init {
        professorTitular = null
        professorAdjunto = null
    }

    fun adicionarUmALuno(umAluno: Aluno): Boolean {
        if (maxAlunos <= alunosMatriculados.size) {
            return false
        }
        alunosMatriculados.add(umAluno)
        return true
    }

    fun excluirAluno (umAluno:Aluno) {
        alunosMatriculados.remove(umAluno)
    }

    override fun toString(): String {
        return "Curso(nome='$nome', codigoCurso=$codigoCurso, maxAlunos=$maxAlunos, alunosMatriculados=$alunosMatriculados, professorTitular=$professorTitular, professorAdjunto=$professorAdjunto)"
    }


}