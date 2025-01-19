
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * @author Ballini Juan Bautista
 */

public class Controladora {
    
    //Creo una instancia para usar los métodos de la Controladora de Persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, String nomDuenio, String celu, String alergico, String atencion) {
        
        //Creo el dueño y asigno sus campos
        Duenio duenio = new Duenio();
        duenio.setCel(celu);
        duenio.setNombre(nomDuenio);
        
        //Creo la mascota y asigno sus campos
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencionEspecial(atencion);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio, masco);
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int numCliente) {
        controlPersis.borrarMascota(numCliente);
    }

    public Mascota traerMascota(int numCliente) {
        return controlPersis.traerMascota(numCliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color, String observaciones, String nomDuenio, String celu, String alergico, String atencion) {
        
        //Asigno los nuevos datos de la mascota
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        
        //Modifico la mascota
        controlPersis.modificarMascota(masco);
        
        //Seteo nuevos valores al dueño
        Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getIdDuenio());
        dueno.setCel(celu);
        dueno.setNombre(nomDuenio);
        
        //Llamo a modificar dueño
        this.modificarDuenio(dueno);
    }

    private Duenio buscarDuenio(int idDuenio) {
        return controlPersis.traerDuenio(idDuenio);
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }
}
