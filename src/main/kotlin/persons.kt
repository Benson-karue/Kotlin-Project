class People(var name :String, var age :Int, var job_status :String, var gender :String)


fun main(){
    var person1 = People("Rita",7,"unemployed","female")
    println(person1.name +" "+ person1.age +" "+person1.job_status +" "+person1.gender)

    var person2 = People("David",21,"unemployed","male")
    println(person2.name +" "+ person2.age +" "+person2.job_status +" "+person2.gender)

    var person3 = People("David",21,"unemployed","male")
    println(person3)


}