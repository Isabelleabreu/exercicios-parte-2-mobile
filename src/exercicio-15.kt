fun main() {

   val idades = listOf<Int>(14,17,18,20)

   val resultado = idades.filter { idade ->
      idade >= 18
   }.average()

   println(resultado)

}