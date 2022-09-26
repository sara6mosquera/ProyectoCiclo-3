package com.IngresosEgresos.Web.entities;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Empleado")
public class Empleado{
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(name = "email")
    String email;



    @Column(name = "nombre")
    String nombre;
    @Column(name = "createdAt")
    Date createdAt;
    @Column(name = "updatedAt")
    Date updatedAt;



    //Basados en Clases
    /*
    Empresa enterprise;
    MovimientoDinero[] transactions;
    Enum_RoleName role;
    */

    //Constructor
    public Empleado()
    {

    }
    public Empleado(String email)
    {
        this.email=email;
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
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
