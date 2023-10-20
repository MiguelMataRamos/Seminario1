package com.main.seminario1

import android.speech.tts.TextToSpeech
import java.util.Locale

fun main(){
    //ej1
    //val listaPrueba = listOf(1,2,3);
    //println(mayor(listaPrueba));

    //ej2
    //println(sumatoria(listaPrueba))

    //ej3
    //println(millasAkms(2.0))

    //ej4
    //println(palindromo("yoese"));

    //ej5
    //println(contarLetra("aaeeass","a"));

    //ej6
    //println(contarCadena("holo que tal", "oq" ))

    //ej7
    //println(primeraMayusc("nose ya que poner"))

    //ej8
    //println(sumaDigitos(123))

    //ej9
    //println(mcd(24,36)

    //ej10
    //println(fibo(6))

    //ej11
    //println(primosRelativos(2,4))

    //ej12
    //println(capicua(1213));

    //ej13


    //ej14
    //mosaico(6)

    //ej15
    //val lista1 = listOf(1,2,3)
    //val lista2 = listOf(1,1,3)
    //println(arrayEquals(lista1,lista2))

    //ej16
    //val lista1 = listOf(1,2,3)
    //println(producto(lista1))

    //ej17
    //val lista1 = listOf(1,2,3,4)
    //println(pares(lista1))
    //print(paresConFilter(lista1))

    //ej18
    //println(primo(8))

    //ej19
    //println(eliminarVocales("macarrones con queso"))

    //ej20
    //println(factorial(10))

    //ej21
    //println(invertirCadena("onam al ne otirrop nu noc"))

    //ej22
    //println(numeroPerfecto(10))

    //ej23
    //println(numeroArmstrong(153))

    //ej24
    //val lista1 = listOf(1,2,3,4)
    //println(numeroMasGrande(lista1))

    //ej25
    //val lista1 = listOf(1,2,3,4)
    //println(numeroMasPequeño(lista1))

    //ej26
    //var lista = listOf("palabra", "mas", "larga")
    //println(palabraMasLarga(lista))

    //ej27
    //var lista = listOf("palabra", "mas", "corta")
    //println(palabraMasCorta())

    //ej28
    //println(soloLetrasEspacios("12 ajsgygs"))

    //ej29
    //println(anagrama("hola","olha"))

    //ej30
    //println(numeroTriangular(40))

}


//Ejercicio 1. Crea una función que obtenga el número máximo de una lista de números
fun mayor(list: List<Int>):Int{
    var max=0
    for (l in list){
        if(l > max){
            max = l
        }
    }
    return max
}


//Ejercicio 2. Crea una función que obtenga la sumatoria de una lista de números
fun sumatoria(list: List<Int>):Int{
    var suma = 0
    for (l in list){
        suma += l
    }
    return suma
}


//Ejercicio 3. Crea una función que dada una distancia en millas calcule su correspondiente en kms
fun millasAkms(n:Double):Double{
    return n*1.609
}


//Ejercicio 4. Crea una función que determine si una cadena de texto es un palíndromo.
fun palindromo(texto:String):Boolean{
    val array = texto.split("")
    return array==array.reversed()
}


//Ejercicio 5. Crea una función que cuenta cuántas veces aparece una letra en un texto.
fun contarLetra(texto: String, letra:String):Int{
    var cont =0
    val letras = texto.split("")
    for (l in letras){
        if (l==letra){
            cont++
        }
    }
    return cont
}

//Ejercicio 6. Crea una función que cuenta cuántas veces aparece una subcadena en un texto.
fun contarCadena(texto: String, cadena:String):Int{
    val array = texto.split(cadena)
    return  array.size-1
}


//Ejercicio 7. Crea una función que pone en mayúscula la primera letra de cada palabra de un texto
fun primeraMayusc (texto: String): String {
    var palabras = texto.split(" ")
    var salida = ""


    for (p in palabras){
        salida += p[0].toString().uppercase()
        for (i in 1 until p.length){
            salida += p[i]
        }

        salida += " "
    }

    salida.trim()

    return salida
}

//Ejercicio 8. Crea una función que sume los dígitos de un número. Ejemplo: sumaDigitos(245) = 2 + 4 + 5 = 11
fun sumaDigitos (numero:Int):Int{
    var suma = 0
    var numeroS = numero.toString()
    var numero : Int

    for (i in numeroS){
        numero = i.toString().toInt()
        suma += numero
    }

    return suma
}

