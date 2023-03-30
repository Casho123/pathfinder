package bg.softuni.pathfinder.web;

import bg.softuni.pathfinder.model.Picture;
import bg.softuni.pathfinder.model.Route;
import bg.softuni.pathfinder.service.RouteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {

    private final RouteService routeService;

    public HomeController(RouteService routeService) {
        this.routeService = routeService;
    }


    @GetMapping("/")
    public String home(Model model) {

        List<Route> routes = this.routeService.getMostCommentedRoute();

        model.addAttribute("mostCommentedRoute", routes.get(0));

        return "index";

    }
}
