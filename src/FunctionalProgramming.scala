object FunctionalProgramming extends App{
  //All Scala Function are instance of FunctionX (X=1,2,3,....22)
  //Funcional programming we can:
  //1) Compose function
  //2) Pass function as argument
  //3) Return Function as results

  val AdditionFun = new Function2[Int,Int,Int]{
    override def apply(v1: Int, v2: Int): Int = v1+v2
  }
  println("AdditionFun(3,4) = "+ AdditionFun(3,4))
  // simple syntax
  // val AdditionFun2: Function2[Int,Int,Int] = (x:Int,y Int)=> x+y
  val AdditionFun2: Function2[Int,Int,Int] = (x:Int,y: Int)=> x+y
  println("AdditionFun2(3,4) = "+ AdditionFun2(3,4))
  // simpler syntax
  val AdditionFun3: (Int,Int)=> Int = (x:Int,y: Int)=> x+y
  println("AdditionFun3(3,4) = "+ AdditionFun3(3,4))
  // Simplest Syntax
  val AdditionFun4 = (x:Int, y:Int)=> x+y
  println("AdditionFun4(3,4) = "+ AdditionFun4(3,4))

  //High Order Functions
  //Map
  val double_digit_map:List[Int]= List(1,2,3).map(x=>x*2)
  println(double_digit_map)
  //Flat Map
  val numb_square_flatmap: List[Int]= List(1,2,3,4).flatMap(x =>List(x,x*x))
  println(numb_square_flatmap)
  // Filter
  val pickEven :List[Int] = List(1,2,3,4,5,6,7,8).filter (x=> x%2==0)
  println(pickEven)

  // Combination of Map, Flat Map and Filter
  val pickevensquares = List(1,2,3,4,5,6,7,8).filter(number => number%2==0).flatMap(number=>(List(number, number*number)))
  println(pickevensquares)
  // Alternate way of doing it
  val pickevensquares2 = for {
    number <- List(1, 2, 3, 4, 5, 6, 7, 8) if number%2==0
  } yield (number, number*number)
  println(pickevensquares2)

  // Collection List, Sets, Sequence, Vector, Range, Tuple
  // List
  val aList = List(1,2,3,4,5)
  println("Head = "+aList.head)
  println("Tail = " +aList.tail)
  val prependList = 0:: aList
  println("prependList = " + prependList )
  val extendList = 8 +: aList :+ 6
  println("extendList = " + extendList )

  // Seq
  val aSeq = Seq(1,3,5,6,7,8,0)
  println("aSeq index number 3 is "+aSeq(3))

  // Vector
  val myVec = Vector(2,3,4,5,6)
  //Sets
  val mySet = Set(1,4,5,4,3,5,2)
  println("mySet = "+ mySet)
  val myBool= mySet.contains(4) // myBool is true
  val mySet1 = mySet+0

  // Range
  val myRange = 1 to 10
  val squaresRange = myRange.map(x=> x*x).toVector
  println(squaresRange)
  //Tuples
  val myTuple = ("Abhijeet"," Visakhapatnam", 212)

  //map
  val SurnameBook = Map(
    "Harry" -> "Potter",("Hermione","Granger")
  )
  println(SurnameBook)





}
