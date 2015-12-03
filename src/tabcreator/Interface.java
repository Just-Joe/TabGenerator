/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tabcreator;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author jo27710
 */
public class Interface extends javax.swing.JFrame {

    JToggleButton[][] Buttons = new JToggleButton[6][12];
    
    int TabColIndex=0;
    DefaultTableModel TM;
    
    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        initTableModel();
        initClickListeners();
        initColumnSpacing();
        initButtonLinks();
    }

    private void initTableModel(){
        TM=(DefaultTableModel)TabTable.getModel();
    }
    
    private void initColumnSpacing(){
        for(int i =0; i<TM.getColumnCount(); i++){
            TableColumn TC = TabTable.getColumnModel().getColumn(i);
            TC.setMaxWidth(20);
            TC.setMinWidth(20);
        }
        repaint();
    }
    
    private void initClickListeners(){
        Component[] CMPS = SelectionPanel.getComponents();
        
        for(Component Cur: CMPS){
            JToggleButton JTB = (JToggleButton)Cur;
            ActionListener actionListener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //System.out.println("Clicked on " + JTB.getText());
                    SetStrings();
                }
            };
            JTB.addActionListener(actionListener);
            
        }
    }
    
    private void initButtonLinks(){
        Component[] CMPS = SelectionPanel.getComponents();
        int row=0;
        int col=0;
        
        for(Component Cur: CMPS){
            JToggleButton JTB = (JToggleButton)Cur;
            col++;
            if(col==6){
                row++;
                col=0;
            }
            System.out.println("Column: " + col + "  Row: " + row + "  Value: " + JTB.getText());
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SelectionPanel = new javax.swing.JPanel();
        T1 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton75 = new javax.swing.JToggleButton();
        jToggleButton76 = new javax.swing.JToggleButton();
        jToggleButton77 = new javax.swing.JToggleButton();
        jToggleButton78 = new javax.swing.JToggleButton();
        T = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButton19 = new javax.swing.JToggleButton();
        jToggleButton20 = new javax.swing.JToggleButton();
        jToggleButton21 = new javax.swing.JToggleButton();
        jToggleButton22 = new javax.swing.JToggleButton();
        jToggleButton23 = new javax.swing.JToggleButton();
        jToggleButton24 = new javax.swing.JToggleButton();
        jToggleButton25 = new javax.swing.JToggleButton();
        jToggleButton26 = new javax.swing.JToggleButton();
        jToggleButton27 = new javax.swing.JToggleButton();
        jToggleButton28 = new javax.swing.JToggleButton();
        jToggleButton29 = new javax.swing.JToggleButton();
        jToggleButton30 = new javax.swing.JToggleButton();
        jToggleButton31 = new javax.swing.JToggleButton();
        jToggleButton32 = new javax.swing.JToggleButton();
        jToggleButton33 = new javax.swing.JToggleButton();
        jToggleButton34 = new javax.swing.JToggleButton();
        jToggleButton35 = new javax.swing.JToggleButton();
        jToggleButton36 = new javax.swing.JToggleButton();
        jToggleButton37 = new javax.swing.JToggleButton();
        jToggleButton38 = new javax.swing.JToggleButton();
        jToggleButton39 = new javax.swing.JToggleButton();
        jToggleButton40 = new javax.swing.JToggleButton();
        jToggleButton41 = new javax.swing.JToggleButton();
        jToggleButton42 = new javax.swing.JToggleButton();
        jToggleButton43 = new javax.swing.JToggleButton();
        jToggleButton44 = new javax.swing.JToggleButton();
        jToggleButton45 = new javax.swing.JToggleButton();
        jToggleButton46 = new javax.swing.JToggleButton();
        jToggleButton47 = new javax.swing.JToggleButton();
        jToggleButton48 = new javax.swing.JToggleButton();
        jToggleButton49 = new javax.swing.JToggleButton();
        jToggleButton50 = new javax.swing.JToggleButton();
        jToggleButton51 = new javax.swing.JToggleButton();
        jToggleButton52 = new javax.swing.JToggleButton();
        jToggleButton53 = new javax.swing.JToggleButton();
        jToggleButton54 = new javax.swing.JToggleButton();
        jToggleButton55 = new javax.swing.JToggleButton();
        jToggleButton56 = new javax.swing.JToggleButton();
        jToggleButton57 = new javax.swing.JToggleButton();
        jToggleButton58 = new javax.swing.JToggleButton();
        jToggleButton59 = new javax.swing.JToggleButton();
        jToggleButton60 = new javax.swing.JToggleButton();
        jToggleButton61 = new javax.swing.JToggleButton();
        jToggleButton62 = new javax.swing.JToggleButton();
        jToggleButton64 = new javax.swing.JToggleButton();
        jToggleButton65 = new javax.swing.JToggleButton();
        jToggleButton67 = new javax.swing.JToggleButton();
        jToggleButton69 = new javax.swing.JToggleButton();
        jToggleButton71 = new javax.swing.JToggleButton();
        jToggleButton73 = new javax.swing.JToggleButton();
        jToggleButton63 = new javax.swing.JToggleButton();
        jToggleButton66 = new javax.swing.JToggleButton();
        jToggleButton68 = new javax.swing.JToggleButton();
        jToggleButton70 = new javax.swing.JToggleButton();
        jToggleButton72 = new javax.swing.JToggleButton();
        jToggleButton74 = new javax.swing.JToggleButton();
        DataButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabTable = new javax.swing.JTable();
        estring = new javax.swing.JTextField();
        EString = new javax.swing.JTextField();
        BString = new javax.swing.JTextField();
        GString = new javax.swing.JTextField();
        DString = new javax.swing.JTextField();
        AString = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        InsertTab = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        SelectionPanel.setOpaque(false);
        SelectionPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelectionPanelMouseClicked(evt);
            }
        });
        SelectionPanel.setLayout(null);

        T1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        T1.setText("E-0");
        T1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        T1.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        T1.setName("E"); // NOI18N
        T1.setOpaque(true);
        T1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(T1);
        T1.setBounds(10, 15, 10, 10);

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton5.setText("B-0");
        jToggleButton5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton5.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton5.setOpaque(true);
        jToggleButton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton5);
        jToggleButton5.setBounds(10, 42, 10, 10);

        jToggleButton75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton75.setText("G-0");
        jToggleButton75.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton75.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton75.setOpaque(true);
        jToggleButton75.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton75);
        jToggleButton75.setBounds(10, 70, 10, 10);

        jToggleButton76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton76.setText("D-0");
        jToggleButton76.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton76.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton76.setOpaque(true);
        jToggleButton76.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton76);
        jToggleButton76.setBounds(10, 101, 10, 10);

        jToggleButton77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton77.setText("A-0");
        jToggleButton77.setToolTipText("");
        jToggleButton77.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton77.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton77.setOpaque(true);
        jToggleButton77.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton77);
        jToggleButton77.setBounds(10, 128, 10, 10);

        jToggleButton78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton78.setText("e-0");
        jToggleButton78.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton78.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton78.setOpaque(true);
        jToggleButton78.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton78);
        jToggleButton78.setBounds(10, 158, 10, 10);

        T.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        T.setText("E-1");
        T.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        T.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        T.setName("E"); // NOI18N
        T.setOpaque(true);
        T.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(T);
        T.setBounds(32, 15, 50, 10);

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton4.setText("B-1");
        jToggleButton4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton4.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton4.setOpaque(true);
        jToggleButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton4);
        jToggleButton4.setBounds(32, 42, 50, 10);

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton6.setText("G-1");
        jToggleButton6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton6.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton6.setOpaque(true);
        jToggleButton6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton6);
        jToggleButton6.setBounds(32, 70, 50, 10);

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton3.setText("D-1");
        jToggleButton3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton3.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton3.setOpaque(true);
        jToggleButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton3);
        jToggleButton3.setBounds(32, 101, 50, 10);

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton7.setText("A-1");
        jToggleButton7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton7.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton7.setOpaque(true);
        jToggleButton7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton7);
        jToggleButton7.setBounds(32, 128, 50, 10);

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton8.setText("e-1");
        jToggleButton8.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton8.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton8.setOpaque(true);
        jToggleButton8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton8);
        jToggleButton8.setBounds(32, 158, 50, 10);

        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton9.setText("E-2");
        jToggleButton9.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton9.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton9.setName("E"); // NOI18N
        jToggleButton9.setOpaque(true);
        jToggleButton9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton9);
        jToggleButton9.setBounds(120, 15, 50, 10);

        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton10.setText("B-2");
        jToggleButton10.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton10.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton10.setOpaque(true);
        jToggleButton10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton10);
        jToggleButton10.setBounds(120, 42, 50, 10);

        jToggleButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton11.setText("G-2");
        jToggleButton11.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton11.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton11.setOpaque(true);
        jToggleButton11.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton11);
        jToggleButton11.setBounds(120, 70, 50, 10);

        jToggleButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton12.setText("D-2");
        jToggleButton12.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton12.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton12.setOpaque(true);
        jToggleButton12.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton12);
        jToggleButton12.setBounds(120, 101, 50, 10);

        jToggleButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton13.setText("A-2");
        jToggleButton13.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton13.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton13.setOpaque(true);
        jToggleButton13.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton13);
        jToggleButton13.setBounds(120, 128, 50, 10);

        jToggleButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton14.setText("e-2");
        jToggleButton14.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton14.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton14.setOpaque(true);
        jToggleButton14.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton14);
        jToggleButton14.setBounds(120, 158, 50, 10);

        jToggleButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton15.setText("E-3");
        jToggleButton15.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton15.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton15.setName("E"); // NOI18N
        jToggleButton15.setOpaque(true);
        jToggleButton15.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton15);
        jToggleButton15.setBounds(215, 15, 50, 10);

        jToggleButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton16.setText("B-3");
        jToggleButton16.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton16.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton16.setOpaque(true);
        jToggleButton16.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton16);
        jToggleButton16.setBounds(215, 42, 50, 10);

        jToggleButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton17.setText("G-3");
        jToggleButton17.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton17.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton17.setOpaque(true);
        jToggleButton17.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton17);
        jToggleButton17.setBounds(215, 70, 50, 10);

        jToggleButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton18.setText("D-3");
        jToggleButton18.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton18.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton18.setOpaque(true);
        jToggleButton18.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton18);
        jToggleButton18.setBounds(215, 101, 50, 10);

        jToggleButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton19.setText("A-3");
        jToggleButton19.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton19.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton19.setOpaque(true);
        jToggleButton19.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton19);
        jToggleButton19.setBounds(215, 128, 50, 10);

        jToggleButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton20.setText("e-3");
        jToggleButton20.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton20.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton20.setOpaque(true);
        jToggleButton20.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton20);
        jToggleButton20.setBounds(215, 158, 50, 10);

        jToggleButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton21.setText("E-4");
        jToggleButton21.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton21.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton21.setName("E"); // NOI18N
        jToggleButton21.setOpaque(true);
        jToggleButton21.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton21);
        jToggleButton21.setBounds(300, 15, 50, 10);

        jToggleButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton22.setText("B-4");
        jToggleButton22.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton22.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton22.setOpaque(true);
        jToggleButton22.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton22);
        jToggleButton22.setBounds(300, 42, 50, 10);

        jToggleButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton23.setText("G-4");
        jToggleButton23.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton23.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton23.setOpaque(true);
        jToggleButton23.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton23);
        jToggleButton23.setBounds(300, 70, 50, 10);

        jToggleButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton24.setText("D-4");
        jToggleButton24.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton24.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton24.setOpaque(true);
        jToggleButton24.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton24);
        jToggleButton24.setBounds(300, 101, 50, 10);

        jToggleButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton25.setText("A-4");
        jToggleButton25.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton25.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton25.setOpaque(true);
        jToggleButton25.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton25);
        jToggleButton25.setBounds(300, 128, 50, 10);

        jToggleButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton26.setText("e-4");
        jToggleButton26.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton26.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton26.setOpaque(true);
        jToggleButton26.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton26);
        jToggleButton26.setBounds(300, 158, 50, 10);

        jToggleButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton27.setText("E-5");
        jToggleButton27.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton27.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton27.setName("E"); // NOI18N
        jToggleButton27.setOpaque(true);
        jToggleButton27.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton27);
        jToggleButton27.setBounds(380, 15, 50, 10);

        jToggleButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton28.setText("B-5");
        jToggleButton28.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton28.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton28.setOpaque(true);
        jToggleButton28.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton28);
        jToggleButton28.setBounds(380, 42, 50, 10);

        jToggleButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton29.setText("G-5");
        jToggleButton29.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton29.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton29.setOpaque(true);
        jToggleButton29.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton29);
        jToggleButton29.setBounds(380, 70, 50, 10);

        jToggleButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton30.setText("D-5");
        jToggleButton30.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton30.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton30.setOpaque(true);
        jToggleButton30.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton30);
        jToggleButton30.setBounds(380, 101, 50, 10);

        jToggleButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton31.setText("A-5");
        jToggleButton31.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton31.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton31.setOpaque(true);
        jToggleButton31.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton31);
        jToggleButton31.setBounds(380, 128, 50, 10);

        jToggleButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton32.setText("e-5");
        jToggleButton32.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton32.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton32.setOpaque(true);
        jToggleButton32.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton32);
        jToggleButton32.setBounds(380, 158, 50, 10);

        jToggleButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton33.setText("D-6");
        jToggleButton33.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton33.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton33.setOpaque(true);
        jToggleButton33.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton33);
        jToggleButton33.setBounds(460, 101, 50, 10);

        jToggleButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton34.setText("B-6");
        jToggleButton34.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton34.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton34.setOpaque(true);
        jToggleButton34.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton34);
        jToggleButton34.setBounds(460, 42, 50, 10);

        jToggleButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton35.setText("E-6");
        jToggleButton35.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton35.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton35.setName("E"); // NOI18N
        jToggleButton35.setOpaque(true);
        jToggleButton35.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton35);
        jToggleButton35.setBounds(460, 15, 50, 10);

        jToggleButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton36.setText("G-6");
        jToggleButton36.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton36.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton36.setOpaque(true);
        jToggleButton36.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton36);
        jToggleButton36.setBounds(460, 70, 50, 10);

        jToggleButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton37.setText("A-6");
        jToggleButton37.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton37.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton37.setOpaque(true);
        jToggleButton37.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton37);
        jToggleButton37.setBounds(460, 128, 50, 10);

        jToggleButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton38.setText("e-6");
        jToggleButton38.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton38.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton38.setOpaque(true);
        jToggleButton38.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton38);
        jToggleButton38.setBounds(460, 158, 50, 10);

        jToggleButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton39.setText("E-7");
        jToggleButton39.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton39.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton39.setName("E"); // NOI18N
        jToggleButton39.setOpaque(true);
        jToggleButton39.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton39);
        jToggleButton39.setBounds(540, 15, 50, 10);

        jToggleButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton40.setText("B-7");
        jToggleButton40.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton40.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton40.setOpaque(true);
        jToggleButton40.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton40);
        jToggleButton40.setBounds(540, 42, 50, 10);

        jToggleButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton41.setText("G-7");
        jToggleButton41.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton41.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton41.setOpaque(true);
        jToggleButton41.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton41);
        jToggleButton41.setBounds(540, 70, 50, 10);

        jToggleButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton42.setText("D-7");
        jToggleButton42.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton42.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton42.setOpaque(true);
        jToggleButton42.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton42);
        jToggleButton42.setBounds(540, 101, 50, 10);

        jToggleButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton43.setText("A-7");
        jToggleButton43.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton43.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton43.setOpaque(true);
        jToggleButton43.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton43);
        jToggleButton43.setBounds(540, 128, 50, 10);

        jToggleButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton44.setText("e-7");
        jToggleButton44.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton44.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton44.setOpaque(true);
        jToggleButton44.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton44);
        jToggleButton44.setBounds(540, 158, 50, 10);

        jToggleButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton45.setText("E-8");
        jToggleButton45.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton45.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton45.setName("E"); // NOI18N
        jToggleButton45.setOpaque(true);
        jToggleButton45.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton45);
        jToggleButton45.setBounds(610, 15, 50, 10);

        jToggleButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton46.setText("B-8");
        jToggleButton46.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton46.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton46.setOpaque(true);
        jToggleButton46.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton46);
        jToggleButton46.setBounds(610, 42, 50, 10);

        jToggleButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton47.setText("G-8");
        jToggleButton47.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton47.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton47.setOpaque(true);
        jToggleButton47.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton47);
        jToggleButton47.setBounds(610, 70, 50, 10);

        jToggleButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton48.setText("D-8");
        jToggleButton48.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton48.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton48.setOpaque(true);
        jToggleButton48.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton48);
        jToggleButton48.setBounds(610, 101, 50, 10);

        jToggleButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton49.setText("A-8");
        jToggleButton49.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton49.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton49.setOpaque(true);
        jToggleButton49.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton49);
        jToggleButton49.setBounds(610, 128, 50, 10);

        jToggleButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton50.setText("e-8");
        jToggleButton50.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton50.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton50.setOpaque(true);
        jToggleButton50.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton50);
        jToggleButton50.setBounds(610, 158, 50, 10);

        jToggleButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton51.setText("E-9");
        jToggleButton51.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton51.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton51.setName("E"); // NOI18N
        jToggleButton51.setOpaque(true);
        jToggleButton51.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton51);
        jToggleButton51.setBounds(690, 15, 50, 10);

        jToggleButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton52.setText("B-9");
        jToggleButton52.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton52.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton52.setOpaque(true);
        jToggleButton52.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton52);
        jToggleButton52.setBounds(690, 42, 50, 10);

        jToggleButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton53.setText("G-9");
        jToggleButton53.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton53.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton53.setOpaque(true);
        jToggleButton53.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton53);
        jToggleButton53.setBounds(690, 70, 50, 10);

        jToggleButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton54.setText("D-9");
        jToggleButton54.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton54.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton54.setOpaque(true);
        jToggleButton54.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton54);
        jToggleButton54.setBounds(690, 101, 50, 10);

        jToggleButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton55.setText("A-9");
        jToggleButton55.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton55.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton55.setOpaque(true);
        jToggleButton55.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton55);
        jToggleButton55.setBounds(690, 128, 50, 10);

        jToggleButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton56.setText("e-9");
        jToggleButton56.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton56.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton56.setOpaque(true);
        jToggleButton56.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton56);
        jToggleButton56.setBounds(690, 158, 50, 10);

        jToggleButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton57.setText("E-10");
        jToggleButton57.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton57.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton57.setName("E"); // NOI18N
        jToggleButton57.setOpaque(true);
        jToggleButton57.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton57);
        jToggleButton57.setBounds(760, 15, 50, 10);

        jToggleButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton58.setText("B-10");
        jToggleButton58.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton58.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton58.setOpaque(true);
        jToggleButton58.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton58);
        jToggleButton58.setBounds(760, 42, 50, 10);

        jToggleButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton59.setText("G-10");
        jToggleButton59.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton59.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton59.setOpaque(true);
        jToggleButton59.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton59);
        jToggleButton59.setBounds(760, 70, 50, 10);

        jToggleButton60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton60.setText("D-10");
        jToggleButton60.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton60.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton60.setOpaque(true);
        jToggleButton60.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton60);
        jToggleButton60.setBounds(760, 101, 50, 10);

        jToggleButton61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton61.setText("A-10");
        jToggleButton61.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton61.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton61.setOpaque(true);
        jToggleButton61.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton61);
        jToggleButton61.setBounds(760, 128, 50, 10);

        jToggleButton62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton62.setText("e-10");
        jToggleButton62.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton62.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton62.setOpaque(true);
        jToggleButton62.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton62);
        jToggleButton62.setBounds(760, 158, 50, 10);

        jToggleButton64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton64.setText("E-11");
        jToggleButton64.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton64.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton64.setName("E"); // NOI18N
        jToggleButton64.setOpaque(true);
        jToggleButton64.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton64);
        jToggleButton64.setBounds(830, 15, 50, 10);

        jToggleButton65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton65.setText("B-11");
        jToggleButton65.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton65.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton65.setOpaque(true);
        jToggleButton65.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton65);
        jToggleButton65.setBounds(830, 42, 50, 10);

        jToggleButton67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton67.setText("G-11");
        jToggleButton67.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton67.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton67.setOpaque(true);
        jToggleButton67.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton67);
        jToggleButton67.setBounds(830, 70, 50, 10);

        jToggleButton69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton69.setText("D-11");
        jToggleButton69.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton69.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton69.setOpaque(true);
        jToggleButton69.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton69);
        jToggleButton69.setBounds(830, 101, 50, 10);

        jToggleButton71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton71.setText("A-11");
        jToggleButton71.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton71.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton71.setOpaque(true);
        jToggleButton71.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton71);
        jToggleButton71.setBounds(830, 128, 50, 10);

        jToggleButton73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton73.setText("e-11");
        jToggleButton73.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton73.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton73.setOpaque(true);
        jToggleButton73.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton73);
        jToggleButton73.setBounds(830, 158, 50, 10);

        jToggleButton63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton63.setText("E-12");
        jToggleButton63.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton63.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton63.setName("E"); // NOI18N
        jToggleButton63.setOpaque(true);
        jToggleButton63.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton63);
        jToggleButton63.setBounds(900, 15, 50, 10);

        jToggleButton66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton66.setText("B-12");
        jToggleButton66.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton66.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton66.setOpaque(true);
        jToggleButton66.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton66);
        jToggleButton66.setBounds(900, 42, 50, 10);

        jToggleButton68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton68.setText("G-12");
        jToggleButton68.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton68.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton68.setOpaque(true);
        jToggleButton68.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton68);
        jToggleButton68.setBounds(900, 70, 50, 10);

        jToggleButton70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton70.setText("D-12");
        jToggleButton70.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton70.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton70.setOpaque(true);
        jToggleButton70.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton70);
        jToggleButton70.setBounds(900, 101, 50, 10);

        jToggleButton72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton72.setText("A-12");
        jToggleButton72.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton72.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton72.setOpaque(true);
        jToggleButton72.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton72);
        jToggleButton72.setBounds(900, 128, 50, 10);

        jToggleButton74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton74.setText("e-12");
        jToggleButton74.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton74.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton74.setOpaque(true);
        jToggleButton74.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton74);
        jToggleButton74.setBounds(900, 158, 50, 10);

        getContentPane().add(SelectionPanel);
        SelectionPanel.setBounds(40, 10, 990, 180);

        DataButton.setText("GetALLData");
        DataButton.setToolTipText("");
        DataButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataButtonMouseClicked(evt);
            }
        });
        getContentPane().add(DataButton);
        DataButton.setBounds(50, 190, 240, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gneck.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 20, 980, 160);

        TabTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25"
            }
        ));
        TabTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TabTable.setColumnSelectionAllowed(true);
        TabTable.setRowHeight(20);
        TabTable.setRowSelectionAllowed(false);
        TabTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 440, 980, 170);

        estring.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        estring.setText(" ");
        estring.setBorder(null);
        getContentPane().add(estring);
        estring.setBounds(23, 160, 20, 20);

        EString.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EString.setText(" ");
        EString.setBorder(null);
        getContentPane().add(EString);
        EString.setBounds(23, 20, 20, 20);

        BString.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BString.setText(" ");
        BString.setBorder(null);
        getContentPane().add(BString);
        BString.setBounds(23, 47, 20, 20);

        GString.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GString.setText(" ");
        GString.setBorder(null);
        getContentPane().add(GString);
        GString.setBounds(23, 75, 20, 20);

        DString.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DString.setText(" ");
        DString.setBorder(null);
        getContentPane().add(DString);
        DString.setBounds(23, 105, 20, 20);

        AString.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AString.setText(" ");
        AString.setBorder(null);
        getContentPane().add(AString);
        AString.setBounds(23, 133, 20, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("e: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 160, 20, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("E: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 20, 20, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("B: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 47, 20, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("G: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 75, 20, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("D: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 105, 20, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("A: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 133, 20, 20);

        InsertTab.setText("Insert");
        InsertTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertTabMouseClicked(evt);
            }
        });
        getContentPane().add(InsertTab);
        InsertTab.setBounds(300, 190, 230, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearSelection(){
        Component[] CMPS = SelectionPanel.getComponents();
        ClearStrings();
        
        for(Component Cur: CMPS){
            JToggleButton JTB = (JToggleButton)Cur;
            JTB.setSelected(false);
        }
        
    }
    
    private void ClearStrings(){
        EString.setText("");
        BString.setText("");
        GString.setText("");
        DString.setText("");
        AString.setText("");
        estring.setText("");
    }
    
    private void SetStrings(){
        int i =0;
        Component[] CMPS = SelectionPanel.getComponents();
        ClearStrings();
        
        for(Component Cur: CMPS){

            JToggleButton JTB = (JToggleButton)Cur;
            if(JTB.isSelected()){
                String Sel = JTB.getText();
                String[] PrsSel = Sel.split("-");
                String sn = PrsSel[0];
                String num = PrsSel[1];
                
                switch(sn){
                    case "E":
                        EString.setText(num);
                        break;
                    case "B":
                        BString.setText(num);    
                        break;
                    case "G":
                        GString.setText(num);
                        break;
                    case "D":
                        DString.setText(num);
                        break;
                    case "A":
                        AString.setText(num);
                        break;
                    case "e":
                        estring.setText(num);
                        break;
                    default:
                        System.out.println("Oooop " + sn + " doesnt exist!");
                        break;
                }
                //System.out.println("String : " + sn);
                //System.out.println("Number : " + num);
            }
            //this.repaint();
            i++;
        }
    }
    
    private void DataButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataButtonMouseClicked
        // TODO add your handling code here:
        SetStrings();
    }//GEN-LAST:event_DataButtonMouseClicked

    private void InsertTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertTabMouseClicked
        // TODO add your handling code here:
        InsertIntoTab();
    }//GEN-LAST:event_InsertTabMouseClicked

    private void SelectionPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectionPanelMouseClicked
        // TODO add your handling code here:
        System.out.println("Clicked on selection panel!");
    }//GEN-LAST:event_SelectionPanelMouseClicked

    private void TabTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabTableMouseClicked
        // TODO add your handling code here:
        TabColIndex=TabTable.getSelectedColumn();
    }//GEN-LAST:event_TabTableMouseClicked

    private void InsertIntoTab(){
        if(TabColIndex>=(TabTable.getColumnCount()-1)){
            TM.addColumn(TabColIndex+2);
        }
        TM.setValueAt(EString.getText(), 0, TabColIndex);
        TM.setValueAt(BString.getText(), 1, TabColIndex);
        TM.setValueAt(GString.getText(), 2, TabColIndex);
        TM.setValueAt(DString.getText(), 3, TabColIndex);
        TM.setValueAt(AString.getText(), 4, TabColIndex);
        TM.setValueAt(estring.getText(), 5, TabColIndex);
        
        TabColIndex++;
        
        initColumnSpacing();
        TabTable.setColumnSelectionInterval(TabColIndex, TabColIndex);
        
        ClearSelection();
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AString;
    private javax.swing.JTextField BString;
    private javax.swing.JTextField DString;
    private javax.swing.JButton DataButton;
    private javax.swing.JTextField EString;
    private javax.swing.JTextField GString;
    private javax.swing.JButton InsertTab;
    private javax.swing.JPanel SelectionPanel;
    private javax.swing.JToggleButton T;
    private javax.swing.JToggleButton T1;
    private javax.swing.JTable TabTable;
    private javax.swing.JTextField estring;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton17;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton19;
    private javax.swing.JToggleButton jToggleButton20;
    private javax.swing.JToggleButton jToggleButton21;
    private javax.swing.JToggleButton jToggleButton22;
    private javax.swing.JToggleButton jToggleButton23;
    private javax.swing.JToggleButton jToggleButton24;
    private javax.swing.JToggleButton jToggleButton25;
    private javax.swing.JToggleButton jToggleButton26;
    private javax.swing.JToggleButton jToggleButton27;
    private javax.swing.JToggleButton jToggleButton28;
    private javax.swing.JToggleButton jToggleButton29;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton30;
    private javax.swing.JToggleButton jToggleButton31;
    private javax.swing.JToggleButton jToggleButton32;
    private javax.swing.JToggleButton jToggleButton33;
    private javax.swing.JToggleButton jToggleButton34;
    private javax.swing.JToggleButton jToggleButton35;
    private javax.swing.JToggleButton jToggleButton36;
    private javax.swing.JToggleButton jToggleButton37;
    private javax.swing.JToggleButton jToggleButton38;
    private javax.swing.JToggleButton jToggleButton39;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton40;
    private javax.swing.JToggleButton jToggleButton41;
    private javax.swing.JToggleButton jToggleButton42;
    private javax.swing.JToggleButton jToggleButton43;
    private javax.swing.JToggleButton jToggleButton44;
    private javax.swing.JToggleButton jToggleButton45;
    private javax.swing.JToggleButton jToggleButton46;
    private javax.swing.JToggleButton jToggleButton47;
    private javax.swing.JToggleButton jToggleButton48;
    private javax.swing.JToggleButton jToggleButton49;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton50;
    private javax.swing.JToggleButton jToggleButton51;
    private javax.swing.JToggleButton jToggleButton52;
    private javax.swing.JToggleButton jToggleButton53;
    private javax.swing.JToggleButton jToggleButton54;
    private javax.swing.JToggleButton jToggleButton55;
    private javax.swing.JToggleButton jToggleButton56;
    private javax.swing.JToggleButton jToggleButton57;
    private javax.swing.JToggleButton jToggleButton58;
    private javax.swing.JToggleButton jToggleButton59;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton60;
    private javax.swing.JToggleButton jToggleButton61;
    private javax.swing.JToggleButton jToggleButton62;
    private javax.swing.JToggleButton jToggleButton63;
    private javax.swing.JToggleButton jToggleButton64;
    private javax.swing.JToggleButton jToggleButton65;
    private javax.swing.JToggleButton jToggleButton66;
    private javax.swing.JToggleButton jToggleButton67;
    private javax.swing.JToggleButton jToggleButton68;
    private javax.swing.JToggleButton jToggleButton69;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton70;
    private javax.swing.JToggleButton jToggleButton71;
    private javax.swing.JToggleButton jToggleButton72;
    private javax.swing.JToggleButton jToggleButton73;
    private javax.swing.JToggleButton jToggleButton74;
    private javax.swing.JToggleButton jToggleButton75;
    private javax.swing.JToggleButton jToggleButton76;
    private javax.swing.JToggleButton jToggleButton77;
    private javax.swing.JToggleButton jToggleButton78;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}
