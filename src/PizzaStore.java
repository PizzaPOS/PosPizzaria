import java.util.ArrayList;
import java.util.List;

public class PizzaStore {

	private Massa massa;
	List<Sabor> sabores;
	
	public enum Sabor {
		MUZZARELA, PEPPERONI, CALABRESA, VEGGIE, CHEESE;
	}

	public enum Massa {
		PAN, TRADICIONAL;
	}
	
	public PizzaStore(PizzaSimples builder){
		this.massa=builder.massa;
		this.sabores=builder.sabores;
	}
	public PizzaStore(PizzaComposta builder){
		this.massa=builder.massa;
		this.sabores=builder.sabores;
	}
	
	public int qtdeSabores(){
		return this.sabores.size();
	}
	
	public  boolean containsSabor(Sabor sabor){
		return this.sabores.contains(sabor);
			
	}
	
	public Massa getMassa() {
		return this.massa;
	}
	
	public static class PizzaSimples {
		Massa massa;
		List<Sabor> sabores=new ArrayList<Sabor>();
	
	
		
		public PizzaSimples(Massa massa) {
			this.massa = massa;
		}

		public void addSabor(Sabor sabor) {
			sabores.add(sabor);
		}

		public Massa getMassa() {
			return massa;
		}

		public void setMassa(Massa massa) {
			this.massa = massa;
		}

		public List<Sabor> getSabores() {
			return sabores;
		}

		public void setSabores(List<Sabor> sabores) {
			this.sabores = sabores;
		}

		@Override
		public String toString() {
			return "PizzaSimples [massa=" + massa + ", sabores=" + sabores
					+ "]";
		}
	}
		
		
	public static class PizzaComposta {
		Massa massa;
		List<Sabor> sabores=new ArrayList<Sabor>();
	
		public PizzaComposta(Massa massa) {
			this.massa=massa;
		}

		public PizzaComposta addSabor(Sabor sabor) {
			sabores.add(sabor);
			return this;
		}

		public Massa getMassa() {
			return massa;
		}

		public void setMassa(Massa massa) {
			this.massa = massa;
		}

		public List<Sabor> getSabores() {
			return sabores;
		}

		public void setSabores(List<Sabor> sabores) {
			this.sabores = sabores;
		}

		@Override
		public String toString() {
			return "PizzaComposta [massa=" + massa + ", sabores=" + sabores
					+ "]";
		}
	}
}
