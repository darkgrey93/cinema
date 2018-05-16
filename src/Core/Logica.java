/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Core;

/**
 *
 * @author Darkgrey93
 */
import  Pojos.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
public class Logica {
    public Usuario loggear(String nombreL, String claveL){
        Usuario nuevoU = new Usuario();
        
        ArrayList<Usuario> usuarios_Lista = new ArrayList<Usuario>();
        Iterator<Usuario> usuarios_Interador = usuarios_Lista.iterator();
        while(usuarios_Interador.hasNext()){
	nuevoU = usuarios_Interador.next();
	if (nuevoU.getNombre()==nombreL && nuevoU.getClave()==claveL)
            return  nuevoU;
        }
        JOptionPane.showConfirmDialog(null, "no se encontro un usuario con esta clave y nombre revise por favor los espacios");
        return null;
    }
    public Boolean registrarse(String nombre,String clave,String telefono){
        ArrayList<Usuario> usuarios_Lista = new ArrayList<Usuario>();
        Usuario nuevoU = new Usuario();
        try{
            nuevoU.setNombre(nombre);
            nuevoU.setClave(clave);
            nuevoU.setTel(telefono);
            nuevoU.setId(2);
            usuarios_Lista.add(nuevoU);
            return true;
        }catch(Exception ex){
            System.out.println("Registro fallido");   
        }
        
        
    }
        
        
} 

