import com.ridgesoft.intellibrain.IntelliBrain;
import com.ridgesoft.robotics.Motor;

public class ManeuverWithMotor {

	private static Motor leftMotor;
	private static Motor rightMotor;

	public static void main(String[] args) {
		leftMotor = new ContinousRotationServo(IntelliBrain.getServo(1), false, 14);
		rightMotor = new ContinousRotationServo(IntelliBrain.getServo(2), true, 14);

		//leftMotor = new DevantechMD23(XXXX);
		//rightMotor = new DevantechMD23(XXXX);
		
		System.out.println("Maneuver");

		leftMotor.setPower(Motor.MAX_FORWARD);
		rightMotor.setPower(Motor.MAX_FORWARD);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		leftMotor.stop();
		rightMotor.stop();	
	}
}
