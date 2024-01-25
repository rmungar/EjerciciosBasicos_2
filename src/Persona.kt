/**
 * La clase persona tiene un constructor primario con el peso y la altura de una persona y cuenta con métodos exclusivos de esta clase.
 */

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

    /**
     * La funcion comprobarPeso() se asegura de que el peso que se introduzca para la persona no sea menor o igual que 0.
     * @param value : Double -> El peso de la persona
     * @return Retorna el mismo valor en caso de que sea mayor que 0 y en caso de que sea menor, retorna           50.0
     */
    fun comprobarPeso(value: Double): Double{
        if (value <= 0.0)
            return 50.0
        else{
            return value
        }
    }

    /**
     * La funcion comprobarAltura() se asegura de que la altura que se introduzca para la persona no sea menor o igual que 0.
     * @param value : Double -> La altura de la persona
     * @return Retorna el mismo valor en caso de que sea mayor que 0 y en caso de que sea menor, retorna           1.60
     */
    fun comprobarAltura(value:Double):Double{
        if (value <= 0.0)
            return 1.60
        else{
            return value
        }
    }

    /**
     * La funcion cambiarNombre() nos permitirá cambiar el nombre de una persona por otro que ingresará el usuario en la consola.
     */


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

    /**
     * cambiarImc() se encarga de cambiar el imc de una persona mediante la modificación de los parámetros peso y altura, que los ingresará el usuario en la consola.
     */
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