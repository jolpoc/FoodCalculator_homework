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
def getReversedUpper(text:String):String = {
  text.length
  //println(s"Going to reverse $text")
  // I could do stuff here and it will not be returned
  text.toUpperCase.reverse
}


getReversedUpper(text = "Beer")
getReversedUpper(text = "Jolanta")

//common pattern create local result variable then return at the end
def getResults(a:Int,txt:String) : Int = {
  var result = 0
  result = a * txt.length
  result += 1000 // result = result + 1000
  result //last line is what gets returned
}

getResults(10, txt = "Jolanta")
def getMaxName(a:Int, b:Int)= {
  val myName = "Jolanta"
  var result = 0
  if (a>b) {
    //scope for myName is local to inner curly braces!!
    result = a* myName.length
  } else {
    result = b
  }
}

getMaxName(5,3)
def getMax(a:Int, b:Int)= {
  var result = 0
  if (a>b) {
    //scope for myName is local to inner curly braces!!
    result = a
  } else {
    result = b
  }
}

getMax(10,20)
getMax(5,3)
// a is global for this notebook
val a = 4
if (a== 2*2){
  println("A is 4")
} else {
  println("A is not 4")
}

//for functions which return booleans we prefix isSomething
def isEqualto4(a:Int): Boolean ={
  if (a==2*2){
    true
  } else {
    false
  }
  //shorter is simply
  a == 2*2
}
isEqualto4(4)
isEqualto4(5)
5> 2*2
4>=2*2
4!=5
4!=4
val myName = "Jolanta"
if (myName == "Jolanta") {
  println("Mine too!")
}
println("Wow this almost never happens!")
def checkName(myName:String, friendName:String) = {
  var isSame = false
  if (myName == friendName){
    println(s"Wow our names match perfectly my dear $friendName")
 isSame = true
  } else{
    println(s"Well my name $myName is different from your $friendName")
 isSame = false
  }
  println ("Let's stay friends")
  isSame
}

checkName( myName= "Jolanta", friendName = "Liga")
checkName( myName= "Jolanta", friendName = "Jolanta")