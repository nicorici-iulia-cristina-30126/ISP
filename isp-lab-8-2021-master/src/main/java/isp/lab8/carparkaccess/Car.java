
package isp.lab8.carparkaccess;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;


public class Car implements Serializable{
    @Getter @Setter
    private String plateNumber;
    
    public Car(String plateNumber){
        this.plateNumber = plateNumber;
    }
    public boolean equals(Car car){ //see if in carParking already exist this car
        return this.plateNumber.equals(car.plateNumber);
    }
}
