package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Employee(
    name: String,
    cpf: String,
    val salary: BigDecimal
) : Person(name, cpf) {
}