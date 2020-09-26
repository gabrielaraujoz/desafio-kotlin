class Curso(val nome: String,
            val codigoCurso: Int,
            val maxAlunos: Int,
            var alunosMatriculados: MutableList<Aluno> = mutableListOf() ) {

    var professor: ProfessorTitular?
    var professorAdjunto: ProfessorAdjunto?

    init {
        professor = null
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
        return "Curso(nome='$nome', codigoCurso=$codigoCurso, maxAlunos=$maxAlunos, alunosMatriculados=$alunosMatriculados, professor=$professor, professorAdjunto=$professorAdjunto)"
    }


}