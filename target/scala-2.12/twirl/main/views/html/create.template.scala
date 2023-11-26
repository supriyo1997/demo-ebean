
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Book],play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(bookForm: Form[Book])(implicit messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*6.2*/import helper._


Seq[Any](format.raw/*2.63*/("""



"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/layout("Create book")/*8.23*/{_display_(Seq[Any](format.raw/*8.24*/("""
   
   """),format.raw/*10.4*/("""<h1>Create book</h1>

    """),_display_(/*12.6*/helper/*12.12*/.form(action = routes.BooksController.save())/*12.57*/{_display_(Seq[Any](format.raw/*12.58*/("""

       """),_display_(/*14.9*/helper/*14.15*/.inputText(bookForm("id"))),format.raw/*14.41*/("""
       """),_display_(/*15.9*/helper/*15.15*/.inputText(bookForm("title"))),format.raw/*15.44*/("""
       """),_display_(/*16.9*/helper/*16.15*/.inputText(bookForm("price"))),format.raw/*16.44*/("""
       """),_display_(/*17.9*/helper/*17.15*/.inputText(bookForm("author"))),format.raw/*17.45*/("""

        """),format.raw/*19.9*/("""<button class="btn btn-success" type="submit"><i class="glyphicon glyphicon-plus"></i> Create Book</button>
    """)))}),format.raw/*20.6*/("""
""")))}),format.raw/*21.2*/("""

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
                  DATE: 2023-11-26T19:43:05.875079700
                  SOURCE: C:/Users/DELL/Desktop/PLAY/demo-ebean/app/views/create.scala.html
                  HASH: 4c1d94131bee5c0a97143a6a5ae89d82b193d72b
                  MATRIX: 932->3|1066->73|1111->64|1145->90|1173->93|1202->114|1240->115|1277->125|1332->154|1347->160|1401->205|1440->206|1478->218|1493->224|1540->250|1576->260|1591->266|1641->295|1677->305|1692->311|1742->340|1778->350|1793->356|1844->386|1883->398|2027->512|2060->515
                  LINES: 27->2|30->6|33->2|37->7|38->8|38->8|38->8|40->10|42->12|42->12|42->12|42->12|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|49->19|50->20|51->21
                  -- GENERATED --
              */
          