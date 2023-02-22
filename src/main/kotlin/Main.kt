fun main(){
    println(names("Kenya "," is"," my"," country"))
addition()
    println(sen("Kotlin","is","fun"))
    countrycities()

}
fun names(a:String,b:String,c:String,d:String) :String{
    var sentence= a+b+c+d
  return(sentence)

    }
fun countrycities(){
    var cities = arrayOf("harare","mumbai","dodoma","jakart")
    cities.forEach { cities-> println(cities)}
        println(cities.contentToString().uppercase())

}
fun addition(){
var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numbers[2]+numbers[4]
    println(sum)
    println(numbers.indexOf(158))
    numbers.sort()
    println(numbers.contentToString())

}
fun sen(word1:String,word2:String,word3:String) :String{
    var senlong= "$word1  $word2  $word3"
    return(senlong)
}


