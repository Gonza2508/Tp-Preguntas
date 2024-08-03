package EstrategiaCorreccion;

import Respuesta.Respuesta;

public class Clasico implements EstrategiaCorreccion {
    @Override
    public int asignarPuntajeAlResponderTodoBien(Respuesta respuesta) {
        return 1;
    }

    @Override
    public int asignarPuntajeAlErrarAlguna(Respuesta respuesta) {
        return 0;
    }

    @Override
    public int asignarPuntajeAlNoResponderTodoBien(Respuesta respuesta) {
        return 0;
    }

}
