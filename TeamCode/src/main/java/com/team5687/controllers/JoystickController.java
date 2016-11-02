package com.team5687.controllers;

/**
 * Created by RedDragon on 10/25/2016.
 */

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.team5687.Constants;


public class JoystickController {

    public DcMotor _rightMotor; // here as place holders for the loop function.
    public DcMotor _leftMotor;
    public DcMotor _sweeper;

    public void Init(HardwareMap map) {
        _leftMotor = map.dcMotor.get(Constants.LEFT_DRIVE_MOTOR);
        _rightMotor = map.dcMotor.get(Constants.RIGHT_DRIVE_MOTOR);
        _sweeper = map.dcMotor.get(Constants.SWEEPER_MOTOR);


    }
    // this is what starts all the motors and servos.

}







