package gov.uk.hmrc.shopping

/**
  * Created by ashwini on 08/02/17.
  */
object ShoppingCart {

  val fruitPrice = Map("Apple" -> 0.6, "Orange" -> 0.25)

  def totalCost(items: Seq[String], onOffer: Boolean):BigDecimal = {
    val (apples, oranges) = items.partition(_ == "Apple")
    onOffer match {
      case true => {
        0.0
      }
      case false => {
        val applesCost = fruitPrice("Apple") * apples.size
        val orangesCost = fruitPrice("Orange") * oranges.size
        applesCost + orangesCost
      }
    }

  }








}
