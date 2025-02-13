package company.management


open class Person constructor(
    var name: String,
    val id: String,
    val sex: String,
    val email: String,
    var phone: String){
}

class Client(
    name: String,
    id: String,
    sex: String,
    email: String,
    phone: String,
    var address: String // Dirección de correspondencia
) : Person(name, id, sex, email, phone) {


}
