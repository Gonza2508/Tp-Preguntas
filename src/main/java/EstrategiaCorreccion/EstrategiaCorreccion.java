package EstrategiaCorreccion;

import Respuesta.Respuesta;

public interface EstrategiaCorreccion {
    int asignarPuntajeAlResponderTodoBien(Respuesta respuesta);

    int asignarPuntajeAlErrarAlguna(Respuesta respuesta);

    int asignarPuntajeAlNoResponderTodoBien(Respuesta respuesta);
}
