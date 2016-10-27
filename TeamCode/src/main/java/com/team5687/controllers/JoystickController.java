package com.team5687.controllers;

/**
 * Created by RedDragon on 10/25/2016.
 */

import android.graphics.Path;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.UltrasonicSensor;
import com.team5687.Constants;
import com.team5687.helpers.Logger;
import com.team5687.primitives.Motor;
import com.team5687.controllers.DriveController;



public class JoystickController extends OpMode{
    DriveController _drive = new DriveController();
    private Motor _rightMotor; // here as place holders for the loop function.
    private Motor _leftMotor;
    private Motor _sweeper;
    private double Power1;
    private double Power2;
    private double Power3;




    @Override
    public void init() {
        _drive.Init(hardwareMap);

    } // this is what starts all the motors and servos.

    @Override
    public void loop() {
        Power1 = gamepad1.left_stick_y;
        Power2 = gamepad1.left_stick_x;
        Power3 = gamepad1.right_stick_y;

        _leftMotor.MotorSpeed(Power1-Power2);
        _rightMotor.MotorSpeed(Power1+Power2);
        _sweeper.MotorSpeed(Power3);


    }
}







