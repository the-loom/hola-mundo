package loom.hola_mundo;

public class HolaMundo {
	
	/**
	 * Metodo para saludar
	 * @param persona Persona a la cual se saludará
	 * @return Saludo
	 */

    public String saludar(final String persona) {
    	if(persona.isEmpty())
    		return "¡Hola!";
        return "¡Hola, "+persona+"!";
    }
}
