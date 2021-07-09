package one.digitalinnovation.digionebank

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    val auth: String
) : Employee(name, cpf, salary){
    override fun calcStimulus(): Double = salary * 0.1
}