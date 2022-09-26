package com.IngresosEgresos.Web.controllers;
import com.IngresosEgresos.Web.entities.MovimientoDinero;
import com.IngresosEgresos.Web.services.TransactionServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MovementsController {

    TransactionServices serviceTransaction;
    ///enterprises/[id]/movements
    public MovementsController(TransactionServices service) {
        this.serviceTransaction = service;
    }

    @GetMapping("/enterprises/{id}/movements")
    public List<MovimientoDinero> consultarMovimientos(@PathVariable long id)
    {
        return this.serviceTransaction.consultarTransactions();
        //return “200”;
    }

    @PostMapping("/enterprises/{id}/movements")
    public MovimientoDinero crearTransaction(@RequestBody MovimientoDinero pTx)
    {
        return this.serviceTransaction.crearTransaction(pTx);
        //return “200”;
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
