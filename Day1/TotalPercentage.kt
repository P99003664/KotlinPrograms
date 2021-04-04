package com.example.kotlinproject1


fun main()
{
    var sub1=Integer.valueOf(readLine())
    var sub2=Integer.valueOf(readLine())
    var sub3=Integer.valueOf(readLine())
    var total=sub1+sub2+sub3
    var perc=total/3
    println("The total marks of student is $total")
    println("The percentage of student is "+perc+"%")
}
