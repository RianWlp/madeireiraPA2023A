package madeireira.negocio;

/**
 *
 * @author rianwlp
 */

import br.univates.raiz.auth.User;

/**
 * 
 * Sera cadastrado os clientes e fornecedores
 * 
 */

public class Pessoa implements User{

    
    /**
     * 
     * NOTAS 
     *  - Ver sobre o operador que ira acessar os cadastros
     *  - Funcionario, Cliente e Fornecedor
     *  -
     * 
     */
    
    private int id;
    private String username;
    private String nome;
    private String password;
    
    @Override
    public String getUsername() {
     
        return this.username;
    }

    @Override
    public String getName() {
        
        return this.nome;
    }

    @Override
    public String getPassword() {
     
        return password;
    }
}
