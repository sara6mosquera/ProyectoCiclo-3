package com.IngresosEgresos.Web.controllers;
import com.IngresosEgresos.Web.services.EnterpriseServices;
import org.springframework.web.bind.annotation.*;


@RestController
public class EnterprisesController {

    EnterpriseServices serviceEnterprise;

    public EnterprisesController() {
        this.serviceEnterprise = new EnterpriseServices();
    }


    @GetMapping("/enterprises")
public String TaskList()
{
    //this.serviceEnterprise.consultarEmpresas();
    return "200";
}
    @PostMapping("/enterprises")
    public String TaskList2()
    {
        //this.serviceEnterprise.consultarEmpresas();
        return "200";
    }

    @GetMapping("/enterprises/{id}")
    public String TaskList3(@PathVariable long id)
    {
        //this.serviceEnterprise.consultarUnaEmpresa(id);
        return "200";
    }
    @PatchMapping("/enterprises/{id}")
    public String TaskList4(@PathVariable long id)
    {
        //this.serviceEnterprise.consultarUnaEmpresa(id);
        return "200";
    }
    @DeleteMapping("/enterprises/{id}")
    public String TaskList5(@PathVariable long id)
    {
        //this.serviceEnterprise.eliminarUnaEmpresa(id);
        return "200";
    }
}
