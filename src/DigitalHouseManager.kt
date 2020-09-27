import java.lang.Exception
import java.time.LocalDateTime

class DigitalHouseManager (val listaDeAlunos: MutableList<Aluno> = mutableListOf(),
                           var listaDeProfessores: MutableList<Professor> = mutableListOf(),
                           var listaDeCursos: MutableList<Curso> = mutableListOf(),
                           val listaDeMatriculas: MutableList<Matricula> = mutableListOf()) {

    fun registrarCurso(nome: String, codigoCurso: Int, maxAlunos: Int) {
        var novoCurso = Curso(nome, codigoCurso, maxAlunos)
        listaDeCursos.add(novoCurso)
    }

    fun excluirCurso(codigoCurso: Int) {
        listaDeCursos = listaDeCursos.filter {
            it.codigoCurso != codigoCurso
        } as MutableList<Curso>
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigo: Int, horasDeMonitoria: Int ) {
        var novoProfessorAdjunto = ProfessorAdjunto(nome,sobrenome,codigo,0, horasDeMonitoria)
        listaDeProfessores.add(novoProfessorAdjunto)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigo: Int, especialidade: String) {
        var novoProfessorTitular = ProfessorTitular(nome, sobrenome, codigo, 0, especialidade)
        listaDeProfessores.add(novoProfessorTitular)
    }

    fun excluirProfessor(codigo: Int) {
        listaDeProfessores = listaDeProfessores.filter {
            it.codigo != codigo
        } as MutableList<Professor>
    }

    fun matricularAluno(nome: String, sobrenome: String, codigo: Int) {
        var novoAluno = Aluno(nome, sobrenome, codigo)
        listaDeAlunos.add(novoAluno)
    }

    fun matricularAluno(codigo: Int, codigoCurso: Int) {

        if (encontrarCurso(codigoCurso) != null) {
            if (encontrarAluno(codigo) != null) {
                if(encontrarCurso(codigoCurso)!!.adicionarUmALuno(encontrarAluno(codigo)!!)) {
                    val data = LocalDateTime.now()
                    val novaMatricula = Matricula(encontrarAluno(codigo)!!, encontrarCurso(codigoCurso)!!, data)
                    listaDeMatriculas.add(novaMatricula)
                    println("Matrícula realizada.")
                } else {
                    println("Não foi possível realizar a matrícula pois não há vagas.")
                }
            } else {
                throw Exception("Aluno não existe. Por favor cadastre o aluno.")
            }
        } else {
            throw Exception("Curso não existe, por favor crie o curso")
        }
    }
    fun encontrarCurso(codigoCurso: Int): Curso? {
        listaDeCursos.forEach {
            if (codigoCurso == it.codigoCurso) {
                return it
            }
        }
        return null
    }

    fun encontrarAluno(codigo: Int): Aluno? {
        listaDeAlunos.forEach {
            if (codigo == it.codigo)
                return it
        }
        return null
    }

    fun encontrarProfessor(codigo: Int): Professor? {
        listaDeProfessores.forEach {
            if (codigo == it.codigo) {
                return it
            }
        }
        return null
    }

    fun alocarProfessores(codigoCurso: Int,
                          codigoProfessorTitular: Int,
                          codigoProfessorAdjunto: Int) {
        if (encontrarProfessor(codigoProfessorTitular) != null) {
            if (encontrarProfessor(codigoProfessorAdjunto) != null) {
                if (encontrarCurso(codigoCurso) != null) {
                    var professorTitular = encontrarProfessor(codigoProfessorTitular)
                    var professorAdjunto = encontrarProfessor(codigoProfessorAdjunto)!!
                    var curso = encontrarCurso(codigoCurso)!!
                    curso.professorTitular = professorTitular as ProfessorTitular?
                    curso.professorAdjunto = professorAdjunto as ProfessorAdjunto?
                } else {
                    throw Exception("O código do curso é inválido.")
                }
            } else {
                throw Exception("Professor Adjunto não cadastrado.")
            }
        } else {
            throw Exception("Professor Titular não cadastrado")
        }
    }

    override fun toString(): String {
        return "DigitalHouseManager(listaDeAlunos=$listaDeAlunos, listaDeProfessores=$listaDeProfessores, listaDeCursos=$listaDeCursos, listaDeMatriculas=$listaDeMatriculas)"
    }

}