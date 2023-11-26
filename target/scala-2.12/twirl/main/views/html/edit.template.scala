
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Book],play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookForm: Form[Book])(implicit messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*1.63*/("""



"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/layout("Edit")/*7.16*/{_display_(Seq[Any](format.raw/*7.17*/("""

"""),format.raw/*9.1*/("""<h1>Edit book</h1>

    """),_display_(/*11.6*/helper/*11.12*/.form(routes.BooksController.update())/*11.50*/{_display_(Seq[Any](format.raw/*11.51*/("""

       """),_display_(/*13.9*/helper/*13.15*/.inputText(bookForm("id"))),format.raw/*13.41*/("""
       """),_display_(/*14.9*/helper/*14.15*/.inputText(bookForm("title"))),format.raw/*14.44*/("""
       """),_display_(/*15.9*/helper/*15.15*/.inputText(bookForm("price"))),format.raw/*15.44*/("""
       """),_display_(/*16.9*/helper/*16.15*/.inputText(bookForm("author"))),format.raw/*16.45*/("""

        """),format.raw/*18.9*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-plus"></i> Edit Book</button>
    """)))}),format.raw/*19.6*/("""
    
  """)))}),format.raw/*21.4*/("""

"""))
      }
    }
  }

  def render(bookForm:Form[Book],messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(bookForm)(messages)

  def f:((Form[Book]) => (play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (bookForm) => (messages) => apply(bookForm)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-11-26T19:43:06.326074200
                  SOURCE: C:/Users/DELL/Desktop/PLAY/demo-ebean/app/views/edit.scala.html
                  HASH: 175fa7c40ac508402288265420a3dadfee7badef
                  MATRIX: 930->1|1064->71|1109->62|1143->88|1171->91|1193->105|1231->106|1261->110|1314->137|1329->143|1376->181|1415->182|1453->194|1468->200|1515->226|1551->236|1566->242|1616->271|1652->281|1667->287|1717->316|1753->326|1768->332|1819->362|1858->374|2000->486|2041->497
                  LINES: 27->1|30->5|33->1|37->6|38->7|38->7|38->7|40->9|42->11|42->11|42->11|42->11|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|49->18|50->19|52->21
                  -- GENERATED --
              */
          