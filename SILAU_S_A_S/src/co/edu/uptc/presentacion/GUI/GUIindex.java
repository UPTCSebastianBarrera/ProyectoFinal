package co.edu.uptc.presentacion.GUI;


import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class GUIindex extends JFrame {

	private JLabel Logo;
	private JPanel MENUINDEX;
	private JLabel Nombre;
	private JLabel Correo;
	private JButton Factura;
	private JButton Pedido;
	private JButton Inventario;
	private JButton Fabricacion;
	private ImageIcon SILAUICON;
	private Font pixelMplus;
	
	
	public GUIindex() {
		
		//COMPONENTES DEL INDEX
		Logo = new JLabel();
		Nombre = new JLabel();
		Correo = new JLabel();
		Factura = new JButton();
		Pedido = new JButton();
		Inventario = new JButton();
		Fabricacion = new JButton();
		SILAUICON = new ImageIcon("src/textures/SILAUICON.png");
		
		setSize(360,540);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setTitle("SILAU S.A.S");
		setIconImage(SILAUICON.getImage());
		
		getContentPane().setBackground(Color.BLACK);
		
		add(getMenuIndex());
		
		
		
	}

	private JPanel getMenuIndex() {
		
		MENUINDEX = new JPanel();
		
		MENUINDEX.setSize(360,540);
		MENUINDEX.setLayout(null);
		MENUINDEX.setBackground(Color.decode("#F2F2F2"));
		
		Logo.setSize(140, 97);
		Logo.setIcon(new ImageIcon(SILAUICON.getImage().getScaledInstance(140, 97, Image.SCALE_DEFAULT)));
		
		Logo.setLocation(100,50);
		Logo.setBackground(Color.orange);
		Nombre.setFont(getCustomFont());
		Nombre.setText("SILAU S.A.S");
		Nombre.setSize(Nombre.getPreferredSize());
		
		Nombre.setLocation(125, 160);
		
		MENUINDEX.add(Logo);
		MENUINDEX.add(Nombre);
		
		
		return MENUINDEX;
	}

	private Font getCustomFont() {
		
		
		try{
            // load a custom font in your project folder
			pixelMplus = Font.createFont(Font.TRUETYPE_FONT, new File("src/Fonts/Quicksand-Bold.ttf")).deriveFont(18f);	
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/Fonts/Quicksand-Bold.ttf")));			
		}
		catch(IOException | FontFormatException e){
			System.err.print("ERROR DE FUENTE");
		}
		
		
		return pixelMplus;
	}
}
