package company.management

// Asegúrate de que la clase Person está definida correctamente
open class Person(
    var name: String,
    val id: String,
    val sex: String,
    val email: String,
    var phone: String
)

class Employee(
    name: String,
    id: String,
    sex: String,
    email: String,
    phone: String,
    var position: String,
    var salary: Double,
    val department: String,  // Ventas, RRHH, Gerencia, Operativo
    val yearOfEntry: Int,
    var Cargo: Cargo,
    val subordinates: MutableList<Employee> = mutableListOf() // Lista de empleados subordinados
) : Person(name, id, sex, email, phone) {

}
