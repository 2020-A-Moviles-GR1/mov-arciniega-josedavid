import java.util.*

fun main(args:Array<String>){
    println("Hola")
    //Ejemplo Java:
    //Int edad = 31;

    //VARIABLES

    // VARIABLES Mutables -> var
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

    // VARIABLES Inmutables -> val (RECOMENDADO)
    val numeroCuenta = 1234543 // NO SE PUEDE REASIGNAR
    // numeroCuenta = 1234

    val fechaNacimiento = Date() // instanciamos clases dentro de Koltlin SIN new


    // Variables declarando el tipo de variable
    val nombreProfesor: String = "Vicente Adrian" //
    val nombreAlumno = "Jose David"
    val sueldo: Double = 13.32
    val apellidoProfesor: Char = 'a'

    //  Variables SIN declarar el tipo de variable (RECOMENDADO)
    val nombreProfesor1 = "Vicente Adrian1" //
    val nombreAlumno1 = "Jose David"
    val sueldo1 = 13.32
    val apellidoProfesor1 = 'a'

    if (sueldo == 13.32){

    } else {

    }
    when (sueldo) {
        13.32 -> println("Sueldo Normal")
        -13.32 -> println("Sueldo Negativo")
        else -> println("No se Reconoce Sueldo")
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
    var resultado = calcularSueldo(sueldo=650.00)
    println(resultado)
}


fun calcularSueldo(
        sueldo: Double, // Requeridos
        tasa: Double = 12.00, // Requeridos (Tienen valor por defecto)
        calculoEspecial : Int? = null // Puede ser nulo "NULL"
): Double {
    if (calculoEspecial != null) {
        return sueldo * tasa * calculoEspecial
    } else {
        return sueldo * tasa
    }
}

 fun imprimirMensaje1(): Unit{   //Unit = void
    println("Nevo Mensaje")
}
 fun imprimirMensaje2(){   //Unit = void
    println("")
}


