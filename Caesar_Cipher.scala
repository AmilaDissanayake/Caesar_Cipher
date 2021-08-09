object Caesar_Cipher {

  def main(args: Array[String]): Unit ={

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val Enc=(c:Char,key:Int,s:String)=>
      s((s.indexOf(c.toUpper)+key)%s.size)
    println(Enc('m',5,alphabet))

    val Dnc=(c:Char,key:Int,s:String)=>
      s((s.indexOf(c.toUpper)-key)%s.size)
    println(Dnc('r',5,alphabet))

    val cipher=(algo:(Char,Int,String)=>
      Char,s:String,key:Int,a:String)=>
      s.map(algo(_,key,a))

    val ct = cipher(Enc,"Amila",5,alphabet)
    val pt = cipher(Dnc,ct,5,alphabet)

    println(ct)
    println(pt)
  }

}
