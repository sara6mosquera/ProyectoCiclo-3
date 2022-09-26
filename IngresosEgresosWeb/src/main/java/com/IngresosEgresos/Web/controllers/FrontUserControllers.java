package com.IngresosEgresos.Web.controllers;

import com.IngresosEgresos.Web.entities.Empleado;
import com.IngresosEgresos.Web.services.UserServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import java.util.List;

@Controller
public class FrontUserControllers {
    @Autowired
    UserServices serviceUser;
    public FrontUserControllers(UserServices service) {
        this.serviceUser = service;
    }
//    @GetMapping("/")
//    public String index() {
//        return "index";
//    }

    @GetMapping("/users1")
    public String users(Model pModel)
    {
        List<Empleado> Empleados=  this.serviceUser.consultarUsuarios();
        pModel.addAttribute("empleado",Empleados);
        return "users";
    }
    @GetMapping("/users1/new")
    public String newUser(Model pModel)
    {
        pModel.addAttribute("empleado", new Empleado());
        return "new-user";

    }
}
