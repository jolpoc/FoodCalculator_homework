val a = 24
if (a == 0) println ("a is 0")
else if (a == 1) println("a is getting to be 1")
else if (a == 2) println("a is getting to be 2")
else if (a == 3) println("a is getting to be 3")
else if (a == 4) println("a is getting to be 4")
else println("what is this?")

val result = {
  a match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
  }
}
println(result)

val text = "Valdis"

println({
  text match{
    case "Anna" => 1000
    case "Liga" => 2000
    case "Valdis" => 9000
    case _ => -1
  }
})

def prettyPrint (anyItem: Any):Unit= {
  println(s"Just a prrety pring of $anyItem)")
}

def lazyPow(a:Int, b:Double =2):Double = {
  Math.pow(a,b)
}
lazyPow(10)
lazyPow(10,0.5)


def only4(incoming: Any):Any = incoming match {

case_=>"Error"
}
println(only4( 1))
println(only4(incoming = 1))