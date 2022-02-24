

//fun main() {
 //   var myName: String? = null
   // if(myName != null){
     //   print(myName)



  //  val value: Float= if(true){
    //    print("inside true")
      //  110f
    //}else{
    //    20f
    //}
  //  print (value)


  //val name="Ama"

  //when(name){
     // "Aman"->{
        //  print("Ki hall e Aman")
      //}
      //"Nav"->{
        //  print("ki nu")
      //}
    //  else->{
      //    print("nothing to print")
//      }

  //}


/*val names= arrayOf("Aman","rahul", "Arun")
    //for(x in names){
      //  println(x)
    //}
    names.forEach {
        print(it)
    }*/

   // print(operation(2.5f,7.3f))
 //   greeting(name = "Aman", greet = "good morning")
  /*  val output= opp(4, 5, {a, b ->
        print("Adding both numbers")
        val temp= a*a
        temp+b
    })
    print(output)*/
//}

/*fun operation(a:Float, b:Float) : Float{
    return (a + b)*/
/*fun greeting(greet: String, name: String){
    print(" Hello $name $greet")*/
//}
/*fun opp(a: Int, b:Int, operate:(Int, Int) -> Int): Int{
    return operate(a, b)
}*/


/*
fun main() {
    val list = listOf<Int>(1,2,8,4,7,6)
     list.filter ({ it % 2==0 }
     )
         .map { it*it }
         .forEach( {println("$it")})

}

*/
/*import java.util.Scanner
fun main(){
   val scan = Scanner(System.`in`)
    scan.forEach {
        println(it)
    }

}*/

/*
import java.util.Scanner
fun main(){
    val scan = Scanner(System.`in`)
   for (i in 1..4){
       println(scan.next())
    }

}*/

/*
fun main() {
    val d : Double= 101.0
    val e = 3.1415
    */
/*val n: Long = d.toLong()
    val b1 = "false".toBoolean()*//*

    println(d.toString())
    println(e.toLong())
    print(e.toString())

}
*/
/*
fun main() {
    println("The earth is Oval. Print true or false:")
    val answer = readLine()!!.toBoolean()
    print(message = "The earth is Oval: ")
    print(answer)
}
*/

/*
fun main(){
    val (a, b, c, d) = readLine()!!.split(" ")
    println(a)
    println(b)
    println(c)
    println(d)
}*/
 /*fun main() {
    val largeString = """
    This is the house that Jack built.
      
    This is the malt that lay in the house that Jack built.
       
    This is the rat that ate the malt
    That lay in the house that Jack built.
       
    This is the cat
    That killed the rat that ate the malt
    That lay in the house that Jack built.
""".trimIndent() // removes the first and the last lines and trim indents
    print(largeString)
 }*/

/*fun main() {
    val a = readLine()!!.toInt()
    val n = readLine()!!.toInt()
    //val b = a + n
    print(a + n)
}*/

/*fun main() {
    val a = readLine()!!
    print("${a.length} is $a: ${a.repeat(a.length)}")
}*/

/*un main() {
    val b1 = readLine().toBoolean()
    val b2 = readLine().toBoolean()
    println(!b1 && !b2)
    println(!b1 && b2)
    println(b1 || !!b2)
    println(!b1 || b2)
    print(!(b1 || b2))

}
*/

/*
fun main(){
    val b1 = readLine().toBoolean()
    val b2 = readLine().toBoolean()
    println( !b1 || b2)

    println(!b1 && b2)

    println(!b1 && !b2)

   println(!(b1 || b2))

    print(b1 || !!b2)
}
*/
 /*fun main() {
    val f: Float = (20.0 + 20.02f).toFloat()

    val f1 = (20.0 + 20.02f).toDouble()

    val l1: Long = (10 + 2L).toLong()

    val l = (10 + 2L).toInt()

    val n1: Int = (3L + 5).toInt()

    val n = (3L + 5).toShort()
    println("$f")
    println("$f1")
    println("$l1")
    println("$l")
    println("$n1")
    println("$n")
 }*/


/*
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val s = a + b + c
    if (s % 2 == 0) {
        println(s / 2)
   } else {
        println((s / 2)+1)
   }
}
*/


/*
fun main() {
    val a = List(3) { readLine()!!.toInt() }
    val b = a.toSet()
    print(b.size == 3)
}*/

/*
fun main() {
    val n = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    val c = readLine()!!.toLong()
    print( n in b..c || n in c..b)
}
*/

/*
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val r = listOf(a,b,c).filter { it > 0}
    print(r.size == 1)

}*/

/*
fun main() {
    val c = readLine()!!.toInt()
    val w = readLine().toBoolean()
    println(c in if (w)  15..25 else 10..20)

}
*/


fun main() {
    val n = readLine()!!.toInt()
    var maxi = 0
    repeat(n) {
        val a = readLine()!!.toInt()
        if (a % 4 == 0 && a > maxi) {
            maxi = a
        }
    }
    println("$maxi")
}