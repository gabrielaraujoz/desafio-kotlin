import java.time.LocalDateTime
import java.util.*

class Matricula(val aluno: Aluno,
                val curso: Curso,
                var data: Date ) {
    init {
        var data = LocalDateTime.now()
    }

}