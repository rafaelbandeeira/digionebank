package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Employee(
    name: String,
    cpf: String,
    val salary: BigDecimal
) : Person(name, cpf) {
    abstract fun calcStimulus()
}