package com.IngresosEgresos.Web.entities;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Perfil")
public class Perfil{
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(name = "image")
    String image;
    @Column(name = "phone")
    String phone;
    @Column(name = "createdAt")
    Date createdAt;
    @Column(name = "updatedAt")
    Date updatedAt;

    //Basados en Clases
    /*
    Empleado user;
    */
    //Constructor
    public Perfil()
    {

    }
    public Perfil(String image, String phone)
    {
        this.image=image;
        this.phone=phone;
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