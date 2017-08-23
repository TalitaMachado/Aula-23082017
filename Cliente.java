/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercioeletronico;

/**
 *
 * @author talita.machado.a
 */
public class Cliente {
    public String identificacao;
    public String nome;
    public String genero;
    public java.util.Date data_nascimento; 
    public String telefone;
    
    public boolean aniversariantemes(){
        if (data_nascimento.getMonth()== new java.util.Date().getMonth())
    return true;
        return false;
                }
    public String toString(){
        String texto = "identificacao" + identificacao + "\n";
        texto +="nome:" + nome+"\n";
        texto += "genero:" +genero+"\n";
        texto += "data_nascimento:0" +data_nascimento +"\n";
        texto += "telefone:" + telefone +"\n";
        return texto;
    }
}
