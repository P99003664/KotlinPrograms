package com.example.kotlinproject1


import java.util.*
fun main(args: Array<String>) {
    var sc=Scanner(System.`in`)
    var x=sc.nextInt()
    leapyear(x)
    
}
fun leapyear(a:Int):Unit
{
    if(a%4==0 && a%100!=0 ||  a%400==0)
    {
        println("$a is leap year")
    }
    else
    {
        println("$a is not leap year")
    }
}
