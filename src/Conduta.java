import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Conduta extends JPanel {
	private ImageIcon imgConduta;
	private JLabel jlCovid;
	
	public Conduta() {
		Componentes();
		Eventos();
	}

	public void Componentes() {
		setLayout(null);
		imgConduta = new ImageIcon("Condutas.png");
		jlCovid = new JLabel(imgConduta);
		jlCovid.setBounds(-7, -2, 530, 525);
		add(jlCovid);
	}
	
	public void Eventos() {
		
	}
	
}
