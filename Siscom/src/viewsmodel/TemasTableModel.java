/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewsmodel;

import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ulise
 */
public class TemasTableModel extends AbstractTableModel{
    
    private ImageIcon imgDelete = new ImageIcon(getClass().getResource("/images/recycle-bin.png"));
    private ImageIcon imgUpdate = new ImageIcon(getClass().getResource("/images/refresh.png"));
    private String[] encabezadoColumna = {"id","Nombre", "Eliminar", "Actualizar"};
    private Vector data = new Vector();
    
    //dice el total de las columnas
    @Override
    public int getColumnCount(){
    
    return encabezadoColumna.length;
    }//tamaño del arreglo
    
    
    //dice el total de los datos a mostrar en en Jtable
    @Override
    public int getRowCount(){
    
    return data.size();//datos de la colección
    }
    
    @Override
    public Object getValueAt(int row, int column){
    
    return ((Vector) data.get(row)).get(column);
    }
    
    @Override
    public String getColumnName(int col){
    return encabezadoColumna[col];
    }
    
    @Override
    public Class getColumnClass(int c){
    return getValueAt(0, c).getClass();
    }
    
    @Override
    public void setValueAt(Object value, int row, int col){
    ((Vector) data.get(row)).setElementAt(value, col);
        fireTableCellUpdated(row, col);
    }
    
    public void inserData(Object [] values){
    
        data.add(new Vector());
        for(int i = 0 ; i< values.length; i++){
            ((Vector) data.get(data.size() - 1)).add(values[i]);
        
        }
        ((Vector)data.get(data.size() - 1)).add(imgDelete);
        ((Vector)data.get(data.size() - 1)).add(imgUpdate);
        fireTableDataChanged();
    
    }
    
    
    public void removeRow(int row){
    
    data.removeElementAt(row);
    fireTableDataChanged();
    }
    
}
