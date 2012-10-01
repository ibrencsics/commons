package org.ib.tools.signature;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/15/12
 * Time: 3:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class GUI extends JFrame implements ActionListener {

    private JToolBar toolbar;
    private JPanel workspacePanel;

    private static final String XML_SIG = "XmlSig";
    private static final String OTHER = "Other";

    public GUI() {
        super("Tools");

		toolbar = new JToolBar("Toolbar");

		JButton xmlsigButton = new JButton(XML_SIG);
		xmlsigButton.setActionCommand(XML_SIG);
		xmlsigButton.setToolTipText(XML_SIG);
		xmlsigButton.addActionListener(this);
		toolbar.add(xmlsigButton);

        JButton otherButton = new JButton(OTHER);
		otherButton.setActionCommand(OTHER);
		otherButton.setToolTipText(OTHER);
		otherButton.addActionListener(this);
		toolbar.add(otherButton);

        workspacePanel = new JPanel();

        showPanels();
    }

    private void showPanels() {
		getContentPane().removeAll();
		getContentPane().setLayout(new BorderLayout());
        getContentPane().add(toolbar, BorderLayout.NORTH);
        getContentPane().add(workspacePanel, BorderLayout.CENTER);
//        getContentPane().add(databasePanel, BorderLayout.EAST);

        validate();
        repaint();
	}

    private static void createAndShowGUI() {
		JFrame frame = new GUI();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.pack();
		frame.setSize(1000, 600);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(XML_SIG)) {
            workspacePanel = new XmlSigPanel();
        } else if (e.getActionCommand().equals(OTHER)) {
            workspacePanel = new JPanel();
            workspacePanel.add(new JLabel(OTHER));
        }
        showPanels();
    }
}
