/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercioeletronico;

import java.util.HashSet;

/**
 *
 * @author talita.machado.a
 */
public class ComercioEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Cadastro de clientes");
      Cliente cl=new Cliente();
      cl.identificacao="152615612556";
      cl.genero="F";
      cl.nome="Maria Só";
      cl.data_nascimento=new java.util.Date();
      cl.data_nascimento.setDate(1111111);
      
      System.out.println(cl);
    }
    
}
