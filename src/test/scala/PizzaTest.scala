

import org.scalatest.{BeforeAndAfter, FlatSpec, FunSuite}

class PizzaTest extends FlatSpec {

  val pizza = new Pizza

  "A new pizza " should "have zero topping" in {
    assert(pizza.getTopping.size == 0)
  }

  "A pizza " should "have one topping" in {
    pizza.addTopping(Topping("green-oliver"))
    assert(pizza.getTopping.size == 1)
  }

  it must "get pizza pricing" is (pending)

}

class PizaaTestWithFunsuite extends FunSuite with BeforeAndAfter{

  var pizza: Pizza = _
  before {
    pizza = new Pizza
  }

  test("new pizza has no topping"){
    assert(pizza.getTopping().size == 0)
  }

  test("adding one topping to the pizza"){
    pizza.addTopping(Topping("red-chilly"))
    assert(pizza.getTopping().size == 1)
  }

 /* test("pizza pricing"){
    pending
  }*/
}
