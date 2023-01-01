package kotlin_learnings

fun main(){
    println(lambda1(1,2))
    addition(4,5,{a,b->a+b})
}
val lambda1={x:Int,y:Int ->x+y}
val lambda2:(Int,Int)->Int={a,b->a+b}
val lambdatemp={x:Int ->x+x}
val lambda3:(Int)->Int={it+it}
val lambda4={
    println("Entered nums are")
    println("i am a good boy")
    2//last value will be lambda return type, in this case int
}

fun addition(a:Int, b:Int ,op:(Int,Int)->Int): Int {
    return op(a,b)
}
