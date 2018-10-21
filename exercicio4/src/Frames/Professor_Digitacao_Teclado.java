package Frames;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class Professor_Digitacao_Teclado {
	
	private JButton buttonTio;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button0;
	private JButton buttonTraco;
	private JButton buttonMais;
	private JButton buttonBackspace;
	
	private JButton buttonTab;
	private JButton buttonQ;
	private JButton buttonW;
	private JButton buttonE;
	private JButton buttonR;
	private JButton buttonT;
	private JButton buttonY;
	private JButton buttonU;
	private JButton buttonI;
	private JButton buttonO;
	private JButton buttonP;
	private JButton buttonColEsq;
	private JButton buttonColDir;
	private JButton buttonContraBarra;
	
	private JButton buttonCaps;
	private JButton buttonA;
	private JButton buttonS;
	private JButton buttonD;
	private JButton buttonF;
	private JButton buttonG;
	private JButton buttonH;
	private JButton buttonJ;
	private JButton buttonK;
	private JButton buttonL;
	private JButton buttonDoisPontos;
	private JButton buttonAspas;
	private JButton buttonEnter;
	
	private JButton buttonShift;
	private JButton buttonZ;
	private JButton buttonX;
	private JButton buttonC;
	private JButton buttonV;
	private JButton buttonB;
	private JButton buttonN;
	private JButton buttonM;
	private JButton buttonVirgula;
	private JButton buttonPonto;
	private JButton buttonInterrogacao;
	private JButton buttonSobe;
	
	private JButton buttonEspaco;
	private JButton buttonEsquerda;
	private JButton buttonBaixo; 
	private JButton buttonDireita; 
	
	private JLabel labelTexto1;
	private JLabel labelTexto2;
	
	private String[] nomeLinha1 = {"~", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "+", "Backspace"};
	private String[] nomeLinha2 = {"Tab", "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", "\\"};
	private String[] nomeLinha3 = {"Caps Lock", "A", "S", "D", "F", "G", "H", "J", "K", "L", ":", "\"", "Enter"};
	private String[] nomeLinha4 = {"Shift", "Z", "X", "C", "V", "B", "N", "M", ",", ".", "?", "^"};
	private String[] nomeLinha5 = {"Space", "<", "v", ">"};
	
	private JButton[] buttonLinha1 = { buttonTio, button1, button2, button3, button4, button5, button6, button7, button8,
			button9, button0, buttonTraco, buttonMais, buttonBackspace };
	
	private JButton[] buttonLinha2 = { buttonTab, buttonQ, buttonW, buttonE, buttonR, buttonT, buttonY, buttonU, buttonI,
			buttonO, buttonP, buttonColEsq, buttonColDir, buttonContraBarra };
	
	private JButton[] buttonLinha3 = { buttonCaps, buttonA, buttonS, buttonD, buttonF, buttonG, buttonH, buttonJ, buttonK,
			buttonL, buttonDoisPontos, buttonAspas, buttonEnter };
	
	private JButton[] buttonLinha4 = { buttonShift, buttonZ, buttonX, buttonC, buttonV, buttonB, buttonN, buttonM, buttonVirgula,
			buttonPonto, buttonInterrogacao, buttonSobe };
	
	private Map<JButton[], String[]> juntaButtons = new HashMap<>();
	
	private JButton[] buttonLinha5 = { buttonEspaco, buttonEsquerda, buttonBaixo, buttonDireita };
	
	private JTextArea textAreaDigitacao;
	
	private String capsOrShiftCase = "";
	
	private Color defaultColor = null;
	
	private boolean ifUpperCase = false;
	
	public Professor_Digitacao_Teclado() {}
	
	public void criaTela() {
		
		final JFrame jFrame = new JFrame("Typing Application");
		final JPanel jPanel = new JPanel();
	
		int x = 18;
		
		for(int i = 0; i < buttonLinha1.length; i++) {
			buttonLinha1[i] = new JButton(nomeLinha1[i]);
			defaultColor = buttonLinha1[i].getBackground();
			buttonLinha1[i].setSize(45,40);
			buttonLinha1[i].setLocation(x, 370);
			if(buttonLinha1[i].getText().equals("Backspace")) {
				buttonLinha1[i].setSize(100, 40);
			}
			x+=60;
		}
		
		x = 18;
		
		for(int i = 0; i < buttonLinha2.length; i++) {
			buttonLinha2[i] = new JButton(nomeLinha2[i]);
			buttonLinha2[i].setSize(45,40);
			buttonLinha2[i].setLocation(x, 420);
			if(buttonLinha2[i].getText().equals("Tab")) {
				buttonLinha2[i].setSize(70, 40);
				x+= 25;
			}
			x+=60;
		}
		
		x = 18;

		for(int i = 0; i < buttonLinha3.length; i++) {
			buttonLinha3[i] = new JButton(nomeLinha3[i]);
			buttonLinha3[i].setSize(45,40);
			buttonLinha3[i].setLocation(x, 470);
			if(buttonLinha3[i].getText().equals("Caps Lock")) {
				buttonLinha3[i].setSize(70, 40);
				x+= 25;
			}
			if(buttonLinha3[i].getText().equals("Enter")) {
				buttonLinha3[i].setSize(105, 40);
			}
			
			x+=60;
		}
		
		x = 18;
		
		for(int i = 0; i < buttonLinha4.length; i++) {
			buttonLinha4[i] = new JButton(nomeLinha4[i]);
			buttonLinha4[i].setSize(45,40);
			buttonLinha4[i].setLocation(x, 520);
			if(buttonLinha4[i].getText().equals("Shift")) {
				buttonLinha4[i].setSize(100, 40);
				x+= 55;
			}
			if(buttonLinha4[i].getText().equals("^")) {
				buttonLinha4[i].setLocation(x+30, 520);
			}
			x+=60;
		}
		
		x = 18;
		
		for(int i = 0; i < buttonLinha5.length; i++) {
			buttonLinha5[i] = new JButton(nomeLinha5[i]);
			buttonLinha5[i].setSize(45,40);
			buttonLinha5[i].setLocation(x, 570);
			if(buttonLinha5[i].getText().equals("Space")) {
				buttonLinha5[i].setSize(300, 40);
				buttonLinha5[i].setLocation(x+300, 570);
				x+=625;
			}
			x+=60;
		}
		
		juntaButtons.put(buttonLinha1, nomeLinha1);
		juntaButtons.put(buttonLinha2, nomeLinha2);
		juntaButtons.put(buttonLinha3, nomeLinha3);
		juntaButtons.put(buttonLinha4, nomeLinha4);
		juntaButtons.put(buttonLinha5, nomeLinha5);
		
		labelTexto1 = new JLabel("Type some text using your keyboard. The keys you press will be highlighted and the text will be displayed.");
		labelTexto1.setLocation(15, 10);
        labelTexto1.setSize(600, 20);
		
		labelTexto2 = new JLabel("Note: Clicking the buttons with your mouse will not perform any action.");
		labelTexto2.setLocation(18, 25);
		labelTexto2.setSize(600, 20);
		
		textAreaDigitacao = new JTextArea();
		textAreaDigitacao.setLocation(18, 50);
		textAreaDigitacao.setSize(880, 300);
		textAreaDigitacao.setLineWrap(true);
		textAreaDigitacao.setEditable(false);
		textAreaDigitacao.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				for(int i = 0; i < buttonLinha1.length; i++) {
					String keyText = KeyEvent.getKeyText(e.getKeyCode());
					if(keyText.toString().equals(buttonLinha1[i].getText())) {
						buttonLinha1[i].setBackground(defaultColor);
					}
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {
				for(int i = 0; i < buttonLinha1.length; i++) {
					String keyText = KeyEvent.getKeyText(e.getKeyCode());
					if(keyText.toString().equals(buttonLinha1[i].getText())) {
						if(keyText.equals("Backspace")) {
							Document doc = textAreaDigitacao.getDocument();
							if(doc.getLength() > 0) {
								try {
									doc.remove(doc.getLength()-1, 1);
								} catch (BadLocationException e1) {
									e1.printStackTrace();
								}
							}
						} else {
							buttonLinha1[i].setBackground(Color.GREEN);
							if(ifUpperCase) {
								escreveLetra(buttonLinha1[i].getText().toLowerCase());
							} else {
								escreveLetra(buttonLinha1[i].getText());
							}
						}
					}
				}
			}
		});
		
		textAreaDigitacao.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				for(int i = 0; i < buttonLinha2.length; i++) {
					String keyText = KeyEvent.getKeyText(e.getKeyCode());
					if(keyText.toString().toUpperCase().equals(buttonLinha2[i].getText())) {
						buttonLinha2[i].setBackground(defaultColor);
					}
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				for(int i = 0; i < buttonLinha2.length; i++) {
					String keyText = KeyEvent.getKeyText(e.getKeyCode());
					if(keyText.toString().equals(buttonLinha2[i].getText())) {
						System.out.println(keyText);
						buttonLinha2[i].setBackground(Color.GREEN);
						if(ifUpperCase) {
							escreveLetra(buttonLinha2[i].getText().toLowerCase());
						} else {
							escreveLetra(buttonLinha2[i].getText());
						}
					}
				}
			}
		});
		
		textAreaDigitacao.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				for(int i = 0; i < buttonLinha3.length; i++) {
					String keyText = KeyEvent.getKeyText(e.getKeyCode());
					if(keyText.toString().toUpperCase().equals(buttonLinha3[i].getText())) {
						buttonLinha3[i].setBackground(defaultColor);
					}
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				for(int i = 0; i < buttonLinha3.length; i++) {
					String keyText = KeyEvent.getKeyText(e.getKeyCode());
					if(keyText.equals("Caps Lock")) {
						ifUpperCase = !ifUpperCase;
					} else
					if(keyText.toString().equals(buttonLinha3[i].getText())) {
						System.out.println(keyText);
						buttonLinha3[i].setBackground(Color.GREEN);
						if(ifUpperCase) {
							escreveLetra(buttonLinha3[i].getText().toLowerCase());
						} else {
							escreveLetra(buttonLinha3[i].getText());
						}
					}
				}
			}
		});
		
		textAreaDigitacao.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				for(int i = 0; i < buttonLinha4.length; i++) {
					String keyText = KeyEvent.getKeyText(e.getKeyCode());
					if(keyText.toString().equals(buttonLinha4[i].getText())) {
						buttonLinha4[i].setBackground(defaultColor);
					}
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				for(int i = 0; i < buttonLinha4.length; i++) {
					String keyText = KeyEvent.getKeyText(e.getKeyCode());
					if(keyText.toString().equals(buttonLinha4[i].getText())) {
						System.out.println(keyText);
						buttonLinha4[i].setBackground(Color.GREEN);
						if(ifUpperCase) {
							escreveLetra(buttonLinha4[i].getText().toLowerCase());
						} else {
							escreveLetra(buttonLinha4[i].getText());
						}
					}
				}
			}
		});
		
		textAreaDigitacao.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				for(int i = 0; i < buttonLinha5.length; i++) {
					String keyText = KeyEvent.getKeyText(e.getKeyCode());
					if(keyText.equals("Espaço")) {
						keyText = "Space";
					}
					if(keyText.toString().equals(buttonLinha5[i].getText())) {
						buttonLinha5[i].setBackground(defaultColor);
					}
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {
				for(int i = 0; i < buttonLinha5.length; i++) {
					String keyText = KeyEvent.getKeyText(e.getKeyCode());
					if(keyText.equals("Espaço")) {
						keyText = "Space";
					}
					if(keyText.toString().equals(buttonLinha5[i].getText())) {
						buttonLinha5[i].setBackground(Color.GREEN);
						escreveLetra(" ");
//					} else if(e.getKeyCode() == ) {
						
					}
				}	
			}
		});
		
		jPanel.add(labelTexto1);
		jPanel.add(labelTexto2);
		jPanel.add(textAreaDigitacao);
