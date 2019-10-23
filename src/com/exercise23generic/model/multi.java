package com.exercise23generic.model;

public class multi 
{
	public static <T> String TipoDeDato(T objeto)
	{
		
	return "Tipo de Dato: "+objeto.getClass()+"\n Nombre del parametro"+ objeto.getClass().getName()+"\n valor del elemento: "+objeto;
	}

}
