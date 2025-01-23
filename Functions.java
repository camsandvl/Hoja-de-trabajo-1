/**
 * Emily Góngora, Camila Sandoval, Ale Sierra
 * Clase Functions almacena la implementación de los métodos llamados en IBlender
 */
public class Functions implements IBlender {
    private int speed;
    private boolean isOn;
    private boolean isFull;

    /**
     * Constructor asigna valores iniciales
     */
    public Functions() {
        this.speed = 0; 
        this.isOn = true;
        this.isFull = false;
    }


    /**
     * Implementación de métodos
     * En la mayoría se verifica antes si está llena con isFull == true para asegurar que la licuadora tenga contenido
     */
    @Override
    public void Fill() {
        if (isFull == true) {
            System.out.println("La licuadora ya está llena");
        } else {
            isFull = true; 
            System.out.println("Licuadora llena");
        }
    }

    @Override
    public void SpeedUp() {
        if (isFull == true) { 
            if (speed < 10) {
                speed++;
                System.out.println ("La velocidad se aumentó a: " + speed);
            } else {
                System.out.println ("Ya se alcanzó el máximo de velocidad");
            }
        } else {
            System.out.println("Llenar la licuadora primero");
        }
    }

    @Override
    public boolean IsFull() {
        return isFull;
    }

    @Override
    public void Empty() {
    if (!isFull) { 
        System.out.println("La licuadora ya está vacía.");
    } else { 
        isFull = false; 
        System.out.println("Licuadora vaciada.");
    }
}

    @Override
    public void SpeedDown() {
        if (isFull == true) { 
            if (speed > 0) {
                speed--; 
                System.out.println("La velocidad disminuyó a: " + speed);
            } else {
                System.out.println("Ya se alcanzó el mínimo de velocidad (0).");
            }
        } else {
            System.out.println("Llena la licuadora primero.");
        }
    }
    

    @Override 
    public int GetSpeed() {
        return speed;
    } 
}
