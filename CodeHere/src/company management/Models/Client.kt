package company.management

class Client(
    name: String,
    id: String,
    sex: String,
    email: String,
    phone: String,
    var address: String // Dirección de correspondencia
) : Person(name, id, sex, email, phone) {


}
