
import scalasql._
import scalasql.mysql._


object OriginalTest extends App {
    
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost/test"
    val username = "username"
    val password = "password"

    val students = SQLSet[Student]("students", driver, url, username, password)
    
    val first_ten = students.filter(_.id < 10)
    
    val daniels = students.filter(_.name == "daniel")
    
    println (toMySQL(first_ten.getQuery))
        
    for (s <- first_ten){
        println("name: " + s.name_ + ", age: " + s.age_ + ", id: "+ s.id_)
    }
    
    for (s <- daniels){
        println("name: " + s.name_ + ", age: " + s.age_ + ", id: "+ s.id_)
    }

}

class Student extends SQLTuple {
    val id = Field[Int]("id")
    val name = Field[String]("name")
    val age = Field[Int]("age")

    override def attributes = List(id, name, age)
}





