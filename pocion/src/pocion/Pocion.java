package pocion;

public class Pocion {
	static final String MOCOS = "mocos de troll";
	static final String PATA = "pata de tarantula";
	static final String CASPA = "caspa de unicornio";
	static final String SUPER = "super poderes";
	static final String VENENO= "veneno";
	static final String SOPA = "sopa";
	
	private int identificador;
	
	private String ingrediente1 = null;
	private String ingrediente2 = null;
	private String ingrediente3 = null; 
	private String efecto = null;

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		// Con la modificación para controlar valores entre 1000 y 1100:
		if (identificador >= 1000 && identificador <= 1100) {
	        this.identificador = identificador;
	    } else {
	        this.identificador = -1;
	    }
	}

	public String getIngrediente1() {
		return ingrediente1;
	}

	public void setIngrediente1(String ingrediente1) {
		// Con la modificación (Aplicado también a construct y prepararbase):
		switch(ingrediente1) {
        case MOCOS:
        case PATA:
        case CASPA:
            this.ingrediente1 = ingrediente1;
            break;
        default:
            this.ingrediente1 = null;
            System.out.println("Ingrediente no válido: " + ingrediente1);
            break;
		}
	}

	public String getIngrediente2() {
		return ingrediente2;
	}

	public void setIngrediente2(String ingrediente2) {
		this.ingrediente2 = ingrediente2;
	}

	public String getIngrediente3() {
		return ingrediente3;
	}

	public void setIngrediente3(String ingrediente3) {
		this.ingrediente3 = ingrediente3;
	}

	public String getEfecto() {
		return efecto;
	}

	public void setEfecto(String efecto) {
		this.efecto = efecto;
	}

	
	Pocion(int id){
		setIdentificador(id);

	}

	Pocion(int id, String in1){
		setIdentificador(id);
		setIngrediente1(in1);
	}

	
	void prepararBase(String in1) {
		setIngrediente1(in1);
		this.efecto = SOPA;
	}

	
	void prepararPocion() {
		int i_in2= (int) (Math.random()*3.45+1);
		int i_in3= (int) (Math.random()*3.45+1);

		switch(i_in2) {
		case 1:
			setIngrediente2(MOCOS);
			break;
		case 2:
			setIngrediente2(PATA);
			break;
		case 3:
			setIngrediente2(CASPA);
			break;
		}

		switch(i_in3) {
		case 1:
			setIngrediente3(MOCOS);
			break;
		case 2:
			setIngrediente3(PATA);
			break;
		case 3:
			setIngrediente3(CASPA);
			break;
		}

		this.setEfecto(SOPA);
		//comprobamos si nos sale veneno
		if(this.ingrediente1.equals(MOCOS)) {
			if (this.ingrediente2.equals(MOCOS) | this.ingrediente3.equals(MOCOS)) {
				this.setEfecto(VENENO);
			}
		} else if(this.ingrediente2.equals(MOCOS) && this.ingrediente3.equals(MOCOS)) {
				this.setEfecto(VENENO);
			} 
		if(this.ingrediente1.equals(CASPA)) {
			if(this.ingrediente2.equals(CASPA) | this.ingrediente3.equals(CASPA)) {
				this.setEfecto(SUPER);
			}
		} else if(this.ingrediente2.equals(CASPA) && this.ingrediente3.equals(CASPA)) {
				this.setEfecto(SUPER);
			}
	}
	
	void prepararPocion(String in1, String in2, String in3) {
		setIngrediente1(in1);
		setIngrediente2(in2);
		setIngrediente3(in3);
		
		this.setEfecto(SOPA);
		//comprobamos si nos sale veneno
		if(this.ingrediente1.equals(MOCOS)) {
			if (this.ingrediente2.equals(MOCOS) | this.ingrediente3.equals(MOCOS)) {
				this.setEfecto(VENENO);
			}
		} else if(this.ingrediente2.equals(MOCOS) && this.ingrediente3.equals(MOCOS)) {
				this.setEfecto(VENENO);
			} 
		if(this.ingrediente1.equals(CASPA)) {
			if(this.ingrediente2.equals(CASPA) | this.ingrediente3.equals(CASPA)) {
				this.setEfecto(SUPER);
			}
		} else if(this.ingrediente2.equals(CASPA) && this.ingrediente3.equals(CASPA)) {
				this.setEfecto(SUPER);
			}
	}
}
