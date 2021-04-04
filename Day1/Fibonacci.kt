package com.example.kotlinproject1

import java.util.*
fun main(args: Array<String>) {
    var sc=Scanner(System.`in`)
    var x=sc.nextInt()
    fib(x)
    
}
fun fib(a:Int):Unit
{
    var l1=ArrayList<Int>()
    var f0:Int=0
    var f1:Int=1
    var i:Int=0
    l1.add(f0)
    l1.add(f1)
    while(i<=a-3){
    var f2:Int=f0+f1
    f0=f1
    f1=f2
    i++
    l1.add(f2)
    }
    for(j in l1)
    {
        print(j)
        print(" ")
    }
}