//Ejercicio 9. Crea una función que calcule el máximo común divisor de dos números naturales
fun mcd(n1:Int, n2:Int):Int{
    if (n1>n2){
        for (i in n2 downTo 1){
            if (n1%i==0 && n2%i==0){
                return i;
            }
        }
    }else{
        for (i in n1 downTo 1){
            if (n1%i==0 && n2%i==0){
                return i;
            }
        }
    }
    return 0;
}

//Ejercicio 10. Crea una función que calcule el término n-ésimo de la sucesión de Finbonacci.
fun fibo (numero: Int):Int{
    var anterior = 0
    var actual = 1
    var aux = 0

    for (i in 1 until numero){
        aux = actual
        actual += anterior
        anterior = aux
    }

    return aux
}

//Ejercicio 11. Crea una función que determine si dos números son primos relativos.
fun primosRelativos(numero1: Int, numero2: Int): Boolean {
    val mcd = mcd(numero1, numero2)
    return mcd == 1
}

//Ejercicio 12. Crea una función que determine si un número dado es capicúa
fun capicua(numero:Int):Boolean{
    var n1 = numero.toString()
    var n2 = numero.toString().reversed()

    if (n1 == n2){
        return true
    }

    return false
}

//Ejercicio 13. Crea una función que dada una cadena de texto con formato Emmet devuelva su
// correspondiente etiqueta HTML, teniendo en cuenta sólo los atributos de clase e id.
fun emmet (cadena: String):String{
    var res="";



    return res
}


//Ejercicio 14. Crea una función que dado un número n imprima el siguiente ‘mosaico’ (para n = 6):
//1
//22
//333
//4444
//55555
//666666
fun mosaico(n:Int){
    for (i in 1..n){
        for (j in 1..i){
            print(i)
        }
        println()

    }
}


//Ejercicio 15. Crear una función que reciba dos arrays de enteros y devuelva un array de booleanos
//que determine si los elementos, uno a uno, de ambos arrays son iguales
fun arrayEquals (array1: List<Int>, array2: List<Int>):Boolean{
    if (array1.size==array2.size){
        for (i in 0 until array1.size){
            if (array1[i]!=array2[i]){
                return false
            }
        }
    }else{
        return false
    }

    return true
}


//Ejercicio 16: Crea una función que calcule el producto de todos los elementos en una lista de números.
fun producto (lista: List<Int>):Int{
    var res = 1

    for (numero in lista){
        res *= numero
    }

    return res
}

//Ejercicio 17: Crea una función que dada una lista de números, devuelva una nueva lista con solo los números pares.
fun pares (lista : List<Int>):List<Int>{
    var npares  =  mutableListOf<Int>()

    for (numero in lista){
        if (numero%2==0){
            npares.add(numero)
        }
    }

    return npares
}

//CON LA FUNCION FILTER USANDO ITERADOR
fun paresConFilter(lista: List<Int>): List<Int> {
    return lista.filter { it % 2 == 0 }
}

//Ejercicio 18: Crea una función que determine si un número es primo.
fun primo(numero: Int): Boolean {
    if (numero <= 1) {
        return false
    }

    if (numero <= 3) {
        return true
    }

    if (numero % 2 == 0 || numero % 3 == 0) {
        return false
    }

    var i = 5
    while (i * i <= numero) {
        if (numero % i == 0 || numero % (i + 2) == 0) {
            return false
        }
        i += 6
    }

    return true
}

//Ejercicio 19: Crea una función que, dada una cadena de texto, elimine todas las vocales de la cadena.
fun eliminarVocales(cadena: String): String {
    return cadena.replace(Regex("[aeiouAEIOU]"), "")
}

//Ejercicio 20: Crea una función que calcule el factorial de un número.
fun factorial(numero: Int): Int {
    var res = 1
    for (i in 1..numero) {
        res *= i
    }
    return res
}

//Ejercicio 21: Crea una función que invierta una cadena de texto. Por ejemplo, "hola" debería convertirse en "aloh".
fun invertirCadena(cadena: String): String {
    return cadena.reversed()
}

//Ejercicio 22: Crea una función que, dado un número, devuelva True si es un número perfecto (la suma de
//sus divisores propios positivos es igual al número), o False en caso contrario.
fun numeroPerfecto(numero: Int): Boolean {
    var suma = 0

    for (i in 1 until numero) {
        if (numero % i == 0) {
            suma += i
        }
    }

    return suma == numero
}

