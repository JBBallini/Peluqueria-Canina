package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Ballini Juan Bautista
 */

public class VerDatos extends javax.swing.JFrame {
    
    Controladora control = null;
    
    public VerDatos() {
        //Cuando se cree una nueva instancia de "Ver Datos" se crea una instancia de la controladora
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelAutor = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMascotas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        labelAutor.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        labelAutor.setForeground(new java.awt.Color(0, 0, 0));
        labelAutor.setText("Autor: Ballini, Juan Bautista");

        labelTitulo.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(93, 129, 200));
        labelTitulo.setText("Visualización de Datos");

        jPanel2.setBackground(new java.awt.Color(187, 193, 79));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        tableMascotas.setBackground(new java.awt.Color(153, 255, 204));
        tableMascotas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tableMascotas.setForeground(new java.awt.Color(0, 0, 0));
        tableMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableMascotas);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Datos de Mascotas");

        btnEliminar.setBackground(new java.awt.Color(153, 222, 246));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\porokiin\\Documents\\NetBeansProjects\\PeluqueriaCanina\\src\\main\\java\\com\\mycompany\\peluqueriacanina\\igu\\imgs\\icon_delete.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(153, 222, 246));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\porokiin\\Documents\\NetBeansProjects\\PeluqueriaCanina\\src\\main\\java\\com\\mycompany\\peluqueriacanina\\igu\\imgs\\icon_edit.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        btnVolver.setBackground(new java.awt.Color(153, 222, 246));
        btnVolver.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 0));
        btnVolver.setIcon(new javax.swing.ImageIcon("C:\\Users\\porokiin\\Documents\\NetBeansProjects\\PeluqueriaCanina\\src\\main\\java\\com\\mycompany\\peluqueriacanina\\igu\\imgs\\icon_leftArrow.png")); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(968, 968, 968)
                        .addComponent(labelAutor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(247, 247, 247)
                                .addComponent(labelTitulo)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelAutor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento que sucede al abrir la ventana de Ver Datos
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    // ------------------------ Botones ------------------------ //
    
    //Botón Eliminar
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        //Controlo que la tabla no este vacía
        if (tableMascotas.getRowCount() > 0){
            //Controlo que se haya seleccionado un registro
            if (tableMascotas.getSelectedRow() != -1){
                //Pido el numero de cliente (id mascota) de la tabla mascotas que este hubicado en la columna 0 de la fila seleccionada y lo almaceno en la variable
                int numCliente  = Integer.parseInt(String.valueOf(tableMascotas.getValueAt(tableMascotas.getSelectedRow(),0)));
                
                //Llamo al método para borrar la mascota de la Controladora
                control.borrarMascota(numCliente);
                mostrarMensaje("Mascota Eliminada Correctamente", "Info", "Borrado de Mascota");
                
                //Actualizo la tabla
                cargarTabla();
            } else {
                mostrarMensaje("Mascota No Seleccionada", "Error", "Error al Eliminar");
            }
        } else {
            mostrarMensaje("No hay registros que eliminar", "Error", "Error al Eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Botón Eliminar
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        if (tableMascotas.getRowCount() > 0){
            if (tableMascotas.getSelectedRow() != -1){
                int numCliente  = Integer.parseInt(String.valueOf(tableMascotas.getValueAt(tableMascotas.getSelectedRow(),0)));
                
                //Abro ventana de para modificar datos
                ModificarDatos pantallaModificarDatos = new ModificarDatos(numCliente);
                pantallaModificarDatos.setVisible(true);
                pantallaModificarDatos.setLocationRelativeTo(null);
                
                this.dispose();
            } else {
                mostrarMensaje("Mascota No Seleccionada", "Error", "Error al Eliminar");
            }
        } else {
            mostrarMensaje("No hay registros que eliminar", "Error", "Error al Eliminar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    //Botón Volver
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //Creo una instancia de la pantalla principal
        Principal pantallaPrin = new Principal();
        //Hago que la pantalla sea visible
        pantallaPrin.setVisible(true);
        //La centro en el medio
        pantallaPrin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
   
    // ------------------------ Botones ------------------------ //
    
    // ------------------------ Otros Métodos ------------------------ //
    
    //Método para los diferentes tipos de mensajes que pueden ocurrir
    public void mostrarMensaje(String mensaje, String tipoMensaje, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipoMensaje.equals("Info") ){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } 
        else if (tipoMensaje.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    //Método para crear la tabla
    private void cargarTabla() {
        
        //Definir el modelo de tabla a partir de la clase DefaultTableModel, es decir, ayuda a definir columnas y el resto del diseño
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            //No permito que las filas y columnas sean editables al interactuar directamente con ellas (no ovlidar el Override)
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        //Establesco los nombres de las columnas
        String titulos[] = {"Num", "Nombre", "Raza", "Color", "Alergias", "Ate. Esp.", "Dueño", "Celular"};
        //Seteo los nombres
        modeloTabla.setColumnIdentifiers(titulos);
        
        //Carga de datos desde la BD
        //Creo una lista para guardar los datos de las mascotas
        List <Mascota> listaMascotas = control.traerMascotas();
        
        //Recorrer la lista y mostrar cada uno de los elementos de la tabla
        //Pregunto si la lista esta vacia o no y luego realizo la lógica
        if (listaMascotas != null) {
            for (Mascota masco : listaMascotas) {
                //Guardo los datos de la mascota en un array de tipo Object porque almaceno datos de diferentes tipos (Strings e ints)
                Object[] objeto = {masco.getNumCliente(), masco.getNombre(), masco.getRaza(), masco.getColor(), masco.getAlergico(), masco.getAtencionEspecial(), masco.getUnDuenio().getNombre(), masco.getUnDuenio().getCel()};
                
                //Agrego el array como fila en la tabla
                modeloTabla.addRow(objeto);
            }
        }
        //Le asigno el modelo creado a la tabla
        tableMascotas.setModel(modeloTabla);
    }
    
    // ------------------------ Otros Métodos ------------------------ //
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tableMascotas;
    // End of variables declaration//GEN-END:variables

}
