def print2() = {
  println("One Line")
  println("Second Line")
}
print2()
print2()
def add(a:Int, b:Int):Unit = {
  println(a+b)
}
add(5,10)
add(500,210)
def multAny(a:Double,b:Double): Int={
  (a*b).toInt
}
multAny(9.11,3.14)
multAny(10,2)
def addAndMultiply(a:Double,b:Double, c:Double)={
  add(multAny(a: Double,b).toInt, multAny(b: Double, c).toInt)
}
val myResult = addAndMultiply(3,4,5)
println(myResult)

//Anti- pattern! do not mutate outside variables
var myMutable = 10
def mutateOutside()= {
  myMutable += 5
  println(myMutable)
}
mutateOutside()
mutateOutside()
mutateOutside()

//Instead you should be doing this
def add5(a: Int) = {
  a+5 //remember last line is retunred automatically no need forreturn
}
myMutable
myMutable = add5(myMutable)
myMutable = add5(myMutable)
myMutable = add5(myMutable)
myMutable = add5(myMutable)
myMutable = add5(myMutable)
print2()
print2()

//make functions which Returns! reversed and uppoercase string (so input string
def getReversedUpper(d:String)= {
  println(d)
}
