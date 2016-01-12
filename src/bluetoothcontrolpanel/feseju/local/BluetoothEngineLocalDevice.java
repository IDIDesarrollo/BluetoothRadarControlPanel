/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluetoothcontrolpanel.feseju.local;

import java.io.IOException;
import javax.bluetooth.LocalDevice;


public class BluetoothEngineLocalDevice {

        LocalDevice localDevice;

        String[] getLocalDeviceData() throws IOException {
            try {
             localDevice = LocalDevice.getLocalDevice();
            } catch(Exception e) {
                e.printStackTrace(System.out);
                return null;
            }
            
            String nombreBluetooth = localDevice.getFriendlyName();
            String direccionBluetooth = localDevice.getBluetoothAddress();
            
            String[] datos = { nombreBluetooth, direccionBluetooth };
            return datos;
            
        }

}


