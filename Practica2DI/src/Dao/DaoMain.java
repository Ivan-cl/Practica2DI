package Dao;

import java.util.List;

public interface DaoMain<T, K> {
	
	void añadir(T a);
	
	void cambiar(T a);
	
	void borrar(T a);
	
	List<T> obtenerTodos();
	T obtener (K id);

}