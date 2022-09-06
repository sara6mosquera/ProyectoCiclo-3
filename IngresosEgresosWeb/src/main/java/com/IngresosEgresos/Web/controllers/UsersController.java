package com.IngresosEgresos.Web.controllers;
import com.IngresosEgresos.Web.services.EnterpriseServices;
import org.springframework.web.bind.annotation.*;


@RestController
public class UsersController {


    @GetMapping("/users")
public String consultarUsuarios()
{
    return "200";
}
    @PostMapping("/users")
    public String consultarUsuarios2()
    {
        return "200";
    }

    @GetMapping("/user/{id}")
    public String consultarUsuario(@PathVariable long id)
    {
        return "200";
    }
    @PatchMapping("/user/{id}")
    public String consultarUsuario1(@PathVariable long id)
    {
        return "200";
    }
    @DeleteMapping("/user/{id}")
    public String consultarUsuario2(@PathVariable long id)
    {
        return "200";
    }
}
