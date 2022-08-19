package com.portfolio.aprograma.Interface;

import com.portfolio.aprograma.Entity.Persona;
import java.util.List;

public interface IPersonaService {
  //Traer lista de personas 
  public List<Persona> getPersona();  
  
  //Guardar objeto de tipo Persona
  public void savePersona(Persona persona);
  
  //Eliminar un objeto buscado por ID
  public void deletePersona(Long id);
  
  //Buscar persona por ID
  public Persona findPersona(Long id);
          
}
