
package aula1;


public class Aula1 {
    
    

    
    public static void main(String[] args) {
        Carro car = new Carro();
        car.Marca ="toyota";
        car.Ano = 2018;
        car.Andar();
        car.AcaoCarro(car.Andando, car.Marca);
        
        Carro car2 = new Carro();
        car2.Marca = "Fiat";
        car2.Ano = 2018;
        car2.Frear();
        car2.AcaoCarro(car2.Andando, car2.Marca);
        
        
        
        }
        
    }
    

