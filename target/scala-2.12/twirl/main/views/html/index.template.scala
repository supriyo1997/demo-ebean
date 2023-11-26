
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(books : List[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.22*/("""

"""),_display_(/*5.2*/layout("All Books")/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""

	"""),format.raw/*7.2*/("""<h1>All books</h1>
   		
   		"""),_display_(/*9.7*/for(book <- books) yield /*9.25*/{_display_(Seq[Any](format.raw/*9.26*/("""
   		   """),format.raw/*10.9*/("""<a href=""""),_display_(/*10.19*/routes/*10.25*/.BooksController.show(book.id)),format.raw/*10.55*/("""">"""),_display_(/*10.58*/book/*10.62*/.title),format.raw/*10.68*/("""</a>
   		   <p>Price : """),_display_(/*11.21*/book/*11.25*/.price),format.raw/*11.31*/("""</p>
   		   <p>Author: """),_display_(/*12.21*/book/*12.25*/.author),format.raw/*12.32*/("""</p>
   		   
   		""")))}),format.raw/*14.7*/("""
""")))}),format.raw/*15.2*/("""


"""))
      }
    }
  }

  def render(books:List[Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((List[Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-11-26T20:59:42.664108600
                  SOURCE: C:/Users/DELL/Desktop/PLAY/demo-ebean/app/views/index.scala.html
                  HASH: 797c8318e5e4599970cfca65feea2014865af88b
                  MATRIX: 912->5|1027->25|1057->30|1084->49|1122->50|1153->55|1211->88|1244->106|1282->107|1319->117|1356->127|1371->133|1422->163|1452->166|1465->170|1492->176|1545->202|1558->206|1585->212|1638->238|1651->242|1679->249|1731->271|1764->274
                  LINES: 27->3|32->3|34->5|34->5|34->5|36->7|38->9|38->9|38->9|39->10|39->10|39->10|39->10|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|43->14|44->15
                  -- GENERATED --
              */
          