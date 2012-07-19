package com.warlux.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.warlux.controller.Engine;
import com.warlux.controller.Listener;

public class Principal extends JFrame {

	private JPanel panelNorte = new JPanel();
	private JPanel panelCentro = new JPanel();
	private JPanel panelSur = new JPanel();

	public Principal(Engine engine) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 550);
		setResizable(false);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - getWidth()) / 2, (screenSize.height - getHeight()) / 2);
		setFocusable(true);
		addKeyListener(new Listener(engine));
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());		
		contentPane.add(panelNorte, BorderLayout.NORTH);
		contentPane.add(panelCentro, BorderLayout.CENTER);
		contentPane.add(panelSur, BorderLayout.SOUTH);
		panelNorte.setLayout(new FlowLayout(FlowLayout.CENTER));
		panelNorte.add(engine.getScoreboard());	
		panelCentro.setLayout(new FlowLayout(FlowLayout.CENTER));
		panelCentro.add(engine.getTablero());
		panelSur.setLayout(new FlowLayout(FlowLayout.CENTER));		
		panelSur.add(engine.getConsoleLabel());
		pack();
	}

}
