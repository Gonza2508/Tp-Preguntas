package EstrategiaCorreccion;

import Respuesta.Respuesta;

public class Parcial implements EstrategiaCorreccion {
    @Override
    public int asignarPuntajeAlResponderTodoBien(Respuesta respuesta) {
        return respuesta.cantidadDeOpcionesCorrectas();
    }

    @Override
    public int asignarPuntajeAlErrarAlguna(Respuesta respuesta) {
        return 0;
    }

    @Override
    public int asignarPuntajeAlNoResponderTodoBien(Respuesta respuesta) {
        return respuesta.cantidadDeOpcionesCorrectas();
    }
}
