package gov.uk.hmrc.shopping

/**
  * Created by ashwini on 08/02/17.
  */
object ShoppingCart {

  val fruitPrice = Map("Apple" -> 0.60, "Orange" -> 0.25)

  def totalCost(items: Seq[String], onOffer: Boolean): BigDecimal = {
    val (apples, oranges) = items.partition(_ == "Apple")
    onOffer match {
      case true => {
        val applesCost = BigDecimal(fruitPrice("Apple")) * (apples.size / 2)
        val orangesCost = fruitPrice("Orange") * ((oranges.size / 3) * 2)
        applesCost + orangesCost
      }
      case false => {
        val applesCost = fruitPrice("Apple") * apples.size
        val orangesCost = fruitPrice("Orange") * oranges.size
        applesCost + orangesCost
      }
    }

  }
}
