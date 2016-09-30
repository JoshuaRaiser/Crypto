package gals;

import crypto.Crypto;

public class Semantico implements Constants
{
    public void executeAction(int action, Token token)	throws SemanticError
    {
        if (1 == action)
        {
            Character criptografado = 0;
            String caracter = token.getLexeme();
            
            for (Character c : caracter.toCharArray()) 
            {
                criptografado = (char)((int)c + 15);
            }
            
            Crypto.criptografado += criptografado.toString();
        }
    }	
}
