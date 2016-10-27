package com.team5687.opmodes;

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
import com.team5687.controllers.JoystickController;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

/**
 * Created by RedDragon on 10/25/2016.
 */

public class TeleOpTest extends OpMode {

    DriveController _drive = new DriveController();
    JoystickController _Joy = new JoystickController();
    @Override
    public void init() {
        telemetry.addLine("Init()");
        Logger.getInstance().SetTelemetry(telemetry);
        Logger.getInstance().WriteMessage("TeleOpTest::Init()");
        _drive = new DriveController();
         _Joy = new JoystickController();
        _drive.Init(hardwareMap);
    }

    @Override
    public void loop() {
        _Joy.loop();
    }
}
