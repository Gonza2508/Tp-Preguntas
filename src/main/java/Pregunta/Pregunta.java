package Pregunta;

import java.util.ArrayList;
import EstadoPregunta.*;
import EstrategiaCorreccion.*;
import Respuesta.*;

public abstract class Pregunta {
    protected String enunciado;
    protected ArrayList<Opcion> opciones;
    protected EstadoPregunta estado;
    protected EstrategiaCorreccion estrategia;
    protected Respuesta respuestaCorrecta;

    public Pregunta(ArrayList<Opcion> opciones,
                    EstrategiaCorreccion estrategia, Respuesta respuestaCorrecta) {
//        this.enunciado = enunciado;
        this.opciones = opciones;
        this.estrategia = estrategia;
        this.estado = new SinResponder();
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public void configurarRespuestaCorrecta(Respuesta respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public void agregarOpcionARespuestaJugador(Respuesta respuestaJugador, int numeroOpcion) {
        respuestaJugador.agregarOpcion(this.opciones.get(numeroOpcion - 1));
    }

    public abstract void corregirRespuesta(Respuesta respuestaJugador);

    public int manejarPuntaje() {
        return this.estado.manejarPuntaje(this);
    }

    public int asignarPuntajeAlResponderTodoBien() {
        return this.estrategia.asignarPuntajeAlResponderTodoBien(this.respuestaCorrecta);
    }

    public int asignarPuntajeAlErrarAlguna() {
        return this.estrategia.asignarPuntajeAlErrarAlguna(this.respuestaCorrecta);
    }

    public int asignarPuntajeAlNoResponderTodoBien() {
        return this.estrategia.asignarPuntajeAlNoResponderTodoBien(this.respuestaCorrecta);
    }
}