//Ejercicio 23: Crea una función que, dado un número entero, devuelva True si es un número Armstrong (un
//número que es igual a la suma de sus propios dígitos elevados a una potencia). Por ejemplo, 153 es un
//número Armstrong porque 1^3 + 5^3 + 3^3 = 153.
fun numeroArmstrong(numero: Int): Boolean {
    val n = numero.toString().length
    var suma = 0
    var num = numero

    while (num > 0) {
        val digito = num % 10
        suma += Math.pow(digito.toDouble(), n.toDouble()).toInt()
        num /= 10
    }

    return suma == numero
}


//Ejercicio 24: Crea una función que encuentre el número más grande en una matriz bidimensional
//(una lista de listas).
fun numeroMasGrande(matriz: List<List<Int>>): Int {
    var maximo = 0

    for (fila in matriz) {
        for (elemento in fila) {
            if (elemento > maximo) {
                maximo = elemento
            }
        }
    }

    return maximo
}

//Ejercicio 25: Crea una función que encuentre el número más pequeño en una matriz
//bidimensional (una lista de listas).
fun numeroMasPequeño(matriz: List<List<Int>>): Int {
    var minimo = matriz[0][0]

    for (fila in matriz) {
        for (elemento in fila) {
            if (elemento < minimo) {
                minimo = elemento
            }
        }
    }

    return minimo
}

//Ejercicio 26: Crea una función que, dada una lista de palabras, devuelva la palabra más larga.
fun palabraMasLarga(listaPalabras: List<String>): String? {

    var palabraMasLarga = listaPalabras[0]

    for (palabra in listaPalabras) {
        if (palabra.length > palabraMasLarga.length) {
            palabraMasLarga = palabra
        }
    }

    return palabraMasLarga
}

//Ejercicio 27: Crea una función que, dada una lista de palabras, devuelva la palabra más corta.
fun palabraMasCorta(listaPalabras: List<String>): String? {
    if (listaPalabras.isEmpty()) {
        return null // Devolver null si la lista está vacía.
    }

    var palabraMasCorta = listaPalabras[0]

    for (palabra in listaPalabras) {
        if (palabra.length < palabraMasCorta.length) {
            palabraMasCorta = palabra
        }
    }

    return palabraMasCorta
}

//Ejercicio 28: Crea una función que determine si una cadena de texto contiene solo
//caracteres alfabéticos (letras) y espacios en blanco.
fun soloLetrasEspacios(cadena: String): Boolean {
    for (caracter in cadena) {
        if (!caracter.isLetter() && caracter != ' ') {
            return false
        }
    }
    return true
}

//Ejercicio 29: Crea una función que determine si una cadena de texto es un anagrama de otra cadena.
// Dos palabras son anagramas si tienen las mismas letras, pero en un orden diferente.
fun anagrama(cadena1: String, cadena2: String): Boolean {
    var cadena1Limpia = cadena1.replace("\\s".toRegex(), "").toLowerCase()
    var cadena2Limpia = cadena2.replace("\\s".toRegex(), "").toLowerCase()

    var cadena1Ordenada = cadena1Limpia.toCharArray().sorted().joinToString("")
    var cadena2Ordenada = cadena2Limpia.toCharArray().sorted().joinToString("")

    return cadena1Ordenada == cadena2Ordenada
}

//Ejercicio 30: Crea una función que, dado un número entero, devuelva True si es un número triangular
// (puede representarse como un triángulo equilátero de puntos), o False en caso contrario.
fun numeroTriangular(numero: Int): Boolean {
    var n = 1
    var suma = 0

    while (suma < numero) {
        suma += n
        if (suma == numero) {
            return true
        }
        n++
    }

    return false
}

//Ejercicio 31: Duplicar Elementos en una Lista
//Escribe una función que tome una lista de números y utilice la función map para
//duplicar cada número en la lista. La función debe devolver una nueva lista con
//todos los números duplicados.
//Por ejemplo, si la entrada es [1, 2, 3, 4], la función debe devolver [2, 4, 6, 8].


//Ejercicio 32: Crear un Diccionario a partir de Listas
//Escribe una función que tome dos listas, una lista de claves y otra lista de valores, y
//cree un diccionario utilizando mapOf para combinar las listas en un diccionario
//clave-valor. La función debe devolver el diccionario resultante.


//Ejercicio 33: Crea un programa se encargue de transformar un número decimal a
//binario sin utilizar funciones propias del lenguaje que lo hagan directamente.


//Ejercicio 34: Crea una función que sea capaz de encriptar y desencriptar texto
//utilizando el algoritmo de encriptación de Karaca (debes buscar información sobre él).


//Ejercicio 35: Crea una función que ordene y retorne una matriz de números.
//- La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro adicional
//- "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor o de mayor a menor.
//- No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.

