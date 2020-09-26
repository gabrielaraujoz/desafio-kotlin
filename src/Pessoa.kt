open class Pessoa(val nome: String,
                  val sobrenome: String,
                  val codigo: Int) {
    override fun toString(): String {
        return "codigo=$codigo, nome='$nome', sobrenome='$sobrenome'"
    }
}