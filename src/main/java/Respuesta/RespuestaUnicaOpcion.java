package Respuesta;

import java.util.ArrayList;

public class RespuestaUnicaOpcion extends Respuesta {
    public RespuestaUnicaOpcion() {
        super();
    }

    public RespuestaUnicaOpcion(ArrayList<Opcion> opciones) {
        super(opciones);
    }

    @Override
    public void cambiarRespuesta(Opcion opcion) {
        opciones.clear();
        this.agregarOpcion(opcion);
    }
}
