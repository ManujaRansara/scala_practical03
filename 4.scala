object sum{
     def sumEven(ints : List[Int]) : Int = {
          if(ints.isEmpty){
             0
          }else if(ints.head % 2 == 0){
              ints.head + sumEven(ints.tail)
          }else{
              sumEven(ints.tail)
          }
     }
     def main(args: Array[String]) : Unit = {
        val numbers = List(1,2,3,4,5,6,7,8,9,10)
        val sum = sumEven(numbers)
        println(sum)
     }
}