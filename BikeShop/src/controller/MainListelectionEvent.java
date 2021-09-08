/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import view.MainWindow;


/**
 *
 * @author Dialvec
 */
public class MainListelectionEvent implements ListSelectionListener {
    
    public MainListelectionEvent(MainWindow mainWindow){
        this.mainWindow = mainWindow;
        //this.jTableData = mainWindow.getjTableData();
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        getMainWindow().EnableAdminButtons(true);
    }
    
    
    private final MainWindow mainWindow;
    //private JTable jTableData;

    /**
     * @return the jTableData
     */
    //public JTable getjTableData() {
    //    return jTableData;
    //}

    /**
     * @param jTableData the jTableData to set
     */
    //public void setjTableData(JTable jTableData) {
    //    this.jTableData = jTableData;
    //}

    /**
     * @return the mainWindow
     */
    public MainWindow getMainWindow() {
        return mainWindow;
    }
}
