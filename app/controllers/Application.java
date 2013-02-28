package controllers;

import play.*;
import play.mvc.*;

import play.data.*;
import models.*;

import views.html.*;

static Form<Task> taksForm = Form.form(Task.class);

public class Application extends Controller {
  
  public static Result index() {
    return redirect(routes.Application.tasks());
  //  return ok(index.render("Your new application is ready."));
  }
  public static Result tasks() {
	//  return TODO;
		return ok(views.html.index.render(Task.all(),taskForm));
  }
  public static Result newTask() {
	  return TODO;
  }
  public static Result deleteTask(Long id) {
	  return TODO;
  }

}
