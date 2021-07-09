package one.digitalinnovation.digionebank

class Customer(
    name: String,
    cpf: String,
    val type: CustomerType,
    val auth: String
) : Person(name, cpf), Authorizable {
    override fun authorize(): Boolean = "654321" == auth
    override fun toString(): String = """
        Name: $name
        CPF: $cpf
        Type: ${type.description}
    """.trimIndent()
}