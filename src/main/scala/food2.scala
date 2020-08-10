object food2 extends App {
  val food = "potatoes"
  val price = 0.37
  val quantity = 20
  val cost = price * quantity
  println(s"It will cost $cost to buy $quantity kilos of $food")
  println(s"We got ${args.length} arguments")
  println(s"The first argument is ${args(0)}")
  println(s"The second argument is ${args(1)}")
  println(s"The third argument is ${args(2)}")
  //TODO write smt what needs to be done later
  //fixme wirte note to fix smt
  val costs = args(0).toFloat * args(1).toInt
  println(s"It will cost $costs Euros to buy ${args(1)} kilos of ${args(2)}")
}
