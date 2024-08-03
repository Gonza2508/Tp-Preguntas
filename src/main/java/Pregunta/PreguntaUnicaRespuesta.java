package Pregunta;

import EstrategiaCorreccion.EstrategiaCorreccion;
import Respuesta.*;

import java.util.ArrayList;

public abstract class PreguntaUnicaRespuesta extends Pregunta {
    protected Respuesta respuestaCorrecta;

    public PreguntaUnicaRespuesta(ArrayList<Opcion> opciones,
                                  EstrategiaCorreccion estrategia, Respuesta respuestaCorrecta) {
        super(opciones, estrategia);
        this.respuestaCorrecta = respuestaCorrecta;
    }


}
