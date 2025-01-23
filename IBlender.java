/**
 * Emily Góngora, Camila Sandoval, Ale Sierra
 * Clase IBlender es tipo interfaz, solo contiene los métodos sin su implementación, es la clase intercambiable
 */
public interface IBlender {
    void SpeedUp();
    boolean IsFull();
    void Fill();
    void Empty();
    void SpeedDown();
    int GetSpeed();
}
