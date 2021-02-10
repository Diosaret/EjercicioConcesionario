
package Logic;

import VehicleFactory.Car;
import VehicleFactory.Motorcycle;
import VehicleFactory.Vehicle;
import VehicleFactory.VehicleFactory;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;


public class Main {

   
    public static void main(String[] args) {
       
       
        VehicleFactory ve = new VehicleFactory();
        VehicleFactory ve1 = new VehicleFactory();
        Vehicle v = ve.createVehicle("Car");
        Car carro = new Car();
        // Casting de Objetos
        Car ca1 = (Car)v;
        
        ca1.setMarca("Renault");
        ca1.setModelo("Chispa");
        ca1.setPrecio(500000.00);
        ca1.setPuerta(4);
        
        carro.setListVehicle(ca1);
        
        Vehicle v1 = ve1.createVehicle("Car");
        Car ca2 = (Car)v1;
        
        ca2.setMarca("Chevrolet");
        ca2.setModelo("MY202");
        ca2.setPrecio(667008.9);
        ca2.setPuerta(2);
        
        carro.setListVehicle(ca2);
        
        Vehicle v4 = ve.createVehicle("Car");
        Car ca4 = (Car)v4;
        
        ca4.setMarca("Hyundai");
        ca4.setModelo("Getz");
        ca4.setPrecio(78999.8);
        ca4.setPuerta(4);
        
        carro.setListVehicle(ca4);
        
         
        Vehicle v5 = ve1.createVehicle("Car");
        Car ca5 = (Car)v5;
        
        ca5.setMarca("Dodge");
        ca5.setModelo("Dart");
        ca5.setPrecio(9900000.0);
        ca5.setPuerta(4);
        
        carro.setListVehicle(ca5);
        
        carro.getListVehicle();
        
        
        VehicleFactory ve2 = new VehicleFactory();
        VehicleFactory ve3 = new VehicleFactory();
        Vehicle v2 = ve2.createVehicle("Motorcycle");
        Motorcycle moto = new Motorcycle();
         
        Motorcycle mo1 = (Motorcycle)v2;
        
        mo1.setMarca("Yamaha");
        mo1.setModelo("mt03");
        mo1.setPrecio(3428823.7);
        mo1.setCilindro(342);
        
        moto.setListVehicle(mo1);
        
        Vehicle v3 = ve3.createVehicle("Motorcycle");
        
         Motorcycle mo3 = (Motorcycle)v3;
        
        mo3.setMarca("Honda");
        mo3.setModelo("wave110");
        mo3.setPrecio(34268783.0);
        mo3.setCilindro(250);
        
        moto.setListVehicle(mo3);
        moto.getListVehicle();
        
        
        Vehicle vve = carro.getVehicleHigherPrice();
        
        Vehicle vve1 = moto.getVehicleHigherPrice();
       
        if (vve.getPrecio()>vve1.getPrecio()){
         System.out.println("El Vehiculo más Caro es el Carro:");
        
        System.out.println("Marca: "+ vve.getMarca()+ " Modelo: "+ vve.getModelo()+" Precio: "+ vve.getPrecio());
        
        }else{
            System.out.println("El Vehiculo más Caro es la Moto:");
            System.out.println("Marca: "+ vve1.getMarca()+ " Modelo: "+ vve1.getModelo()+" Precio: "+ vve1.getPrecio());
        }
        
        carro.getListY();
        
        moto.getListY();
        
        carro.getOrden();
        /* Prueba de metodo para acceder a constructor
        Constructor<Car>[] con = ca.getObjetc(ca);
        
        for(Constructor<Car> c : con){
            
            System.out.println(c);
        }*/
        
        
        
    }
    
}
