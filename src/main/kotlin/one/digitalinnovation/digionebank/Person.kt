package one.digitalinnovation.digionebank

class Person {
    var name: String = "Rafael"
    var cpf: String = "123.123.123-10"
}

fun main() {
    val person: Person = Person()
    println("meu nome é ${person.name}")
}