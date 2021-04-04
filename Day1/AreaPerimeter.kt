package com.example.kotlinproject1

import java.util.*

fun main()
{
    var sc= Scanner(System.`in`)
    var r:Float=sc.nextFloat()
    var p: Double =3.14
    var radius:Double=p*r*r
    println("The area of circle is: "+String.format("%.3f", radius))
    var perimeter:Double=2*p*r
    println("The perimeter of circle is: "+ String.format("%.3f", perimeter))
    var lensqu:Double=perimeter/4
    println("The length of side of square is: "+String.format("%.3f", lensqu))
}
