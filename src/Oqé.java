import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Oqé extends JPanel{
	JLabel jlCovid, texto1, jlSintomas;
	 ImageIcon imgCovid, imgSintomas;
	
	public Oqé() {
		Componentes();
	}
	
	public void Componentes() {
		setLayout(null);
		texto1 = new JLabel("<html> O  <b> novo Coronavírus </b> faz parte de uma grande "
				+ "família viral que causa infecções respiratórias em seres humanos e em animais.</html>");
		texto1.setBounds(300, 250, 260, 100);
		texto1.setFont(new Font("Arial", Font.HANGING_BASELINE ,16));
		texto1.setForeground(Color.BLACK);
		add(texto1);
		
		imgCovid = new ImageIcon("Covid o que é.png");
		jlCovid = new JLabel(imgCovid);
		jlCovid.setBounds(0, -50, 564, 510);
		add(jlCovid);
	}
}
