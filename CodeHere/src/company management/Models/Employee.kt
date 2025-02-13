package company.management



class       Employee(
    name: String,
    id: String,
    sex: String,
    email: String,
    phone: String,
    var position: String,
    var salary: Double,
    val department: String,  // Venwtas, RRHH, Gerencia, Operativo
    val yearOfEntry: Int,
    var cargo: Cargo,
    val subordinates: MutableList<Employee> = mutableListOf() // Lista de empleados subordinados
) : Person(name, id, sex, email, phone) {

}
