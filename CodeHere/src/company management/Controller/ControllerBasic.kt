package `company management`.Controller

import company.management.Client
import company.management.Employee

class ControllerBasic {
    private val clients = mutableListOf<Client>()
    private val employees = mutableListOf<Employee>()




    // CRUD para Clientes
    fun addClient(client: Client) {
        clients.add(client)
    }

    fun serchCLiente(id: String): Client? {
        return clients.find { it.id == id }
    }


    fun getClients(): List<Client> {
        return clients
    }

    fun updateClient(id: String, name: String, address: String, phone: String) {
        val client = clients.find { it.id == id }
        client?.apply {
            this.name = name
            this.address = address
            this.phone = phone
        }
    }

    fun deleteClient(id: String) {
        clients.removeIf { it.id == id }
    }

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
        employee?.apply {
            this.name = name
            this.position = position
            this.salary = salary
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





}