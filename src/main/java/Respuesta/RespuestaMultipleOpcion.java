package Respuesta;

import java.util.ArrayList;

public class RespuestaMultipleOpcion extends Respuesta {
    public RespuestaMultipleOpcion() {
        super();
    }

    public RespuestaMultipleOpcion(ArrayList<Opcion> opciones) {
        super(opciones);
    }

    @Override
    public void cambiarRespuesta(Opcion opcion) {
        opciones.clear();
    }
}
