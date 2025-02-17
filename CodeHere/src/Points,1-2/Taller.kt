package `Points,1-2`
import kotlin.math.pow




//punto 1 pasamos de decimal a binario
fun decimalABaseDos(n: Int): String {
    if(n==0) return "0"
    if(n==1) return "1"
    return decimalABaseDos(n/2) + (n%2).toString()
}


//Punto 2 pasamos binario a decimal
fun binarioADecimal(binario: String): Int {
    fun helper(binario: String, index: Int): Int {
        if (index == binario.length) return 0
        val bit = binario[binario.length - 1 - index].toString().toInt()
        return bit * 2.0.pow(index).toInt() + helper(binario, index + 1)
    }
    return helper(binario, 0)
}
fun main() {
    val decimal = 30
    val binario = "10110"
    println("el valor decimal en base dos de $decimal es ${decimalABaseDos(decimal)}.")
    println("El valor binario $binario en decimal es ${binarioADecimal(binario)}.")
}


