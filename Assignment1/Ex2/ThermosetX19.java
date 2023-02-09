package itec3030.assignments.a1;


import itec3030.assignments.a1.sensors.thermoset.ThermoSetX19FrontEnd.FrontEnd;
import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.Thermostat;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class ThermosetX19 implements Thermostat{
    private ControllerInterface controllerInterface;
    private String ID;
    private int temperature;
    private boolean enable;
    private FrontEnd UI;

    public ThermosetX19() {
        // Create new ThermoSetX19 device
        UI = new FrontEnd(this);
        UI.pack();
        UI.setVisible(true);

    }

    @Override
    public void disable() {
        // TODO disable the machine
        this.enable = false;
    }

    @Override
    public void enable() {
        // TODO enable the machine
        this.enable = true;
    }

    @Override
    public boolean enabled() {
        // TODO check the status of the devide whether it enable or disable
        return enable;
    }

    @Override
    public ControllerInterface getController() {
        // TODO return the controller interface of the device
        return this.controllerInterface;
    }


    @Override
    public String getID() {
        // TODO return ID of the device
        return this.ID;
    }

    @Override
    public void setController(ControllerInterface controllerInterface) {
        // TODO set the controller interface for the device
        this.controllerInterface = controllerInterface;
    }

    @Override
    public void setID(String id) {
        // TODO set device ID
        this.ID = id;


    }

    @Override
    public int getReading() {
        // TODO return current reading temperature from the device
        return temperature;
    }

    @Override
    public void newTemperature(int temperature) {
        // TODO set a new temperature for the device
        this.temperature = temperature;
    }


}