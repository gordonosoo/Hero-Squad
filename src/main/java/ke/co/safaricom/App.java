package ke.co.safaricom;

import ke.co.safaricom.routes.HeroRoutes;
import ke.co.safaricom.routes.SquadRoutes;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        // Configure routes
        HeroRoutes.setupRoutes();
        SquadRoutes.setupRoutes();
    }
}
