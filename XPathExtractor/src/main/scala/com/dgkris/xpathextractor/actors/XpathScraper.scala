import akka.actor.{ActorLogging, Actor}

class XpathScraper extends Actor with ActorLogging {

  def receive = {
    case "scrape" => log.info(s"scrape xpath from html")
  }
}