import javax.swing.*;
import javax.swing.GroupLayout;
import java.lang.Math;
import java.awt.EventQueue;
import java.awt.event.*;
import static javax.swing.LayoutStyle.ComponentPlacement.RELATED;

public class App extends JFrame {
    private JButton clearButton, equal, add, minus, times, divide, sqrt, button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    private JLabel answer;


    public App() {
        initUI();
    }

    private void initUI() {
        clearButton = new JButton("Clear"); //Construct the button
        clearButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText("");
            }
        });
        add = new JButton("+");
        add.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText() + " + ");
            }
        });
        minus = new JButton("-");
        minus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText() + " - ");
            }
        });
        times = new JButton("*");
        times.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText() + " * ");
            }
        });
        divide = new JButton("/");
        divide.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText() + " / ");
            }
        });
        sqrt = new JButton("Sqrt");
        sqrt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String total;
                if (answer.getText().length() == 1){
                    total = Integer.toString((int) Math.sqrt((double) Integer.parseInt(answer.getText())));
                } else {
                    String[] value = answer.getText().split(" ");   
                    int totalCalc = 0;
                    if(value[1].equals("+")){
                        totalCalc += Integer.parseInt(value[0]) + Integer.parseInt(value[2]);
                    } else if(value[1].equals("-")){
                        totalCalc += Integer.parseInt(value[0]) - Integer.parseInt(value[2]);
                    } else if(value[1].equals("*")){
                        totalCalc += Integer.parseInt(value[0]) * Integer.parseInt(value[2]);
                    } else if(value[1].equals("/")){
                        totalCalc += Integer.parseInt(value[0]) / Integer.parseInt(value[2]);
                    }
    
                    for(int i = 3; i < value.length; i++){
                        if(value[i].equals("+")){
                            totalCalc += Integer.parseInt(value[i+1]);
                        } else if(value[i].equals("-")){
                            totalCalc -= Integer.parseInt(value[i+1]);
                        } else if(value[i].equals("*")){
                            totalCalc *= Integer.parseInt(value[i+1]);
                        } else if(value[i].equals("/")){
                            totalCalc /= Integer.parseInt(value[i+1]);
                        }
                    }
                    total = Integer.toString((int) Math.sqrt((double) totalCalc));
                }

                answer.setText(total);
            }
        });

        equal = new JButton("=");
        equal.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] value = answer.getText().split(" ");   
                int totalCalc = 0;
                if(value[1].equals("+")){
                    totalCalc += Integer.parseInt(value[0]) + Integer.parseInt(value[2]);
                } else if(value[1].equals("-")){
                    totalCalc += Integer.parseInt(value[0]) - Integer.parseInt(value[2]);
                } else if(value[1].equals("*")){
                    totalCalc += Integer.parseInt(value[0]) * Integer.parseInt(value[2]);
                } else if(value[1].equals("/")){
                    totalCalc += Integer.parseInt(value[0]) / Integer.parseInt(value[2]);
                }

                for(int i = 3; i < value.length; i++){
                    if(value[i].equals("+")){
                        totalCalc += Integer.parseInt(value[i+1]);
                    } else if(value[i].equals("-")){
                        totalCalc -= Integer.parseInt(value[i+1]);
                    } else if(value[i].equals("*")){
                        totalCalc *= Integer.parseInt(value[i+1]);
                    } else if(value[i].equals("/")){
                        totalCalc /= Integer.parseInt(value[i+1]);
                    }
                }
                String total = Integer.toString(totalCalc);
                answer.setText(total);
            }
        });

        button1 = new JButton("1");
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText() + "1");
            }
        });
        button2 = new JButton("2");
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText() + "2");
            }
        });
        button3 = new JButton("3");
        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText() + "3");
            }
        });
        button4 = new JButton("4");
        button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText() + "4");            
            }
        });
        button5 = new JButton("5");
        button5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText() + "5");
            }
        });
        button6 = new JButton("6");
        button6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText() + "6");
            }
        });
        button7 = new JButton("7");
        button7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText() + "7");
            }
        });
        button8 = new JButton("8");
        button8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText() + "8");
            }
        });
        button9 = new JButton("9");
        button9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText() + "9");
            }
        });
        button0 = new JButton("0");
        button0.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setText(answer.getText() + "0");
            }
        });

        answer = new JLabel("", SwingConstants.CENTER);

        createLayout(clearButton, button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, add, minus, times, divide, sqrt, answer, equal);//Method called to place

        setTitle("Calculator");
        //      width, height
        setSize(290, 240);
        setLocationRelativeTo(null);// Center aline on the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// When close is pressed it closes
    }

    private void createLayout(JComponent...args){
        //Add the button onto the screen using GroupLayout
        var pane = getContentPane();
        var gl = new GroupLayout(pane);
        pane.setLayout(gl); //

        gl.setAutoCreateContainerGaps(true); // Creates gaps
        //GroupLayout
        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addPreferredGap(RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gl.createParallelGroup()
                    .addComponent(args[0])// Close
                    .addComponent(args[4])
                    .addComponent(args[8])
                    .addComponent(args[12])
                    .addComponent(args[16]))
                .addGroup(gl.createParallelGroup()
                    .addComponent(args[1])
                    .addComponent(args[5])
                    .addComponent(args[9])
                    .addComponent(args[13]))
                .addGroup(gl.createParallelGroup()    
                    .addComponent(args[2])
                    .addComponent(args[6])
                    .addComponent(args[10])
                    .addComponent(args[14]))
                .addGroup(gl.createParallelGroup()
                    .addComponent(args[17])
                    .addComponent(args[3])
                    .addComponent(args[7])
                    .addComponent(args[11])
                    .addComponent(args[15])));

        
        gl.setVerticalGroup(gl.createSequentialGroup()
            .addPreferredGap(RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gl.createParallelGroup()
                    .addComponent(args[16])
                    .addComponent(args[17]))
                .addGroup(gl.createParallelGroup()
                    .addComponent(args[0])
                    .addComponent(args[1])
                    .addComponent(args[2])
                    .addComponent(args[3]))
                .addGroup(gl.createParallelGroup()
                    .addComponent(args[4])
                    .addComponent(args[5])
                    .addComponent(args[6])
                    .addComponent(args[7]))
                .addGroup(gl.createParallelGroup()    
                    .addComponent(args[8])
                    .addComponent(args[9])
                    .addComponent(args[10])
                    .addComponent(args[11]))
                .addGroup(gl.createParallelGroup()
                    .addComponent(args[12])
                    .addComponent(args[13])
                    .addComponent(args[14])
                    .addComponent(args[15])));

        gl.linkSize(SwingConstants.HORIZONTAL, equal, clearButton, add, minus, times, sqrt, divide, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9);
    }

    public static void main(String[] args) {    
        EventQueue.invokeLater(() -> {
            var calc = new App();
            calc.setVisible(true);
        });
    }
}