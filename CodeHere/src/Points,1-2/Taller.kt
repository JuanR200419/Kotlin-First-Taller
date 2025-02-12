package `Points,1-2`
import kotlin.math.pow





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
baseADecimal(10001000     )
}


