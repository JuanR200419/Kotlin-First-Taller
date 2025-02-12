package `Points,1-2`
import kotlin.math.pow



//punto 1 pasamos de decimal a binario
fun decimalABaseDos(n: Int): String {
    if(n==0) return "0"
    if(n==1) return "1"
    return decimalABaseDos(n/2) + (n%2).toString()
}

//Punto 2 pasamos binario a decimal
fun baseADecimal(base:Int) {
    var baseInvert= base.toString().reversed()
    var total=0
    var valor=0
  for ((i,bas) in baseInvert.withIndex()){
    valor = bas.toString().toInt()*2.0.pow(i.toDouble()).toInt()
      total+=valor
  }
println(total)
}
fun main() {
    val decimal = 22
    println("el valor decimal en base dos de $decimal es ${decimalABaseDos(decimal)}.")

    baseADecimal(10001000)
}


