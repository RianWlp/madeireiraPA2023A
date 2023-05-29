package madeireira.persistencia;

import br.univates.raiz.db.DataBaseConnectionManager;
import br.univates.raiz.db.DataBaseException;
import br.univates.raiz.persistence.Filter;
import br.univates.raiz.persistence.IDao;
import br.univates.raiz.persistence.InvalidKeyException;
import br.univates.raiz.persistence.KeyViolationException;
import br.univates.raiz.persistence.NotFoundException;
import madeireira.negocio.Cidade;
import madeireira.negocio.Estado;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author mouriac
 */
// public class CidadeDAO extends IDao<Cidade,Integer>
// {

    
//     @Override
//     public void create(Cidade cidadeNova) throws KeyViolationException, InvalidKeyException
//     {
//         if (cidadeNova.getId() <= 0)
//         {
//             throw new InvalidKeyException();
//         }
        
//         try
//         {
//             String sql = "insert into cidade values ( ?, ?, ?)";
//             SystemManager.getInstance().getDataBase().runPreparedSQL(sql, cidadeNova.getId(), 
//                                                                           cidadeNova.getNome(), 
//                                                                           cidadeNova.getEstado().getSigla() );
//         } 
//         catch (DataBaseException ex)
//         {
//             throw new KeyViolationException();
//         }
//     }

//     @Override
//     public Cidade read(Integer primaryKey) throws NotFoundException
//     {
//         Cidade cidadeRetorno = null;
        
//         if (primaryKey == null || primaryKey <= 0)
//         {
//             throw new NotFoundException();
//         }
        
//         try
//         {
//             String sql = "select * from cidade where id = ?";
//             SystemManager.getInstance().getDataBase().runPreparedQuerySQL(sql, primaryKey);
            
//             ResultSet rs = SystemManager.getInstance().getDataBase().getResultSet();
            
//             if (rs.isBeforeFirst())
//             {
//                 rs.next(); // posiciona sobre o único retorno da consulta
//                 int id = rs.getInt("id");
//                 String nome = rs.getString("nome");
//                 String uf = rs.getString("sigla_estado");
                
//                 cidadeRetorno = new Cidade(id, nome, DaoFactory.createEstadoDao().read(uf) );
//             }
//         }
//         catch (DataBaseException ex) // deu erro na execução do SQL, não gerar um not found, mas o problema é no SQL
//         {
//             throw new NotFoundException();
//         } 
//         catch (SQLException ex) // executou o SQL mas não retornou nada
//         {
//             throw new NotFoundException();
//         }
        
//         return cidadeRetorno;
//     }

//     @Override
//     public ArrayList<Cidade> readAll()
//     {
        
//         ArrayList<Cidade> lista = new ArrayList();
        
//         try
//         {
//             ResultSet rs = SystemManager.getInstance().getDataBase().runQuerySQL("select * from cidade;");
            
//             if (rs.isBeforeFirst())
//             {
//                 rs.next();
//                 while (!rs.isAfterLast())
//                 {
//                     int id = rs.getInt("id");
//                     String nome = rs.getString("nome");
//                     String uf = rs.getString("sigla_estado");
                    
//                     Cidade c = new Cidade(id, nome, DaoFactory.createEstadoDao().read(uf) );
//                     lista.add(c);
                    
//                     rs.next();
//                 }
//             }
//         } 
//         catch (DataBaseException | SQLException | NotFoundException ex)
//         {
//             // não executa nada. Não há o que fazer.
//         } 
        
//         // retornar a lista com todas as cidades lidas
//         return lista;
//     }

//     @Override
//     public void update(Cidade cidadeAtualizada) throws NotFoundException
//     {
//         if (cidadeAtualizada == null || cidadeAtualizada.getId() <= 0)
//         {
//             throw new NotFoundException();
//         }
        
//         try
//         {
//             String sql = "update cidade set nome = ?,sigla_estado = ? where id = ?";
//             SystemManager.getInstance().getDataBase().runPreparedSQL(sql, cidadeAtualizada.getNome(), 
//                                                                           cidadeAtualizada.getEstado().getSigla(),
//                                                                           cidadeAtualizada.getId() );
//         } 
//         catch (DataBaseException ex)
//         {
//             throw new NotFoundException();
//         }
//     }

//     @Override
//     public void delete(Integer primaryKey) throws NotFoundException
//     {
//         if (primaryKey == null || primaryKey <= 0)
//         {
//             throw new NotFoundException();
//         }
        
//         try
//         {
//             String sql = "delete from cidade where id = ?";
//             SystemManager.getInstance().getDataBase().runPreparedSQL(sql, primaryKey );
//         } 
//         catch (DataBaseException ex)
//         {
//             throw new NotFoundException();
//         }
//     }
    
// }
