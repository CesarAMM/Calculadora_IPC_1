
package calculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VentanaCalculadora extends JFrame{
    public JPanel panel; 
    JTextField caja;
    public VentanaCalculadora(){
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Calculadora Simple");
        IniciarComponenetes();
    }
    
    private void IniciarComponenetes(){
       IniciarPaneles();
       IniciarEtiquetas();
       IniciarButtons();
    }
    
    private void IniciarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void IniciarEtiquetas(){
        JLabel label = new JLabel();
        label.setText("CALCULADORA BÁSICA");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBounds(0, 20, 600, 40);
        label.setForeground(Color.WHITE);
        label.setOpaque(true);
        label.setBackground(Color.BLACK);
        label.setFont(new Font("Cambria", Font.BOLD, 20));
        panel.add(label);
        
        //CREACIÓN CAJA DE TEXTO
        caja = new JTextField();
        caja.setBounds(150, 85, 300, 30);
        panel.add(caja);
    }
    
    private void IniciarButtons(){
        //CREACIÓN BOTONES
        //FILA 1 BOTONES
        //BOTÓN 1
        JButton boton1 = new JButton("1");
        boton1.setBounds(140,150,60,60);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                caja.setText(Operaciones.mostrarTexto(caja.getText(), "1"));
            }
        });
        panel.add(boton1);

        //BOTÓN 2
        JButton boton2 = new JButton("2");
        boton2.setBounds(205,150,60,60);
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                caja.setText(Operaciones.mostrarTexto(caja.getText(), "2"));
            }
        });
        panel.add(boton2);

        //BOTÓN 3
        JButton boton3 = new JButton();
        boton3.setBounds(270,150,60,60);
        boton3.setText("3");
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                caja.setText(Operaciones.mostrarTexto(caja.getText(), "3"));
            }
        });
        panel.add(boton3);


        //BOTÓN PARÉNTESIS "("
        JButton botonparentesis1 = new JButton();
        botonparentesis1.setBounds(335,150,60,60);
        botonparentesis1.setText("(");
        botonparentesis1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                caja.setText(Operaciones.mostrarTexto(caja.getText(), "("));
            }
        });
        panel.add(botonparentesis1);


        //BOTÓN PARÉNTESIS ")"
        JButton botonparentesis2 = new JButton();
        botonparentesis2.setBounds(400,150,60,60);
        botonparentesis2.setText(")");
        botonparentesis2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                caja.setText(Operaciones.mostrarTexto(caja.getText(), ")"));
            }
        });
        panel.add(botonparentesis2);

        //FILA 2 BOTONES
        //BOTÓN 4
        JButton boton4 = new JButton();
        boton4.setBounds(140,220,60,60);
        boton4.setText("4");
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                caja.setText(Operaciones.mostrarTexto(caja.getText(), "4"));
            }
        });
        panel.add(boton4);


        //BOTÓN 5
        JButton boton5 = new JButton();
        boton5.setBounds(205,220,60,60);
        boton5.setText("5");
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                caja.setText(Operaciones.mostrarTexto(caja.getText(), "5"));
            }
        });
        panel.add(boton5);


        //BOTÓN 6
        JButton boton6 = new JButton();
        boton6.setBounds(270,220,60,60);
        boton6.setText("6");
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                caja.setText(Operaciones.mostrarTexto(caja.getText(), "5"));
            }
        });
        panel.add(boton6);


        //BOTÓN DIVISIÓN "/"
        JButton botondivision = new JButton();
        botondivision.setBounds(335,220,60,60);
        botondivision.setText("/");
        botondivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                caja.setText(Operaciones.mostrarTexto(caja.getText(), "/"));
            }
        });
        panel.add(botondivision);


        //BOTÓN MULTIPLICACIÓN "*"
        JButton botonmultiplicacion = new JButton();
        botonmultiplicacion.setBounds(400,220,60,60);
        botonmultiplicacion.setText("*");
        botonmultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                caja.setText(Operaciones.mostrarTexto(caja.getText(), "*"));
            }
        });
        panel.add(botonmultiplicacion);

        //FILA 3
        //BOTÓN 7
        JButton boton7 = new JButton();
        boton7.setBounds(140,290,60,60);
        boton7.setText("7");
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                caja.setText(Operaciones.mostrarTexto(caja.getText(), "7"));
            }
        });
        panel.add(boton7);

        //BOTÓN 8
        JButton boton8 = new JButton();
        boton8.setBounds(205,290,60,60);
        boton8.setText("8");
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                caja.setText(Operaciones.mostrarTexto(caja.getText(), "7"));
            }
        });
        panel.add(boton8);

        //BOTÓN 9
        JButton boton9 = new JButton();
        boton9.setBounds(270,290,60,60);
        boton9.setText("9");
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                caja.setText(Operaciones.mostrarTexto(caja.getText(), "9"));
            }
        });
        panel.add(boton9);

        //BOTÓN SUMA "+"
        JButton botonsuma = new JButton();
        botonsuma.setBounds(335,290,60,60);
        botonsuma.setText("+");
        botonsuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                caja.setText(Operaciones.mostrarTexto(caja.getText(), "+"));
            }
        });
        panel.add(botonsuma);

        //BOTÓN RESTA "-"
        JButton botonresta = new JButton();
        botonresta.setBounds(400,290,60,60);
        botonresta.setText("-");
        botonresta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                caja.setText(Operaciones.mostrarTexto(caja.getText(), "-"));
            }
        });
        panel.add(botonresta);


        //FILA 4
        //BOTÓN 0
        JButton boton0 = new JButton();
        boton0.setBounds(140,360,190,60);
        boton0.setText("0");
        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                caja.setText(Operaciones.mostrarTexto(caja.getText(), "0"));
            }
        });
        panel.add(boton0);


        //BOTÓN IGUAL "="
        JButton botonigual = new JButton();
        botonigual.setBounds(335,360,125,60);
        botonigual.setText("=");
        botonigual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                caja.setText(Operaciones.mostrarTexto(caja.getText(), "="));
            }
        });
        panel.add(botonigual);
    }
}
