abstract class Professor(nome: String,
                     sobrenome: String,
                     codigo: Int,
                     var tempoDeCasa: Int): Pessoa(nome, sobrenome, codigo) {
    override fun toString(): String {
        return "${super.toString()}, tempoDeCasa=$tempoDeCasa"
    }

}