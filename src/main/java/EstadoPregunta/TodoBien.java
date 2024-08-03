package EstadoPregunta;

import Pregunta.Pregunta;

public class TodoBien implements EstadoPregunta {
    @Override
    public int manejarPuntaje(Pregunta pregunta) {
        return pregunta.asignarPuntajeAlResponderTodoBien();
    }
}
