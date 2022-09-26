package com.IngresosEgresos.Web.controllers;
import org.springframework.web.bind.annotation.*;
import com.IngresosEgresos.Web.entities.Empleado;
import com.IngresosEgresos.Web.services.UserServices;

import java.util.List;
import java.util.Optional;

@RestController
public class UsersController {

    //EnterpriseServices serviceEnterprise;
    UserServices serviceUser;
    public UsersController(UserServices service) {
        this.serviceUser = service;
    }

//    @GetMapping("/users")
//    public List<Empleado> consultarUsuarios()
//    {
//        return (List<Empleado>) this.serviceUser.consultarUsuarios();
//        //return “200“;
//    }

    @PostMapping("/users")
    public Empleado CrearEmployee(@RequestBody Empleado pEmpleado)
    {
        return this.serviceUser.crearUsuario(pEmpleado);
        //return “200”;
    }

//    @GetMapping("/user/{id}")
//    public Optional<Empleado> EmployeeList(@PathVariable long id)
//    {
//        return this.serviceUser.consultarUnUsuario(id);
//        //return “200“;
//    }
    @PatchMapping("/user/{id}")
    public Optional<Empleado> EmployeeList2(@PathVariable long id)
    {
        return this.serviceUser.consultarUnUsuario(id);
        //return “200“;
    }

    @DeleteMapping("/user/{id}")
    public String borrarEmployee(@PathVariable long id)
    {
        this.serviceUser.eliminarUnUsuario(id);
        return "200";
    }
}
