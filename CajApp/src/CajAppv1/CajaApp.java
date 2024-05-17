package CajAppv1;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CajaApp extends JFrame {

	/**Apliacación que suma el total de monedas y billetes de una caja registradora.
	 * se añadira un cambio inicial en la caja por teclado, el cambio final sera la suma de monedas.
	 * se restara el cambio final al inicial para obtener el cambio sobrante. 
	 * luego se resta el cambio sobrante a la suma de billetes para obtener el cambio faltante.
	 * Se sumara una casilla de pagos para obtener el total de la caja en efectivo.
	 * se sumara la casilla de pagos de tarjeta para obtener la suma de la caja en efectivo y tarjeta.
	 * y a eso se sumara otra casilla llamada just eat para obtener la suma total de la caja.
	 * 
	 * habra otra casilla que restara un efectivo introducido con el total de la caja de efectivo para obtener el cambio que sobra.
	 * 
	 * se hara otra casilla en la cual se introduce un numero y se divide el total de la caja entre ese numero para obtener la media de la caja.
	 * 
	 * todos los numeros pueden ser decimales.
	 * 
	 * 
	 */

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cent10;
	private JTextField billetesTotales;
	private JTextField MonedasTotales;
	private JTextField cent20;
	private JTextField cent50;
	private JTextField euro;
	private JTextField euro5;
	private JTextField euro10;
	private JTextField euro20;
	private JTextField euro50;
	private JTextField cambioInicial;
	private JTextField cambioSobrante;
	private JTextField totalBilletes2;
	private JTextField totalMonedas2;
	private JTextField cambioSobrante2;
	private JTextField pagos;
	private JTextField cajaEfectivo;
	private JTextField tarjeta;
	private JTextField cajaEfectivoTarjeta;
	private JTextField justEat;
	private JTextField cajaNoche;
	private JTextField cajaEfectivo2;
	private JTextField cajaTPV;
	private JTextField loQueSobra;
	private JTextField numeroPizzas;
	private JTextField porcentajeCaja;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CajaApp frame = new CajaApp();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CajaApp() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ibane\\OneDrive\\Imágenes\\DALL·E 2023-12-14 00.33.50 - Another dream art style logo, offering a different surreal interpretation of a mushroom, a pirate flag, and a computer. This design should also featur.png"));
		setTitle("CajApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 1122);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();

		cent10 = new JTextField();
		cent10.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Monedas");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));

		billetesTotales = new JTextField();
		billetesTotales.setColumns(10);
		//no dejar modificar el total
		billetesTotales.setEditable(false);

		JLabel lblMonedasDe_2_1 = new JLabel(" 50 €");
		lblMonedasDe_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblNewLabel_5_1 = new JLabel("Billetes");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 14));



		MonedasTotales = new JTextField();
		MonedasTotales.setColumns(10);
		//no dejar modificar el total
		MonedasTotales.setEditable(false);

		cent20 = new JTextField();
		cent20.setColumns(10);

		cent50 = new JTextField();
		cent50.setColumns(10);

		euro = new JTextField();
		euro.setColumns(10);

		euro5 = new JTextField();
		euro5.setColumns(10);

		euro10 = new JTextField();
		euro10.setColumns(10);

		euro20 = new JTextField();
		euro20.setColumns(10);

		euro50 = new JTextField();
		euro50.setColumns(10);

		JLabel lblMonedasDe_2_1_1 = new JLabel(" 20 €");
		lblMonedasDe_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblMonedasDe_2_1_2 = new JLabel(" 10 €");
		lblMonedasDe_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblMonedasDe_2_1_3 = new JLabel("5 €");
		lblMonedasDe_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblMonedasDe_2_1_3_1 = new JLabel("10 Cent");
		lblMonedasDe_2_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblMonedasDe_2_1_3_2 = new JLabel("20 Cent");
		lblMonedasDe_2_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblMonedasDe_2_1_3_3 = new JLabel("50 Cent");
		lblMonedasDe_2_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblMonedasDe_2_1_3_4 = new JLabel("1 €");
		lblMonedasDe_2_1_3_4.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblNewLabel = new JLabel("Cambios");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel lblMonedasDe_2_1_3_1_1 = new JLabel("Cambio Inicial:");
		lblMonedasDe_2_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblMonedasDe_2_1_3_1_2 = new JLabel("Cambio Final:");
		lblMonedasDe_2_1_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblMonedasDe_2_1_3_1_3 = new JLabel("Cambio Sobrante:");
		lblMonedasDe_2_1_3_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));

		cambioInicial = new JTextField();
		cambioInicial.setColumns(10);

		cambioSobrante = new JTextField();
		cambioSobrante.setColumns(10);
		//no dejar modificar el total
		cambioSobrante.setEditable(false);

		JLabel lblNewLabel_1 = new JLabel("Cálculo de la Caja");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel lblMonedasDe_2_1_3_4_1 = new JLabel("Total Monedas");
		lblMonedasDe_2_1_3_4_1.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblMonedasDe_2_1_3_4_1_1 = new JLabel("Total Billetes");
		lblMonedasDe_2_1_3_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblNewLabel_5_1_1 = new JLabel("Billetes:");
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));

		totalBilletes2 = new JTextField();
		totalBilletes2.setEditable(false);
		totalBilletes2.setColumns(10);

		totalMonedas2 = new JTextField();
		totalMonedas2.setEditable(false);
		totalMonedas2.setColumns(10);

		JLabel lblMonedasDe_2_1_3_1_3_1 = new JLabel("Cambio Sobrante:");
		lblMonedasDe_2_1_3_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));

		cambioSobrante2 = new JTextField();
		cambioSobrante2.setEditable(false);
		cambioSobrante2.setColumns(10);

		JLabel lblNewLabel_5_1_1_1 = new JLabel("Pagos:");
		lblNewLabel_5_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));

		pagos = new JTextField();
		pagos.setColumns(10);

		JLabel lblMonedasDe_2_1_3_1_3_1_1 = new JLabel("Caja Efectivo:");
		lblMonedasDe_2_1_3_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));

		cajaEfectivo = new JTextField();
		cajaEfectivo.setEditable(false);
		cajaEfectivo.setColumns(10);

		JLabel lblNewLabel_5_1_1_1_1 = new JLabel("Tarjeta:");
		lblNewLabel_5_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));

		tarjeta = new JTextField();
		tarjeta.setColumns(10);

		JLabel lblMonedasDe_2_1_3_1_3_1_1_1 = new JLabel("Caja Efectivo + Tarjeta:");
		lblMonedasDe_2_1_3_1_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));

		cajaEfectivoTarjeta = new JTextField();
		cajaEfectivoTarjeta.setEditable(false);
		cajaEfectivoTarjeta.setColumns(10);

		JLabel lblNewLabel_5_1_1_1_1_1 = new JLabel("Just Eat:");
		lblNewLabel_5_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));

		justEat = new JTextField();
		justEat.setColumns(10);

		JLabel lblMonedasDe_2_1_3_1_3_1_1_2 = new JLabel("Caja de la Noche:");
		lblMonedasDe_2_1_3_1_3_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));

		cajaNoche = new JTextField();
		cajaNoche.setEditable(false);
		cajaNoche.setColumns(10);

		JLabel lblMonedasDe_2_1_3_1_3_1_1_3 = new JLabel("Caja Efectivo:");
		lblMonedasDe_2_1_3_1_3_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel lblNewLabel_1_1 = new JLabel("Descuadre");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));

		cajaEfectivo2 = new JTextField();
		cajaEfectivo2.setEditable(false);
		cajaEfectivo2.setColumns(10);

		JLabel lblMonedasDe_2_1_3_1_3_1_1_3_1 = new JLabel("Caja TPV:");
		lblMonedasDe_2_1_3_1_3_1_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));

		cajaTPV = new JTextField();
		cajaTPV.setColumns(10);

		JLabel lblMonedasDe_2_1_3_1_3_1_1_3_2 = new JLabel("\"Lo que sobra\":");
		lblMonedasDe_2_1_3_1_3_1_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 13));

		loQueSobra = new JTextField();
		loQueSobra.setEditable(false);
		loQueSobra.setColumns(10);

		JLabel lblMonedasDe_2_1_3_1_3_1_1_3_3 = new JLabel("Pizzas Vendidas:");
		lblMonedasDe_2_1_3_1_3_1_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 13));

		numeroPizzas = new JTextField();
		numeroPizzas.setColumns(10);

		JLabel lblMonedasDe_2_1_3_1_3_1_1_3_1_1 = new JLabel("Porcentaje de la caja:");
		lblMonedasDe_2_1_3_1_3_1_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));

		porcentajeCaja = new JTextField();
		porcentajeCaja.setEditable(false);
		porcentajeCaja.setColumns(10);

		JButton btnNewButton = new JButton("Hacer la caja");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// las variables que no se se pueden modificar estaran a 0
					// si no hemos introducido algun valor en alguna casilla saltara un mensaje de error
					if (cent10.getText().isEmpty() || cent20.getText().isEmpty() || cent50.getText().isEmpty()
							|| euro.getText().isEmpty())
					{
						throw new Exception("No has introducido las monedas.");
					}
						//Monedas
					double cent10 = Double.parseDouble(CajaApp.this.cent10.getText());
					double cent20 = Double.parseDouble(CajaApp.this.cent20.getText());
					double cent50 = Double.parseDouble(CajaApp.this.cent50.getText());
					double euro = Double.parseDouble(CajaApp.this.euro.getText());

					
					
					
					//suamams las monedas
					 double totalMonedas = cent10 + cent20 + cent50 + euro;

					//mostrarmos las monedas
					CajaApp.this.MonedasTotales.setText(String.valueOf(totalMonedas));
					
					// si no hemos introducido los billetes
					
					if (euro5.getText().isEmpty() || euro10.getText().isEmpty() || euro20.getText().isEmpty()
							|| euro50.getText().isEmpty()) {
						throw new Exception("No has introducido los billetes.");
					}
					
					//billetes
					double euro5 = Double.parseDouble(CajaApp.this.euro5.getText());
					double euro10 = Double.parseDouble(CajaApp.this.euro10.getText());
					double euro20 = Double.parseDouble(CajaApp.this.euro20.getText());
					double euro50 = Double.parseDouble(CajaApp.this.euro50.getText());

					//sumamos los billetes
					
					
					 double totalBilletes = euro5 + euro10 + euro20 + euro50;

					//mostramos los billetes
					CajaApp.this.billetesTotales.setText(String.valueOf(totalBilletes));
					
					// si no hemos introducido el cambio inicial saltara un mensaje de error
					if (cambioInicial.getText().isEmpty()) {
						throw new Exception("No has introducido el cambio inicial.");
					}
					//cambio inicial
					double cambioInicial = Double.parseDouble(CajaApp.this.cambioInicial.getText());

					//cambio final
					
					 double cambioFinal = totalMonedas;
					//mostramos el cambio final
					CajaApp.this.totalMonedas2.setText(String.valueOf(cambioFinal));
					
						//cambio sobrante
					double cambioSobrante =  cambioInicial - cambioFinal ;
					
					//acortar decimales
					cambioSobrante = Math.round(cambioSobrante * 100.0) / 100.0;
					
						//mostramos el cambio sobrante
					CajaApp.this.cambioSobrante.setText(String.valueOf(cambioSobrante));

					//mostrar el total de billetes2
					CajaApp.this.totalBilletes2.setText(String.valueOf(totalBilletes));

					//camio sobrante2
					double cambioSobrante2 = totalBilletes - cambioSobrante;
					
					//acrecentar decimales
					cambioSobrante2 = Math.round(cambioSobrante2 * 100.0) / 100.0;

					//mostramos el cambio sobrante2
					CajaApp.this.cambioSobrante2.setText(String.valueOf(cambioSobrante2));
					
					
					// si no hemos introducido los pagos saltara un mensaje de error
					if (pagos.getText().isEmpty()) {
						throw new Exception("No has introducido los pagos.");
					}
					
					//pagos
					double pagos = Double.parseDouble(CajaApp.this.pagos.getText());

					//caja efectivo
					double cajaEfectivo = cambioSobrante2 + pagos;


					//mostramos la caja efectivo
					CajaApp.this.cajaEfectivo.setText(String.valueOf(cajaEfectivo));
					
					
					// si no hemos introducido la tarjeta saltara un mensaje de error
					if (tarjeta.getText().isEmpty()) {
						throw new Exception("No has introducido la tarjeta.");
					}
					
						//tarjeta
					double tarjeta = Double.parseDouble(CajaApp.this.tarjeta.getText());

					//mostramos la tarjeta
					CajaApp.this.tarjeta.setText(String.valueOf(tarjeta));
					
					//caja efectivo + tarjeta
					double cajaEfectivoTarjeta = cajaEfectivo + tarjeta;
					
					//mostramos la caja efectivo + tarjeta
					CajaApp.this.cajaEfectivoTarjeta.setText(String.valueOf(cajaEfectivoTarjeta));
					
					// si no hemos introducido just eat saltara un mensaje de error
					if (justEat.getText().isEmpty()) {
						throw new Exception("No has introducido just eat.");
					}
					

					//just eat
					double justEat = Double.parseDouble(CajaApp.this.justEat.getText());
					
					//mostramos just eat
					
					CajaApp.this.justEat.setText(String.valueOf(justEat));
					
						//caja noche
					double cajaNoche = cajaEfectivoTarjeta + justEat;

					//mostramos la caja noche
					CajaApp.this.cajaNoche.setText(String.valueOf(cajaNoche));
					
							//caja efectivo2
					double cajaEfectivo2 = cajaEfectivo;

					//mostramos la caja efectivo2
					CajaApp.this.cajaEfectivo2.setText(String.valueOf(cajaEfectivo2));
					
					
					// si no hemos introducido el caja TPV saltara un mensaje de error
					if (cajaTPV.getText().isEmpty()) {
						throw new Exception("No has introducido la caja TPV.");
					}
					
					//caja TPV

					double cajaTPV = Double.parseDouble(CajaApp.this.cajaTPV.getText());

					//lo que sobra

					double loQueSobra = cajaEfectivo2 - cajaTPV;
					
					//acortar decimales
					loQueSobra = Math.round(loQueSobra * 100.0) / 100.0;

					//mostramos lo que sobra
					CajaApp.this.loQueSobra.setText(String.valueOf(loQueSobra));
					
					// si no hemos introducido el numero de pizzas saltara un mensaje de error
					if (numeroPizzas.getText().isEmpty()) {
						throw new Exception("No has introducido el numero de pizzas.");
					}
				

					//numero de pizzas
					double numeroPizzas = Double.parseDouble(CajaApp.this.numeroPizzas.getText());

					//porcentaje de la caja
					double porcentajeCaja = cajaNoche / numeroPizzas;
					//acortar decimales
					porcentajeCaja = Math.round(porcentajeCaja * 100.0) / 100.0;

					//mostramos el porcentaje de la caja
					CajaApp.this.porcentajeCaja.setText(String.valueOf(porcentajeCaja));




				}
				catch (Exception e1) {
					//mensaje de error
					javax.swing.JOptionPane.showMessageDialog(CajaApp.this, e1.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(86)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(113)
					.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(82)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(66)
							.addComponent(cent10, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblMonedasDe_2_1_3_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
					.addGap(123)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMonedasDe_2_1_3, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(60)
							.addComponent(euro5, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(82)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(66)
							.addComponent(cent20, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblMonedasDe_2_1_3_2, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
					.addGap(113)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(70)
							.addComponent(euro10, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblMonedasDe_2_1_2, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(82)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMonedasDe_2_1_3_3, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(66)
							.addComponent(cent50, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
					.addGap(113)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMonedasDe_2_1_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(70)
							.addComponent(euro20, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(82)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(66)
							.addComponent(euro, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblMonedasDe_2_1_3_4, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
					.addGap(113)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMonedasDe_2_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(70)
							.addComponent(euro50, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addComponent(lblMonedasDe_2_1_3_4_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(MonedasTotales, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(61)
					.addComponent(lblMonedasDe_2_1_3_4_1_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(billetesTotales, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(203)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addComponent(lblMonedasDe_2_1_3_1_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addComponent(cambioInicial, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(78)
					.addComponent(lblMonedasDe_2_1_3_1_2, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addComponent(totalMonedas2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(148)
					.addComponent(lblMonedasDe_2_1_3_1_3, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(cambioSobrante, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(158)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(69)
							.addComponent(totalBilletes2, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5_1_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
					.addGap(54)
					.addComponent(lblMonedasDe_2_1_3_1_3_1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(cambioSobrante2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(69)
							.addComponent(pagos, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5_1_1_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
					.addGap(72)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(100)
							.addComponent(cajaEfectivo, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblMonedasDe_2_1_3_1_3_1_1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(69)
							.addComponent(tarjeta, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5_1_1_1_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMonedasDe_2_1_3_1_3_1_1_1, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(167)
							.addComponent(cajaEfectivoTarjeta, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(69)
							.addComponent(justEat, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
					.addGap(59)
					.addComponent(lblMonedasDe_2_1_3_1_3_1_1_2, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(cajaNoche, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(192)
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(97)
							.addComponent(cajaEfectivo2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblMonedasDe_2_1_3_1_3_1_1_3, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMonedasDe_2_1_3_1_3_1_1_3_1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(76)
							.addComponent(cajaTPV, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(166)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(113)
							.addComponent(loQueSobra, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblMonedasDe_2_1_3_1_3_1_1_3_2, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMonedasDe_2_1_3_1_3_1_1_3_3, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(115)
							.addComponent(numeroPizzas, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(148)
							.addComponent(porcentajeCaja, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblMonedasDe_2_1_3_1_3_1_1_3_1_1, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(99)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(cent10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblMonedasDe_2_1_3_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(2)
									.addComponent(lblMonedasDe_2_1_3, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
								.addComponent(euro5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(cent20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(lblMonedasDe_2_1_3_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(euro10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMonedasDe_2_1_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(lblMonedasDe_2_1_3_3, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
								.addComponent(cent50, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblMonedasDe_2_1_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(euro20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(euro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblMonedasDe_2_1_3_4, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(lblMonedasDe_2_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(euro50, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addComponent(lblMonedasDe_2_1_3_4_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(MonedasTotales, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(13)
							.addComponent(lblMonedasDe_2_1_3_4_1_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(billetesTotales, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(9)
							.addComponent(lblMonedasDe_2_1_3_1_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(cambioInicial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(9)
							.addComponent(lblMonedasDe_2_1_3_1_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(totalMonedas2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(8)
							.addComponent(lblMonedasDe_2_1_3_1_3, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(cambioSobrante, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(totalBilletes2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_5_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(9)
							.addComponent(lblMonedasDe_2_1_3_1_3_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(cambioSobrante2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(pagos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5_1_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(cajaEfectivo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(lblMonedasDe_2_1_3_1_3_1_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(tarjeta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5_1_1_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(2)
									.addComponent(lblMonedasDe_2_1_3_1_3_1_1_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
								.addComponent(cajaEfectivoTarjeta, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(justEat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(lblMonedasDe_2_1_3_1_3_1_1_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(cajaNoche, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(67)
					.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(cajaEfectivo2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(lblMonedasDe_2_1_3_1_3_1_1_3, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblMonedasDe_2_1_3_1_3_1_1_3_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(cajaTPV, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(loQueSobra, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(lblMonedasDe_2_1_3_1_3_1_1_3_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(2)
									.addComponent(lblMonedasDe_2_1_3_1_3_1_1_3_3, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
								.addComponent(numeroPizzas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(porcentajeCaja, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(14)
							.addComponent(lblMonedasDe_2_1_3_1_3_1_1_3_1_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addGap(21)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);



	}
}
