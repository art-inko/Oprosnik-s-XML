package oprosnik;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class OprosnikTableModel extends AbstractTableModel {

    private final ArrayList<Question> allQuestions;

    public OprosnikTableModel(ArrayList<Question> allQuestions) {
        this.allQuestions = allQuestions;
    }

    @Override
    public int getRowCount() {
        return allQuestions.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return rowIndex + 1;
            case 1:
                return allQuestions.get(rowIndex).getChosenAnswerID();
            case 2:
                if (allQuestions.get(rowIndex).checkRightAnswer()) {

                    return "Верно";
                } else {
                    return "Не Верно";
                }
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Номер вопроса";
            case 1:
                return "Данный ответ";

            case 2:
                return "Результат";

            default:
                return "Другая колонка";

        }
    }
}
