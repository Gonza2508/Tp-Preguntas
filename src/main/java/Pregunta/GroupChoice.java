package Pregunta;

import java.util.ArrayList;
import EstrategiaCorreccion.*;
import Respuesta.*;

public class GroupChoice extends Pregunta {
    public GroupChoice(ArrayList<Opcion> opciones,
                       EstrategiaCorreccion estrategia,
                       Respuesta respuestaCorrecta) {
        super(opciones, estrategia, respuestaCorrecta);
    }

    @Override
    public void corregirRespuesta(Respuesta respuestaJugador) {
        this.estado = respuestaCorrecta.corregirSinImportarElOrden(respuestaJugador);
    }
}
