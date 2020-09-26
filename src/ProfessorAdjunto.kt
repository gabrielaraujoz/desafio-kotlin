class ProfessorAdjunto(nome: String,
                       sobrenome: String,
                       codigo: Int,
                       tempoDeCasa: Int,
                       val horasDeMonitoria: Int): Professor(nome, sobrenome, codigo, tempoDeCasa) {
}