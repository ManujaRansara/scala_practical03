object mean{
     def meanTwoNumbers(num1:Int,num2:Int):Float = {
         val mean = (num1 + num2).toFloat / 2
         val rounded =  mean
         rounded
     }
     def main(args:Array[String]) : Unit = {
         var num1 = 100;
         var num2 = 13;
         val result = meanTwoNumbers(num1, num2)
         println(f"$result%.2f")
     } 
}