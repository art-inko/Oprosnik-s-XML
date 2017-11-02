package oprosnik;
// 12345
import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class OprosnikMainFrame extends javax.swing.JFrame {

    public OprosnikMainFrame() throws IOException, SAXException, ParserConfigurationException {
        initComponents();
        setLocationRelativeTo(null);
        ArrayList<Integer> al = new ArrayList();
        nextQuestionButton.setEnabled(false);
        previousQuestionButton.setEnabled(false);
        finishButton.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        answersButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        questionField = new javax.swing.JTextField();
        finishButton = new javax.swing.JButton();
        nextQuestionButton = new javax.swing.JButton();
        previousQuestionButton = new javax.swing.JButton();
        beginTestButton = new javax.swing.JButton();
        answersPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Вопрос:");

        finishButton.setText("Закончить тестирование");
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });

        nextQuestionButton.setText("Сделующий вопрос");
        nextQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQuestionButtonActionPerformed(evt);
            }
        });

        previousQuestionButton.setText("Предыдущий вопрос");
        previousQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousQuestionButtonActionPerformed(evt);
            }
        });

        beginTestButton.setText("Начать тестирование");
        beginTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginTestButtonActionPerformed(evt);
            }
        });

        answersPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Варианты ответов:");

        javax.swing.GroupLayout answersPanelLayout = new javax.swing.GroupLayout(answersPanel);
        answersPanel.setLayout(answersPanelLayout);
        answersPanelLayout.setHorizontalGroup(
            answersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answersPanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        answersPanelLayout.setVerticalGroup(
            answersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answersPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 202, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(questionField)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(answersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(198, 198, 198))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(previousQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(finishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(beginTestButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(questionField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(answersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(beginTestButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finishButton)
                    .addComponent(nextQuestionButton)
                    .addComponent(previousQuestionButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishButtonActionPerformed
        allQuestions.get(currentDisplayedQuestion).setChosenAnswerID(getSelectedButtonID(answersButtonGroup));
        int quantityOfRightAnswers = 0;
        for (int i = 0; i < allQuestions.size(); i++) {
            if (allQuestions.get(i).checkRightAnswer()) {
                quantityOfRightAnswers++;
            }
        }
        ResultsFrame resultsFrame = new ResultsFrame(allQuestions, quantityOfRightAnswers);
        resultsFrame.setVisible(true);

    }//GEN-LAST:event_finishButtonActionPerformed

    private void beginTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginTestButtonActionPerformed
        finishButton.setEnabled(true);
        beginTestButton.setEnabled(false);
        try {
            allQuestions = fileParsing();
        } catch (SAXException | IOException | ParserConfigurationException ex) {
            Logger.getLogger(OprosnikMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        questionField.setText(allQuestions.get(currentDisplayedQuestion).getQuestionText());
        nextQuestionButton.setEnabled(true);
        answersButtonGroup = setAnswersOnDisplay();
    }//GEN-LAST:event_beginTestButtonActionPerformed

    private void nextQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQuestionButtonActionPerformed
        currentDisplayedQuestion++;
        allQuestions.get(currentDisplayedQuestion - 1).setChosenAnswerID(getSelectedButtonID(answersButtonGroup));
        if (currentDisplayedQuestion == allQuestions.size() - 1) {
            nextQuestionButton.setEnabled(false);
        }
        previousQuestionButton.setEnabled(true);
        questionField.setText(allQuestions.get(currentDisplayedQuestion).getQuestionText());
        answersButtonGroup = setAnswersOnDisplay();
        int selectedAnswer = allQuestions.get(currentDisplayedQuestion).getChosenAnswerID();
    }//GEN-LAST:event_nextQuestionButtonActionPerformed

    private void previousQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousQuestionButtonActionPerformed
        currentDisplayedQuestion--;
        allQuestions.get(currentDisplayedQuestion + 1).setChosenAnswerID(getSelectedButtonID(answersButtonGroup));
        allQuestions.get(currentDisplayedQuestion).checkRightAnswer();
        if (currentDisplayedQuestion == 0) {
            previousQuestionButton.setEnabled(false);
        }
        nextQuestionButton.setEnabled(true);
        questionField.setText(allQuestions.get(currentDisplayedQuestion).getQuestionText());
        answersButtonGroup = setAnswersOnDisplay();
    }//GEN-LAST:event_previousQuestionButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                new OprosnikMainFrame().setVisible(true);
            } catch (IOException | SAXException | ParserConfigurationException ex) {
                Logger.getLogger(OprosnikMainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    //=============== Переменные ===============

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup answersButtonGroup;
    private javax.swing.JPanel answersPanel;
    private javax.swing.JButton beginTestButton;
    private javax.swing.JButton finishButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nextQuestionButton;
    private javax.swing.JButton previousQuestionButton;
    private javax.swing.JTextField questionField;
    // End of variables declaration//GEN-END:variables
    private final String filePath = "C:/JavaLearn/Актуальные программы/Oprosnik with XML/Questions.xml";
    private ArrayList<Question> allQuestions;
    private int currentDisplayedQuestion = 0;

    //=============== Методы ===================
    private ButtonGroup setAnswersOnDisplay() {
        int j = 30;
        answersPanel.removeAll();
        answersPanel.add(jLabel2);
        ButtonGroup currentAnswersGroup = new ButtonGroup();
        for (int i = 1; i < allQuestions.get(currentDisplayedQuestion).getAllAnswers().length + 1; i++) {
            JRadioButton radioButton = new JRadioButton(allQuestions.get(currentDisplayedQuestion).getAllAnswers()[i - 1]);
            radioButton.setBounds(50, j, 300, 40);
            currentAnswersGroup.add(radioButton);
            answersPanel.add(radioButton);
            if (i == allQuestions.get(currentDisplayedQuestion).getChosenAnswerID()) {
                radioButton.setSelected(true);
            }
            j = j + 30;
        }
        repaint();
        return currentAnswersGroup;
    }

    public int getSelectedButtonID(ButtonGroup buttonGroup) {
        int i = 1;
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) { // Как работает данный цикл
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return i;
            }
            i++;
        }

        return 0;
    }

    public ArrayList<Question> fileParsing() throws SAXException, IOException, ParserConfigurationException {
        ArrayList<Question> allQuestionsTemp = new ArrayList();
        File file = new File(filePath);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);
        doc.getDocumentElement().normalize();
        NodeList allQuestions = doc.getElementsByTagName("Question");
        for (int s = 0; s < allQuestions.getLength(); s++) {
            Question question = new Question();
            Node fstNode = allQuestions.item(s);
            if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) fstNode;
                question.setQuestionText(element.getAttribute("QuestionText"));
                NodeList answerList = element.getElementsByTagName("Answer");
                String[] tempAllAnswers = new String[answerList.getLength()];
                for (int i = 0; i < answerList.getLength(); i++) {
                    Element answer = (Element) answerList.item(i);
                    NodeList answerNL = answer.getChildNodes();
                    tempAllAnswers[i] = ((Node) answerNL.item(0)).getNodeValue();
                }
                question.setAllAnswers(tempAllAnswers);
                NodeList rightAnswerList = element.getElementsByTagName("Right_answer");
                Element rightAnswer = (Element) rightAnswerList.item(0);
                NodeList rightAnswerNL = rightAnswer.getChildNodes();
                int rightAnswerID = Integer.parseInt(((Node) rightAnswerNL.item(0)).getNodeValue());
                question.setRightAnswerID(rightAnswerID);
            }
            allQuestionsTemp.add(question);
        }
        return allQuestionsTemp;
    }
}
