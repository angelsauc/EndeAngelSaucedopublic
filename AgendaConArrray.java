package agenda;

//Esto es el cambio que hemos hecho en ende
//papi gavi la verdunch del medio

import java.util.Arrays;

public class AgendaConArrray {
//Atributos
	private Contacto[] contactos;

	//constructor para preparar una agenda vacía
	public AgendaConArrray() {
		this.contactos = new Contacto[200];
	}
	
	public AgendaConArrray(int tamaño) {
		this.contactos = new Contacto[tamaño];
	}
	
	
	//constructor que recibe un array ya preparado
public AgendaConArrray(Contacto[] contactos) {
	super();
	this.contactos = contactos;
}

public Contacto[] getContactos() {
	return contactos;
}

public void setContactos(Contacto[] contactos) {
	this.contactos = contactos;
}
	
//método para buscar un contacto por nombre
public Contacto getContacto(String nombre) {
	for (Contacto contacto : this.contactos) {
		if (contacto.getNombre().equals(nombre)) {
			return contacto;
		}
	}
	return null;
}

//método para eliminar un contacto, pasando nombre
public boolean removeContacto(String nombre) {
for (int i = 0; i < contactos.length; i++) {
	if (contactos[i].getNombre().equals(nombre)) {
		contactos[i] = null; //borro el contacto
	    return true;
	}
}
return false;
}

//Faltan muchos métodos todavía
	
}
