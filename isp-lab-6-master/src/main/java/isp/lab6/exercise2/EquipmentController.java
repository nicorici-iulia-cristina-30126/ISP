package isp.lab6.exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquipmentController {

    List<Equipment> equipmentList = new ArrayList<Equipment>();
    
    /**
     * Add new equipment to the list of equipments
     *
     * @param equipment - equipment to be added
     */
    public void addEquipment(final Equipment equipment) {
        equipmentList.add(equipment);
    }

    /**
     * Get current list of equipments
     *
     * @return list of equipments
     */
    public List<Equipment> getEquipments() {
        return equipmentList;
    }

    /**
     * Get number of equipments
     *
     * @return number of equipments
     */
    public int getNumberOfEquipments() {
        return equipmentList.size();
    }

    /**
     * Group equipments by owner
     *
     * @return a dictionary where the key is the owner and value is represented by list of equipments he owns
     */
    public Map<String, List<Equipment>> getEquipmentsGroupedByOwner() {
        Map<String, List<Equipment>> equipmentGrouped = new HashMap<String, List<Equipment>>();
        for(Equipment eq: equipmentList){
            equipmentGrouped.put(eq.getOwner(), getEquipmentByOwner(eq.getOwner()));
        }
        return equipmentGrouped;
    }
     public List<Equipment> getEquipmentByOwner(String owner){
         List<Equipment> sublistEquipment = new ArrayList<Equipment>();
         for(Equipment eq: equipmentList){
             if(eq.getOwner().equals(owner)){
                 sublistEquipment.add(eq);
             }
         }
         return sublistEquipment;
     }

    /**
     * Remove a particular equipment from equipments list by serial number
     * @param serialNumber - unique serial number
     * @return deleted equipment instance or null if not found
     */
    public Equipment removeEquipmentBySerialNumber(final String serialNumber) {
        Equipment deletedEquipment = new Equipment(serialNumber);
        int i = 0;
        for(Equipment eq: equipmentList){
            if(serialNumber.equals(eq.getSerialNumber())){
                deletedEquipment = eq;
                equipmentList.remove(eq);
                i = 1;
                break;
            }
        }
        if(i == 0){
            deletedEquipment = null;
        }
        return deletedEquipment;
    }
}
