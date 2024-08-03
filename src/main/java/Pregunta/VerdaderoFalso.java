package Pregunta;

import java.util.ArrayList;
import EstrategiaCorreccion.*;
import Respuesta.*;

public class VerdaderoFalso extends Pregunta {

    public VerdaderoFalso(ArrayList<Opcion> opciones,
                          EstrategiaCorreccion estrategia, Respuesta respuestaCorrecta) {
        super(opciones, estrategia, respuestaCorrecta);
    }

    @Override
    public void corregirRespuesta(Respuesta respuestaJugador) {
        this.estado = respuestaCorrecta.corregirRespuestaUnica(respuestaJugador);
    }
}
