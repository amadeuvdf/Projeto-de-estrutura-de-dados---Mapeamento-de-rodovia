import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Janela extends JFrame {

    ListaLigada lista;

    // Cria os objetos que serão usados na janela
    Container container;
    Container panel1;
    Container panel2;
    Container panel3;

    JTextField txt1;

    JLabel lbl1;
    JTextField lbl2;

    JButton btn1;

    public Janela(ListaLigada lista) {
        super("Trabalho EAD2");

        this.lista = lista;


        // Cria a tela
        container = getContentPane();
        container.setLayout(null);

        this.instanciarComponentes();

        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null); 


        this.aumentarFonteComponentes();
        this.posicionarComponentes();
        this.adicionarComponentes();


        setSize(800, 600); // Largura, altura - tamanho da janela
        setLocationRelativeTo(null);  // Centraliza a janela

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cria a operação pra quando o usuário clicar no "X" fechar a tela
        setVisible(true); // Deixa a janela visivel
    }

    public void instanciarComponentes() {

        // Instacia os objetos para serem adicionados na tela
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        lbl1 = new JLabel("Digite o km:");
        lbl2 = new JTextField("",SwingConstants.CENTER);
        lbl2.setEditable(false);

        txt1 = new JTextField();

        btn1 = new JButton("Pesquisar!");
        //cria o evento do botão
        btn1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
				int procura = Integer.parseInt(txt1.getText());
				int posicao_lista = selecao.melhorSelecao(lista,procura);
				int km = lista.pega(posicao_lista).Kilometro;
				String url = lista.pega(posicao_lista).link_url;
                lbl2.setText("Km: " + km +"\n"+ "- URL: " + url);  
            }  
        });  
    }

    public void adicionarComponentes() {

        // Adiciona os objetos na tela
        panel1.add(lbl1);
        panel1.add(txt1);

        panel2.add(btn1);

        panel3.add(lbl2);

        container.add(panel1);
        container.add(panel2);
        container.add(panel3);
    }

    public void aumentarFonteComponentes() {

        // Aumenta a fonte dos textos
        lbl1.setFont(new Font("Dialog", Font.PLAIN, 20));
        lbl2.setFont(new Font("Dialog", Font.PLAIN, 15));



        txt1.setFont(new Font("Dialog", Font.PLAIN, 20));

    }

    public void posicionarComponentes() {

        // Define a posição e tamanho na tela, já que definimos o layout como null
        // Respectivamente: coluna linha, largura e altura

        panel1.setBounds(200, 100, 150, 150);
        panel2.setBounds(400, 100, 150, 150);
        panel3.setBounds(25, 300, 700, 150);

        lbl1.setBounds(10, 10, 200, 150);
        lbl2.setBounds(10, 0, 690, 150);

        txt1.setBounds(15, 100, 100, 40);

        btn1.setBounds(10,90,100,50);
    }
}