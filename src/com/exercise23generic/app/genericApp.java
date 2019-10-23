package com.exercise23generic.app;
import com.exercise23generic.model.suma;
import com.exercise23generic.model.multi;
import com.exercise23generic.model.resta;
import java.util.ArrayList;
public class genericApp {

	public static void main(String[] args)
	{
		
		suma<Integer> miObjeto = new suma<Integer>(15);
		suma<String>  miObjetoString = new suma<String>("un texto");
		resta<Integer,Integer> miObjetoresta = new resta<Integer, Integer>(10, 20);
		resta<Integer,Integer> miObjetoresta2 = new resta<Integer, Integer>();
		
		
		System.out.println("objeto de miobjeto:"+miObjeto.getMiObjeto());
		System.out.println("objeto de mi objeto String "+" "+miObjetoString.getMiObjeto());
		miObjetoresta2.setKey(100);
		miObjetoresta.setValue(200);
		System.out.println(multi.TipoDeDato(10));
		System.out.println(multi.TipoDeDato(" el macho "));
		System.out.println(multi.TipoDeDato(10.0));
		System.out.println("10.0 +10.0 = "+ suma.sumaNumeros(10, 10));
		
		
		// TODO Auto-generated method stub

	}

}
