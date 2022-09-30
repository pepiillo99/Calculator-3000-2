package me.pepe.Calculeitor30002;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class RoundedPanel extends JPanel {
	private Color backgroundColor = Color.BLACK;
    private JLabel label;
    private int cornerRadius = 15;
    private boolean pressed = false;
    private Color pressedColor = Color.PINK;
    private ClickAction clickAction;
    public RoundedPanel(LayoutManager layout, int radius) {
        super(layout);
        cornerRadius = radius;
    }

    public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
        super(layout);
        cornerRadius = radius;
        backgroundColor = bgColor;
    }

    public RoundedPanel(int radius) {
        super();
        cornerRadius = radius;
    }

    public RoundedPanel(int radius, Color bgColor, String text) {
    	this(radius, bgColor, new Color((bgColor.getRed() + 50) > 255 ? 255 : bgColor.getRed() + 50, (bgColor.getGreen() + 50) > 255 ? 255 : bgColor.getGreen() + 50, (bgColor.getBlue() + 50) > 255 ? 255 : bgColor.getBlue() + 50), text);
    }
    public RoundedPanel(int radius, Color bgColor, Color pressedColor, String text) {
        super();
        this.pressedColor = pressedColor;
        setBackground(Color.BLACK);
        setLayout(null);
        cornerRadius = radius;
        backgroundColor = bgColor;
		
        label = new JLabel(text);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.PLAIN, 25));
        label.setBounds(10, 10, 30, 30);
		add(label);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pressed = true;
				repaint();
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if (clickAction != null) {
					clickAction.click();
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pressed = false;
				repaint();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pressed = false;
				repaint();
			}
		});
    }
    public JLabel getLabel() {
    	return label;
    }
    public void setPressedButtonColor(Color color) {
    	this.pressedColor = color;
    }
    public void setBackgroundColor(Color color) {
    	this.backgroundColor = color;
    }
    public void setClickAction(ClickAction action) {
    	this.clickAction = action;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //Draws the rounded panel with borders.
        if (pressed) {
        	graphics.setColor(pressedColor);
        } else {
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
        }
        graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
    }
}