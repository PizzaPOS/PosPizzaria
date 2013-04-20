import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class PizzaTesteDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PizzaStore.PizzaSimples pizzaSimples = new PizzaStore.PizzaSimples(
				PizzaStore.Massa.PAN);
		pizzaSimples.addSabor(PizzaStore.Sabor.MUZZARELA);

		PizzaStore.PizzaComposta pizzaComposta = new PizzaStore.PizzaComposta(
				PizzaStore.Massa.TRADICIONAL);
		List<PizzaStore.Sabor> sabores = new ArrayList<PizzaStore.Sabor>();

		sabores.add(PizzaStore.Sabor.PEPPERONI);
		sabores.add(PizzaStore.Sabor.MUZZARELA);
		sabores.add(PizzaStore.Sabor.VEGGIE);

		for (PizzaStore.Sabor sabor : sabores) {
			pizzaComposta.addSabor(sabor);
		}
		JOptionPane.showMessageDialog(null,"Pizza Simples:" + pizzaSimples);
		JOptionPane.showMessageDialog(null,"Pizza Composta:" + pizzaComposta);
	}

}
