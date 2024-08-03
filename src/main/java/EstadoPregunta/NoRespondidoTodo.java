package EstadoPregunta;

import Pregunta.Pregunta;

public class NoRespondidoTodo implements EstadoPregunta {
    @Override
    public int manejarPuntaje(Pregunta pregunta) {
        return pregunta.asignarPuntajeAlNoResponderTodoBien();
    }
}
