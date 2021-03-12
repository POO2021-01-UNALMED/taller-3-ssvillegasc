package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 1;
	private int volumen = 1;
	private boolean estado;
	private Control control;

	private static int numTV;

	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return this.volumen;
	}

	public void setVolumen(int volumen) {
		if (!this.estado)
			return;
		
		if(volumen < 0 || volumen > 7)
			return;
		
		this.volumen = volumen;
	}

	public int getCanal() {
		return this.canal;
	}

	public void setCanal(int canal) {
		if (!this.estado)
			return;
		
		if(canal < 1 || canal > 120)
			return;
		
		this.canal = canal;
	}

	public static int getNumTV() {
		return TV.numTV;
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}

	public void turnOn() {
		estado = true;
	}

	public void turnOff() {
		estado = false;
	}

	public boolean getEstado() {
		return this.estado;
	}

	public void canalUp() {
		setCanal(this.canal + 1);
	}

	public void canalDown() {
		setCanal(this.canal - 1);
	}

	public void volumenUp() {
		setVolumen(this.volumen + 1);
	}

	public void volumenDown() {
		setVolumen(this.volumen - 1);
	}
	
}
