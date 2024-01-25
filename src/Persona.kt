class persona(peso: Double, altura: Double){

    var peso: Double = 0.0
        set(value){
            comprobarPeso(value)
            field = value
        }

    var altura: Double = 0.0
        set(value){
            comprobarAltura(value)
            field = value
        }

    var nombre: String = ""
    var imc:Double = 0.00
    init {
        this.imc = (this.peso/(this.altura * this.altura))
    }

    constructor(nombre:String, peso: Double, altura: Double) : this(peso, altura){
        this.nombre = nombre
    }

    fun comprobarPeso(value: Double): Double{
        if (value <= 0.0)
            return 0.0
        else{
            return value
        }
    }
    fun comprobarAltura(value:Double):Double{
        if (value <= 0.0)
            return 0.0
        else{
            return value
        }
    }
    fun cambiarNombre(){
        var nom = ""
        print("Ingresa el nuevo nombre: ")
        nom = readln()
        if (nom != this.nombre) {
            this.nombre = nom
            println("Nombre cambiado a $nom")
        }
        else println("Nombre no modificado")
    }

    fun cambiarImc() {
        var pes = 0.0
        var alt = 0.0
        print("Introduzca su nuevo peso: ")
        pes = readln().toDouble()
        if (pes.toString() != "") {
            println("Peso cambiado")
            this.peso = pes
        } else println("Peso no cambiado")
        print("Introduzca su nueva altura: ")
        alt = readln().toDouble()
        if (alt.toString() != "") {
            println("Altura cambiada")
            this.altura = alt
        } else println("Altura no cambiada")
    }
    fun saludar(){
        println("Hola, soy ${this.nombre}, un placer")
    }
    fun descripcion(){
        println("${this.nombre} con altura de ${this.altura}m y un peso de ${this.peso}KG (${saludable()}) ")
    }
    fun saludable(): String {
        var salud = ""
        if (this.imc < 18.5) salud = "Peso insuficiente"
        else if (18.5 < this.imc && this.imc < 24.9) salud = "Peso saludable"
        else if (25.0 < this.imc && this.imc < 29.9) salud = "Sobrepreso"
        else salud = "Obesidad"
        return salud
    }


}