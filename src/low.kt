fun main(){
println(even(25))
var category1=Product("kales",50.9f,100,"grocery")
 var   category2=Product("msafi",79.9f,160,"hygiene")
  var  category3=Product("drinks",499.9f,30,"others")
   println(category1)
println(category2)
    println(category3)
     println(Newclothes("blouse"))

    println(evenNames(arrayOf("Achol","Sindet","Audrey","Gilly","Wato")))
}
fun even(num:Int):Boolean {

        if (num%2== 0) {
            return true
        }
        else {
            return false
        }
    }


data class Product(val name:String, var weight:Float,var price:Int,var category: String) {
    fun brands() {
        var grocery = mutableListOf<String>()
        var hygiene = mutableListOf<String>()
        var others = mutableListOf<String>()
        when ("category") {
            "grocery" -> println(grocery.add("${name}"))
            "hygiene"-> println(hygiene.add("${name}"))
            else-> println(others.add("${name}"))



        }
        println(grocery)
    }
}


fun Newclothes(clothes:String):String {
    var evenCharecters = ""
    for (Char in clothes) {
        if (clothes.indexOf(Char) % 2 == 0) {
evenCharecters+=Char
        }
    }
return  evenCharecters
}
fun evenNames(names:Array<String>):MutableList<String> {
    var evenName = mutableListOf<String>()
    for (name in names) {
        if(name.length%2==0){
            evenName.add(name)
        }
    }
    return evenName
}




























