package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result contextViewer() {
        return ok(index.render("ContextViewer application is ready to be developed !!!"));
    }
}
