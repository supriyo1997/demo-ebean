
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

object layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title : String)(body:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*3.1*/("""<html>
	
	<head>
		<title>"""),_display_(/*6.11*/title),format.raw/*6.16*/("""</title>
	</head>
   <body>
   		"""),_display_(/*9.7*/body),format.raw/*9.11*/("""
   		
   """),format.raw/*11.4*/("""</body>

</html>"""))
      }
    }
  }

  def render(title:String,body:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(body)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (body) => apply(title)(body)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-11-26T19:43:07.561956100
                  SOURCE: C:/Users/DELL/Desktop/PLAY/demo-ebean/app/views/layout.scala.html
                  HASH: 5f77d40c96cc0813b07fef86c8d089e29bc8fd29
                  MATRIX: 914->1|1036->28|1066->32|1122->62|1147->67|1209->104|1233->108|1272->120
                  LINES: 27->1|32->1|34->3|37->6|37->6|40->9|40->9|42->11
                  -- GENERATED --
              */
          