package com.main.seminario1

fun main(){
    //ej1
    val listaPrueba = listOf(1,2,3);
    println(mayor(listaPrueba));


    //ej2
    println(sumatoria(listaPrueba))

    //ej3
    println(millasAkms(2.0))

    //ej4
    println(palindromo("yoese"));

    //ej5
    println(contarLetra("aaeeass","a"));

    //ej6




}
//Ejercicio 1. Crea una función que obtenga el número máximo de una lista de números
fun mayor(list: List<Int>):Int{
    var max=0;
    for (l in list){
        if(l > max){
            max = l;
        }
    }
    return max;
}


//Ejercicio 2. Crea una función que obtenga la sumatoria de una lista de números
fun sumatoria(list: List<Int>):Int{
    var suma = 0;
    for (l in list){
        suma += l;
    }
    return suma;
}


//Ejercicio 3. Crea una función que dada una distancia en millas calcule su correspondiente en kms
fun millasAkms(n:Double):Double{
    return n*1.609;
}


//Ejercicio 4. Crea una función que determine si una cadena de texto es un palíndromo.
fun palindromo(texto:String):Boolean{
    val array = texto.split("");
    return array==array.reversed();
}


//Ejercicio 5. Crea una función que cuenta cuántas veces aparece una letra en un texto.
fun contarLetra(texto: String, letra:String):Int{
    var cont =0;
    val letras = texto.split("");
    for (l in letras){
        if (l==letra){
            cont++;
        }
    }
    return cont;
}

//Ejercicio 6. Crea una función que cuenta cuántas veces aparece una subcadena en un texto.#########################
fun contarCadena(texto: String, cadena:String):Int{
    var cont =0;
    val letras = texto.split(" ");
    for (l in letras){
        if (l==cadena){
            cont++;
        }
    }
    return cont;
}


//Ejercicio 7. Crea una función que pone en mayúscula la primera letra de cada palabra de un texto
fun primeraMayusc(texto:String):String{
    var palabras = texto.split(" ");
    var palabrasMayus ;

    for (p in palabras){

    }

}

//Ejercicio 8. Crea una función que sume los dígitos de un número. Ejemplo: sumaDigitos(245) = 2 + 4 + 5 = 11


//Ejercicio 9. Crea una función que calcule el máximo común divisor de dos números naturales








