package mechanics;

import transport.Transport;

public class Mechanic {
    public final String name;
    private final String company;
    public final String transport;

    public Mechanic(String name, String company, String transport) {
        this.name = name;
        this.company = company;
        this.transport = transport;
    }

    public void doMaintenance(Transport transport) {
        if ( this.name.contains(transport.getMechanics().toString()) ) System.out.println(" обслуживание " + transport + " проведено " + this.name);
            else  System.out.println(" механик " + this.name + " не списке ");
    }

    public void repairCar(Transport transport){
        if ( this.name.contains(transport.getMechanics().toString()) ) System.out.println(" ремонт " + transport + " проведен " + this.name);
        else  System.out.println(" механик " + this.name + " не списке ");
        }

    @Override
    public String toString() {
        return "механик: " + name +", из компании: " + company + " может обслужиавать: " + transport ;

    };
}
