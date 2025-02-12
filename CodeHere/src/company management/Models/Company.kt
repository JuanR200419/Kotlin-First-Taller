package company.management

class Company(
    val businessName: String,      // Razón social (nombre de la empresa)
    val nit: String,               // Número de Identificación Tributaria (NIT)
    val address: String,           // Dirección de la empresa
    val employees: MutableList<Employee>, // Lista de empleados (obligatoria)
    val clients: MutableList<Client> = mutableListOf() // Lista de clientes (opcional)
) {


}
