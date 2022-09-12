package com.IngresosEgresos.Web.controllers;

import org.springframework.web.bind.annotation.*;


@RestController
public class MovementsController {


    ///enterprises/[id]/movements
    @GetMapping("/enterprises/{id}/movements")
    public String consultarMovimientos(@PathVariable long id)
    {
        return "200";
    }

    @PostMapping("/enterprises/{id}/movements")
    public String consultarMovimientos1(@PathVariable long id)
    {
        return "200";
    }

    @PatchMapping("/enterprises/{id}/movements")
    public String consultarMovimientos2(@PathVariable long id)
    {
        return "200";
    }
    @DeleteMapping("/enterprises/{id}/movements")
    public String borrarMovimientos(@PathVariable long id)
    {
        return "200";
    }
}
