/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package madeireira.persistencia;

import br.univates.raiz.persistence.IDao;
import madeireira.negocio.Cidade;
import madeireira.negocio.Estado;
import madeireira.negocio.Order;

/**
 *
 * @author rianwlp
 */
public class DAOFactory {

    
    // public static IDao<Estado,String> createEstado()
    // {
    //     return new EstadoDAO();
    // }
    
    // public static IDao<Cidade,Integer> createCidade()
    // {
    //     return new CidadeDAO();
    // }
    
    public static IDao<Order,String> createOrder()
    {
        return new OrderDAO();
    }

    public static IDao<Order,String> createMerchandise()
    {
        return new OrderDAO();
    }
}
