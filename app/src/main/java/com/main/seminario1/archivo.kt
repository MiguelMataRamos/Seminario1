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
    //println(primeraMayusc("nose ya que poner"));

    //ej8
    //println(sumaDigitos(123))

    //ej9

    //ej10
    println(fibo(10))

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

//Ejercicio 6. Crea una función que cuenta cuántas veces aparece una subcadena en un texto.#########################
fun contarCadena(texto: String, cadena:String):Int{
    var cont = 0
    var contsub = 0
    var primeracadena = cadena[0]

    for (i in texto){
        if (cont>0) {
            if (i == cadena[cont]) {
                cont++
            } else {
                cont = 0
            }
        }

        if (i==primeracadena){
            cont ++
        }else{
            cont = 0
        }

        if (cont == cadena.length){
            contsub++
        }

    }
    return contsub
}


//Ejercicio 7. Crea una función que pone en mayúscula la primera letra de cada palabra de un texto
fun primeraMayusc (texto: String): String {
    var letras = texto.split("")
    var salida = ""

    for (i in 0 .. texto.length){
        if (i==1){
            salida += texto[0].uppercase()
        }else{
            salida += letras[i]
        }
    }
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


//Ejercicio 10. Crea una función que calcule el término n-ésimo de la sucesión de Finbonacci.
fun fibo (numero: Int):Int{
    var anterior = 0
    var actual = 1
    var aux = 0

    for (i in 0 until numero){
        aux = actual
        actual += anterior
        anterior = aux
    }

    return aux
}

//Ejercicio 11. Crea una función que determine si dos números son primos relativos.


//Ejercicio 12. Crea una función que determine si un número dado es capicúa
fun capicua(numero:Int):Boolean{
    var n1 = numero.toString()
    var n2 = numero.toString().reversed()

    if (n1 == n2){
        return true;
    }

    return false;
}

//Ejercicio 13. Crea una función que dada una cadena de texto con formato Emmet devuelva su
// correspondiente etiqueta HTML, teniendo en cuenta sólo los atributos de clase e id.
