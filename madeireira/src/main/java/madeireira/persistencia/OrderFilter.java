package madeireira.persistencia;

import br.univates.raiz.persistence.Filter;
import madeireira.negocio.Order;

/**
 *
 * @author rianwlp
 */

public class OrderFilter implements Filter<Order>
{

    @Override
    public boolean isAccept(Order record)
    {
        // return (record.getSalario() >= 1000);
        return true;
    }
}
