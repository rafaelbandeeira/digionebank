package one.digitalinnovation.digionebank

class Analyst(
    name: String,
    cpf: String,
    salary: Double
) : Employee(name, cpf, salary) {
    override fun calcStimulus(): Double = salary * 0.4
}