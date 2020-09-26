class ProfessorTitular(nome: String,
                       sobrenome: String,
                       codigo: Int,
                       tempoDeCasa: Int,
                       val especialidade: String): Professor(nome, sobrenome, codigo, tempoDeCasa) {
    override fun toString(): String {
        return "ProfessorTitular(${super.toString()}, especialidade=$especialidade)"
    }

}