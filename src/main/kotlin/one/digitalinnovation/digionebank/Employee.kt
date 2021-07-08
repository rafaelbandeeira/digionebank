package one.digitalinnovation.digionebank

abstract class Employee(
    name: String,
    cpf: String,
    val salary: Double
) : Person(name, cpf) {

    abstract fun calcStimulus(): Double
}