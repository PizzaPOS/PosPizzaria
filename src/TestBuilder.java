import static org.junit.Assert.*;

import org.junit.Test;


public class TestBuilder {

	@Test
	public void testPizzaSimpes() {
		PizzaStore.PizzaSimples pb = new PizzaStore.PizzaSimples(PizzaStore.Massa.PAN);
		pb.addSabor(PizzaStore.Sabor.MUZZARELA);
		PizzaStore p = new PizzaStore(pb);
		
		assertEquals(PizzaStore.Massa.PAN, p.getMassa());
		assertEquals(1, p.qtdeSabores());
		assertTrue(p.containsSabor(PizzaStore.Sabor.MUZZARELA));
		assertFalse(p.containsSabor(PizzaStore.Sabor.PEPPERONI));
		assertFalse(p.containsSabor(PizzaStore.Sabor.CALABRESA));
		
	}
	
	@Test
	public void testPizzaComposta() {
		PizzaStore.PizzaSimples pb = new PizzaStore.PizzaSimples(PizzaStore.Massa.PAN);
		pb.addSabor(PizzaStore.Sabor.MUZZARELA);
		pb.addSabor(PizzaStore.Sabor.PEPPERONI);
		PizzaStore p = new PizzaStore(pb);
		
		assertEquals(PizzaStore.Massa.PAN, p.getMassa());
		assertEquals(2, p.qtdeSabores());
		assertTrue(p.containsSabor(PizzaStore.Sabor.MUZZARELA));
		assertTrue(p.containsSabor(PizzaStore.Sabor.PEPPERONI));
		assertFalse(p.containsSabor(PizzaStore.Sabor.CALABRESA));
	}
	
	@Test
	public void testPizzaBuilder() {
		PizzaStore p = new PizzaStore(
				new PizzaStore.PizzaComposta(PizzaStore.Massa.TRADICIONAL)
				.addSabor(PizzaStore.Sabor.CALABRESA)
				.addSabor(PizzaStore.Sabor.PEPPERONI)
		);
		
		assertEquals(PizzaStore.Massa.TRADICIONAL, p.getMassa());
		assertEquals(2, p.qtdeSabores());
		assertFalse(p.containsSabor(PizzaStore.Sabor.MUZZARELA));
		assertTrue(p.containsSabor(PizzaStore.Sabor.PEPPERONI));
		assertTrue(p.containsSabor(PizzaStore.Sabor.CALABRESA));
	}		
}

