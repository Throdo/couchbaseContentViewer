package routes;

import org.junit.Test;
import play.Logger;
import play.mvc.Result;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.*;

/**
 * Created with IntelliJ IDEA.
 * User: throdo
 * Date: 28/05/13
 * Time: 21:34
 */
public class IndexRouteTest {
    @Test
    public void contextViewerRoute() {
        Logger.info("Une requête GET pour récupérer les informations concernant les clusters Couchbase /contextViewer");
        running(fakeApplication(), new Runnable() {
            public void run() {
                Result result = route(fakeRequest(GET, "/contextViewer"));
                Logger.info("status(result) : " + status(result));
                assertThat(status(result)).isEqualTo(OK);
            }
        });
    }

    @Test
    public void badRoute() {
        Logger.info("Une requête GET pour récupérer les informations concernant les clusters Couchbase /contextViewer");
        Result result = route(fakeRequest(GET, "/bad"));
        Logger.info("status(result) : " + status(result));
        assertThat(status(result)).isEqualTo(BAD_REQUEST);

    }
}
