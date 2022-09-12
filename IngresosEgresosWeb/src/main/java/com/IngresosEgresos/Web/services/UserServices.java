package com.IngresosEgresos.Web.services;
import com.IngresosEgresos.Web.entities.Empleado;
import com.IngresosEgresos.Web.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
    private EmployeeRepository repository;

    public UserServices(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Empleado> consultarUsuarios()
    {
        return this.repository.findAll();
        //return "hola";
    }
    public Optional<Empleado> consultarUnUsuario(long id)
    {
        return this.repository.findById(id);
        //return "mundo";
    }
    public Empleado crearUsuario(Empleado newEmpleado)
    {
        // return this.repository.
        return this.repository.save(newEmpleado);
        //return "mundo";
    }

    public String editarUnUsuario(long id)
    {
//return this.repositor
        return "mundo";
    }

    public void eliminarUnUsuario(long id)
    {
        this.repository.deleteById(id);
        //return "mundo";
    }

}
