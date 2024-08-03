package EstadoPregunta;

import Pregunta.Pregunta;

public class SinResponder implements EstadoPregunta {
    @Override
    public int manejarPuntaje(Pregunta pregunta) {
        return 0;
    }
}
