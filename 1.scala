object ReverseString{
     def reverse(str:String):String = {
        if(str.isEmpty){
            ""
        }else{
            reverse(str.substring(1)) + str.charAt(0)
        }     
     }

     def main(args : Array[String]):Unit = {
                val OriginalString = "ManujaRansara"
                val ReverseString = reverse(OriginalString);
                println(ReverseString);
     }
   
}

