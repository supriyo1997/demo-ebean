
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Book,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(book : Book):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.15*/("""

"""),_display_(/*4.2*/layout(book.title)/*4.20*/{_display_(Seq[Any](format.raw/*4.21*/("""
	
		"""),format.raw/*6.3*/("""<h2>"""),_display_(/*6.8*/book/*6.12*/.title),format.raw/*6.18*/("""</h2>
   		   <p>Price : """),_display_(/*7.21*/book/*7.25*/.price),format.raw/*7.31*/("""</p>
   		   <p>Author: """),_display_(/*8.21*/book/*8.25*/.author),format.raw/*8.32*/("""</p>
   		    <a href=""""),_display_(/*9.20*/routes/*9.26*/.BooksController.edit(book.id)),format.raw/*9.56*/("""">Edit</a>
   		     <a href=""""),_display_(/*10.21*/routes/*10.27*/.BooksController.destroy(book.id)),format.raw/*10.60*/("""">Delete</a>

""")))}),format.raw/*12.2*/("""

"""))
      }
    }
  }

  def render(book:Book): play.twirl.api.HtmlFormat.Appendable = apply(book)

  def f:((Book) => play.twirl.api.HtmlFormat.Appendable) = (book) => apply(book)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-11-26T19:43:07.823958200
                  SOURCE: C:/Users/DELL/Desktop/PLAY/demo-ebean/app/views/show.scala.html
                  HASH: c5d8e64055536f2c97fa750f7a928965edc8ff10
                  MATRIX: 905->3|1013->16|1043->21|1069->39|1107->40|1140->47|1170->52|1182->56|1208->62|1261->89|1273->93|1299->99|1351->125|1363->129|1390->136|1441->161|1455->167|1505->197|1564->229|1579->235|1633->268|1680->285
                  LINES: 27->2|32->2|34->4|34->4|34->4|36->6|36->6|36->6|36->6|37->7|37->7|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|42->12
                  -- GENERATED --
              */
          