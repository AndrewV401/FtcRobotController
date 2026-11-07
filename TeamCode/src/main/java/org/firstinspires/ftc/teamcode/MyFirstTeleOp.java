package org.firstinspires.ftc.teamcode;

import android.os.SystemClock;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class MyFirstTeleOp extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        waitForStart();

        long startTime = SystemClock.elapsedRealtime();
        boolean last = false;

        while (opModeIsActive()) {

            if (gamepad1.a = last) {
                if (gamepad1.a) {
                    telemetry.addLine("You are pressing button A");
                } else {
                    telemetry.addLine("You are not pressing button A");
                }

            }
            last = gamepad1.a;

            double elapsed =
                    (SystemClock.elapsedRealtime() - startTime) / 1000.0;

            double rounded = Math.round(elapsed * 100) / 100.0;

            telemetry.addLine("Seconds since start: " + rounded);

            telemetry.update();
        }
    }
}