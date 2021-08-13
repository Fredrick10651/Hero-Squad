import static spark.Spark.*;
import static spark.route.HttpMethod.post;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import models.hero;
import models.squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;


public class App {


    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }

    public static void main(String[] args) {


        port(getHerokuAssignedPort());
        staticFileLocation("/public");
        staticFileLocation("/public");
        hero.buildNewHero();
        hero.buildNewHero1();
        squad.buildNewSquad();
        squad.buildNewSquad1();

//        main page
        get("/", (request, response) -> {
                    Map<String, Object> model = new HashMap<String, Object>();
                    return new ModelAndView(new HashMap(), "main.hbs");
                }, new HandlebarsTemplateEngine()
        );

//        Hero form for filling
        get("/Hero-form",(req, res) ->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "Hero-form.hbs");
        }, new HandlebarsTemplateEngine());

//The Heroes page
        get("/Hero", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<hero> hero = models.hero.getAllInstances();
            model.put("Hero", hero);
            return new ModelAndView(model, "Hero.hbs");
        }, new HandlebarsTemplateEngine());

        post("/new/hero", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            Integer age = Integer.parseInt(request.queryParams("age"));
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            hero buildHero = new hero(name, age, power, weakness);
            request.session().attribute("item", name);
            model.put("item", request.session().attribute("item"));
            model.put("newHero", buildHero);
            return new ModelAndView(model, "submit.hbs");
        }, new HandlebarsTemplateEngine());



// registering a squad
        get("/Squad-form",(req, res) ->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "Squad-form.hbs");
        }, new HandlebarsTemplateEngine());

// squads are displayed
        get("/Squad", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<squad> squads = squad.getInstances();
            model.put("squads", squads);
            ArrayList<hero> members = hero.getInstances();
            squad newSquad = squads.get(1);
            model.put("Hero", members);
            model.put("squadMembers", newSquad.getSquadMembers());
            return new ModelAndView(model, "Squad.hbs");
        }, new HandlebarsTemplateEngine());

        post("/new/squad",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String squadTag = request.queryParams("squadTag");
            Integer squadTotal = Integer.parseInt(request.queryParams("squadTotal"));
            String motive = request.queryParams("motive");
            squad buildSquad = new squad(squadTag, squadTotal, motive);
            request.session().attribute("item", squadTag);
            model.put("item", request.session().attribute("item"));
            model.put("newSquad", buildSquad);
            return new ModelAndView(model, "submit.hbs");
        }, new HandlebarsTemplateEngine());

//
    }
}
