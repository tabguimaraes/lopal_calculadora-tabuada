package br.senai.jandira.calculadora_tabuada.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import br.senai.jandira.calculadora_tabuada.model.Tabuada;

public class TelaTabuada {
	
	private JLabel lblMultiplicando;
	private JTextField txtMultiplicando;
	private JLabel lblMinimoMultiplicador;
	private JTextField txtMinimoMultiplicador;
	private JLabel lblMaximoMultiplicador;
	private JTextField txtMaximoMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JList listTabuada;
	private String resultado[];

	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setSize(245, 500);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Tabuada");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setResizable(false);
		
		lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando:");
		lblMultiplicando.setBounds(20, 10, 130, 30);
		
		txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(170, 10, 40, 30);
		
		lblMinimoMultiplicador = new JLabel();
		lblMinimoMultiplicador.setText("Mínimo Multiplicador:");
		lblMinimoMultiplicador.setBounds(20, 50, 130, 30);
		
		txtMinimoMultiplicador = new JTextField();
		txtMinimoMultiplicador.setBounds(170, 50, 40, 30);
		
		lblMaximoMultiplicador = new JLabel();
		lblMaximoMultiplicador.setText("Maximo Multiplicador:");
		lblMaximoMultiplicador.setBounds(20, 90, 130, 30);
		
		txtMaximoMultiplicador = new JTextField();
		txtMaximoMultiplicador.setBounds(170, 90, 40, 30);
		
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 140, 90, 30);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(120, 140, 90, 30);
		
		listTabuada = new JList(resultado);
		listTabuada.setBounds(20, 190, 190, 250);
		
		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(lblMinimoMultiplicador);
		tela.getContentPane().add(txtMinimoMultiplicador);
		tela.getContentPane().add(lblMaximoMultiplicador);
		tela.getContentPane().add(txtMaximoMultiplicador);
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		tela.getContentPane().add(listTabuada);
		
		//Configurar os ouvintes (listeners) dos botões
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String multiplicando = txtMultiplicando.getText();
				String minimoMultiplicador = txtMinimoMultiplicador.getText();
				String maximoMultiplicador = txtMaximoMultiplicador.getText();
				
				//casting -> conversão de um tipo para outro
				double multiplicandoDouble = Double.parseDouble(multiplicando);
				double minimoMultiplicadorDouble = Double.parseDouble(minimoMultiplicador);
				double maximoMultiplicadorDouble = Double.parseDouble(maximoMultiplicador);
				
				Tabuada tabuada = new Tabuada();
				tabuada.setMultiplicando(multiplicandoDouble);
				tabuada.setMinimoMultiplicador(minimoMultiplicadorDouble);
				tabuada.setMaximoMultiplicador(maximoMultiplicadorDouble);
				resultado = tabuada.calcularTabuada();
				
			}
		});
		
		tela.setVisible(true);
		
	}

}
