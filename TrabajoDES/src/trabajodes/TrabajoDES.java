package trabajodes;
import javax.swing.*;


public class TrabajoDES extends JFrame{
    
    private JTextArea pantalla = new JTextArea();
    private JButton cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve;
    private JButton suma, resta, multiplicacion, division,  igual, CE;       
    
    
    public TrabajoDES(){
       setTitle ("Calculadora");
       setSize(700,300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
}
    public static void main(String[] args){
        Calculadora
    }
    public void AddComponentes (JPanel Panel) {
        pantalla.setLayout(null);
        pantalla.setBounds(10, 70, 260, 90);
        cero.setBounds(15, 120, 60, 60);
        uno.setBounds(115, 120, 60, 60);
        dos.setBounds(215, 120, 60, 60);
        tres.setBounds(315, 220, 60, 60);
        cuatro.setBounds(415, 220, 60, 60);
        cinco.setBounds(515, 220, 60, 60);
      //  seis.setBounds;
        
                
 /*
        cero.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        String result = pantalla.getText();
        pantalla.setText(result+"0");
        }
    });
     
        uno.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        String result = resultadoOp.getText();
        uno.setText(result+"1");
        }
    });
        
        dos.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        String result = resultadoOp.getText();
        dos.setText(result+"2");
        }
    });
        
        tres.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        String result = resultadoOp.getText();
        tres.setText(result+"3");
        }
    });
        
        cuatro.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        String result = resultadoOp.getText();
        cuatro.setText(result+"4");
        }
    });
       
        cinco.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        String result = resultadoOp.getText();
        cinco.setText(result+"5");
        }
    });
        
        seis.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        String result = resultadoOp.getText();
        seis.setText(result+"6");
        }
    });
        
        siete.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        String result = resultadoOp.getText();
        siete.setText(result+"7");
        }
    });
        
        ocho.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        String result = resultadoOp.getText();
        ocho.setText(result+"8");
        }
    });
        
        nueve.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        String result = resultadoOp.getText();
        nueve.setText(result+"9");
        }
    });
        */
        
        
        
        
    }       
}
        
        
    
    
        
   
  
    
    
    
    
    
    
    
    
    
    
    
    
    
  



