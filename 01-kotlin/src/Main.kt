import java.util.*
import kotlin.collections.ArrayList

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

    // VARIABLES INMUTABLES-> val (RECOMENDADO)
    val numeroCuenta = 1234543 // NO SE PUEDE REASIGNAR
    // numeroCuenta = 1234

    val fechaNacimiento = Date() // instanciamos clases dentro de Koltlin SIN new


    //TIPOS DE VARIABLE
    // Variables declarando el tipo de variable

    val nombreProfesor1: String = "Vicente Adrian" //
    val nombreProfesor2 = "Vicente Adrian" //(RECOMENDADO)
    val nombreAlumno = "Jose David"
    val sueldo: Double = 13.32
    val apellidoProfesor: Char = 'a'

    //  Variables SIN declarar el tipo de variable (RECOMENDADO)
    val nombreProfesor = "Vicente Adrian1" //
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
            tasa=16.00,  //Named Parameters -> parametros nombrados
            sueldo=800.00  //Named Parameters -> parametros nombrados
    )
    calcularSueldo(700.00) // no me pide tasa por que taasa tiene valor por defecto
    var resultado = calcularSueldo(sueldo=650.00)
    println(resultado)

    val arregloConstante: Array<Int> = arrayOf(1,2,3)
    val arregloDeListas: ArrayList<Int> = arrayListOf(30,31,32,33,20) //

    print(arregloDeListas)
    arregloDeListas.add(24)
    print(arregloDeListas)
    arregloDeListas.remove(element = 31)
    print(arregloDeListas)

    // OPERADORES / funciones puras : se encunetran en todos los lenguajes

    // 1) .forEach no devuelve nada = Unit , nos ayuda a iterar un arreglo

    arregloDeListas
            .forEach {
                println("Valor de la iterracion: $it")
            }

    arregloDeListas
            .forEach{ valorIteracion:Int ->
                println("valor Iteracion: $valorIteracion")
            }

    val respuestaArregloForEach = arregloDeListas // forEach no devuelve nada -> Unit
            .forEachIndexed{ index:Int, it:Int ->
                println("valor Iteracion: $it")
            }

    println(respuestaArregloForEach) // void Unit

    arregloDeListas
            .forEach{ iteracion:Int ->
                println("valor Iteracion: $iteracion")
                println("vañor con -1 = ${iteracion * -1}")
            }
    // 2) .map -> Muta el arreglo (Cambia el arreglo)
    // Enviamos el nuevo valor de la iteracion
    // Nos devuelve Un Nuevo Arreglo con los valores madificados

    arregloDeListas.map {it * -1}

    val respuestaMap1= arregloDeListas
            .map {it * -1}

    // retur@map puedo añadir mas de una linea de código y me devuelve cualquier cosa que necesite

    val respuestaMap2= arregloDeListas
            .map {iterador: Int ->
                val primerValor = iterador * -1
                val segundoValor = primerValor * 2
                return@map segundoValor
            }

    val respuestaMap3= arregloDeListas
            .map {iterador: Int ->
                val primerValor = iterador * -1
                val segundoValor = primerValor * 2
                return@map segundoValor.toString()
                //return@map true
                // return@map Date()
            }

    val respuestaMap4= arregloDeListas
            .map {iterador: Int ->
                val primerValor = iterador * -1
                val segundoValor = primerValor * 2
                return@map Date()
            }
    println("///////////////////////////////////////////")
    println(arregloDeListas)
    println(respuestaMap1)
    println(respuestaMap2)
    println(respuestaMap3)
    println(respuestaMap4)

    // PROGRAMACION FUNCIONAL ME DEVUELVE UN NUEVO ARREGLO

    // 3) .filter -> FILTRA EL ARREGLO : no le modifica al arreglo,
    //  Me devuelve una expresión (TRUE o FALSE)
    // ME devuelve un NUEVO arreglo que cumpla esa expresión

    arregloDeListas.filter {it>25}

    val respuestaFilter1= arregloDeListas
            .filter {it>25}

    val respuestaFilter2= arregloDeListas
            .filter {
                iterador: Int ->
                val esMayorA25 = iterador > 25
                return@filter esMayorA25
            }
    println("///////////////////////////////////////////")
    println(arregloDeListas)
    println(respuestaFilter1)
    println(respuestaFilter2)

    // 4) .any return TRUE o FALSE
    // un nuevo arreflo que cumpla la expreción
    // ANY -> OR (Some) = si almenos uno cumple -> TRUE

    arregloDeListas.any {it > 33}  // ALMENOS uno debe cumplir la condicion para que retorne TRUE

    val respuestaAny1= arregloDeListas
            .any {it<33}

    val respuestaAny2= arregloDeListas
            .any {
                iterador: Int ->
                return@any iterador < 18
            }

    println("///////////////////////////////////////////")
    println(arregloDeListas)
    println(respuestaAny1)
    println(respuestaAny2)

    // 5) all return TRUE o FALSE
    // un nuevo arreflo que cumpla la expreción
    // ALL -> AND (Every) = TRUE, todo lo demas es falso


    arregloDeListas.all {it>25}// TODOS deben cumplir la condición para devolver TRUE

    val respuestaAll1= arregloDeListas
            .all {it>25}

    val respuestaAll2= arregloDeListas
            .all{ iterador: Int ->
                return@all iterador < 18
            }

    println("///////////////////////////////////////////")
    println(arregloDeListas)
    println(respuestaAll1)
    println(respuestaAll2)


    // 6) reduce
    // Devuelve el acumulado
    // Definimos en que valor empieza


    val respuestaReduce= arregloDeListas // acumulador empieza en 0 o en VACIO con Strings
            .reduce { acumulador, iteracion ->
                return@reduce acumulador - iteracion
            }



    println("///////////////////////////////////////////")
    println(arregloDeListas)
    println(respuestaReduce)

    // 7) fold
    // foldRignt empieza desde la derecha
    // Indico el valor desde donde empieza

    val respuestaFold= arregloDeListas // acumulador empieza en 0 o en VACIO con Strings
            .fold(
                100,
                { acumulador, iteracion ->
                    return@fold acumulador + iteracion
                }
            )
    println("///////////////////////////////////////////")
    println(arregloDeListas)
    println(respuestaFold)

    // .forEach -> Nada/Unit
    // .map -> Arreglo
    // .filter -> Arreglo
    // .any -> Bolleano
    // .all -> Booleano
    // .reduce -> Valor
    // .fold -> Valor


}


fun calcularSueldo(
        sueldo: Double, // Requeridos
        tasa: Double = 12.00, // Requeridos (Tienen valor por defecto)
        calculoEspecial : Int? = null // Puede ser nulo "NULL" -> NO REQUERIDO

): Double ? {  // El valor que devuelve Puede ser NULO
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


