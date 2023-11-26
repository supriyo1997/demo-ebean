// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/DELL/Desktop/PLAY/demo-ebean/conf/routes
// @DATE:Sun Nov 26 20:03:23 IST 2023


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
