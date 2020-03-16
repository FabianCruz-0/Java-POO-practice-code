package InterfazInstancias;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


public class InterfaceAlumnos extends JFrame implements ActionListener
{
	JButton primero,ultimo,anterior,siguiente,editar,guardarCa,guardarNue,nuevo,borrar,salir;
	JTextField mat,nom,prom;
	int index;
	
	ArrayList<Alumno> lista = new ArrayList<Alumno>();

	
	
	public static void main(String[] args) 
	{
		InterfaceAlumnos interfaceAl = new InterfaceAlumnos();
		interfaceAl.crearGUI();
		interfaceAl.setVisible(true);
		interfaceAl.setSize(800,200);
		interfaceAl.setResizable(false);
	}

	private void crearGUI()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container frame = this.getContentPane();
		frame.setLayout(new FlowLayout());
		this.setTitle("Base Datos Alumnos.");
		
		JLabel JLab_mat =new JLabel("Matricula");
		JLabel JLab_nom =new JLabel("Nombre");
		JLabel JLab_prom =new JLabel("Promedio");
		
		mat = new JTextField(10);
		nom = new JTextField(30);
		prom = new JTextField(10);
		
		mat.setEditable(false);
		nom.setEditable(false);
		prom.setEditable(false);
		
		primero = new JButton("Primero");
		primero.addActionListener(this);
		ultimo = new JButton("ultimo");
		ultimo.addActionListener(this);
		anterior = new JButton("anterior");
		anterior.addActionListener(this);
		siguiente = new JButton("siguiente");
		siguiente.addActionListener(this);
		editar = new JButton("editar");
		editar.addActionListener(this);
		guardarCa = new JButton("guardar cambios");
		guardarCa.addActionListener(this);
		nuevo = new JButton("nuevo");
		nuevo.addActionListener(this);
		guardarNue = new JButton("guardar nuevo");
		guardarNue.addActionListener(this);
		borrar = new JButton("borrar");
		borrar.addActionListener(this);
		salir = new JButton("salir");
		salir.addActionListener(this);
		
		frame.add(JLab_mat);
		frame.add(mat);
		frame.add(JLab_nom);
		frame.add(nom);
		frame.add(JLab_prom);
		frame.add(prom);
		frame.add(primero);
		frame.add(ultimo);
		frame.add(anterior);
		frame.add(siguiente);
		frame.add(editar);
		frame.add(guardarCa);
		frame.add(nuevo);
		frame.add(guardarNue);
		frame.add(borrar);
		frame.add(salir);

	}
	
	private void noeditable()
	{
		mat.setEditable(false);
		nom.setEditable(false);
		prom.setEditable(false);
	}

	private void editable()
	{
		mat.setEditable(true);
		nom.setEditable(true);
		prom.setEditable(true);
	}
	private void primero()
	{
		try {
			int index = 0;
			Alumno alumno = lista.get(index);
			mat.setText(""+ alumno.mat_alu);
			nom.setText(""+alumno.nom_alu);
			prom.setText(""+alumno.prom_alu);
			noeditable();
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Hubo un error con los parámetros.");
		}
	}
	private void ultimo()
	{
		try {
			Alumno alumno = lista.get(lista.size()-1);
			mat.setText(""+ alumno.mat_alu);
			nom.setText(""+alumno.nom_alu);
			prom.setText(""+alumno.prom_alu);
			noeditable();
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Hubo un error con los parámetros.");
		}
	}
	private void anterior()
	{
		try {
			index = sacarIndex();
			int indexLocal =index-1;
			Alumno alumno = lista.get(indexLocal);
			mat.setText(""+ alumno.mat_alu);
			nom.setText(""+alumno.nom_alu);
			prom.setText(""+alumno.prom_alu);
			noeditable();
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Hubo un error con los parámetros.");
		}
	}
	private void siguiente()
	{
		try {
			index = sacarIndex();
			int indexLocal = index+1;
			Alumno alumno = lista.get(indexLocal);
			mat.setText(""+ alumno.mat_alu);
			nom.setText(""+alumno.nom_alu);
			prom.setText(""+alumno.prom_alu);
			noeditable();
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Hubo un error con los parámetros.");
		}
	}
	private void editar()
	{
		try {
			primero.setEnabled(false);
			ultimo.setEnabled(false);
			anterior.setEnabled(false);
			siguiente.setEnabled(false);
			nuevo.setEnabled(false);
			guardarNue.setEnabled(false);
			borrar.setEnabled(false);
			for(Alumno alumno : lista)
			{
				if(alumno.getNom_alu().contentEquals(nom.getText()));
				{
					index = lista.indexOf(alumno);
				}
				Alumno traer = lista.get(index);
				mat.setText(""+traer.mat_alu);
				nom.setText(""+traer.nom_alu);
				prom.setText(""+traer.prom_alu);
				editable();
			}
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Hubo un error con los parámetros.");
		}
	}
	private void guardarCa()
	{
		try {
			int matricula = Integer.parseInt(mat.getText());
			String nombre = nom.getText();
			float promedio = Float.parseFloat(prom.getText());
			Alumno alumno = new Alumno(matricula,nombre,promedio);
			lista.add(index, alumno);
			noeditable();
			
			primero.setEnabled(true);
			ultimo.setEnabled(true);
			anterior.setEnabled(true);
			siguiente.setEnabled(true);
			nuevo.setEnabled(true);
			guardarNue.setEnabled(true);
			borrar.setEnabled(true);
			
			}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Hubo un error con los parámetros.");
		}
	}
	private void nuevo()
	{
		try {
			mat.setText("");
			nom.setText("");
			prom.setText("");
			editable();
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Hubo un error con los parámetros.");
		}
	}
	private void guardarNue()
	{
		try {
			int matricula = Integer.parseInt(mat.getText());
			String nombre = nom.getText();
			float promedio = Float.parseFloat(prom.getText());
			Alumno alumno = new Alumno(matricula,nombre,promedio);
			lista.add(alumno);
			noeditable();
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Hubo un error con los parámetros.");
		}
	}
	private void borrar()
	{
		try 
		{
			for(Alumno alumno : lista)
			{
				if(alumno.getNom_alu().contentEquals(nom.getText()));
				{
					mat.setText("");
					nom.setText("");
					prom.setText("");
					noeditable();
					lista.remove(alumno);
					break;
				}
			}
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Hubo un error con los parámetros.");
		}
	}
	private int sacarIndex()
	{
		for(Alumno alumno : lista)
		{
			if(alumno.getNom_alu().contentEquals(nom.getText()))
			{
				return lista.indexOf(alumno);
			}
		}
		return-10;
	}
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		if(arg0.getSource() == primero)
		{
			primero();
		}else if(arg0.getSource() == ultimo)
		{
			ultimo();
		}else if(arg0.getSource() == anterior)
		{
			anterior();
		}else if(arg0.getSource() == siguiente)
		{
			siguiente();
		}else if(arg0.getSource() == editar)
		{
			editar();
		}else if(arg0.getSource() == guardarCa)
		{
			guardarCa();
		}else if(arg0.getSource() == nuevo)
		{
			nuevo();
		}else if(arg0.getSource() == guardarNue)
		{
			guardarNue();
		}else if(arg0.getSource() == borrar)
		{
			borrar();
		}else if(arg0.getSource() == salir)
		{
			System.exit(0);
		}
	}

}
