import org.eclipse.jetty.ee10.servlet.DefaultServlet
import org.eclipse.jetty.ee10.webapp.WebAppContext
import org.eclipse.jetty.server.Server
import org.scalatra.servlet.ScalatraListener

object JettyLauncher {
  def main(args: Array[String]): Unit = {
    val server = new Server(8080)

    val context = new WebAppContext()
    context.setContextPath("/")
    context.setBaseResourceAsString("src/main/webapp")
    context.addEventListener(new ScalatraListener())
    context.addServlet(classOf[DefaultServlet], "/")
    server.setHandler(context)

    server.start()
    server.join()
  }
}
