class tiempo(){
    private var hora: Int = 0
    fun pedirHora(){
        print("Ingrese el número de horas: ")
        val h = readln()
        if (h != "" && h.toInt() != 0) this.hora = h.toInt()
        else this.hora = 0
    }
    //------------------------------------------------------------------------------------------------------------------
    private var minuto: Int = 0
    fun pedirMinutos(){
        print("Ingrese los minutos: ")
        var m = readln().toInt()
        if (m != 0){
            while (m > 60){
                this.hora += 1
                m -= 60
            }
            this.minuto = m
        }
        else this.minuto = 0
    }
    //------------------------------------------------------------------------------------------------------------------
    private var segundo:  Int = 0
    fun pedirSegundos(){
        print("Ingrese los segundos: ")
        var s = readln().toInt()
        if (s != 0) {
            while (s > 60){
                this.minuto += 1
                s -= 60
            }
            this.segundo = s
        }
        else this.segundo = 0
    }

    override fun toString(): String {
        if (minuto < 10 && segundo < 10){
            return "${this.hora}h 0${this.minuto}m 0${this.segundo}s"
        }
        else if (minuto > 10 && segundo < 10){
            return "${this.hora}h ${this.minuto}m 0${this.segundo}s"
        }
        else if (minuto < 10 && segundo > 10){
            return "${this.hora}h 0${this.minuto}m ${this.segundo}s"
        }
        else {
            return "${this.hora}h ${this.minuto}m 0${this.segundo}s"
        }
    }
}