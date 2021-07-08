package one.digitalinnovation.digionebank

class Manager(
    name: String,
    cpf: String,
    salary: Double
) : Employee(name, cpf, salary){
    override fun calcStimulus(): Double = salary * 0.1
}