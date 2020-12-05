package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.acmerobotics.roadrunner.*;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class ultimateGoalAuto extends LinearOpMode {
    @Override
    public void runOpMode(){
        SampleMecanumDrive drivetrain = new SampleMecanumDrive(hardwareMap);

        waitForStart();

        //R and L sides are in relation to when the person is facing the goals
        if(were blue alliance left side){
            Pose2d startPose = new Pose2d(-60, 48, 0.17453292519943295);
            drivetrain.setPoseEstiamte(startPose);

            Trajectory traj1 = drivetrain.trajectoryBuilder(startPose)
                    .forward(30)
                    .strafeRight(13)
                    .build();

            drivetrain.followTrajectory(traj1);
            //PAUSE TO SENSE
            //use vuforia to figure out # of rings

            if(path1) {
                //Trajectories for Path1
                Trajectory traj2 = drivetrain.trajectoryBuilder(traj1.end())
                        .strafeLeft(25)
                        .forward(42)
                        .build();

                Trajectory traj3 = drivetrain.trajectoryBuilder(traj2.end())
                        .strafeRight(25)
                        .back(11)
                        .build();

                //PAUSE TO SHOOT
                //shoot rings into goal

                Trajectory traj4 = drivetrain.trajectoryBuilder(traj3.end())
                        .forward(11)
                        .build();

                //Path1
                drivetrain.followTrajectory(traj2);
                drivetrain.followTrajectory(traj3);
                drivetrain.followTrajectory(traj4);
            }
            else if(path2) {
                //Trajectories for Path2
                Trajectory traj2 = drivetrain.trajectoryBuilder(traj1.end())
                        .forward(65)
                        .build();

                Trajectory traj3 = drivetrain.trajectoryBuilder(traj2.end())
                        .back(35)
                        .build();

                //PAUSE TO SHOOT
                //shoot rings into goal

                Trajectory traj4 = drivetrain.trajectoryBuilder(traj3.end())
                        .forward(11)
                        .build();

                //Path2
                drivetrain.followTrajectory(traj2);
                drivetrain.followTrajectory(traj3);
                drivetrain.followTrajectory(traj4);
            }
            else {
                //Trajectories for Path3
                Trajectory traj2 = drivetrain.trajectoryBuilder(traj1.end())
                        .strafeLeft(25)
                        .forward(90)
                        .build();

                Trajectory traj3 = drivetrain.trajectoryBuilder(traj2.end())
                        .strafeRight(25)
                        .back(60)
                        .build();

                //PAUSE TO SHOOT
                //shoot rings into goal

                Trajectory traj4 = drivetrain.trajectoryBuilder(traj3.end())
                        .forward(11)
                        .build();

                //Path3
                drivetrain.followTrajectory(traj2);
                drivetrain.followTrajectory(traj3);
                drivetrain.followTrajectory(traj4);
            }
        }

        else if(were blue alliance right side){
            Pose2d startPose = new Pose2d(-60, 24, 0.0);
            drivetrain.setPoseEstiamte(startPose);

            Trajectory traj1 = drivetrain.trajectoryBuilder(startPose)
                    .forward(30)
                    .strafeLeft(11)
                    .build();

            drivetrain.followTrajectory(traj1);
            //PAUSE TO SENSE
            //use vuforia to figure out # of rings

            if(path4) {
                //Trajectories for Path4
                Trajectory traj2 = drivetrain.trajectoryBuilder(traj1.end())
                        .strafeLeft(25)
                        .forward(42)
                        .build();

                Trajectory traj3 = drivetrain.trajectoryBuilder(traj2.end())
                        .strafeRight(25)
                        .back(11)
                        .build();

                //PAUSE TO SHOOT
                //shoot rings into goal

                Trajectory traj4 = drivetrain.trajectoryBuilder(traj3.end())
                        .forward(11)
                        .build();

                //Path4
                drivetrain.followTrajectory(traj2);
                drivetrain.followTrajectory(traj3);
                drivetrain.followTrajectory(traj4);
            }
            else if(path5) {
                //Trajectories for Path5
                Trajectory traj2 = drivetrain.trajectoryBuilder(traj1.end())
                        .forward(65)
                        .build();

                Trajectory traj3 = drivetrain.trajectoryBuilder(traj2.end())
                        .back(35)
                        .build();

                //PAUSE TO SHOOT
                //shoot rings into goal

                Trajectory traj4 = drivetrain.trajectoryBuilder(traj3.end())
                        .forward(11)
                        .build();

                //Path5
                drivetrain.followTrajectory(traj2);
                drivetrain.followTrajectory(traj3);
                drivetrain.followTrajectory(traj4);
            }
            else {
                //Trajectories for Path6
                Trajectory traj2 = drivetrain.trajectoryBuilder(traj1.end())
                        .strafeLeft(25)
                        .forward(90)
                        .build();

                Trajectory traj3 = drivetrain.trajectoryBuilder(traj2.end())
                        .strafeRight(25)
                        .back(60)
                        .build();

                //PAUSE TO SHOOT
                //shoot rings into goal

                Trajectory traj4 = drivetrain.trajectoryBuilder(traj3.end())
                        .forward(11)
                        .build();

                //Path6
                drivetrain.followTrajectory(traj2);
                drivetrain.followTrajectory(traj3);
                drivetrain.followTrajectory(traj4);
            }
        }

        else if(were red alliance left side){
            Pose2d startPose = new Pose2d(-60, -24, 0.0);
            drivetrain.setPoseEstiamte(startPose);

            Trajectory traj1 = drivetrain.trajectoryBuilder(startPose)
                    .forward(30)
                    .strafeRight(11)
                    .build();

            drivetrain.followTrajectory(traj1);
            //PAUSE TO SENSE
            //use vuforia to figure out # of rings

            if(path7) {
                //Trajectories for Path7
                Trajectory traj2 = drivetrain.trajectoryBuilder(traj1.end())
                        .strafeRight(25)
                        .forward(42)
                        .build();

                Trajectory traj3 = drivetrain.trajectoryBuilder(traj2.end())
                        .strafeLeft(25)
                        .back(12)
                        .build();

                //PAUSE TO SHOOT
                //shoot rings into goal

                Trajectory traj4 = drivetrain.trajectoryBuilder(traj3.end())
                        .forward(11)
                        .build();

                //Path7
                drivetrain.followTrajectory(traj2);
                drivetrain.followTrajectory(traj3);
                drivetrain.followTrajectory(traj4);
            }
            else if(path8) {
                //Trajectories for Path8
                Trajectory traj2 = drivetrain.trajectoryBuilder(traj1.end())
                        .forward(65)
                        .build();

                Trajectory traj3 = drivetrain.trajectoryBuilder(traj2.end())
                        .back(35)
                        .build();

                //PAUSE TO SHOOT
                //shoot rings into goal

                Trajectory traj4 = drivetrain.trajectoryBuilder(traj3.end())
                        .forward(11)
                        .build();

                //Path8
                drivetrain.followTrajectory(traj2);
                drivetrain.followTrajectory(traj3);
                drivetrain.followTrajectory(traj4);
            }
            else {
                //Trajectories for Path9
                Trajectory traj2 = drivetrain.trajectoryBuilder(traj1.end())
                        .strafeRight(25)
                        .forward(90)
                        .build();

                Trajectory traj3 = drivetrain.trajectoryBuilder(traj2.end())
                        .strafeLeft(25)
                        .back(60)
                        .build();

                //PAUSE TO SHOOT
                //shoot rings into goal

                Trajectory traj4 = drivetrain.trajectoryBuilder(traj3.end())
                        .forward(11)
                        .build();

                //Path9
                drivetrain.followTrajectory(traj2);
                drivetrain.followTrajectory(traj3);
                drivetrain.followTrajectory(traj4);
            }
        }

        else if(were red alliance right side){
            Pose2d startPose = new Pose2d(-60, -49, 0.0);
            drivetrain.setPoseEstiamte(startPose);

            Trajectory traj1 = drivetrain.trajectoryBuilder(startPose)
                    .forward(30)
                    .strafeLeft(14)
                    .build();

            drivetrain.followTrajectory(traj1);
            //PAUSE TO SENSE
            //use vuforia to figure out # of rings

            if(path10) {
                //Trajectories for Path10
                Trajectory traj2 = drivetrain.trajectoryBuilder(traj1.end())
                        .strafeRight(25)
                        .forward(42)
                        .build();

                Trajectory traj3 = drivetrain.trajectoryBuilder(traj2.end())
                        .strafeLeft(25)
                        .back(12)
                        .build();

                //PAUSE TO SHOOT
                //shoot rings into goal

                Trajectory traj4 = drivetrain.trajectoryBuilder(traj3.end())
                        .forward(11)
                        .build();

                //Path10
                drivetrain.followTrajectory(traj2);
                drivetrain.followTrajectory(traj3);
                drivetrain.followTrajectory(traj4);
            }
            else if(path11) {
                //Trajectories for Path11
                Trajectory traj2 = drivetrain.trajectoryBuilder(traj1.end())
                        .forward(65)
                        .build();

                Trajectory traj3 = drivetrain.trajectoryBuilder(traj2.end())
                        .back(35)
                        .build();

                //PAUSE TO SHOOT
                //shoot rings into goal

                Trajectory traj4 = drivetrain.trajectoryBuilder(traj3.end())
                        .forward(11)
                        .build();

                //Path11
                drivetrain.followTrajectory(traj2);
                drivetrain.followTrajectory(traj3);
                drivetrain.followTrajectory(traj4);
            }
            else {
                //Trajectories for Path12
                Trajectory traj2 = drivetrain.trajectoryBuilder(traj1.end())
                        .strafeRight(25)
                        .forward(90)
                        .build();

                Trajectory traj3 = drivetrain.trajectoryBuilder(traj2.end())
                        .strafeLeft(25)
                        .back(60)
                        .build();

                //PAUSE TO SHOOT
                //shoot rings into goal

                Trajectory traj4 = drivetrain.trajectoryBuilder(traj3.end())
                        .forward(11)
                        .build();


                //Path12
                drivetrain.followTrajectory(traj2);
                drivetrain.followTrajectory(traj3);
                drivetrain.followTrajectory(traj4);
            }
        }
    }
}
