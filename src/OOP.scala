object OOP extends App {
  class Car{
    val color = "Red"
    val brand = "Honda"
    val ModelNumber = 2
    //define methods in class
    def drive():Unit = println(s"Congrats! for a $brand car")
  }
  //making a new class of same type
 val newCar = new Car

 //inheritance
  class RaceCar(val name: String) extends Car
  val newRaceCar = new RaceCar("Formula_one")
  //subtype Polymorphism
  val aNewCar : Car = new RaceCar(name = "Ferrari")
  aNewCar.drive
  //Abstract Class
  abstract class mysteryCar{
    val speed: Int=100
    def carName(): Unit
  }
  //inheritance
  trait sponsor{
    def spons(name: String): Unit
  }
  //null methods has to be override for creating a class
class brandnewCar extends mysteryCar with sponsor{
  override def spons(name: String): Unit = println("Kia")
    override def carName(): Unit = println("override method")
  }

  // Methods which has single argument can be written as object method argument
  class MyObject{
    def myMethod(num: Int): String = s"My number is $num"
  }
  val TryObject = new MyObject
  val string_prt = TryObject.myMethod(7)
  println("string_prt = "+ string_prt)
  val string_prt1 = TryObject myMethod 7
  println("string_prt1 = "+string_prt1)

  //In Scala Methods can nahe name like "!", "?"
  //Infact operators are also methods in scale
  // 1+2 <==> 1.+(2)
  if(1+2 == 1.+(2)) println("Voila it works!")
  // Apply Method
  object RandomObject{
    val myVal= 23
    def myMeth(y:Int): Int = y*y
    def apply(x: Int): String= s"Apply method is amazing $x"
  }
  println("RandomObject.myVal(4) = "+ RandomObject.myMeth(4))
  println("RandomObject.apply(9) = "+ RandomObject.apply(9))
  //Easy syntax, if only one method in in a singleton object
  println("RandomObject(9) = "+ RandomObject(9))

  // companion

}
