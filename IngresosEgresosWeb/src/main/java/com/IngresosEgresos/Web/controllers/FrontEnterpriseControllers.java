package com.IngresosEgresos.Web.controllers;
import com.IngresosEgresos.Web.entities.Empresa;
import com.IngresosEgresos.Web.services.EnterpriseServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FrontEnterpriseControllers {
    EnterpriseServices serviceEnterprise;


    public FrontEnterpriseControllers(EnterpriseServices service) {
        this.serviceEnterprise = service;
    }

    @GetMapping("/")
    public String index()
    {
        return  "index";
    }

    @GetMapping("/empresas")
    public String enterprises(Model pModel)
    {
        List<Empresa> Empresas=  this.serviceEnterprise.consultarEmpresas();
        pModel.addAttribute("Empresas",Empresas);
        return  "enterprises";
    }

    @GetMapping("/empresas/new")
    public String newEmpresa()
    {
        return "new-enterprise";

    }

}
