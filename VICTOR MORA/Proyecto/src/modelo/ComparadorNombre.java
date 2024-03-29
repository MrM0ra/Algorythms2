package modelo;

import java.util.Comparator;

/**
 * Clase ComparadorNombre
 * @author Victor Mora
 *
 */
public class ComparadorNombre implements Comparator<Usuario>{

	@Override
	public int compare(Usuario usuario1, Usuario usuario2) {
		return usuario1.getNombre().compareToIgnoreCase(usuario2.getNombre());
	}
	

}
