package madeireira.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.univates.raiz.db.DataBaseConnectionManager;
import br.univates.raiz.db.DataBaseException;
import br.univates.raiz.persistence.Filter;
import br.univates.raiz.persistence.IDao;
import br.univates.raiz.persistence.InvalidKeyException;
import br.univates.raiz.persistence.KeyViolationException;
import br.univates.raiz.persistence.NotFoundException;

import madeireira.main.TimberTech;
import madeireira.negocio.Order;

/**
 *
 * @author rianwlp
 */

public class OrderDAO implements IDao<Order,String>{

    //CRUD

    @Override
    public void create(Order order) throws KeyViolationException, InvalidKeyException
    {
        
        /*
        if (a chave é errada)
        {
            new InvalidKeyException();
        }
        */
        
        DataBaseConnectionManager dbcm;
        try
        {
            System.out.println("CHEGUEI NO DAO");
            
            dbcm = TimberTech.getInstance().getDB();
            
            String sql = "INSERT INTO order VALUES ( ?, ?, ?, ?);";

            dbcm.runPreparedSQL(sql,order.getDeliveryDate(),
                                    order.getOrderDate(),
                                    order.getObservations(),
                                    order.getQuantity()
                                );

            System.out.println(dbcm);

            // dbcm.runPreparedSQL(sql, Order.getData().getDataFormatada(0), 
            //                          Order.getHorario().getHorario( Horario.HHMMSS ), 
            //                          Order.getRetangulo().getBase(),
            //                          Order.getRetangulo().getAltura() );
                                     
            dbcm.closeConnection();
        }
        catch (DataBaseException ex)
        {
            System.out.println(ex);

            // throw new KeyViolationException();
        }
    }
    
    @Override
    public ArrayList<Order> readAll()
    {
        ArrayList<Order> lista = new ArrayList();
        
        DataBaseConnectionManager dbcm;
        try
        {
            dbcm = TimberTech.getInstance().getDB();
            
            String sql = "SELECT * FROM Order;";

            ResultSet rs = dbcm.runQuerySQL(sql);
            
            // if (rs.isBeforeFirst())
            // {
            //     rs.next();
            //     while (!rs.isAfterLast())
            //     {
            //         // Date dt = rs.getDate("data_calculo");
            //         // Time time = rs.getTime("hora_calculo");
            //         // Double base = rs.getDouble("base");
            //         // Double altura = rs.getDouble("altura");
                    
            //         // Order h = new Order(dt,time,new Retangulo(base,altura) );
            //         // lista.add(h);
                    
            //         // rs.next();
            //     }
            // }
        } 
        catch (DataBaseException ex)
        {
            System.out.println("Foi de arrasta pra cima");
        }

        // catch (SQLException ex)
        // {
        //     Logger.getLogger(OrderDaoPostgres.class.getName()).log(Level.SEVERE, null, ex);
        // }
        return lista;
    }

    @Override
    public Order read(String id) throws NotFoundException
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ArrayList<Order> readAll(Filter<Order> filter)
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void update(Order object){

    }

    @Override
    public void delete(String id){

    }
}
