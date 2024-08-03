package Respuesta;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import EstadoPregunta.*;

public abstract class Respuesta {
    protected ArrayList<Opcion> opciones;
    private int cantidadOpcionesCorrectas;
    private int cantidadOpcionesIncorrectas;

    public Respuesta() {
        opciones = new ArrayList<>();
    }

    public Respuesta(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }

    public void agregarOpcion(Opcion opcion) {
        opciones.add(opcion);
    }

    public void eliminarOpcion(int numeroOpcion) {
        opciones.remove(numeroOpcion - 1);
    }

    public abstract void cambiarRespuesta(Opcion opcion);

    public boolean mismaCantidadOpciones(Respuesta otraRespuesta) {
        return this.opciones.size() == otraRespuesta.opciones.size();
    }

    public boolean respuestaVacia(Respuesta otraRespuesta) {
        return otraRespuesta.opciones.isEmpty();
    }

    public boolean otraRespuestaTieneMayorCantidadDeOpciones(Respuesta otraRespuesta) {
        return this.opciones.size() < otraRespuesta.opciones.size();
    }

    public EstadoPregunta corregirRespuestaUnica(Respuesta otraRespuesta) {
        if(respuestaVacia   (otraRespuesta)) {
            return new SinResponder();
        }
        else if(this.opciones.equals(otraRespuesta.opciones)) {
            this.cantidadOpcionesCorrectas++;
            return new TodoBien();
        }
        this.cantidadOpcionesIncorrectas++;
        return new Errado();
    }

    public EstadoPregunta corregirSinImportarElOrden(Respuesta otraRespuesta) {
        if(respuestaVacia(otraRespuesta)) {
            return new SinResponder();
        }
        List<Opcion> opciones1 = this.opciones;
        List<Opcion> opciones2 = otraRespuesta.opciones;

        Set<Opcion> set1 = new HashSet<>(opciones1);
        Set<Opcion> set2 = new HashSet<>(opciones2);

        Set<Opcion> iguales = new HashSet<>(set1);
        Set<Opcion> diferentes = new HashSet<>(set2);

        iguales.retainAll(set2);
        diferentes.removeAll(set1);

        this.cantidadOpcionesCorrectas = iguales.size();
        this.cantidadOpcionesIncorrectas = diferentes.size();

        if(this.otraRespuestaTieneMayorCantidadDeOpciones(otraRespuesta) ||
                cantidadOpcionesIncorrectas != 0) {
            return new Errado();
        }
        else {
            if(this.cantidadOpcionesCorrectas == this.opciones.size()) {
                return new TodoBien();
            }
            return new NoRespondidoTodo();
        }
    }

    public EstadoPregunta corregirImportandoElOrden(Respuesta otraRespuesta) {
        if(respuestaVacia(otraRespuesta)) {
            return new SinResponder();
        }
        else if(this.opciones.equals(otraRespuesta.opciones)) {
            return new TodoBien();
        }
        return new Errado();
    }

    public int cantidadDeOpcionesCorrectas() {
        return this.cantidadOpcionesCorrectas;
    }

    public int cantidadDeOpcionesIncorrectas() {
        return this.cantidadOpcionesIncorrectas;
    }
}
