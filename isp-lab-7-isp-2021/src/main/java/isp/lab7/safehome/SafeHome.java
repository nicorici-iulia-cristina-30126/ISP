package isp.lab7.safehome;

import isp.lab7.safehome.DoorLockController.InvalidPinException;
import isp.lab7.safehome.DoorLockController.TenantAlreadyExistsException;
import isp.lab7.safehome.DoorLockController.TenantNotFoundException;
import isp.lab7.safehome.DoorLockController.TooManyAttemptsException;
import java.util.List;

public class SafeHome {

    public static void main(String[] args) throws InvalidPinException, TooManyAttemptsException, TenantAlreadyExistsException, TenantNotFoundException {
        DoorLockController dlc = new DoorLockController();
        DoorStatus ds; 
        
        try{
            dlc.addTenant("7843", "Maria");
            dlc.addTenant("1233", "Iulia");
            dlc.addTenant("7853", "Denisa");
            dlc.addTenant("1231", "Roxana");
            ds = dlc.enterPin("7843");
            //System.out.println("1: " + ds);
            ds = dlc.enterPin("1233");
            //System.out.println("3: " + ds);
            ds = dlc.enterPin("1233");
            //System.out.println("4: " + ds);
            ds = dlc.enterPin("1233");
            //System.out.println("5: " + ds);
        }catch(TenantAlreadyExistsException | InvalidPinException | TooManyAttemptsException e){   
        }
        for(int i = 0; i < 3; i++){
            try{
                dlc.enterPin("12233");
            }catch(TooManyAttemptsException e){
            
            }catch(InvalidPinException e){
            
            }
        }
        try{
            dlc.enterPin(ControllerInterface.MASTER_KEY);
            dlc.enterPin("7843");
            dlc.removeTenant("Maria");
            dlc.enterPin("7843");
        }catch(InvalidPinException e){
        }catch(TooManyAttemptsException e){   
        }catch(TenantNotFoundException e){
        }
        List<AccessLog> accessLogDisplay = dlc.getAccessLogs();
        for(AccessLog access: accessLogDisplay){
            System.out.println(access);
        }

    }
}
