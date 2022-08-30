package com.IngresosEgresos.Web.entities;
import java.util.Date;

public class Perfil{
    //Atributos
    long id;
    String image;
    String phone;

    Date createdAt;
    Date updatedAt;

    //Basados en Clases
    Empleado user;

    //Constructor
    public Perfil()
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image=  image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone=  phone;
    }



}