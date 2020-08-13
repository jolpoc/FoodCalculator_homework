object food2 extends App {
  var price = 0.37
  var quantity = 20
  var myVar = 50
  println(s"We got ${args.length} arguments")
  //! means negation
  // if (!args.isEmpty)
  if (args.length >=2){
    price = args(0).toFloat
    quantity = args(1).toInt
  }
  val food = if (args.length >=3)
    args(2)
  else "potatoes"
if (args.length >=3) {
  println(s"The first argument is ${args(0)}")
  println(s"The second argument is ${args(1)}")
  println(s"The third argument is ${args(2)}")
}
  myVar += 100
  myVar +=100
  val cost = BigDecimal(price * quantity).setScale(4,BigDecimal.RoundingMode.HALF_UP)

  println(s"It will cost $cost to buy $quantity kilos of $food")
  //TODO write smt what needs to be done later
  //fixme wirte note to fix smt
  val costs = args(0).toFloat * args(1).toInt
  println(s"It will cost $costs Euros to buy ${args(1)} kilos of ${args(2)}")
  println("All is done")
}

