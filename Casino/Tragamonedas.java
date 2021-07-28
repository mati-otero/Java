package tragamonedas;

public class Tragamonedas {
	private Tambor tamborUno;
	private Tambor tamborDos;
	private Tambor tamborTres;

	public Tragamonedas() {
		tamborUno = new Tambor();
		tamborDos = new Tambor();
		tamborTres = new Tambor();
	}
	
	public void activar() {
		tamborUno.girar() ;
		tamborDos.girar() ;
		tamborTres.girar() ;
	}
	
	public boolean entregaPremio() {
		return	(tamborUno.getPosicion() == tamborDos.getPosicion() && tamborDos.getPosicion() == tamborTres.getPosicion());
		}

	public String toString() {
		return	"[" + tamborUno.getPosicion() + "]" + 
				"[" + tamborDos.getPosicion() + "]" + 
				"[" + tamborTres.getPosicion() + "]" ;
				
	}
	public int simularHastaQueSalgaPremio() {
		int cantidadDeIntentos = 0;
		this.activar();
		
		while (!this.entregaPremio()) {
			cantidadDeIntentos++;
			this.activar();
		}
		System.out.println(this);
		
		return cantidadDeIntentos;

	}
	public int cuantosPremiosEntregaEnNgiros(int n) {
		int cantidadDeAciertos = 0;
		for (int i = 1 ; i <= n ; i++) {
			this.activar();
			if (this.entregaPremio()) {
				System.out.println(this);
				cantidadDeAciertos++;
			}
		}
		return cantidadDeAciertos;
	
	}
}	
	
	
