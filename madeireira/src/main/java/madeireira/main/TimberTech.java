package madeireira.main;

import br.univates.raiz.auth.User;
import br.univates.raiz.db.DataBaseConnectionManager;
import br.univates.raiz.db.DataBaseException;

/**
 *
 * @author rianwlp
 */

public class TimberTech {

    private String nameTimberTech;
    private String licensed;
    private User   user;
    private DataBaseConnectionManager dbcm;

    private static TimberTech timberTech = new TimberTech();

    public static TimberTech getInstance(){

        return timberTech;
    }

    private TimberTech(){

        this.nameTimberTech = "Sistema de gestao de madeireiras";
        this.licensed       = "Rian Welp";
        this.user           = null;
        
        // CREATE DATABASE teste;
        // CREATE USER postgres WITH ENCRYPTED PASSWORD 'postgres';
        
        try
        {

            //Instalar o sqlite3
            //sudo pamac install sqlite3

            // this.dbcm = new DataBaseConnectionManager( DataBaseConnectionManager.POSTGRESQL,"teste","postgres" ,"postgres");
            // this.dbcm = new DataBaseConnectionManager( DataBaseConnectionManager.POSTGRESQL,"teste","rianwlp" ,"xxx15159","192.168.0.23");
            // this.dbcm = new DataBaseConnectionManager( DataBaseConnectionManager.SQLITE,"teste","rianwlp" ,"xxx15159");
            this.dbcm = new DataBaseConnectionManager( DataBaseConnectionManager.SQLITE,"/home/rianwlp/Documents/teste.db","" ,"");
            
        } 
        catch (DataBaseException ex)
        {
            System.exit(0);
        }
    }

    public void setUser(User user)
    {
        this.user = user;
    }
     
    public String getSystemName()
    {
        return nameTimberTech;
    }

    public String getLicensedName()
    {
        return licensed;
    }

    public User getUser()
    {
        return user;
    }

    public DataBaseConnectionManager getDB()
    {
        return dbcm;
    }
}
