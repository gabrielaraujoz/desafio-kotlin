class Aluno (nome: String,
             sobrenome: String,
             codigo: Int): Pessoa(nome, sobrenome, codigo) {
    override fun toString(): String {
        return "Aluno(${super.toString()})"
    }
}