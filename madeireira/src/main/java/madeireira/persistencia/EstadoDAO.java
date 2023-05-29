package madeireira.persistencia;

import br.univates.raiz.db.DataBaseConnectionManager;
import br.univates.raiz.db.DataBaseException;
import br.univates.raiz.persistence.Filter;
import br.univates.raiz.persistence.IDao;
import br.univates.raiz.persistence.InvalidKeyException;
import br.univates.raiz.persistence.KeyViolationException;
import br.univates.raiz.persistence.NotFoundException;
import madeireira.negocio.Estado;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author mouriac
 */
// public class EstadoDAO extends DaoAdapter<Estado,String>
// {

//     @Override
//     public void create(Estado estadoNovo) throws KeyViolationException, InvalidKeyException
//     {
//         if (estadoNovo.getSigla().isEmpty())
//         {
//             throw new InvalidKeyException();
//         }
        
//         try
//         {
//             String sql = "insert into estado values ('"+estadoNovo.getSigla()+"', '"+estadoNovo.getNome()+"' );";
            
//             /***
//              * Para não usar a classe SystemManager
//              * 
//             DataBaseConnectionManager x;
//             x = new DataBaseConnectionManager( DataBaseConnectionManager.POSTGRESQL, "banco", "postgres", "postgres");
//             x.runSQL(sql);
//             x.closeConnection();
//             */
            
//             SystemManager.getInstance().getDataBase().runSQL(sql);
//         } 
//         catch (DataBaseException ex)
//         {
//             throw new KeyViolationException();
//         }
//     }

//     @Override
//     public Estado read(String primaryKey) throws NotFoundException
//     {
//         Estado estadoRetorno = null;
        
//         if (primaryKey == null || primaryKey.isEmpty())
//         {
//             throw new NotFoundException();
//         }
        
//         try
//         {
//             String sql = "select * from estado where sigla = ?";
//             SystemManager.getInstance().getDataBase().runPreparedQuerySQL(sql, primaryKey);
            
//             ResultSet rs = SystemManager.getInstance().getDataBase().getResultSet();
            
//             if (rs.isBeforeFirst())
//             {
//                 rs.next(); // posiciona sobre o único retorno da consulta
//                 String sigla = rs.getString("sigla");
//                 String nome = rs.getString("nome");
                
//                 estadoRetorno = new Estado(sigla, nome);
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
        
//         return estadoRetorno;
//     }

//     @Override
//     public ArrayList<Estado> readAll()
//     {
        
//         ArrayList<Estado> lista = new ArrayList();
        
//         try
//         {
//             ResultSet rs = SystemManager.getInstance().getDataBase().runQuerySQL("select * from estado;");
            
//             if (rs.isBeforeFirst())
//             {
//                 rs.next();
//                 while (!rs.isAfterLast())
//                 {
//                     String sigla = rs.getString("sigla");
//                     String nome = rs.getString("nome");
                    
//                     Estado e = new Estado(sigla,nome);
//                     lista.add(e);
                    
//                     rs.next();
//                 }
//             }
//         } 
//         catch (DataBaseException | SQLException ex)
//         {
//             // não executa nada. Não há o que fazer.
//         } 
        
//         // retornar a lista com todas as cidades lidas
//         return lista;
//     }

//     @Override
//     public ArrayList<Estado> readAll(Filter<Estado> filtro)
//     {
//         ArrayList<Estado> selecionados = new ArrayList<Estado>();
//         ArrayList<Estado> todosEstados = readAll();
//         for (Estado estado: todosEstados)
//         {
//             if (filtro.isAccept(estado))
//             {
//                 selecionados.add(estado);
//             }
//         }
//         Collections.sort(selecionados);    
//         return selecionados;
//     }

//     @Override
//     public void update(Estado estadoAtualizado) throws NotFoundException
//     {
//         if (estadoAtualizado.getSigla().isEmpty())
//         {
//             throw new NotFoundException();
//         }
        
//         try
//         {
//             String sql = "update estado set nome = ? where sigla = ?";
//             SystemManager.getInstance().getDataBase().runPreparedSQL(sql, estadoAtualizado.getNome(), estadoAtualizado.getSigla() );
//         } 
//         catch (DataBaseException ex)
//         {
//             throw new NotFoundException();
//         }
//     }

//     @Override
//     public void delete(String primaryKey) throws NotFoundException
//     {
//         if (primaryKey == null || primaryKey.isEmpty())
//         {
//             throw new NotFoundException();
//         }
        
//         try
//         {
//             String sql = "delete from estado where sigla = ?";
//             SystemManager.getInstance().getDataBase().runPreparedSQL(sql, primaryKey );
//         } 
//         catch (DataBaseException ex)
//         {
//             throw new NotFoundException();
//         }
//     }
    
// }
