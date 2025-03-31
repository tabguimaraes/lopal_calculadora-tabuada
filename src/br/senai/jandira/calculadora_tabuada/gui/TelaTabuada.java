package br.senai.jandira.calculadora_tabuada.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaTabuada {

	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setSize(250, 400);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Tabuada");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		
		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando:");
		lblMultiplicando.setBounds(20, 10, 130, 30);
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(170, 10, 40, 30);
		
		JLabel lblMinimoMultiplicador = new JLabel();
		lblMinimoMultiplicador.setText("Mínimo Multiplicador:");
		lblMinimoMultiplicador.setBounds(20, 50, 130, 30);
		
		JTextField txtMinimoMultiplicando = new JTextField();
		txtMinimoMultiplicando.setBounds(170, 50, 40, 30);
		
		JLabel lblMaximoMultiplicador = new JLabel();
		lblMaximoMultiplicador.setText("Maximo Multiplicador:");
		lblMaximoMultiplicador.setBounds(20, 90, 130, 30);
		
		JTextField txtMaximoMultiplicando = new JTextField();
		txtMaximoMultiplicando.setBounds(170, 90, 40, 30);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 140, 90, 20);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Calcular");
		buttonLimpar.setBounds(120, 140, 90, 20);
		
		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(lblMinimoMultiplicador);
		tela.getContentPane().add(txtMinimoMultiplicando);
		tela.getContentPane().add(lblMaximoMultiplicador);
		tela.getContentPane().add(txtMaximoMultiplicando);
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		
		tela.setVisible(true);
		
	}

}
