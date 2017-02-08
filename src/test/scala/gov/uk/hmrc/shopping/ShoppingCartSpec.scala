package gov.uk.hmrc.shopping

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by ashwini on 08/02/17.
  */
class ShoppingCartSpec extends FlatSpec with Matchers {

  "ShoppingCart" should "calculate total cost of fruits when no fruits in basket" in {
    val items = Seq.empty
    val onOffer = false
    ShoppingCart.totalCost(items, onOffer) should be(0.0)
  }

  "ShoppingCart" should "calculate total cost of fruits" in {
    val items = Seq("Apple", "Apple", "Apple", "Orange")
    val onOffer = false
    ShoppingCart.totalCost(items, onOffer) should be(2.05)
  }

  "ShoppingCart" should "calculate total cost of fruits when there is an offer for apple and orange" in {
    val items = Seq("Apple", "Apple", "Apple", "Apple", "Orange", "Orange","Orange")
    val onOffer = true
    ShoppingCart.totalCost(items, onOffer) should be(1.8)
  }

  "ShoppingCart" should "calculate total cost of fruits when selected fruit does not match the offer" in {
    val items = Seq("Apple", "Orange", "Orange")
    val onOffer = true
    ShoppingCart.totalCost(items, onOffer) should be(0.0)
  }
}
