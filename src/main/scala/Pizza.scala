import scala.collection.mutable.ArrayBuffer

class Pizza {
  private val toppings = new ArrayBuffer[Topping]
  def addTopping(t: Topping) = {toppings += t}
  def getTopping() = toppings.toList
  def removeTopping(t: Topping) = {toppings -= t}
}
case class Topping(name: String)