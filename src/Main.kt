fun main() {

    val persona1 = persona(72.00, 180.00)
    val persona2 = persona("MMORPG NO LINEAL", 190.00, 1.00)
    val persona3 = persona("Anthem", 100.00, 0.78)
    val persona4 = persona("Ppe",80.0, 1.70)
    val persona5 = persona("pko", 1.75, 0.86)
    persona1.cambiarNombre()
    println("Nombre: ${persona2.nombre}, peso = ${persona2.peso}KG, altura = ${persona2.altura}m")
    persona3.cambiarImc()
    println(persona3.imc)
    persona1.saludar()
    persona1.descripcion()
    persona2.saludar()
    persona2.descripcion()
    persona3.saludar()
    persona3.descripcion()
    persona4.saludar()
    persona4.descripcion()
    persona5.saludar()
    persona5.descripcion()

}