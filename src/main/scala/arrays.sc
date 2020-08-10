var myArr = Array(10, 20, 30, 50, 600)
println(myArr.length)
myArr.getClass
myArr(0)
println(myArr(4))
myArr(myArr.length-1)
myArr.last
myArr.drop(1)
myArr.take(1)
myArr(3) = 9000
// I am overwriting old array with new array
myArr = myArr :+ 555
myArr
// so I cannot overwrite with differnt type
// myArr = "Different type"
//myArr = Array("Valdis","Peteris", "Liga")
myArr = Array(3,32,52,2,6,0)
myArr
myArr :++ Array(5,7,10)
myArr
res12
myArr.max
myArr.min
myArr.reverse
val newArr = myArr :+ 652525
myArr
val insertedArr = newArr.slice(0,6) :++ Array (10,20,30) :++ newArr.slice(6,9)
insertedArr
insertedArr.contains(10)
insertedArr.contains(11)
insertedArr.indexOf(10)
insertedArr(6)
insertedArr.dropRight(2)
insertedArr.take(2)
insertedArr.product
val noZero = insertedArr.slice(0,5) :++ insertedArr.slice(6,insertedArr.length)
noZero
noZero.product
noZero.sum
noZero.foreach(println)
val mySeq = Seq (1,2,3,4,5,6,7,8,90)
mySeq
mySeq.length
mySeq.min
mySeq.max
mySeq.getClass

//generally you import at the beginning of file
import scala.collection.mutable

val myMutableSeq = mutable.ArrayBuffer(1,3,6,7,8,8,10)
myMutableSeq(0) = 1000
myMutableSeq
myMutableSeq += 5000
myMutableSeq ++= Array(3,3,3,10)
myMutableSeq.product
myMutableSeq

//after all this data shaping and mutating lets copy
val immmutableSeq = myMutableSeq.clone()
val immmutableSeq = myMutableSeq.toArray()
immmutableSeq.getClass
