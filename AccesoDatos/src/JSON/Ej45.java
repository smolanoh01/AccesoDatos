package JSON;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Ej45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectMapper mapper = new ObjectMapper();
		
		String jsonString = "{ \"dni\": \"15456415A\", \"nombre\": \"Juan\", \"edad\": 30 }";
		Persona p = new Persona();
		
		try {
			p = mapper.readValue(jsonString, Persona.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		System.out.println("Leer y parsed a animados desde JSON: " + p);

	}

}
