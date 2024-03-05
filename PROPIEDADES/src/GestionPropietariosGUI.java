import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GestionPropietariosGUI extends JFrame {
    private ArrayList<Propietario> propietarios;

    public GestionPropietariosGUI() {
        propietarios = new ArrayList<>();

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar imagen de fondo
                ImageIcon img = new ImageIcon("imgfondo.jpeg");
                g.drawImage(img.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };

        ImageIcon logo = new ImageIcon("casa.png");
        Image scaledLogo = logo.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel lblLogo = new JLabel(new ImageIcon(scaledLogo));
        lblLogo.setBounds(220, 100, 100, 100);
        panel.add(lblLogo);


        JButton btnRegistrarPropietario = new JButton("Registrar Propietario");
        btnRegistrarPropietario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarPropietario();
            }
        });
        btnRegistrarPropietario.setBounds(20, 20, 180, 30); // Coordenadas del botón
        panel.add(btnRegistrarPropietario);

        JButton btnListarPropietarios = new JButton("Listar Propietarios");
        btnListarPropietarios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarPropietarios();
            }
        });
        btnListarPropietarios.setBounds(20, 70, 180, 30); // Coordenadas del botón
        panel.add(btnListarPropietarios);

        JButton btnBuscarPropietario = new JButton("Buscar Propietario");
        btnBuscarPropietario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buscarPropietario();
            }
        });
        btnBuscarPropietario.setBounds(20, 120, 180, 30); // Coordenadas del botón
        panel.add(btnBuscarPropietario);

        add(panel);
        setTitle("Gestión de Propietarios");
        setSize(350, 200); // Tamaño ajustado para el logo y los botones
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void registrarPropietario() {
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del propietario:");
        String apellido = JOptionPane.showInputDialog(this, "Ingrese el apellido del propietario:");
        int documento = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el documento del propietario:"));
        int edad = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la edad del propietario:"));

        Propietario propietario = new Propietario(documento, nombre, apellido, edad, new ArrayList<>());
        propietarios.add(propietario);

        JOptionPane.showMessageDialog(this, "Propietario registrado correctamente.");
    }

    private void listarPropietarios() {
        JFrame frame = new JFrame("Listado de Propietarios");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Documento");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Apellido");
        tableModel.addColumn("Edad");
        JTable table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        for (Propietario propietario : propietarios) {
            Object[] rowData = {propietario.getDocumento(), propietario.getNombres(), propietario.getApellidos(), propietario.getEdad()};
            tableModel.addRow(rowData);
        }

        frame.setVisible(true);
    }

    private void buscarPropietario() {
        int documento = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el documento del propietario a buscar:"));

        Propietario encontrado = null;
        for (Propietario propietario : propietarios) {
            if (propietario.getDocumento() == documento) {
                encontrado = propietario;
                break;
            }
        }

        if (encontrado != null) {
            JOptionPane.showMessageDialog(this, encontrado.getInformacion(), "Propietario Encontrado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Propietario no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new GestionPropietariosGUI();
    }
}