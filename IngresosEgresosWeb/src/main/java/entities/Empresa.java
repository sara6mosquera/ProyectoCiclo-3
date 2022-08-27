package entities;
import java.util.Date;

public class Empresa {
    /*
    * Es posible leer y modificar el nombre de la empresa
Es posible leer y modificar la dirección de la empresa
Es posible leer y modificar el teléfono de la empresa
Es posible leer y modificar el NIT de la empresa
    * */
    //Atributos
    long id;
    String name;
    String document;
    String phone;
    String address;
    Date createdAt;
    Date updatedAt;

    //Basados en Clases
    Empleado[] users;
    MovimientoDinero[] transactions;

    //Constructor
    public Empresa()
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