//		jPanel.add(buttonTio);
//		jPanel.add(button1);
		
		
		for (JButton button : buttonLinha1) {
			jPanel.add(button);
		}
		
		for (JButton button : buttonLinha2) {
			jPanel.add(button);

		}
		
		for (JButton button : buttonLinha3) {
			jPanel.add(button);
		}
		
		for (JButton button : buttonLinha4) {
			jPanel.add(button);
			
		}
		
		for (JButton button : buttonLinha5) {
			jPanel.add(button);

		}
		
		
		
		jPanel.setLayout(null);
		jPanel.setSize(934, 700);
        jPanel.setVisible(true);
        
        jFrame.add(jPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(jPanel.getSize());
        jFrame.setResizable(false);
        jFrame.setVisible(true);
	}
	
	private void escreveLetra(String letra) {
		String capturaEscrever = textAreaDigitacao.getText();
		textAreaDigitacao.setText(capturaEscrever + letra);
		textAreaDigitacao.requestFocus(true);
	}
	
	private void escreveLetra(Character letra) {
		String capturaEscrever = textAreaDigitacao.getText();
		textAreaDigitacao.setText(capturaEscrever + letra);
		textAreaDigitacao.requestFocus(true);
	}
	
	public static void main(String[] args) {
		new Professor_Digitacao_Teclado().criaTela();
	}
}
