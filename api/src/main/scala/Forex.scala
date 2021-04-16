import org.json4s.JsonDSL._
import org.json4s.native.JsonMethods._

import scala.collection.immutable
import scala.xml._

object Forex {
  def getExchangeRates(): Map[String, Double] = {
    val apiUrl = "https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml"
    val response = requests.get(apiUrl)
    val xmlResponse = XML.loadString(response.text)
    val currencyCodes: immutable.Seq[String] = (xmlResponse \\ "@currency").map(node => node.text)
    val euroToCurrencyMultipliers: immutable.Seq[Double] = (xmlResponse \\ "@rate").map(node => node.text.toDouble)
    (currencyCodes zip euroToCurrencyMultipliers).toMap
  }

  def getRatesAsJson(): String = compact(render(getExchangeRates()))

  def main(args: Array[String]): Unit = {
    println(getExchangeRates())
  }
}
