package isp.lab6.exercise2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercise2 {
    public static void main(String[] args) {
        Equipment eq1 = new Equipment("Jacket", "1233", "Jhon");
        Equipment eq2 = new Equipment("Tux", "1212", "Alan");
        Equipment eq3 = new Equipment("Socks", "3654", "Jhon");
        Equipment eq4 = new Equipment("Mop", "OJ846", "Deis");
        Equipment eq5 = new Equipment("Mop", "OJ123", "Deis");
        Equipment eq6 = new Equipment("Mop", "OJ987", "Deis");
        
        eq1.provideEquipmentToUser("Deis");
        
        EquipmentController eqc = new EquipmentController();
        eqc.addEquipment(eq1);
        eqc.addEquipment(eq2);
        eqc.addEquipment(eq3);
        eqc.addEquipment(eq4);
        eqc.addEquipment(eq5);
        eqc.addEquipment(eq6);
        
        
        final Equipment delete = eqc.removeEquipmentBySerialNumber("1233");
        System.out.println("Deleted equipment: name = " + delete.getName() + ", serial number = " + delete.getSerialNumber() + ", owner = " + delete.getOwner());
        Map<String, List<Equipment>> map= eqc.getEquipmentsGroupedByOwner();
        
        int numberOfEquipments = eqc.getNumberOfEquipments();
        System.out.println("Number of equipments: " + numberOfEquipments);
        
        Set<String> display = map.keySet();
        for(String s: display){
            System.out.println(s);
        }
        
    }
}
