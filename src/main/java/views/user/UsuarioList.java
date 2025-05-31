package views.user;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class UsuarioList extends JPanel {
    private UserListTableModel tableModel;

    public UsuarioList(){
        this.initComponets();
    }

    private void initComponets() {
        setLayout(new BorderLayout());

        this.tableModel = new UserListTableModel(List.of());
    }
}
