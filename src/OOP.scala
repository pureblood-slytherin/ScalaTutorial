object OOP extends App {
  class Car{
    var color = "Red"
    var brand = "Honda"
    var ModelNumber = 2
    def drive():Unit = println("Congrats! for a new car")
  }
 var newCar = new Car
  newCar.brand = "Mersedeze"
  println(newCar.brand)

}
