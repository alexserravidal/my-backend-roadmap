package com.bolsadeideas.testing.daos;

import java.util.List;

public interface IPreguntaDao {
	
	List<String> findPreguntasByExamenId(Long id);

}