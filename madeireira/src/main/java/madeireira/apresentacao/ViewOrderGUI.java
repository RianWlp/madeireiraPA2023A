package madeireira.apresentacao;

import br.univates.raiz.Data;
import br.univates.raiz.InvalidDateException;
import br.univates.raiz.persistence.IDao;
import br.univates.raiz.persistence.InvalidKeyException;
import br.univates.raiz.persistence.KeyViolationException;
import madeireira.negocio.Merchandise;
import madeireira.negocio.Order;
import madeireira.persistencia.DAOFactory;



/**
 *
 * @author rianwlp
 */
public class ViewOrderGUI extends javax.swing.JFrame {

    /**
     * Creates new form ViewOrderGUI
     * @throws InvalidDateException
     */
    public ViewOrderGUI() throws InvalidDateException {
        
        this.setTitle("Cadastro de Pedidos");
        this.getTitle();
        
        initComponents();
        
        this.jDataFieldDeliveryDate.setData(new Data(01,02,2000));
        this.jDataFieldOrderDate.setData(new Data(01,02,2001));
        this.jTextAreaObservations.setText("AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        this.jIntegerFieldQuantity.setInteger(12);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jClose = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jTextFieldCode = new br.univates.raiz.JTextFieldCustomized();
        jLabelCode = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObservations = new javax.swing.JTextArea();
        jLabelObservations = new javax.swing.JLabel();
        jDataFieldOrderDate = new br.univates.raiz.JDataField();
        jLabelOrderDate = new javax.swing.JLabel();
        jDataFieldDeliveryDate = new br.univates.raiz.JDataField();
        jLabelDeliveryDate = new javax.swing.JLabel();
        jIntegerFieldQuantity = new br.univates.raiz.JIntegerField();
        jLabelQuantity = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jClose.setText("Fechar");
        jClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseActionPerformed(evt);
            }
        });

        jButtonClear.setText("Limpar");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonSave.setText("Salvar");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jLabelCode.setText("Codigo do Produto:");

        jTextAreaObservations.setColumns(20);
        jTextAreaObservations.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObservations);

        jLabelObservations.setText("Observacoes do Pedido");

        jLabelOrderDate.setText("Data da Realizacao");

        jLabelDeliveryDate.setText("Data de Entrega ");

        jLabelQuantity.setText("Quantidade:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCode, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelOrderDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDataFieldOrderDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelDeliveryDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDataFieldDeliveryDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jIntegerFieldQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jClose, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabelObservations)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCode)
                    .addComponent(jLabelOrderDate)
                    .addComponent(jLabelDeliveryDate)
                    .addComponent(jLabelQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDataFieldOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDataFieldDeliveryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIntegerFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabelObservations)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jClose)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonSave))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {                                            

        
        // Data date = new Data();

        // Data deliveryDate = jDataFieldDeliveryDate.getData();
        // Data orderDate    = jDataFieldOrderDate.getData();

        // int quantity = jIntegerFieldQuantity.getInteger();

        // String observations = jTextAreaObservations.getText();
        // String code = jTextFieldCode.getText();
        // Order order = new Order();

        IDao dao = DAOFactory.createOrder();
        try
        {
            Order order = new Order();

            // order.setOrderDeliveryDate(jDataFieldOrderDate.getData(),jDataFieldDeliveryDate.getData());
            
            System.out.println(jDataFieldDeliveryDate.getData());
            System.out.println(jDataFieldOrderDate.getData());
            System.out.println(jIntegerFieldQuantity.getInteger());
            System.out.println(jTextAreaObservations.getText());

            order.setDeliveryDate(jDataFieldDeliveryDate.getData());
            order.setOrderDate(jDataFieldOrderDate.getData());

            order.setQuantity(jIntegerFieldQuantity.getInteger());
            order.setObservations(jTextAreaObservations.getText());

            // order.setCode(jTextFieldCode.getText());
            // int quantity = jIntegerFieldQuantity.getInteger();
            // String observations = jTextAreaObservations.getText();
            // String code = jTextFieldCode.getText();

            dao.create(order);
        } 
        catch (KeyViolationException | InvalidKeyException ex)
        {
            System.out.println("Na tela do Order deu pau !!!");
        }

        // Merchandise merchandise  = new Merchandise();

        // Data deliveryDate = jDataFieldDeliveryDate.getData();
        // Data orderDate    = jDataFieldOrderDate.getData();
        

    }
    
    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {                                             
    
        
    }
    
    private void jCloseActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
        this.dispose();
    }
    
    private void jTextFieldCustomizedNameActionPerformed(java.awt.event.ActionEvent evt) {}

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jClose;
    private br.univates.raiz.JDataField jDataFieldDeliveryDate;
    private br.univates.raiz.JDataField jDataFieldOrderDate;
    private br.univates.raiz.JIntegerField jIntegerFieldQuantity;
    private javax.swing.JLabel jLabelCode;
    private javax.swing.JLabel jLabelDeliveryDate;
    private javax.swing.JLabel jLabelObservations;
    private javax.swing.JLabel jLabelOrderDate;
    private javax.swing.JLabel jLabelQuantity;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaObservations;
    private br.univates.raiz.JTextFieldCustomized jTextFieldCode;
    // End of variables declaration//GEN-END:variables
}
