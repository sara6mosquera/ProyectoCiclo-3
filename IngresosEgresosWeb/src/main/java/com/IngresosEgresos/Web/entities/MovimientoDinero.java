package com.IngresosEgresos.Web.entities;
import java.util.Date;

//en el figma aparece como Transaction pero en el pdf se habla de entidades en español
public class MovimientoDinero {

    //Atributos
    long id;
    String concept;
    float amount;

    Date createdAt;
    Date updatedAt;

    //Basados en Clases
    Empleado user;
    Empresa enterprise;


    //Constructor
    public MovimientoDinero()
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

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept=  concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount=  amount;
    }

}

