package app;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoControlador {
    private static final String respuesta = "Hola, %s!";
    private final AtomicLong contador = new AtomicLong();
        
	public HolaMundoControlador() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/holamundo")
	public String holamundo(@RequestParam(value = "nombre", defaultValue = "Mundo") String nombre) {
	    //String respuestaJSON = String.format(respuesta, nombre);
	    //respuestaJSON = respuestaJSON + new Date().toString();
	    //HolaMundo objetoJSON = new HolaMundo(contador.incrementAndGet(), respuestaJSON);
	    //return objetoJSON;
		return "<p><b>Hola, </p></b>" + nombre + "! ...";
	}
}
