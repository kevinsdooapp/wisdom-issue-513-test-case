package com.ksenechal.wisdom.issues.issue513.platform;

import org.wisdom.api.DefaultController;
import org.wisdom.api.annotations.Controller;
import org.wisdom.api.annotations.Path;
import org.wisdom.api.annotations.Route;
import org.wisdom.api.annotations.View;
import org.wisdom.api.http.HttpMethod;
import org.wisdom.api.http.Result;
import org.wisdom.api.templates.Template;

@Controller
@Path("/platform")
public class PlatformController extends DefaultController {

    /**
     * Injects a template named 'index'.
     */
    @View("platform/index")
    Template index;

    /**
     * Injects a template named 'index'.
     */
    @View("platform/administration/index")
    Template admin;

    /**
     * Injects a template named 'index'.
     */
    @View("platform/administration/index2")
    Template admin2;

    /**
     * The action method returning the index page. It handles
     * HTTP GET request on the "/" URL.
     *
     * @return the welcome page
     */
    @Route(method = HttpMethod.GET, uri = "/")
    public Result index() {
        return ok(render(index));
    }

    /**
     * The action method returning the index page. It handles
     * HTTP GET request on the "/" URL.
     *
     * @return the welcome page
     */
    @Route(method = HttpMethod.GET, uri = "/admin")
    public Result admin() {
        return ok(render(admin));
    }

    /**
     * The action method returning the index page. It handles
     * HTTP GET request on the "/" URL.
     *
     * @return the welcome page
     */
    @Route(method = HttpMethod.GET, uri = "/admin2")
    public Result admin2() {
        return ok(render(admin2));
    }

}