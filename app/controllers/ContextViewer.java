package controllers;

import com.orange.contextviewer.AvailableClusters;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Created with IntelliJ IDEA.
 * User: throdo
 * Date: 19/05/13
 * Time: 09:03
 */
public class ContextViewer extends Controller {
    public static Result index() {
        AvailableClusters availableClusters = new AvailableClusters();

        return ok(index.render("ContextViewer application is under development with " + availableClusters.getClusterMap().size() + " Cluster(s) !!!"));
    }
}
