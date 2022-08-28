package controllers;
import org.springframework.web.bind.annotation.*;


@RestController
public class EnterprisesController {
@GetMapping("/enterprises")
public String TaskList()
{
return "200";
}
    @PostMapping("/enterprises")
    public String TaskList2()
    {
        return "200";
    }

    @GetMapping("/enterprises/{id}")
    public String TaskList3(@PathVariable long id)
    {
        return "200";
    }
    @PatchMapping("/enterprises/{id}")
    public String TaskList4(@PathVariable long id)
    {
        return "200";
    }
    @DeleteMapping("/enterprises/{id}")
    public String TaskList5(@PathVariable long id)
    {
        return "200";
    }
}
