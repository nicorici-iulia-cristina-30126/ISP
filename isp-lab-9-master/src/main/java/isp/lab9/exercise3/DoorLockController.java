
package isp.lab9.exercise3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

public class DoorLockController implements ControllerInterface{
    private List<AccessKey> accessKeyList = new ArrayList<AccessKey>();
    private List<Tenant> tenantList = new ArrayList<Tenant>();
    private List<AccessLog> accessLogList = new ArrayList<AccessLog>();
    private Map<Tenant, AccessKey> validAccess = new HashMap<Tenant, AccessKey>();
    private Door door = new Door(DoorStatus.CLOSE);
    int nb_of_retries = 0;
   

    @Override
    public DoorStatus enterPin(String pin) throws InvalidPinException, TooManyAttemptsException {
        if(pin.equals(MASTER_KEY)){
            door.unlockDoor();
            nb_of_retries = 0;
            accessLogList.add(new AccessLog(LocalDateTime.now(), "enterPin", door.getStatus(), "no error"));
            return door.getStatus();
        }
        for(AccessKey ak: accessKeyList){
            if(ak.getPin().equals(pin)){
                if(door.getStatus().equals(DoorStatus.CLOSE)){
                    door.unlockDoor();
                }else{
                    door.lockDoor();
                }
                accessLogList.add(new AccessLog(LocalDateTime.now(), "enterPin", door.getStatus(), "no error"));
                return door.getStatus();
            }
        }
        if(nb_of_retries > 1){
            door.lockDoor();
            accessLogList.add(new AccessLog(LocalDateTime.now(), "enterPin", door.getStatus(), "Too many attempts"));
            throw new TooManyAttemptsException("No more tries. The door is locked, if you want to open the door you have to use keyMester!");
        }
        nb_of_retries++;
        accessLogList.add(new AccessLog(LocalDateTime.now(), "enterPin", door.getStatus(), "Invalid Pin"));
        throw new InvalidPinException("Incorect pin!");
    }

    @Override
    public void addTenant(String pin, String name) throws TenantAlreadyExistsException {
        if(tenantList.isEmpty()){
            accessLogList.add(new AccessLog(name, LocalDateTime.now(), "addTenant", door.getStatus(), "no error"));
            Tenant t1 = new Tenant(name);
            AccessKey ak = new AccessKey(pin);
            accessKeyList.add(ak);
            tenantList.add(new Tenant(name));
            validAccess.put(t1, ak);
        }
        else{
            for(Tenant t: tenantList){
                if(t.getName().equals(name)){
                    accessLogList.add(new AccessLog(name, LocalDateTime.now(), "addTenant", door.getStatus(), "Tenant already exist"));
                    throw new TenantAlreadyExistsException("Tenant already exist!");
                }
            }
            accessLogList.add(new AccessLog(name, LocalDateTime.now(), "addTenant", door.getStatus(), "no error"));
            Tenant t1 = new Tenant(name);
            AccessKey ak = new AccessKey(pin);
            accessKeyList.add(ak);
            tenantList.add(t1);
            validAccess.put(t1, ak);
//            validAccess.forEach((key, value) -> System.out.println(key + ":" + value));
//            validAccess.forEach((key, value) -> System.out.println(key.getName() + ":" + value.getPin()));
        }
    }

    @Override
    public void removeTenant(String name) throws TenantNotFoundException {
        boolean flag = true;
        int i = 0;
        for(Tenant t: tenantList){
            if(name.equals(t.getName())){
                accessLogList.add(new AccessLog(name, LocalDateTime.now(), "removeTenant", door.getStatus(), "no error"));
                flag = false;
                tenantList.remove(t);
                accessKeyList.remove(accessKeyList.get(i));
                validAccess.remove(t);
                break;
            }
            i++;
        }
        if(flag){
            accessLogList.add(new AccessLog(name, LocalDateTime.now(), "removeTenant", door.getStatus(), "Tenant not found"));
            throw new TenantNotFoundException("Tenant not found!");
        }
    }

    
    public List<AccessLog> getAccessLogs(){
        return accessLogList;
    }
    
    
    
    
    class InvalidPinException extends Exception{ 
        public InvalidPinException(String error){
            System.out.println(error);
        }
    }
    class TooManyAttemptsException extends Exception{
        public TooManyAttemptsException(String error){
            System.out.println(error);
        }
    }
    class TenantAlreadyExistsException extends Exception{
        public TenantAlreadyExistsException(String error) {
           System.out.println(error);
        } 
    }
    class TenantNotFoundException extends Exception{
        public TenantNotFoundException(String error) {
            System.out.println(error);
        }
    }
}
