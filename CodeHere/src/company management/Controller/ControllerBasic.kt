package `company management`.Controller

import company.management.Client
import company.management.Employee

class ControllerBasic {
    private val clients = mutableListOf<Client>()
    private val employees = mutableListOf<Employee>()

    //----------------------------------------------------------------------------------------------------------------


    // CRUD para Clientes
    fun addClient(client: Client) {
        var clienSer = serchCLiente(client.id)
        if(clienSer==null){
            clients.add(client)
        }else{
            println("El cliente ya existe")
        }

    }

    fun serchCLiente(id: String): Client? {
        return clients.find { it.id == id }
    }


    fun getClients(): List<Client> {
        return clients
    }

    fun updateClient(id: String, name: String, address: String, phone: String) {
        val client = clients.find { it.id == id }
        if (client != null) {
            client?.apply {
                this.name = name
                this.address = address
                this.phone = phone
            }
        }else{
            println("El cliente no existe")
        }
    }

    fun deleteClient(id: String) {
        var clienSer = serchCLiente(id)
        if(clienSer!=null){
            clients.removeIf { it.id == id }
        }else{
            println("El cliente no existe")
        }

    }





    //----------------------------------------------------------------------------------------------------------------



    // CRUD para Empleados
    fun addEmployee(employee: Employee) {
    var cliente = serchCLiente(employee.id)
        if(cliente==null){
            employees.add(employee)
        }else{
            println("El cliente ya existe")

        }
    }

    fun getEmployees(): List<Employee> {
        return employees
    }

    fun updateEmployee(id: String, name: String, position: String, salary: Double) {
        val employee = employees.find { it.id == id }

        if (employee != null) {

            employee?.apply {
                this.name = name
                this.position = position
                this.salary = salary
            }
        }else{
            println("El empleado no existe")
        }
    }

    fun deleteEmployee(id: String) {
        var cliente = serchCLiente(id)
        if(cliente!=null){
            employees.removeIf { it.id == id }

        }else{
            println("El cliente no existe")
        }
    }

    //----------------------------------------------------------------------------------------------------------------



}