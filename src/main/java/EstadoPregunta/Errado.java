package EstadoPregunta;

import Pregunta.Pregunta;

public class Errado implements EstadoPregunta {
    @Override
    public int manejarPuntaje(Pregunta pregunta) {
        return pregunta.asignarPuntajeAlErrarAlguna();
    }
}
