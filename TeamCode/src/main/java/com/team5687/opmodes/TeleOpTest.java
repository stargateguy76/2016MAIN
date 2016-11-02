package com.team5687.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.team5687.controllers.JoystickController;
import com.team5687.helpers.Logger;

/**
 * Created by RedDragon on 10/25/2016.
 */



@TeleOp(name = "TeleOptest", group = "Test")
public class TeleOpTest extends OpMode {

    public float Power1 =100;
    JoystickController _joy = new JoystickController();


    @Override
    public void init() {
        telemetry.addLine("Init()");
        Logger.getInstance().SetTelemetry(telemetry);
        Logger.getInstance().WriteMessage("TeleOpTest::Init()");
        _joy = new JoystickController();
        _joy.Init(hardwareMap);
    }

    @Override
    public void loop() {

        telemetry.addData("leftstick", gamepad1.left_stick_y);
        telemetry.addData("rightstick", gamepad1.right_stick_y);
        _joy._rightMotor.setPower(gamepad1.left_stick_y);
        _joy._leftMotor.setPower(gamepad1.right_stick_y);




    }
}
