fun main(){
    try {
        val hora1 = tiempo()
        hora1.pedirHora()
        hora1.pedirMinutos()
        hora1.pedirSegundos()
        println(hora1.toString())
    }
    catch (_:NumberFormatException){
        println("ERROR EN EL INGRESO DE DATOS")
    }
}