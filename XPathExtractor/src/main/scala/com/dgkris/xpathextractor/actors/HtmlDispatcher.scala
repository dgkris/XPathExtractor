import akka.actor.{ActorLogging, Actor}

class HtmlDispatcher extends Actor with ActorLogging {

  def receive = {
    case "Initialise" => log.info(s"read html files in")
        // loop and read html files in src folder
        // Create HTMLfile model for each file, with attribute : html, text, etc
        // ScraperActor ! scrape(HTMLfile,xpath)
        // send Reply
  }
}