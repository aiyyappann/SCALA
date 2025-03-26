class Person(var name: String, var age: Int) {}
object Person {
  def apply(data: String): Person = {
    val parts = data.split(" ")
    val p = new Person(parts(0), parts(1).toInt)
    p
  }
}
object test {
  def main(args: Array[String]) = {
    val p1 = Person("John 30")
    println(p1.name)
    val p2 = new Person("Jane", 25)
    println(p2.name)

    val personsdata = List("A 1", "B 2")
    val persons = personsdata.map(Person(_))
    persons.foreach(s => println(s.name))
  }
}
