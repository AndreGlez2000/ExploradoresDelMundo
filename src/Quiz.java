import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.Arrays;

public class Quiz implements ActionListener{

    String[] preguntas = {

            "Pregunta 1: ",
            "Pregunta 2: ",
            "Pregunta 3: ",
            "Pregunta 4: "

    };

    String[][] opciones = {

            {"Opcion A","Opcion B","Opcion C","Opcion D"},
            {"Opcion A","Opcion B","Opcion C","Opcion D"},
            {"Opcion A","Opcion B","Opcion C","Opcion D"},
            {"Opcion A","Opcion B","Opcion C","Opcion D"}

    };

    char[] respuestas = {

            'A',
            'B',
            'C',
            'D'

    };

    char guess;
    char answer;
    int index;
    int correct_guesses = 0;
    int total_preguntas = preguntas.length;
    int result;
    int segundos = 10;

    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JTextArea textArea = new JTextArea();
    JButton botonA = new JButton();
    JButton botonB = new JButton();
    JButton botonC = new JButton();
    JButton botonD = new JButton();
    JLabel respuesta_labelA = new JLabel();
    JLabel respuesta_labelB = new JLabel();
    JLabel respuesta_labelC = new JLabel();
    JLabel respuesta_labelD = new JLabel();
    JLabel time_label = new JLabel();
    JLabel segundos_restantes = new JLabel();
    JTextField number_right = new JTextField();
    JTextField porcentaje = new JTextField();


    public Quiz(){

        //frame osea ventana 1200 x 980
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200,980);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(null);
        frame.setResizable(true);


        //texto de hasta arriba
        textField.setBounds(0,0,1200,50);
        textField.setBackground(new Color(25,25,25)); // color del background
        textField.setForeground(new Color(25,255,0));
        textField.setFont(new Font("Ink Free", Font.BOLD, 30));
        textField.setBorder(BorderFactory.createBevelBorder(1));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);
        textField.setText("Texto de hasta arriba");

        //sub_texto
        textArea.setBounds(0,50,1200,50);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(25,25,25)); // color del background
        textArea.setForeground(new Color(25,255,0));
        textArea.setFont(new Font("MV Boli", Font.BOLD, 25));
        textArea.setBorder(BorderFactory.createBevelBorder(1));
        textArea.setEditable(false);
        textArea.setText("Sub-Texto");

        //Boton A, medidas, font
        botonA.setBounds(0,100,600,100);
        botonA.setFont(new Font("MV Boli", Font.BOLD, 35));
        botonA.setFocusable(false);
        botonA.addActionListener(this);

        //Boton B, medidas, font
        botonB.setBounds(600,100,600,100);
        botonB.setFont(new Font("MV Boli", Font.BOLD, 35));
        botonB.setFocusable(false);
        botonB.addActionListener(this);

        //Boton C, medidas, font
        botonC.setBounds(0,200,600,100);
        botonC.setFont(new Font("MV Boli", Font.BOLD, 35));
        botonC.setFocusable(false);
        botonC.addActionListener(this);

        //Boton D, medidas, font
        botonD.setBounds(600,200,600,100);
        botonD.setFont(new Font("MV Boli", Font.BOLD, 35));
        botonD.setFocusable(false);
        botonD.addActionListener(this);


        //anadir elementos al frame
        frame.add(botonA);
        frame.add(botonB);
        frame.add(botonC);
        frame.add(botonD);
        frame.add(textArea);
        frame.add(textField);
        frame.setVisible(true);

    }

    public void nextQuestion() {

    }

    public void actionPerformed(ActionEvent e) {


    }

    public void displayAnswer() {

    }

    public void results() {

    }


}