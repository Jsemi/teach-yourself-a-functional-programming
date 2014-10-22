object Map {
    
    /*  Exercise
     *  Implement a map functionality for Int lists.
     *  Map means that for a given parameter it gives a new value using function.
     *  Signature to support: Int => Int
     */

    def myMap(lista: List[Int], op: (Int => Int)):List[Int] = {
        if(lista.size > 1) {
            List(op(lista.head)):::(myMap(lista.tail, op))
        } else {
            List(op(lista.head))
        }
    }

    val kokeilu = List(1,2,3,4,5)
    println(myMap(kokeilu, (x: Int) => x*2))
    
    // kokeilu.map((x) => x*2)
}