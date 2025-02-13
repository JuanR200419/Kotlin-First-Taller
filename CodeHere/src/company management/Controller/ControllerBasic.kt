package `company management`.Controller

import company.management.Cargo
import company.management.Client
import company.management.Company
import company.management.Employee

class ControllerBasic {
    private val clients = mutableListOf<Client>()
    private val employees = mutableListOf<Employee>()

    //----------------------------------------------------------------------------------------------------------------


    // CRUD para Clientes
    fun addClient(client: Client) {
        var clienSer = serchCLiente(client.id)
        if (clienSer == null) {
            clients.add(client)

        } else {
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
        } else {
            println("El cliente no existe")
        }
    }

    fun deleteClient(id: String) {
        var clienSer = serchCLiente(id)
        if (clienSer != null) {
            clients.removeIf { it.id == id }
        } else {
            println("El cliente no existe")
        }

    }


    //----------------------------------------------------------------------------------------------------------------


    // CRUD para Empleados
    fun addEmployee(employee: Employee) {
        var empleado = serchEmpleado(employee.id)
        if (empleado == null) {
            employees.add(employee)
        } else {
            println("El cliente ya existe")

        }
    }

    fun serchEmpleado(id: String): Employee? {
        return employees.find { it.id == id }
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
        } else {
            println("El empleado no existe")
        }
    }

    fun deleteEmployee(id: String) {
        var cliente = serchEmpleado(id)
        if (cliente != null) {
            employees.removeIf { it.id == id }

        } else {
            println("El cliente no existe")
        }
    }

    fun nominaEmpresa(){
        addEmployee(Employee("E1441", "Carlos Mendoza", "M", "carlos.mendoza@example.com", "3001112222", "Gerente", 6000.0, "Gerencia", 2015, Cargo("Gerente", 1)))
        addEmployee(Employee("E2441", "Ana Robles", "F", "ana.robles@example.com", "3002223333", "Analista", 4000.0, "RRHH", 2016, Cargo("Analista", 2)))
        addEmployee(Employee("E3441", "Luis Rojas", "M", "luis.rojas@example.com", "3003334444", "Operador", 3000.0, "Operativo", 2017, Cargo("Operador", 3)))
        addEmployee(Employee("E4441", "Sofía García", "F", "sofia.garcia@example.com", "3004445555", "Desarrollador", 4500.0, "Ventas", 2018, Cargo("Desarrollador", 4)))
        addEmployee(Employee("E5441", "Ricardo Morales", "M", "ricardo.morales@example.com", "3005556666", "Tester", 3500.0, "Operativo", 2019, Cargo("Tester", 5)))
        addEmployee(Employee("E1644", "Laura Díaz", "F", "laura.diaz@example.com", "3006667777", "Analista", 4100.0, "RRHH", 2020, Cargo("Analista", 2)))
        addEmployee(Employee("E7144", "Diego Pérez", "M", "diego.perez@example.com", "3007778888", "Desarrollador", 4700.0, "Ventas", 2021, Cargo("Desarrollador", 4)))
        addEmployee(Employee("E8144", "Valentina Romero", "F", "valentina.romero@example.com", "3008889999", "Analista", 4200.0, "RRHH", 2019, Cargo("Analista", 2)))
        addEmployee(Employee("E9144", "Jorge Navarro", "M", "jorge.navarro@example.com", "3009990000", "Operador", 3300.0, "Operativo", 2018, Cargo("Operador", 3)))
        addEmployee(Employee("E10144", "Isabel Torres", "F", "isabel.torres@example.com", "3001010101", "Project Manager", 5500.0, "Gerencia", 2017, Cargo("Gerente", 1)))
        var temp = employees.sumOf { it.salary }
        return println("la nomina total de la empresa es: $temp")

    }
    fun nominaDependencia(department: String){
        addEmployee(Employee("E1465", "Javier3 Gómez", "M", "javier.gomez@example.com", "3011112222", "Director", 7500.0, "Administración", 2014, Cargo("Director", 1)))
        addEmployee(Employee("E2475", "María3 León", "F", "maria.leon@example.com", "3012223333", "Consultor", 4300.0, "Finanzas", 2017, Cargo("Consultor", 2)))
        addEmployee(Employee("E3485", "Pedro 3Vargas", "M", "pedro.vargas@example.com", "3013334444", "Técnico", 3200.0, "Soporte", 2018, Cargo("Técnico", 3)))
        addEmployee(Employee("E4495", "Lucía3 Méndez", "F", "lucia.mendez@example.com", "3014445555", "Ingeniero", 4900.0, "Desarrollo", 2019, Cargo("Ingeniero", 4)))
        addEmployee(Employee("E54995", "Hécto3r Salazar", "M", "hector.salazar@example.com", "3015556666", "Auditor", 3700.0, "Control", 2020, Cargo("Auditor", 5)))
        addEmployee(Employee("E64995", "Carolin3a Espinoza", "F", "carolina.espinoza@example.com", "3016667777", "Consultor", 4500.0, "Finanzas", 2021, Cargo("Consultor", 2)))
        addEmployee(Employee("E74995", "Roberto 3Chávez", "M", "roberto.chavez@example.com", "3017778888", "Ingeniero", 5100.0, "Desarrollo", 2022, Cargo("Ingeniero", 4)))
        addEmployee(Employee("E84995", "Verónica3 Ruiz", "F", "veronica.ruiz@example.com", "3018889999", "Consultor", 4600.0, "Finanzas", 2020, Cargo("Consultor", 2)))
        addEmployee(Employee("E94995", "Esteban 3Flores", "M", "esteban.flores@example.com", "3019990000", "Técnico", 3500.0, "Soporte", 2019, Cargo("Técnico", 3)))
        addEmployee(Employee("E104995", "Andrea 3Ríos", "F", "andrea.rios@example.com", "3011010101", "Coordinador", 5800.0, "Administración", 2016, Cargo("Director", 1)))
        var empleado = employees.filter { it.department == department }.sumOf { it.salary }
        return println("La nómina del departamento $department es: $empleado")
    }
    fun cantidadEmpleados(name:String){
        addEmployee(Employee("E14", "Javier Grómez", "M", "javier.gomez@example.com", "3011112222", "Director", 7500.0, "Administración", 2014, Cargo("Director", 1)))
        addEmployee(Employee("E24", "María reón", "F", "maria.leon@example.com", "3012223333", "Consultor", 4300.0, "Finanzas", 2017, Cargo("Consultor", 2)))
        addEmployee(Employee("E34", "Pedro Vargas", "M", "pedro.vargas@example.com", "3013334444", "Técnico", 3200.0, "Soporte", 2018, Cargo("Técnico", 3)))
        addEmployee(Employee("E44", "Lucía Mérndez", "F", "lucia.mendez@example.com", "3014445555", "Ingeniero", 4900.0, "Desarrollo", 2019, Cargo("Ingeniero", 4)))
        addEmployee(Employee("E54", "Héctorr Salazar", "M", "hector.salazar@example.com", "3015556666", "Auditor", 3700.0, "Control", 2020, Cargo("Auditor", 5)))
        addEmployee(Employee("E64", "Carolinra Espinoza", "F", "carolina.espinoza@example.com", "3016667777", "Consultor", 4500.0, "Finanzas", 2021, Cargo("Consultor", 2)))
        addEmployee(Employee("E74", "Robertro Chávez", "M", "roberto.chavez@example.com", "3017778888", "Ingeniero", 5100.0, "Desarrollo", 2022, Cargo("Ingeniero", 4)))
        addEmployee(Employee("E84", "Verónirca Ruiz", "F", "veronica.ruiz@example.com", "3018889999", "Consultor", 4600.0, "Finanzas", 2020, Cargo("Consultor", 2)))
        addEmployee(Employee("E94", "Esteban Flores", "M", "esteban.flores@example.com", "3019990000", "Técnico", 3500.0, "Soporte", 2019, Cargo("Técnico", 3)))
        addEmployee(Employee("E104", "Andrea Ríos", "F", "andrea.rios@example.com", "3011010101", "Coordinador", 5800.0, "Administración", 2016, Cargo("Director", 1)))
        var varible = employees.count { it.cargo.name ==  name}
        return   println("el total de empleados con el cargo $name son: $varible")
    }





    //----------------------------------------------------------------------------------------------------------------

    fun porcentajesGenero(){

        addClient(Client("C1", "Juan Perez", "M", "juan.perez@example.com", "3001112222", "Calle 1 #1-1"))
        addClient(Client("C2", "Maria Gomez", "F", "maria.gomez@example.com", "3002223333", "Calle 2 #2-2"))
        addClient(Client("C3", "Carlos Rodriguez", "M", "carlos.rodriguez@example.com", "3003334444", "Calle 3 #3-3"))
        addClient(Client("C4", "Ana Martinez", "F", "ana.martinez@example.com", "3004445555", "Calle 4 #4-4"))
        addClient(Client("C5", "Luis Hernandez", "M", "luis.hernandez@example.com", "3005556666", "Calle 5 #5-5"))
        addClient(Client("C6", "Sofia Ramirez", "F", "sofia.ramirez@example.com", "3006667777", "Calle 6 #6-6"))
        addClient(Client("C7", "Miguel Sanchez", "M", "miguel.sanchez@example.com", "3007778888", "Calle 7 #7-7"))
        addClient(Client("C8", "Laura Diaz", "F", "laura.diaz@example.com", "3008889999", "Calle 8 #8-8"))
        addClient(Client("C9", "Jorge Morales", "M", "jorge.morales@example.com", "3009990000", "Calle 9 #9-9"))
        addClient(Client("C10", "Elena Torres", "F", "elena.torres@example.com", "3001010101", "Calle 10 #10-10"))
        addClient(Client("C11", "Diego Herrera", "M", "diego.herrera@example.com", "3001110001", "Calle 11 #11-11"))
        addClient(Client("C12", "Isabel Ruiz", "F", "isabel.ruiz@example.com", "3002220002", "Calle 12 #12-12"))
        addClient(Client("C13", "Ricardo Flores", "M", "ricardo.flores@example.com", "3003330003", "Calle 13 #13-13"))
        addClient(Client("C14", "Camila Rojas", "F", "camila.rojas@example.com", "3004440004", "Calle 14 #14-14"))
        addClient(Client("C15", "Andres Castro", "M", "andres.castro@example.com", "3005550005", "Calle 15 #15-15"))
        addClient(Client("C16", "Valentina Mendoza", "F", "valentina.mendoza@example.com", "3006660006", "Calle 16 #16-16"))
        addClient(Client("C17", "Sebastian Vega", "M", "sebastian.vega@example.com", "3007770007", "Calle 17 #17-17"))
        addClient(Client("C18", "Paula Navarro", "F", "paula.navarro@example.com", "3008880008", "Calle 18 #18-18"))
        addClient(Client("C19", "Esteban Campos", "M", "esteban.campos@example.com", "3009990009", "Calle 19 #19-19"))
        addClient(Client("C20", "Natalia Gil", "F", "natalia.gil@example.com", "3001010102", "Calle 20 #20-20"))
        addClient(Client("C21", "Pedro Salazar", "M", "pedro.salazar@example.com", "3002020202", "Calle 21 #21-21"))
        addClient(Client("C22", "Carolina Prieto", "M", "carolina.prieto@example.com", "3003030303", "Calle 22 #22-22"))
        addClient(Client("C23", "Fernando Cordero", "M", "fernando.cordero@example.com", "3004040404", "Calle 23 #23-23"))
        addClient(Client("C24", "Juliana Pineda", "F", "juliana.pineda@example.com", "3005050505", "Calle 24 #24-24"))
        addClient(Client("C25", "Oscar Dominguez", "M", "oscar.dominguez@example.com", "3006060606", "Calle 25 #25-25"))
        addClient(Client("C26", "Daniela Franco", "F", "daniela.franco@example.com", "3007070707", "Calle 26 #26-26"))
        addClient(Client("C27", "Victor Bravo", "M", "victor.bravo@example.com", "3008080808", "Calle 27 #27-27"))
        addClient(Client("C28", "Gabriela Lozano", "F", "gabriela.lozano@example.com", "3009090909", "Calle 28 #28-28"))
        addClient(Client("C29", "Armando Rivas", "M", "armando.rivas@example.com", "3000101010", "Calle 29 #29-29"))
        addClient(Client("C30", "Silvia Acosta", "F", "silvia.acosta@example.com", "3001111111", "Calle 30 #30-30"))

        var e = getClients()
        var feminas = 0
        var mens =0
        for (i in e){
                if(i.sex == "F"){
                    feminas++
                }else{
                    mens++
                }
        }
        println("La cantidad de femeninas es: $feminas")
        println("La cantidad de hombres es: $mens")
        var porcentMen = mens.toDouble()/30*100
        var porcentFem = feminas.toDouble()/30*100
        println("El porcentaje de mujeres es: $porcentFem %")
        println("El porcentaje de hombres es: $porcentMen %")
    }

    fun employeeOlder() {
        // Agregar empleados
        addEmployee(Employee("E1", "Carlos Mendoza", "M", "carlos.mendoza@example.com", "3001112222", "Gerente", 6000.0, "Gerencia", 2015, Cargo("Gerente", 1)))
        addEmployee(Employee("E2", "Ana Robles", "F", "ana.robles@example.com", "3002223333", "Analista", 4000.0, "RRHH", 2016, Cargo("Analista", 2)))
        addEmployee(Employee("E3", "Luis Rojas", "M", "luis.rojas@example.com", "3003334444", "Operador", 3000.0, "Operativo", 2017, Cargo("Operador", 3)))
        addEmployee(Employee("E4", "Sofía García", "F", "sofia.garcia@example.com", "3004445555", "Desarrollador", 4500.0, "Ventas", 2018, Cargo("Desarrollador", 4)))
        addEmployee(Employee("E5", "Ricardo Morales", "M", "ricardo.morales@example.com", "3005556666", "Tester", 3500.0, "Operativo", 2019, Cargo("Tester", 5)))
        addEmployee(Employee("E6", "Laura Díaz", "F", "laura.diaz@example.com", "3006667777", "Analista", 4100.0, "RRHH", 2020, Cargo("Analista", 2)))
        addEmployee(Employee("E7", "Diego Pérez", "M", "diego.perez@example.com", "3007778888", "Desarrollador", 4700.0, "Ventas", 2021, Cargo("Desarrollador", 4)))
        addEmployee(Employee("E8", "Valentina Romero", "F", "valentina.romero@example.com", "3008889999", "Analista", 4200.0, "RRHH", 2019, Cargo("Analista", 2)))
        addEmployee(Employee("E9", "Jorge Navarro", "M", "jorge.navarro@example.com", "3009990000", "Operador", 3300.0, "Operativo", 2018, Cargo("Operador", 3)))
        addEmployee(Employee("E10", "Isabel Torres", "F", "isabel.torres@example.com", "3001010101", "Project Manager", 5500.0, "Gerencia", 2017, Cargo("Gerente", 1)))

        val empleados = getEmployees()
        var older = Int.MAX_VALUE  // Inicializamos con el valor máximo posible para Int
        for (i in empleados) {
            if (i.yearOfEntry < older) {
                older = i.yearOfEntry
            }
        }
        println("El empleado que lleva más tiempo en la empresa es del año: $older")
    }



}