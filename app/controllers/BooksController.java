package controllers;

import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import models.Book;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import play.i18n.MessagesApi;

import views.html.*;

public class BooksController extends Controller {
	
	  @Inject
	    FormFactory formFactory;
	  @Inject
	  private MessagesApi messagesApi;

	    // for all books

	    public Result index(){
	       List<Book> books= Book.find.all();
	       
	        return ok(index.render(books));
	    }

	    // to create book

	    public Result create(Http.Request request){
	        Form<Book> bookForm = formFactory.form(Book.class);
	        return ok(create.render(bookForm,messagesApi.preferred(request)));
	    }

	    // to save book
	   
	     public Result save(Http.Request request){
	    	 Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest(request);
				/*
				 * if(bookForm.hasErrors()){ flash("danger","Please Correct the Form Below");
				 * return badRequest(create.render(bookForm)); }
				 */
	         Book book = bookForm.get();
	          book.save();
	       
	         return redirect(routes.BooksController.index());
	    }

	    public Result edit(Integer id,Http.Request request){
           Book book=Book.find.byId(id);
           if(book==null)
           {
        	   return notFound("Book not found");
           }
           Form<Book> bookForm = formFactory.form(Book.class).fill(book);
           return ok(edit.render(bookForm,messagesApi.preferred(request)));
	    }

	    public Result update(Http.Request request){
	    	Book bookForm = formFactory.form(Book.class).bindFromRequest(request).get();
	    	Book oldbook=Book.findById(bookForm.id);
	    	if(bookForm==null)
	           {
	        	   return notFound("Book not found");
	           }
	    	oldbook.title=bookForm.title;
	    	oldbook.price=bookForm.price;
	    	oldbook.author=bookForm.author;
	    	
	    	 oldbook.update();
	       
	       
	    	 return redirect(routes.BooksController.index());
	    }

	    public Result destroy(Integer id){
	    	 Book book=Book.find.byId(id);
	    	 if(book==null)
	           {
	        	   return notFound("Book not found");
	           }
	    	 book.delete();
	    	 
	        return  redirect(routes.BooksController.index());
	    }

	    public Result show(Integer id){
	    	 Book book=Book.find.byId(id);
	    	 if(book==null)
	           {
	        	   return notFound("Book not found");
	           }
	    	
	    	 
	        return  ok(show.render(book));
	    }
}
