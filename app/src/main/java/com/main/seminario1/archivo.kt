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

    //ej12
    //println(capicua(1213));

    //ej13


    //ej14


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
fun primosRelativos(n1: Int, n2: Int):Boolean{


    return true
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


//Ejercicio 14. Crea una función que dado un número n imprima el siguiente ‘mosaico’ (para n = 6):
//1
//22
//333
//4444
//55555
//666666


//Ejercicio 15. Crear una función que reciba dos arrays de enteros y devuelva un array de booleanos
//que determine si los elementos, uno a uno, de ambos arrays son iguales


//Ejercicio 20: Crea una función que calcule el factorial de un número.


//Ejercicio 21: Crea una función que invierta una cadena de texto. Por ejemplo, "hola" debería convertirse en "aloh".



//Ejercicio 22: Crea una función que, dado un número, devuelva True si es un número perfecto (la suma de
//sus divisores propios positivos es igual al número), o False en caso contrario.


//Ejercicio 23: Crea una función que, dado un número entero, devuelva True si es un número Armstrong (un
//número que es igual a la suma de sus propios dígitos elevados a una potencia). Por ejemplo, 153 es un
//número Armstrong porque 1^3 + 5^3 + 3^3 = 153.


//Ejercicio 24: Crea una función que encuentre el número más grande en una matriz bidimensional
//(una lista de listas).


//Ejercicio 25: Crea una función que encuentre el número más pequeño en una matriz
//bidimensional (una lista de listas).


//Ejercicio 26: Crea una función que, dada una lista de palabras, devuelva la palabra más larga.


//Ejercicio 27: Crea una función que, dada una lista de palabras, devuelva la palabra más corta.


//Ejercicio 28: Crea una función que determine si una cadena de texto contiene solo
//caracteres alfabéticos (letras) y espacios en blanco.


//Ejercicio 29: Crea una función que determine si una cadena de texto es un anagrama de otra cadena.
// Dos palabras son anagramas si tienen las mismas letras, pero en un orden diferente.



//Ejercicio 30: Crea una función que, dado un número entero, devuelva True si es un número triangular
// (puede representarse como un triángulo equilátero de puntos), o False en caso contrario.