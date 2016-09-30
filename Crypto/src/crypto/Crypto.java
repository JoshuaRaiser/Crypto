package crypto;

import gals.LexicalError;
import gals.Lexico;
import gals.SemanticError;
import gals.Semantico;
import gals.Sintatico;
import gals.SyntaticError;

public class Crypto 
{
    
    public static String criptografado = "";

    public static void main(String[] args) 
    {
        try 
        {
            Lexico lex = new Lexico("");
            Sintatico sin = new Sintatico();
            Semantico sem = new Semantico();
            sin.parse(lex, sem);
            
            System.out.println("Codificado: " + criptografado);
            
            String descriptografado = "";
            
            for (Character c : criptografado.toCharArray()) 
            {
                descriptografado += (char)((int)c - 15);
            }
            
            System.out.println("Decodificado: " + descriptografado);
        } catch (LexicalError | SyntaticError | SemanticError ex) {
            System.out.println(ex);
        }
    }
    
}
