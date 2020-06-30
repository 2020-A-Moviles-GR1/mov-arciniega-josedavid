import java.util.*

fun main(args:Array<String>){
    println("Hola")
    //Ejemplo Java:
    //Int edad = 31;
    //Mutables -> var
    var edadProfesor = 31    // no especifocamos el tipo de dato
                             // no necesita ;
    //Duck Typing = esto realiza el compilador internamente
    //var edad: x
    var edadAlumno1: Int //sintaxis para declarar variable sin asignar valor
    var edadAlumno2 = 25 //sintaxis para declarar variable asignando valor
    edadAlumno1 = 22
    edadProfesor = 32
    edadAlumno1 = 23
    // Nombre  de veriables debe ser descriptivo
    //Inmutables (RECOMENDADO) -> val
    val numeroCuenta = 1234543 // NO SE PUEDE REASIGNAR
    // numeroCuenta = 1234

    // Tipos de Variables
    val nombreProfesor: String = "Vicente Adrian"
    val sueldo: Double = 13.32
    val apellidoProfesor: Char = 'a'
    val fechaNacimiento = Date() // En Java : new Date()

    if (sueldo == 13.32){

    } else {

    }

    // If de una sola linea
    val esSueldoayorAlEstablecdo = if(sueldo==13.32) true else false

    //calcularSueldo(1000.00,14.00)       //como escribo
    calcularSueldo(1000.00,14.00) // como el editor me muestra
    calcularSueldo(
            tasa=16.00,
            sueldo=800.00
    )//Named Parameters -> parametros nombrados
    calcularSueldo(700.00) // no me pide tasa por que taasa tiene valor por defecto
    calcularSueldo(sueldo=650.00)



}

fun calcularSueldo(
        sueldo: Double,
        tasa: Double = 12.00,
        calculoEspecial : Int? = null// Puede ser nulo "NULL"

): Double {
    if (calculoEspecial != null) {
        return sueldo * tasa * calculoEspecial
    } else {
        return sueldo * tasa
    }

}



 fun imprimirMensaje1(): Unit{   //Unit = void
    println("")
}
 fun imprimirMensaje2(){   //Unit = void
    println("")
}


