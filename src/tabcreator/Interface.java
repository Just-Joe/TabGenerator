/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tabcreator;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author jo27710
 */
public class Interface extends javax.swing.JFrame {

    JToggleButton[][] Buttons = new JToggleButton[6][13];
    
    int TabColIndex=0;
    DefaultTableModel TM;
    
    HashMap ChordDic = new HashMap();
    
    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        initTableModel();
        initClickListeners();
        initColumnSpacing();
        initButtonLinks();
        initChords();
        
        TabTable.setColumnSelectionInterval(0, 0);
    }
    
    private void initChords(){
        File CF = new File(getClass().getResource("/Data/Chords.txt").getPath());
        // Open the file
        FileInputStream fstream;
        try {
            fstream = new FileInputStream(CF);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;

            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
              // Print the content on the console
              String[] elements = strLine.split(",");
              String Note = elements[0].trim();
              String Rep = elements[1];
              ChordDic.put(Note, Rep);
              ChordBox.addItem(Note);
              System.out.println ("Chord: " + elements[0].trim() + " Value: " + elements[1]);
            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void initTableModel(){
        //Initialized table model
        TM=(DefaultTableModel)TabTable.getModel();
        
        TabTable.requestFocusInWindow();
        
        TabTable.getColumnModel().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                System.out.println("Column Selection Changed! Currently Selected: " + TabTable.getSelectedColumn());
                
                TabColIndex=TabTable.getSelectedColumn();
                ShowCurrentTab(TabColIndex);
            }
        });
        
        
    }
    
    private void initColumnSpacing(){
        //Sets all data in tab table to centered
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        TabTable.setDefaultRenderer(String.class, centerRenderer);
        
        for(int i =0; i<TM.getColumnCount(); i++){
            TableColumn TC = TabTable.getColumnModel().getColumn(i);
            TC.setMaxWidth(30);
            TC.setMinWidth(30);
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
            
            if(col==6){
                row++;
                col=0;
            }
            System.out.println("Column: " + col + "  Row: " + row + "  Value: " + JTB.getText());
            Buttons[col][row]=JTB;
            col++;
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
        jToggleButton35 = new javax.swing.JToggleButton();
        jToggleButton34 = new javax.swing.JToggleButton();
        jToggleButton36 = new javax.swing.JToggleButton();
        jToggleButton33 = new javax.swing.JToggleButton();
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
        Insert = new javax.swing.JButton();
        Repeat = new javax.swing.JButton();
        ChordBox = new javax.swing.JComboBox<>();
        DuplicateButton = new javax.swing.JButton();
        ClearAll = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Load = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Listen = new javax.swing.JButton();
        ChordBox1 = new javax.swing.JComboBox<>();
        PlayButton = new javax.swing.JButton();
        estring1 = new javax.swing.JTextField();
        EString1 = new javax.swing.JTextField();
        BString1 = new javax.swing.JTextField();
        GString1 = new javax.swing.JTextField();
        DString1 = new javax.swing.JTextField();
        AString1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        Key = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

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

        jToggleButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton35.setText("E-6");
        jToggleButton35.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton35.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton35.setName("E"); // NOI18N
        jToggleButton35.setOpaque(true);
        jToggleButton35.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton35);
        jToggleButton35.setBounds(460, 15, 50, 10);

        jToggleButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton34.setText("B-6");
        jToggleButton34.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton34.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton34.setOpaque(true);
        jToggleButton34.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton34);
        jToggleButton34.setBounds(460, 42, 50, 10);

        jToggleButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton36.setText("G-6");
        jToggleButton36.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton36.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton36.setOpaque(true);
        jToggleButton36.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton36);
        jToggleButton36.setBounds(460, 70, 50, 10);

        jToggleButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton33.setText("D-6");
        jToggleButton33.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton33.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Unselected.png"))); // NOI18N
        jToggleButton33.setOpaque(true);
        jToggleButton33.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Selected.png"))); // NOI18N
        SelectionPanel.add(jToggleButton33);
        jToggleButton33.setBounds(460, 101, 50, 10);

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
        SelectionPanel.setBounds(40, 110, 970, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gneck.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 120, 950, 160);

        TabTable.setBackground(new java.awt.Color(51, 51, 51));
        TabTable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TabTable.setForeground(new java.awt.Color(255, 255, 255));
        TabTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TabTable.setColumnSelectionAllowed(true);
        TabTable.setRowHeight(25);
        TabTable.setRowSelectionAllowed(false);
        TabTable.setShowVerticalLines(false);
        TabTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabTableMouseClicked(evt);
            }
        });
        TabTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 320, 950, 190);

        estring.setBackground(new java.awt.Color(200, 150, 124));
        estring.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estring.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        estring.setText(" ");
        estring.setBorder(null);
        getContentPane().add(estring);
        estring.setBounds(23, 260, 20, 20);

        EString.setBackground(new java.awt.Color(200, 150, 124));
        EString.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EString.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EString.setText(" ");
        EString.setBorder(null);
        getContentPane().add(EString);
        EString.setBounds(23, 120, 20, 20);

        BString.setBackground(new java.awt.Color(200, 150, 124));
        BString.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BString.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BString.setText(" ");
        BString.setBorder(null);
        getContentPane().add(BString);
        BString.setBounds(23, 147, 20, 20);

        GString.setBackground(new java.awt.Color(200, 150, 124));
        GString.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GString.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GString.setText(" ");
        GString.setBorder(null);
        getContentPane().add(GString);
        GString.setBounds(23, 175, 20, 20);

        DString.setBackground(new java.awt.Color(200, 150, 124));
        DString.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DString.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DString.setText(" ");
        DString.setBorder(null);
        getContentPane().add(DString);
        DString.setBounds(23, 205, 20, 20);

        AString.setBackground(new java.awt.Color(200, 150, 124));
        AString.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AString.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AString.setText(" ");
        AString.setBorder(null);
        getContentPane().add(AString);
        AString.setBounds(23, 233, 20, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("E: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 260, 20, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("E: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 120, 20, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("B: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 147, 20, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("G: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 175, 20, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("D: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 205, 20, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("A: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 233, 20, 20);

        Insert.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonBack.png"))); // NOI18N
        Insert.setText("Insert");
        Insert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertMouseClicked(evt);
            }
        });
        getContentPane().add(Insert);
        Insert.setBounds(230, 285, 150, 30);

        Repeat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Repeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonBack.png"))); // NOI18N
        Repeat.setText("Repeat");
        Repeat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Repeat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RepeatMouseClicked(evt);
            }
        });
        getContentPane().add(Repeat);
        Repeat.setBounds(390, 285, 150, 30);

        ChordBox.setBackground(new java.awt.Color(134, 117, 109));
        ChordBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ChordBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        ChordBox.setOpaque(false);
        ChordBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ChordBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(ChordBox);
        ChordBox.setBounds(50, 285, 170, 30);

        DuplicateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DuplicateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonBack.png"))); // NOI18N
        DuplicateButton.setText("Duplicate");
        DuplicateButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DuplicateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DuplicateButtonMouseClicked(evt);
            }
        });
        getContentPane().add(DuplicateButton);
        DuplicateButton.setBounds(550, 285, 140, 30);

        ClearAll.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ClearAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonBack.png"))); // NOI18N
        ClearAll.setText("Clear All");
        ClearAll.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ClearAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearAllMouseClicked(evt);
            }
        });
        getContentPane().add(ClearAll);
        ClearAll.setBounds(860, 285, 140, 30);

        Delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonBack.png"))); // NOI18N
        Delete.setText("Delete");
        Delete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        getContentPane().add(Delete);
        Delete.setBounds(700, 285, 150, 30);

        Load.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Load.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonBack.png"))); // NOI18N
        Load.setText("Load");
        Load.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Load);
        Load.setBounds(50, 525, 160, 50);

        Save.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonBack.png"))); // NOI18N
        Save.setText("Save");
        Save.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });
        getContentPane().add(Save);
        Save.setBounds(220, 525, 160, 50);

        Listen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Listen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonBack.png"))); // NOI18N
        Listen.setText("Listen");
        Listen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Listen);
        Listen.setBounds(670, 525, 160, 50);

        ChordBox1.setBackground(new java.awt.Color(134, 117, 109));
        ChordBox1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ChordBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200", "210", "220", "230", "240", "250", "260", "270", "280", "290", "300", "310", "320", "330", "340", "350", "360" }));
        ChordBox1.setOpaque(false);
        getContentPane().add(ChordBox1);
        ChordBox1.setBounds(590, 525, 70, 50);

        PlayButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PlayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ButtonBack.png"))); // NOI18N
        PlayButton.setText("Play");
        PlayButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(PlayButton);
        PlayButton.setBounds(840, 525, 160, 50);

        estring1.setBackground(new java.awt.Color(51, 51, 51));
        estring1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estring1.setForeground(new java.awt.Color(255, 255, 255));
        estring1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        estring1.setText(" ");
        estring1.setBorder(null);
        getContentPane().add(estring1);
        estring1.setBounds(25, 468, 20, 20);

        EString1.setBackground(new java.awt.Color(51, 51, 51));
        EString1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EString1.setForeground(new java.awt.Color(255, 255, 255));
        EString1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EString1.setText(" ");
        EString1.setBorder(null);
        getContentPane().add(EString1);
        EString1.setBounds(25, 343, 20, 20);

        BString1.setBackground(new java.awt.Color(51, 51, 51));
        BString1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BString1.setForeground(new java.awt.Color(255, 255, 255));
        BString1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BString1.setText(" ");
        BString1.setBorder(null);
        getContentPane().add(BString1);
        BString1.setBounds(25, 368, 20, 20);

        GString1.setBackground(new java.awt.Color(51, 51, 51));
        GString1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GString1.setForeground(new java.awt.Color(255, 255, 255));
        GString1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GString1.setText(" ");
        GString1.setBorder(null);
        getContentPane().add(GString1);
        GString1.setBounds(25, 393, 20, 20);

        DString1.setBackground(new java.awt.Color(51, 51, 51));
        DString1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DString1.setForeground(new java.awt.Color(255, 255, 255));
        DString1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DString1.setText(" ");
        DString1.setBorder(null);
        getContentPane().add(DString1);
        DString1.setBounds(25, 418, 20, 20);

        AString1.setBackground(new java.awt.Color(51, 51, 51));
        AString1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AString1.setForeground(new java.awt.Color(255, 255, 255));
        AString1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AString1.setText(" ");
        AString1.setBorder(null);
        getContentPane().add(AString1);
        AString1.setBounds(25, 443, 20, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("E: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(2, 468, 20, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("E: ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(2, 343, 20, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("B: ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(2, 368, 20, 20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("G: ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(2, 393, 20, 20);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("D: ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(2, 418, 20, 20);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("A: ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(2, 443, 20, 20);

        Title.setFont(new java.awt.Font("Magneto", 0, 80)); // NOI18N
        Title.setForeground(new java.awt.Color(179, 147, 131));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Tab Generator");
        getContentPane().add(Title);
        Title.setBounds(30, 0, 1000, 100);

        Title1.setFont(new java.awt.Font("Magneto", 0, 80)); // NOI18N
        Title1.setForeground(new java.awt.Color(51, 51, 51));
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setText("Tab Generator");
        getContentPane().add(Title1);
        Title1.setBounds(25, 5, 1000, 100);

        Key.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FretKey.PNG"))); // NOI18N
        getContentPane().add(Key);
        Key.setBounds(50, 100, 950, 20);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimalism_texture_paper_list_line.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1030, 600);

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
        
        EString1.setText("");
        BString1.setText("");
        GString1.setText("");
        DString1.setText("");
        AString1.setText("");
        estring1.setText("");
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
                        EString1.setText(num);
                        break;
                    case "B":
                        BString.setText(num);  
                        BString1.setText(num);  
                        break;
                    case "G":
                        GString.setText(num);
                        GString1.setText(num);  
                        break;
                    case "D":
                        DString.setText(num);
                        DString1.setText(num);
                        break;
                    case "A":
                        AString.setText(num);
                        AString1.setText(num);
                        break;
                    case "e":
                        estring.setText(num);
                        estring1.setText(num);
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
    
    private void ShowCurrentTab(int col){
        
        ClearSelection();
        
        if((col!=-1) && (TabTable.getValueAt(0, col)!=null)){
            
            if(!((String)TabTable.getValueAt(0, col)).trim().equals("")){
                int row=Integer.valueOf((String)TabTable.getValueAt(0, col));
                Buttons[0][row].setSelected(true);
            }
            if(!((String)TabTable.getValueAt(1, col)).trim().equals("")){
                int row=Integer.valueOf((String)TabTable.getValueAt(1, col));
                Buttons[1][row].setSelected(true);
            }
            if(!((String)TabTable.getValueAt(2, col)).trim().equals("")){
                int row=Integer.valueOf((String)TabTable.getValueAt(2, col));
                Buttons[2][row].setSelected(true);
            }
            if(!((String)TabTable.getValueAt(3, col)).trim().equals("")){
                int row=Integer.valueOf((String)TabTable.getValueAt(3, col));
                Buttons[3][row].setSelected(true);
            }
            if(!((String)TabTable.getValueAt(4, col)).trim().equals("")){
                int row=Integer.valueOf((String)TabTable.getValueAt(4, col));
                Buttons[4][row].setSelected(true);
            }
            if(!((String)TabTable.getValueAt(5, col)).trim().equals("")){
                int row=Integer.valueOf((String)TabTable.getValueAt(5, col));
                Buttons[5][row].setSelected(true);
            }
        }
    }
    
    private void InsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertMouseClicked
        // TODO add your handling code here:
        InsertIntoTab();
    }//GEN-LAST:event_InsertMouseClicked

    private void SelectionPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectionPanelMouseClicked
        // TODO add your handling code here:
        System.out.println("Clicked on selection panel!");
    }//GEN-LAST:event_SelectionPanelMouseClicked

    private void TabTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabTableMouseClicked
        // TODO add your handling code here:
        //TabColIndex=TabTable.getSelectedColumn();
        //ShowCurrentTab(TabColIndex);
    }//GEN-LAST:event_TabTableMouseClicked

    private void DuplicateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DuplicateButtonMouseClicked
        // TODO add your handling code here:
        int[] cols = TabTable.getSelectedColumns();
        
        int len = cols.length;
        
        if(cols[0]==-1){
            len--;
        }
        
        System.out.println("Number of cols selected: " + len);
        
        if(TabTable.getColumnCount()<(cols[0]+((2*len)-1))){
            for(int i=0; i<len; i++){
                TM.addColumn(TabTable.getColumnCount()+1);
            }
            initColumnSpacing();
        }
        
        
        
        for(int i : cols){
            if(i!=-1){
                TabTable.setValueAt(TabTable.getValueAt(0, i), 0, i+len);
                TabTable.setValueAt(TabTable.getValueAt(1, i), 1, i+len);
                TabTable.setValueAt(TabTable.getValueAt(2, i), 2, i+len);
                TabTable.setValueAt(TabTable.getValueAt(3, i), 3, i+len);
                TabTable.setValueAt(TabTable.getValueAt(4, i), 4, i+len);
                TabTable.setValueAt(TabTable.getValueAt(5, i), 5, i+len);
            }
        }
    }//GEN-LAST:event_DuplicateButtonMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        // TODO add your handling code here:
        int[] cols = TabTable.getSelectedColumns();
        
        for(int i : cols){
            TabTable.setValueAt("", 0, i);
            TabTable.setValueAt("", 1, i);
            TabTable.setValueAt("", 2, i);
            TabTable.setValueAt("", 3, i);
            TabTable.setValueAt("", 4, i);
            TabTable.setValueAt("", 5, i);
        }
    }//GEN-LAST:event_DeleteMouseClicked

    private void TabTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabTableKeyReleased
        // TODO add your handling code here:
        /*
        System.out.println("Key pressed on table! ");
        System.out.println("Key Code: " + evt.getKeyCode());
        int col = TabTable.getSelectedColumn();
        if(evt.getKeyCode()==37){
            //left
            if(col>0){
                TabTable.setColumnSelectionInterval(col-1, col-1);
                
            }
        }
        if(evt.getKeyCode()==39){
            //right
            if(col<(TabTable.getColumnCount()-1)){
                TabTable.setColumnSelectionInterval(col+1, col+1);
            }
        }
        */
    }//GEN-LAST:event_TabTableKeyReleased

    private void RepeatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RepeatMouseClicked
        // TODO add your handling code here:
        int col = TabTable.getSelectedColumn();
        
        if(col>0){
            TabTable.setValueAt(TabTable.getValueAt(0, col-1), 0, col);
            TabTable.setValueAt(TabTable.getValueAt(1, col-1), 1, col);
            TabTable.setValueAt(TabTable.getValueAt(2, col-1), 2, col);
            TabTable.setValueAt(TabTable.getValueAt(3, col-1), 3, col);
            TabTable.setValueAt(TabTable.getValueAt(4, col-1), 4, col);
            TabTable.setValueAt(TabTable.getValueAt(5, col-1), 5, col);

            TabTable.setColumnSelectionInterval(col+1, col+1);
        }
    }//GEN-LAST:event_RepeatMouseClicked

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
        // TODO add your handling code here:
        //JFrame n = new JFrame();
        JFileChooser nf = new JFileChooser();
        nf.showSaveDialog(this);
    }//GEN-LAST:event_SaveMouseClicked

    private void ChordBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ChordBoxItemStateChanged
        // TODO add your handling code here:
        if((evt.getStateChange()==ItemEvent.SELECTED) && (!((String)ChordBox.getSelectedItem()).trim().equals(""))){
            String CN = (String)ChordBox.getSelectedItem();
            String CV = (String)ChordDic.get(CN);
            
            ClearSelection();
            
            if(!(CV.charAt(6)==' ')){
                int row=Integer.valueOf(""+CV.charAt(6));
                System.out.println("E Row: " +row );
                EString.setText(""+CV.charAt(6));
                Buttons[0][row].setSelected(true);
            }
            if(!(CV.charAt(5)==' ')){
                int row=Integer.valueOf(""+CV.charAt(5));
                System.out.println("B Row: " +row );
                BString.setText(""+CV.charAt(5));
                Buttons[1][row].setSelected(true);
            }
            if(!(CV.charAt(4)==' ')){
                int row=Integer.valueOf(""+CV.charAt(4));
                System.out.println("G Row: " +row );
                GString.setText(""+CV.charAt(4));
                Buttons[2][row].setSelected(true);
            }
            if(!(CV.charAt(3)==' ')){
                int row=Integer.valueOf(""+CV.charAt(3));
                System.out.println("D Row: " +row );
                DString.setText(""+CV.charAt(3));
                Buttons[3][row].setSelected(true);
            }
            if(!(CV.charAt(2)==' ')){
                int row=Integer.valueOf(""+CV.charAt(2));
                System.out.println("A Row: " +row );
                AString.setText(""+CV.charAt(2));
                Buttons[4][row].setSelected(true);
            }
            if(!(CV.charAt(1)==' ')){
                int row=Integer.valueOf(""+CV.charAt(1));
                System.out.println("E Row: " +row );
                estring.setText(""+CV.charAt(1));
                Buttons[5][row].setSelected(true);
            }
            
            //System.out.println("Chord Selected: " + CN + "  Chord Value: " + CV);
            //System.out.println("E="+CV.charAt(6));
            //System.out.println("B="+CV.charAt(5));
            //System.out.println("G="+CV.charAt(4));
            //System.out.println("D="+CV.charAt(3));
            //System.out.println("A="+CV.charAt(2));
            //System.out.println("e="+CV.charAt(1));
            
        }
        
    }//GEN-LAST:event_ChordBoxItemStateChanged

    private void ClearAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearAllMouseClicked
        // TODO add your handling code here:
        int col = TM.getColumnCount();
        int row = TM.getRowCount();
        
        for(int j=0; j<row; j++){
            for(int i=0; i<col; i++){
                TabTable.setValueAt("", j, i);
            }
        }
        
    }//GEN-LAST:event_ClearAllMouseClicked

    private void InsertIntoTab(){
        TabColIndex= TabTable.getSelectedColumn();
        
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
        ChordBox.setSelectedIndex(0);
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
    private javax.swing.JTextField AString1;
    private javax.swing.JTextField BString;
    private javax.swing.JTextField BString1;
    private javax.swing.JLabel Background;
    private javax.swing.JComboBox<String> ChordBox;
    private javax.swing.JComboBox<String> ChordBox1;
    private javax.swing.JButton ClearAll;
    private javax.swing.JTextField DString;
    private javax.swing.JTextField DString1;
    private javax.swing.JButton Delete;
    private javax.swing.JButton DuplicateButton;
    private javax.swing.JTextField EString;
    private javax.swing.JTextField EString1;
    private javax.swing.JTextField GString;
    private javax.swing.JTextField GString1;
    private javax.swing.JButton Insert;
    private javax.swing.JLabel Key;
    private javax.swing.JButton Listen;
    private javax.swing.JButton Load;
    private javax.swing.JButton PlayButton;
    private javax.swing.JButton Repeat;
    private javax.swing.JButton Save;
    private javax.swing.JPanel SelectionPanel;
    private javax.swing.JToggleButton T;
    private javax.swing.JToggleButton T1;
    private javax.swing.JTable TabTable;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JTextField estring;
    private javax.swing.JTextField estring1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
