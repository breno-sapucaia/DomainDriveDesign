package br.com.fiap.entrada;

import javax.swing.JOptionPane;

public class Magica {

	public static String t(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	public static int i(String msg) {
		return Integer.parseInt(t(msg));
	}
	public static double d(String msg) {
		return Double.parseDouble(t(msg));
	}
}
