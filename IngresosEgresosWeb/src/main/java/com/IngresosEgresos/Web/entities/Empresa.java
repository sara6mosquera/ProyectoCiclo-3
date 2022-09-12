package com.IngresosEgresos.Web.entities;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Empresa")
public class Empresa {
    /*
        Es posible leer y modificar el nombre de la empresa
        Es posible leer y modificar la dirección de la empresa
        Es posible leer y modificar el teléfono de la empresa
        Es posible leer y modificar el NIT de la empresa
     */
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    String name;
    @Column(name = "document")
    String document;
    @Column(name = "phone")
    String phone;
    @Column(name = "address")
    String address;
    @Column(name = "createdAt")
    Date createdAt;
    @Column(name = "updatedAt")
    Date updatedAt;

    //Basados en Clases
    /*
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Empleado.class)
    @JoinColumn(name = "id")
    private List<Empleado> users;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = MovimientoDinero.class)
    @JoinColumn(name = "id")
    private List<MovimientoDinero> transactions;
    */

    //Empleado[] users;
    //MovimientoDinero[] transactions;

    //Constructor
    public Empresa()
    {
       // this.createdAt = new Date();
       // this.updatedAt = new Date();
    }

    public Empresa(String name, String document, String phone, String address)
    {
         super();
         this.name=name;
         this.document=document;
         this.phone=phone;
         this.address=address;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=  name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document=  document;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone=  phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address=  address;
    }


}
