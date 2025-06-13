def file = new File("Details.txt")
file.text = "Dharsiniya"       //write to a file
file<< "\n Ai&ds"
println file.text              //Read a file



// handle divide-by-zero
try{
    def div = 10/0
    //  println "$div"
}
catch(Exception e){
    println e.message
}
finally{
    println "Exception handled"
}


//handle file not found
try {
    new File("doesNotExist.txt").eachLine { println it }
}
catch (Exception e) {
    println "File Error: ${e.message}"
}
finally {
    println "File Exception Handled"
}



//Method and Property Missing
class Person{
    int id
    void eat(){
        println "Eating"
    }
    def methodMissing(String name,args){                  //methodMissing
        println "Method $name is not defined $args"
    }
    def propertyMissing(String name){                     //propertyMissing
        println "$name undefined"
    }
}
def per = new Person(id: 203)
per.eat()
per.unknownMethod()
per.unknownProperty

//metaprogramming dynamically modify properties
println per.getProperty("id")
per.setProperty("id", 502)
println per.getProperty("id")

per.metaClass.newProp = "added now"
println per.newProp
