fun main() {
    school("Akirachix")
    println(myself("Orishaba mercy","22"))
    calls("mercy")
    calls("Rabbeca")
    println(hospital("case-clinic"))


}

//Given a string “akirachix”. Write a function that prints out a string composed
//of the first, third and fourth characters of the string.
fun school(name:String){
    val school ="Akirachix"
    var out ="${school[0]}${school[2]}${school[3]}"
    println(school[0]+""+school[2]+""+school[3])

}
//Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and
fun myself(name: String,age:String):String{
    val myself ="Hi,my name is $name and I am $age years old"
    return myself
}
//Write a function that takes in a String and returns its length.
fun hospital(name: String):Int{
    val hospital=(name.length)
    return hospital
}
//Write a function that takes in a name and prints out “That’s me!” when your
//name is passed to it, otherwise it prints out “I don’t know who that is”
fun calls(name: String){
    if(name=="mercy")
        println("That's me")
    else
        println("That's not me")
}


