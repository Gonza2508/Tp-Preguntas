package EstrategiaCorreccion;

import Respuesta.Respuesta;

public class Penalidad implements EstrategiaCorreccion {
    @Override
    public int asignarPuntajeAlResponderTodoBien(Respuesta respuesta) {
        return respuesta.cantidadDeOpcionesCorrectas();
    }

    @Override
    public int asignarPuntajeAlErrarAlguna(Respuesta respuesta) {
        return respuesta.cantidadDeOpcionesCorrectas() - respuesta.cantidadDeOpcionesIncorrectas();
    }

    @Override
    public int asignarPuntajeAlNoResponderTodoBien(Respuesta respuesta) {
        return respuesta.cantidadDeOpcionesCorrectas() - respuesta.cantidadDeOpcionesIncorrectas();
    }
}
