package madeireira.main;

/**
 *
 * @author rianwlp
 */

import br.univates.raiz.auth.Authenticator;
import madeireira.apresentacao.ViewMainGUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) 
    {
        //Retorna uma instancia do timberTech
        TimberTech timberTech = TimberTech.getInstance();
        // PessoaDAO dao = new PessoaDao();
        // ArrayList<Pessoa> users = dao.readAll();

        // FuncionarioDaoPostgres dao = new FuncionarioDaoPostgres();
        // ArrayList<Funcionario> users = dao.readAll();
        
        // Authenticator auth = new Authenticator( users );

        ViewMainGUI vm = new ViewMainGUI();
        vm.setVisible(true);

        // if (auth.showDialog(true))
        // {
        //     timberTech.setUser( auth.getLoggedUser() );
            
        //     View v = new View();
        //     v.setVisible(true);
        // }       
    }
}



