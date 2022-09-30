package me.pepe.Calculeitor30002;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Frame extends JFrame {

	private JPanel contentPane;
	private RoundedPanel button_0;
	private RoundedPanel ac_button;
	private RoundedPanel plusnegative_button;
	private RoundedPanel porcent_button;
	private RoundedPanel div_button;
	private RoundedPanel plus_button;
	private RoundedPanel button_9;
	private RoundedPanel button_8;
	private RoundedPanel button_7;
	private RoundedPanel negative_button;
	private RoundedPanel button_6;
	private RoundedPanel button_5;
	private RoundedPanel button_4;
	private RoundedPanel sume_button;
	private RoundedPanel button_3;
	private RoundedPanel button_2;
	private RoundedPanel button_1;
	private RoundedPanel equals_button;
	private RoundedPanel come_button;
	private JLabel solution;
	private double cacheNumber = -1;
	private MathAction cacheMathAction;
	private RoundedPanel cacheMathActionPanel;
	private boolean toResetNumber = false;
	public Frame() {
		setTitle("C 3000 2");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 264, 408);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ac_button = new RoundedPanel(200, Color.LIGHT_GRAY, "AC");
		ac_button.setBounds(10, 77, 50, 50);
		ac_button.getLabel().setBounds(0, 10, 50, 30);
		ac_button.getLabel().setForeground(Color.BLACK);
		contentPane.add(ac_button);
		
		plusnegative_button = new RoundedPanel(200, Color.LIGHT_GRAY, "+/-");
		plusnegative_button.setBounds(70, 77, 50, 50);
		plusnegative_button.getLabel().setForeground(Color.BLACK);
		contentPane.add(plusnegative_button);
		
		porcent_button = new RoundedPanel(200, Color.LIGHT_GRAY, "%");
		porcent_button.setBounds(130, 77, 50, 50);
		porcent_button.getLabel().setForeground(Color.BLACK);
		contentPane.add(porcent_button);
		
		div_button = new RoundedPanel(200, Color.ORANGE, "\u00F7");
		div_button.setBounds(190, 77, 50, 50);
		div_button.getLabel().setFont(new Font("Arial", Font.PLAIN, 35));
		contentPane.add(div_button);
		
		plus_button = new RoundedPanel(200, Color.ORANGE, "x");
		plus_button.setBounds(190, 135, 50, 50);
		plus_button.getLabel().setBounds(10, 8, 30, 30);
		plus_button.getLabel().setFont(new Font("Arial", Font.PLAIN, 35));
		contentPane.add(plus_button);
		
		button_9 = new RoundedPanel(200, Color.DARK_GRAY, "9");
		button_9.setBounds(130, 135, 50, 50);
		contentPane.add(button_9);
		
		button_8 = new RoundedPanel(200, Color.DARK_GRAY, "8");
		button_8.setBounds(70, 135, 50, 50);
		contentPane.add(button_8);
		
		button_7 = new RoundedPanel(200, Color.DARK_GRAY, "7");
		button_7.setBounds(10, 135, 50, 50);
		contentPane.add(button_7);
		
		negative_button = new RoundedPanel(200, Color.ORANGE, "_");
		negative_button.getLabel().setFont(new Font("Arial", Font.PLAIN, 35));
		negative_button.setBounds(190, 195, 50, 50);
		negative_button.getLabel().setBounds(5, -12, 40, 40);
		contentPane.add(negative_button);
		
		button_6 = new RoundedPanel(200, Color.DARK_GRAY, "6");
		button_6.setBounds(130, 195, 50, 50);
		contentPane.add(button_6);
		
		button_5 = new RoundedPanel(200, Color.DARK_GRAY, "5");
		button_5.setBounds(70, 195, 50, 50);
		contentPane.add(button_5);
		
		button_4 = new RoundedPanel(200, Color.DARK_GRAY, "4");
		button_4.setBounds(10, 195, 50, 50);
		contentPane.add(button_4);
		
		sume_button = new RoundedPanel(200, Color.ORANGE, "+");
		sume_button.setBounds(190, 255, 50, 50);
		sume_button.getLabel().setFont(new Font("Arial", Font.PLAIN, 35));
		contentPane.add(sume_button);
		
		button_3 = new RoundedPanel(200, Color.DARK_GRAY, "3");
		button_3.setBounds(130, 255, 50, 50);
		contentPane.add(button_3);
		
		button_2 = new RoundedPanel(200, Color.DARK_GRAY, "2");
		button_2.setBounds(70, 255, 50, 50);
		contentPane.add(button_2);
		
		button_1 = new RoundedPanel(200, Color.DARK_GRAY, "1");
		button_1.setBounds(10, 255, 50, 50);
		contentPane.add(button_1);
		
		equals_button = new RoundedPanel(200, Color.ORANGE, "=");
		equals_button.getLabel().setFont(new Font("Arial", Font.PLAIN, 35));
		equals_button.setBounds(190, 315, 50, 50);
		contentPane.add(equals_button);
		
		come_button = new RoundedPanel(200, Color.DARK_GRAY, ",");
		come_button.getLabel().setFont(new Font("Arial", Font.PLAIN, 40));
		come_button.getLabel().setBounds(10, -10, 30, 50);
		come_button.setBounds(130, 315, 50, 50);
		contentPane.add(come_button);
		
		button_0 = new RoundedPanel(50, Color.DARK_GRAY, "0");
		button_0.getLabel().setHorizontalAlignment(SwingConstants.LEADING);
		button_0.getLabel().setBounds(10, 10, 90, 30);
		button_0.setBounds(10, 315, 110, 50);
		contentPane.add(button_0);
		
		solution = new JLabel("0");
		solution.setFont(new Font("Arial", Font.PLAIN, 40));
		solution.setHorizontalAlignment(SwingConstants.TRAILING);
		solution.setForeground(Color.WHITE);
		solution.setBounds(-575, 28, 815, 39);
		contentPane.add(solution);
		setClickActions();
	}
	private void setMatchAction(RoundedPanel panel, MathAction mathAction) {
		if (cacheMathActionPanel != null) {
			resetMathAction();
		}
		toResetNumber = true;
		cacheNumber = getNumber();
		cacheMathActionPanel = panel;
		cacheMathAction = mathAction;
		cacheMathActionPanel.setBackgroundColor(Color.WHITE);
		cacheMathActionPanel.getLabel().setForeground(Color.ORANGE);
	}
	private void resetMathAction() {
		if (cacheMathActionPanel != null) {
			cacheMathActionPanel.setBackgroundColor(Color.ORANGE);
			cacheMathActionPanel.getLabel().setForeground(Color.WHITE);
			cacheMathActionPanel.repaint();
		}
		cacheMathActionPanel = null;
		cacheMathAction = null;
	}
	private void setClickActions() {
		ac_button.setClickAction(new ClickAction() {
			@Override
			public void click() {
				reset();
			}
		}); 
		equals_button.setClickAction(new ClickAction() {
			@Override
			public void click() {
				equals_action();
			}
		}); 		
		div_button.setClickAction(new ClickAction() {
			@Override
			public void click() {
				setMatchAction(div_button, MathAction.DIVIDIR);
			}
		}); 	
		plus_button.setClickAction(new ClickAction() {
			@Override
			public void click() {
				setMatchAction(plus_button, MathAction.MULTIPLICAR);
			}
		}); 	
		negative_button.setClickAction(new ClickAction() {
			@Override
			public void click() {
				setMatchAction(negative_button, MathAction.RESTAR);
			}
		}); 
		sume_button.setClickAction(new ClickAction() {
			@Override
			public void click() {
				setMatchAction(sume_button, MathAction.SUMAR);
			}
		}); 
		button_0.setClickAction(new ClickAction() {
			@Override
			public void click() {
				addNumber(0);
			}
		});
		button_1.setClickAction(new ClickAction() {
			@Override
			public void click() {
				addNumber(1);
			}
		});
		button_2.setClickAction(new ClickAction() {
			@Override
			public void click() {
				addNumber(2);
			}
		});
		button_3.setClickAction(new ClickAction() {
			@Override
			public void click() {
				addNumber(3);
			}
		});
		button_4.setClickAction(new ClickAction() {
			@Override
			public void click() {
				addNumber(4);
			}
		});
		button_5.setClickAction(new ClickAction() {
			@Override
			public void click() {
				addNumber(5);
			}
		});
		button_6.setClickAction(new ClickAction() {
			@Override
			public void click() {
				addNumber(6);
			}
		});
		button_7.setClickAction(new ClickAction() {
			@Override
			public void click() {
				addNumber(7);
			}
		});
		button_8.setClickAction(new ClickAction() {
			@Override
			public void click() {
				addNumber(8);
			}
		});
		button_9.setClickAction(new ClickAction() {
			@Override
			public void click() {
				addNumber(9);
			}
		});
		come_button.setClickAction(new ClickAction() {
			@Override
			public void click() {
				if (!solution.getText().contains(".")) {
					solution.setText(solution.getText() + ".");
					toResetNumber = false;
				}
			}
		});
		porcent_button.setClickAction(new ClickAction() {
			@Override
			public void click() {
				solution.setText(doubleToString(getNumber() * 0.01));
			}
		});
		plusnegative_button.setClickAction(new ClickAction() {
			@Override
			public void click() {
				if (solution.getText().contains("-")) {
					solution.setText(solution.getText().replace("-", ""));
				} else {
					solution.setText("-" + solution.getText());
				}
			}
		});
	}
	private void equals_action() {
		if (cacheMathAction != null) {
			solution.setText(doubleToString(cacheMathAction.execute(cacheNumber, getNumber())));
			resetMathAction();
			cacheNumber = -1;
			toResetNumber = true;
		}		
	}
	private double getNumber() {
		return Double.valueOf(solution.getText());
	}
	private void addNumber(double number) {
		String sol = solution.getText();
		if (sol.equals("0") || toResetNumber) {
			sol = "";
		}
		sol = sol + doubleToString(number);
		if (sol.equals("0")) {
			ac_button.getLabel().setText("AC");
		} else {
			ac_button.getLabel().setText("C");
		}
		solution.setText(sol);
		if (toResetNumber) {
			toResetNumber = false;
		}
	}
	private String doubleToString(double d) {
		String result = d + "";
		if (d == 0) { 
			result = "0";
		} else if ((int) d != 0 && result.contains(".0")) {
			result = result.replace(".0", "");
		}
		return result;
	}
	private void reset() {
		cacheNumber = -1;
		resetMathAction();
		solution.setText("0");
		ac_button.getLabel().setText("AC");
	}
}
