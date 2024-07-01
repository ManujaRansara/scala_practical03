object  ReturnGreaterThanFive {
    def filter(strings: List[String]): List[String] ={
            if (strings.isEmpty){
                Nil
            }else if (strings.head.length > 5){
                strings.head :: filter(strings.tail)
            }else{
                filter(strings.tail)
    }
   }

    def main(args:Array[String]):Unit = {
            val input = List("welcome", "to", "the", "real", "awensome", "worlds")
            val output = filter(input)
            println(output) 
    }

}