object Basics extends App{
  //Function
  def myFunction (x:Int,y: String): String= x+" "+y
  val age=23
  val text = "is my age."
  //interpolated string
  // non meaningful expressions
  println(s"My age is $age")
  println(myFunction(age,text))
  //if else expression
  val ageGroup = if(age<5)"Toddler"
  else if(age<13) "kid"
  else if(age<18) "teenager"
  else "Adult"
  val text2="My age group is "
  println(text2+ageGroup)

}

