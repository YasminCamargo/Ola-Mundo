package programasjava;

import java.awt.Toolkit;
import java.awt.Dimension;

public class ResolucaoDatela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.print("A resolução da tela do seu sistema é: " + d.width + " x " + d.height);
    }
    
}
