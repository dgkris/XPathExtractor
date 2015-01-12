import akka.actor.{ActorLogging, Actor}

class CSVWriter extends Actor with ActorLogging {

  def receive = {
    case "read" => log.info(s"read line from queue and write it to file")
        // loop and read html files in src folder
        // Create HTMLfile model for each file, with attribute : html, text, etc
        // ScraperActor ! scrape(HTMLfile,xpath)
        // send Reply
  }
}