package PP_Restaurant;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.awt.event.ActionEvent;

public class PP_Restaurant extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField jtxtTax;
	private JTextField jtxtSubtotal;
	private JTextField jtxtTotal;
	private JTextField jtxtBeerTempura;
	private JTextField jtxtSpringRolls;
	private JTextField jtxtCrispyGyoza;
	private JTextField jtxtWonton;
	private JTextField jtxtSoupOfTheDay;
	private JTextField jtxtTomKha;
	private JTextField jtxtCoffee;
	private JTextField jtxtTea;
	private JTextField jtxtCocaCola;
	private JTextField jtxtTempuraBanana;
	private JTextField jtxtThaiIceCream;
	private JTextField jtxtMangoLassi;
	private JTextField jtxtPrawnBun;
	private JTextField jtxtSteamedDumplings;
	private JTextField jtxtThaiCurry;
	private JTextField jtxtBeefUdon;
	private JTextField jtxtPadThai;
	private JTextField jtxtTeriyakiSalmon;
	private JTextField jtxtCrispyDuck;
	private JTextField jtxtCostOfMeal;
	private JTextField jtxtCostOfDrinks;
	private JTextField jtxtTotalCostOfItems;

	/**
	 * Launch the application.
	 * 
	 * @throws UnsupportedLookAndFeelException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {

		// UIManager.setLookAndFeel("com.jtatoo.plaf.aluminium.AluminiumLookAndFeel");

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PP_Restaurant frame = new PP_Restaurant();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PP_Restaurant() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 874, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(102, 51, 51), 6));
		panel_6.setBounds(584, 86, 265, 386);
		contentPane.add(panel_6);
		panel_6.setLayout(null);

		JTextArea jtxtReceipt = new JTextArea();
		jtxtReceipt.setBounds(10, 11, 245, 364);
		panel_6.add(jtxtReceipt);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(102, 51, 51), 6));
		panel_7.setBounds(10, 483, 564, 56);
		contentPane.add(panel_7);
		panel_7.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(102, 51, 51), 6));
		panel_3.setBounds(188, 86, 188, 260);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JPanel panel_11 = new JPanel();
		panel_11.setBounds(10, 86, 168, 128);
		contentPane.add(panel_11);
		panel_11.setBorder(new LineBorder(new Color(102, 51, 51), 6));
		panel_11.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(102, 51, 51), 6));
		panel_2.setBounds(10, 218, 168, 128);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(new Color(102, 51, 51), 6));
		panel_9.setBounds(10, 358, 285, 114);
		contentPane.add(panel_9);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(102, 51, 51), 6));
		panel_4.setBounds(386, 86, 188, 128);
		contentPane.add(panel_4);
		panel_4.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(102, 51, 51), 6));
		panel_5.setBounds(386, 218, 188, 128);
		contentPane.add(panel_5);
		panel_5.setLayout(null);

		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(102, 51, 51), 6));
		panel_10.setBounds(305, 358, 269, 114);
		contentPane.add(panel_10);
		panel_10.setLayout(null);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField cleartext = null;

				for (Component c : panel_11.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext = (JTextField) c;
						cleartext.setText("0");
					}
				}
				// ===========================================================
				for (Component c : panel_2.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext = (JTextField) c;
						cleartext.setText("0");
					}
				}
				// ===========================================================
				for (Component c : panel_9.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext = (JTextField) c;
						cleartext.setText("");
					}
				}
				// ===========================================================
				for (Component c : panel_3.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext = (JTextField) c;
						cleartext.setText("0");
					}
				}
				// ===========================================================
				for (Component c : panel_4.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext = (JTextField) c;
						cleartext.setText("0");
					}
				}
				// ===========================================================
				for (Component c : panel_5.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext = (JTextField) c;
						cleartext.setText("0");
					}
				}
				// ===========================================================
				for (Component c : panel_10.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext = (JTextField) c;
						cleartext.setText("");
					}
				}
				// ===========================================================
				jtxtReceipt.setText(null);

			}
		});
		btnReset.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnReset.setBounds(302, 11, 121, 34);
		panel_7.add(btnReset);

		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SubClass_Child ItemCost = new SubClass_Child();

				double iTax, iSubTotal, iTotal;

				ItemCost.SoupOfTheDay = ItemCost.pSoupOfTheDay * Double.parseDouble(jtxtSoupOfTheDay.getText());
				ItemCost.Wonton = ItemCost.pWonton * Double.parseDouble(jtxtWonton.getText());
				ItemCost.TomKha = ItemCost.pTomKha * Double.parseDouble(jtxtTomKha.getText());
				ItemCost.CrispyGyoza = ItemCost.pCrispyGyoza * Double.parseDouble(jtxtCrispyGyoza.getText());
				ItemCost.SpringRolls = ItemCost.pSpringRolls * Double.parseDouble(jtxtSpringRolls.getText());
				ItemCost.BeerTempura = ItemCost.pBeerTempura * Double.parseDouble(jtxtBeerTempura.getText());
				ItemCost.SteamedDumplings = ItemCost.pSteamedDumplings
						* Double.parseDouble(jtxtSteamedDumplings.getText());
				ItemCost.PrawnBun = ItemCost.pPrawnBun * Double.parseDouble(jtxtPrawnBun.getText());
				ItemCost.ThaiCurry = ItemCost.pThaiCurry * Double.parseDouble(jtxtThaiCurry.getText());
				ItemCost.PadThai = ItemCost.pPadThai * Double.parseDouble(jtxtPadThai.getText());
				ItemCost.BeefUdon = ItemCost.pBeefUdon * Double.parseDouble(jtxtBeefUdon.getText());
				ItemCost.TeriyakiSalmon = ItemCost.pTeriyakiSalmon * Double.parseDouble(jtxtTeriyakiSalmon.getText());
				ItemCost.CrispyDuck = ItemCost.pCrispyDuck * Double.parseDouble(jtxtCrispyDuck.getText());
				ItemCost.Tea = ItemCost.pTea * Double.parseDouble(jtxtTea.getText());
				ItemCost.Coffee = ItemCost.pCoffee * Double.parseDouble(jtxtCoffee.getText());
				ItemCost.CocaCola = ItemCost.pCocaCola * Double.parseDouble(jtxtCocaCola.getText());
				ItemCost.ThaiIceCream = ItemCost.pThaiIceCream * Double.parseDouble(jtxtThaiIceCream.getText());
				ItemCost.TempuraBanana = ItemCost.pTempuraBanana * Double.parseDouble(jtxtTempuraBanana.getText());
				ItemCost.MangoLassi = ItemCost.pMangoLassi * Double.parseDouble(jtxtMangoLassi.getText());

				iSubTotal = ItemCost.GetAmount();
				iTax = ItemCost.cFindTax(iSubTotal);
				iTotal = iSubTotal + iTax;

				String SubTotal = String.format("z³%.2f", iSubTotal);
				jtxtSubtotal.setText(SubTotal);

				String Tax = String.format("z³%.2f", iTax);
				jtxtTax.setText(Tax);

				String Total = String.format("z³%.2f", iTotal);
				jtxtTotal.setText(Total);

				String iMeal = String.format("z³%.2f", ItemCost.Meals);
				jtxtCostOfMeal.setText(iMeal);

				String iDrink = String.format("z³%.2f", ItemCost.Drinks);
				jtxtCostOfDrinks.setText(iDrink);

				String TotalCost = String.format("z³%.2f", ItemCost.TotalofMD);
				jtxtTotalCostOfItems.setText(TotalCost);

			}
		});
		btnTotal.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnTotal.setBounds(10, 11, 121, 34);
		panel_7.add(btnTotal);

		JButton btnReceipt = new JButton("Check");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ===============================================
				int refs = 1325 + (int) (Math.random() * 4238);

				// ================================================
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat Tdate = new SimpleDateFormat("dd:MMM:yyyy");
				tTime.format(timer.getTime());
				
				String[] waiter = {"Marek","Kasia","Patrycja"};
				Random r = new Random();
				String name = waiter[r.nextInt(waiter.length)];

				jtxtReceipt.append("Welcome in Restaurant Billing Systems:\n" + "Order ID: \t\t" + refs
						+ "\n=======================================\n" + "\nMeals:\t\t" + jtxtCostOfMeal.getText()
						+ "\n\n" + "Drinks:\t\t" + jtxtCostOfDrinks.getText() + "\n\n" + "Cost of Items:\t\t"
						+ jtxtTotalCostOfItems.getText() + "\n" + "\n=======================================\n"
						+ "\n" + "Tax:\t\t" + jtxtTax.getText() + "\n\n" + "Subtotal:\t\t" + jtxtSubtotal.getText()
						+ "\n\n" + "Total:\t\t" + jtxtTotal.getText() + "\n" +

						"==========================================" +
						
						"\nWaiter name: "+"\t\t"+ name +
						"\nDate: " + Tdate.format(timer.getTime()) + "            Time: "
						+ tTime.format(timer.getTime()) + "\n\n\tThank you " + "\n") ;

			}
		});
		btnReceipt.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnReceipt.setBounds(158, 11, 121, 34);
		panel_7.add(btnReceipt);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SubClass_Child iExit = new SubClass_Child();
				iExit.iExitSystem();
			}
		});
		btnExit.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnExit.setBounds(433, 11, 121, 34);
		panel_7.add(btnExit);

		panel.setBackground(new Color(139, 69, 19));
		panel.setBorder(new LineBorder(new Color(102, 51, 51), 6));
		panel.setBounds(50, 11, 759, 64);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		lblNewLabel_2.setBounds(66, 11, 48, 46);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFocusTraversalKeysEnabled(false);
		lblNewLabel_2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\dimsum3.png"));

		JLabel lblNewLabel = new JLabel("System zarz\u0105dzania rachunkami");
		lblNewLabel.setBounds(111, 11, 508, 46);
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 29));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		panel.add(lblNewLabel);

		JLabel label = new JLabel("");
		label.setBounds(618, 11, 48, 46);
		panel.add(label);
		label.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\dimsum3.png"));
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFocusTraversalKeysEnabled(false);
		label.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		label.setBorder(new LineBorder(new Color(0, 0, 0), 4));

		JLabel lblMeal = new JLabel("Main Meals");
		lblMeal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMeal.setBounds(27, 11, 139, 24);
		panel_3.add(lblMeal);

		JLabel lblPierogiNaParze = new JLabel("Steamed dumplings");
		lblPierogiNaParze.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPierogiNaParze.setBounds(10, 46, 125, 26);
		panel_3.add(lblPierogiNaParze);

		JLabel lblPrawnBun = new JLabel("Prawn Bun");
		lblPrawnBun.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrawnBun.setBounds(10, 77, 116, 20);
		panel_3.add(lblPrawnBun);

		JLabel lblThaiCurry = new JLabel("Thai Curry");
		lblThaiCurry.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblThaiCurry.setBounds(10, 108, 116, 14);
		panel_3.add(lblThaiCurry);

		jtxtPrawnBun = new JTextField();
		jtxtPrawnBun.setColumns(10);
		jtxtPrawnBun.setBounds(136, 78, 43, 20);
		panel_3.add(jtxtPrawnBun);
		jtxtPrawnBun.setText("0");

		jtxtSteamedDumplings = new JTextField();
		jtxtSteamedDumplings.setColumns(10);
		jtxtSteamedDumplings.setBounds(136, 46, 43, 20);
		panel_3.add(jtxtSteamedDumplings);
		jtxtSteamedDumplings.setText("0");

		jtxtThaiCurry = new JTextField();
		jtxtThaiCurry.setColumns(10);
		jtxtThaiCurry.setBounds(136, 106, 43, 20);
		panel_3.add(jtxtThaiCurry);
		jtxtThaiCurry.setText("0");

		JLabel lblPadThai = new JLabel("Pad Thai");
		lblPadThai.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPadThai.setBounds(10, 133, 116, 26);
		panel_3.add(lblPadThai);

		JLabel lblBeefUdon = new JLabel("Beef Udon");
		lblBeefUdon.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBeefUdon.setBounds(10, 170, 116, 20);
		panel_3.add(lblBeefUdon);

		JLabel lblTeriyakiSalmon = new JLabel("Teriyaki Salmon");
		lblTeriyakiSalmon.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTeriyakiSalmon.setBounds(10, 203, 116, 14);
		panel_3.add(lblTeriyakiSalmon);

		jtxtBeefUdon = new JTextField();
		jtxtBeefUdon.setColumns(10);
		jtxtBeefUdon.setBounds(136, 171, 43, 20);
		panel_3.add(jtxtBeefUdon);
		jtxtBeefUdon.setText("0");

		jtxtPadThai = new JTextField();
		jtxtPadThai.setColumns(10);
		jtxtPadThai.setBounds(136, 137, 43, 20);
		panel_3.add(jtxtPadThai);
		jtxtPadThai.setText("0");

		jtxtTeriyakiSalmon = new JTextField();
		jtxtTeriyakiSalmon.setColumns(10);
		jtxtTeriyakiSalmon.setBounds(136, 201, 43, 20);
		panel_3.add(jtxtTeriyakiSalmon);
		jtxtTeriyakiSalmon.setText("0");

		JLabel lblCrispyDuck = new JLabel("Crispy Duck");
		lblCrispyDuck.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCrispyDuck.setBounds(10, 231, 116, 14);
		panel_3.add(lblCrispyDuck);

		jtxtCrispyDuck = new JTextField();
		jtxtCrispyDuck.setColumns(10);
		jtxtCrispyDuck.setBounds(136, 229, 43, 20);
		panel_3.add(jtxtCrispyDuck);
		jtxtCrispyDuck.setText("0");

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(102, 51, 51), 6));
		panel_8.setBounds(584, 483, 265, 56);
		contentPane.add(panel_8);
		panel_8.setLayout(null);

		JButton btnSave = new JButton("Save to .txt");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String content = jtxtReceipt.getText(); // step1: get the content of the textfield

				try {

					File file = new File("C:\\Users\\user\\Desktop\\filename.txt");

					// if file doesnt exists, then create it
					if (!file.exists()) {
						file.createNewFile();
					}

					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(content); // step2: write it
					bw.close();

				} catch (IOException a) {
					a.printStackTrace();
				}
				
				
			}
		});
		btnSave.setBounds(25, 11, 103, 34);
		panel_8.add(btnSave);

		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					jtxtReceipt.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnPrint.setBounds(138, 11, 101, 34);
		panel_8.add(btnPrint);

		jtxtTax = new JTextField();
		jtxtTax.setBounds(171, 16, 70, 20);
		panel_10.add(jtxtTax);
		jtxtTax.setColumns(10);

		jtxtSubtotal = new JTextField();
		jtxtSubtotal.setBounds(171, 47, 70, 20);
		panel_10.add(jtxtSubtotal);
		jtxtSubtotal.setColumns(10);

		jtxtTotal = new JTextField();
		jtxtTotal.setColumns(10);
		jtxtTotal.setBounds(171, 78, 70, 20);
		panel_10.add(jtxtTotal);

		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTax.setBounds(38, 16, 86, 14);
		panel_10.add(lblTax);

		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSubtotal.setBounds(38, 47, 86, 14);
		panel_10.add(lblSubtotal);

		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotal.setBounds(38, 78, 86, 14);
		panel_10.add(lblTotal);

		jtxtBeerTempura = new JTextField();
		jtxtBeerTempura.setColumns(10);
		jtxtBeerTempura.setBounds(115, 97, 43, 20);
		panel_2.add(jtxtBeerTempura);
		jtxtBeerTempura.setText("0");

		jtxtSpringRolls = new JTextField();
		jtxtSpringRolls.setColumns(10);
		jtxtSpringRolls.setBounds(115, 66, 43, 20);
		panel_2.add(jtxtSpringRolls);
		jtxtSpringRolls.setText("0");

		jtxtCrispyGyoza = new JTextField();
		jtxtCrispyGyoza.setColumns(10);
		jtxtCrispyGyoza.setBounds(115, 35, 43, 20);
		panel_2.add(jtxtCrispyGyoza);
		jtxtCrispyGyoza.setText("0");

		JLabel lblCrispyGyoza = new JLabel("Crispy Gyoza");
		lblCrispyGyoza.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCrispyGyoza.setBounds(10, 31, 116, 26);
		panel_2.add(lblCrispyGyoza);

		JLabel lblSpringRolls = new JLabel("Spring Rolls");
		lblSpringRolls.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSpringRolls.setBounds(10, 66, 116, 20);
		panel_2.add(lblSpringRolls);

		JLabel lblBeerTempura = new JLabel("Beer Tempura");
		lblBeerTempura.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBeerTempura.setBounds(10, 98, 116, 17);
		panel_2.add(lblBeerTempura);

		JLabel lblSnacks = new JLabel("Snacks");
		lblSnacks.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSnacks.setBounds(45, 11, 115, 20);
		panel_2.add(lblSnacks);

		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDrinks.setBounds(59, 11, 73, 20);
		panel_4.add(lblDrinks);

		JLabel lblHerbata = new JLabel("Tea");
		lblHerbata.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHerbata.setBounds(10, 38, 106, 26);
		panel_4.add(lblHerbata);

		JLabel lblKawa = new JLabel("Coffee");
		lblKawa.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblKawa.setBounds(10, 68, 97, 20);
		panel_4.add(lblKawa);

		JLabel lblCocacola = new JLabel("Coca-Cola");
		lblCocacola.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCocacola.setBounds(10, 99, 97, 14);
		panel_4.add(lblCocacola);

		jtxtCoffee = new JTextField();
		jtxtCoffee.setColumns(10);
		jtxtCoffee.setBounds(123, 69, 43, 20);
		panel_4.add(jtxtCoffee);
		jtxtCoffee.setText("0");

		jtxtTea = new JTextField();
		jtxtTea.setColumns(10);
		jtxtTea.setBounds(123, 42, 43, 20);
		panel_4.add(jtxtTea);
		jtxtTea.setText("0");

		jtxtCocaCola = new JTextField();
		jtxtCocaCola.setColumns(10);
		jtxtCocaCola.setBounds(123, 97, 43, 20);
		panel_4.add(jtxtCocaCola);
		jtxtCocaCola.setText("0");

		JLabel lblDeserts = new JLabel("Deserts");
		lblDeserts.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDeserts.setBounds(55, 11, 81, 20);
		panel_5.add(lblDeserts);

		JLabel lblTajskieLody = new JLabel("Thai ice cream");
		lblTajskieLody.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTajskieLody.setBounds(10, 31, 116, 26);
		panel_5.add(lblTajskieLody);

		JLabel lblTempuraBanana = new JLabel("Tempura Banana");
		lblTempuraBanana.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTempuraBanana.setBounds(10, 65, 116, 20);
		panel_5.add(lblTempuraBanana);

		JLabel lblMangoLassi = new JLabel("Mango Lassi");
		lblMangoLassi.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMangoLassi.setBounds(10, 96, 116, 17);
		panel_5.add(lblMangoLassi);

		jtxtTempuraBanana = new JTextField();
		jtxtTempuraBanana.setColumns(10);
		jtxtTempuraBanana.setBounds(123, 66, 43, 20);
		panel_5.add(jtxtTempuraBanana);
		jtxtTempuraBanana.setText("0");

		jtxtThaiIceCream = new JTextField();
		jtxtThaiIceCream.setColumns(10);
		jtxtThaiIceCream.setBounds(123, 37, 43, 20);
		panel_5.add(jtxtThaiIceCream);
		jtxtThaiIceCream.setText("0");

		jtxtMangoLassi = new JTextField();
		jtxtMangoLassi.setColumns(10);
		jtxtMangoLassi.setBounds(123, 96, 43, 20);
		panel_5.add(jtxtMangoLassi);
		jtxtMangoLassi.setText("0");

		jtxtCostOfMeal = new JTextField();
		jtxtCostOfMeal.setColumns(10);
		jtxtCostOfMeal.setBounds(202, 16, 67, 20);
		panel_9.add(jtxtCostOfMeal);

		jtxtCostOfDrinks = new JTextField();
		jtxtCostOfDrinks.setColumns(10);
		jtxtCostOfDrinks.setBounds(202, 47, 67, 20);
		panel_9.add(jtxtCostOfDrinks);

		jtxtTotalCostOfItems = new JTextField();
		jtxtTotalCostOfItems.setColumns(10);
		jtxtTotalCostOfItems.setBounds(202, 78, 67, 20);
		panel_9.add(jtxtTotalCostOfItems);

		JLabel lblCostOfMeal = new JLabel("Cost of meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCostOfMeal.setBounds(31, 16, 163, 14);
		panel_9.add(lblCostOfMeal);

		JLabel lblCostOfDrinks = new JLabel("Cost of drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCostOfDrinks.setBounds(31, 47, 163, 14);
		panel_9.add(lblCostOfDrinks);

		JLabel lblTotalCostOf = new JLabel("Total cost of items");
		lblTotalCostOf.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotalCostOf.setBounds(31, 78, 174, 14);
		panel_9.add(lblTotalCostOf);

		JLabel lblSoups = new JLabel("Soups");
		lblSoups.setBounds(65, 11, 73, 20);
		lblSoups.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_11.add(lblSoups);

		JLabel lblZupaDnia = new JLabel("Soup of the day");
		lblZupaDnia.setBounds(10, 32, 116, 26);
		lblZupaDnia.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_11.add(lblZupaDnia);

		JLabel lblWonton = new JLabel("Wonton");
		lblWonton.setBounds(10, 66, 116, 20);
		lblWonton.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_11.add(lblWonton);

		JLabel lblTomKha = new JLabel("Tom Kha");
		lblTomKha.setBounds(10, 100, 116, 14);
		lblTomKha.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_11.add(lblTomKha);

		jtxtWonton = new JTextField();
		jtxtWonton.setBounds(115, 67, 43, 20);
		jtxtWonton.setColumns(10);
		panel_11.add(jtxtWonton);
		jtxtWonton.setText("0");

		jtxtSoupOfTheDay = new JTextField();
		jtxtSoupOfTheDay.setBounds(115, 36, 43, 20);
		jtxtSoupOfTheDay.setColumns(10);
		panel_11.add(jtxtSoupOfTheDay);
		jtxtSoupOfTheDay.setText("0");

		jtxtTomKha = new JTextField();
		jtxtTomKha.setBounds(115, 98, 43, 20);
		jtxtTomKha.setColumns(10);
		panel_11.add(jtxtTomKha);
		jtxtTomKha.setText("0");

	}
}
