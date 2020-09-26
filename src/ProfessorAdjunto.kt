class ProfessorAdjunto(nome: String,
                       sobrenome: String,
                       codigo: Int,
                       tempoDeCasa: Int,
                       var horasDeMonitoria: Int): Professor(nome, sobrenome, codigo, tempoDeCasa) {
    override fun toString(): String {
        return "ProfessorAdjunto(${super.toString()}, horasDeMonitoria=$horasDeMonitoria)"
    }
}