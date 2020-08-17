import scala.io.Source

//will count lines from first files given as argument
object CountLines extends App {
  //read arg
  //read text file
  //loop through each line and count length
  // keep a running total of all characters
  println("Running Countlines")
  if (args.length > 0) { //at least one file
    for (arg <- args) {
      for (line <- Source.fromFile(args.(arg:Int)).getLines())
        println(s"${line.length.toString}::: $line")
    }
    else
    {
      println("You need to enter file as command argument")
    }
  }
}
