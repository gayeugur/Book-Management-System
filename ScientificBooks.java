/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp;

import static bp.ScientificBooks.ScientificBooksName;
import java.awt.TextArea;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author gayeu
 */
public class ScientificBooks extends Book {

    static ArrayList ScientificBooksName = new ArrayList<>();

    public ScientificBooks(String name, String author, int bookId, int num, boolean stockStatus) {
        super(name, author, bookId, num, stockStatus);
    }

    @Override
    public void ListBook() {
        JFrame frame = new JFrame("Scientific Book List");
        frame.setVisible(true);
        frame.setSize(300, 300);
        TextArea area = new TextArea();
        frame.add(area);
        for (int i = 0; i < ScientificBooksName.size(); i++) {
            area.setText((String) ScientificBooksName.get(i));
        }
    }

}
