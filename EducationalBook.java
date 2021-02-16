/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp;

import static bp.Book.booksName;
import java.awt.TextArea;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author gayeu
 */
public class EducationalBook extends Book implements Search {

    String topic;
    static ArrayList Educationalbooks = new ArrayList<String>();
    static ArrayList topics = new ArrayList<String>();

    public EducationalBook(String name, String author, int bookId, int num, boolean stockStatus, String topic) {
        super(name, author, bookId, num, stockStatus);
        this.topic = topic;
        Educationalbooks.add("Java");
    }

    @Override
    public void ListBook() {
        JFrame frame = new JFrame("Educational Book List");
        frame.setVisible(true);
        frame.setSize(300, 300);
        TextArea area = new TextArea();
        frame.add(area);
        for (int i = 0; i < Educationalbooks.size(); i++) {
            area.setText((String) Educationalbooks.get(i));
        }
    }

    @Override
    public void BookSearch(String BookName) {
        for (int i = 0; i < booksName.size(); i++) {
            if (booksName.get(i).equals(BookName)) {
                JOptionPane.showMessageDialog(null, "Book find");
                break;
            }
        }
    }

    @Override
    public void BookSearch(String Name, ArrayList array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals(Name)) {
                JOptionPane.showMessageDialog(null, "Book find");
                break;
            }
        }
    }
}
