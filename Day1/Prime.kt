package com.example.kotlinproject1


import java.util.*
fun main(args: Array<String>) {
    var sc=Scanner(System.`in`)
    var x=sc.nextInt()
    prime(x)
    
}
fun prime(a:Int):Unit
{
    var l1=ArrayList<Int>()
    var c1=1
    var i=2
    while(c1<=a)
    {
        var c=0
        for(j in 2..i/2)
        {
            if(i%j==0)
            {
                c=c+1
                break
            }
        }
        if(c==0)
        {
            l1.add(i)
            c1++
        }
        i++
    }
    for(k in l1)
    {
        print(k)
        print(" ")
    }    
}
