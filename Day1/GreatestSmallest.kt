package com.example.kotlinproject1


import java.util.*
fun main()
{
    var r:(Int,Int)->Unit={a,b:Int->println("Greatest number is $a and smallest number is $b") }
    var sc=Scanner(System.`in`)
    var n=sc.nextInt()
    var l1=ArrayList<Int>()
    for(i in 0..n-1)
    {
        l1.add(sc.nextInt())
    }
    smallgreat(l1,n,r)
}
fun  smallgreat(a:ArrayList<Int>,n:Int,r: (Int,Int) -> Unit):Unit
{
    var small=a.get(0)
    var large=a.get(0)
    for(i in 0..n-1)
    {
        if(a[i]>large)
             large=a[i]
        if(a[i]<small)
            small=a[i]
    }
    r(large,small)
 
}
