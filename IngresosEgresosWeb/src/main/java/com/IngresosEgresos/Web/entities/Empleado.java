package com.IngresosEgresos.Web.entities;
import java.util.Date;

public class Empleado{
    //Atributos
    long id;
    String email;
    Date createdAt;
    Date updatedAt;

    //Basados en Clases
    Empresa enterprise;
    MovimientoDinero[] transactions;
    Enum_RoleName role;

    //Constructor
    public Empleado()
    {
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    //Getters y Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id=  id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=  email;
    }

}
