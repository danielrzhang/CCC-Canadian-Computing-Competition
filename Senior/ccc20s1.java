import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ccc20s1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		ArrayList<SpeedTime> info = new ArrayList<SpeedTime>();

		String[] input;
		double maxSpeed = 0;
		double currentSpeed = 0;

		for (int i = 0; i < n; i++) {
			input = in.readLine().split(" ");
			info.add(new SpeedTime(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
		}

		Collections.sort(info, new Comparator<SpeedTime>() {
			@Override
			public int compare(SpeedTime s1, SpeedTime s2) {
				return s1.time - s2.time;
			}
		}
				);

		for (int i = 0; i < info.size() - 1; i++) {
			currentSpeed = 1.0 * (info.get(i + 1).distance - info.get(i).distance) / (info.get(i + 1).time - info.get(i).time);
			if (Math.abs(currentSpeed) >= maxSpeed) {
				maxSpeed = Math.abs(currentSpeed);
			}
		}
		System.out.println(maxSpeed);
	}
}

class SpeedTime {
	int time;
	int distance;

	SpeedTime(int time, int distance) {
		this.time = time;
		this.distance = distance;
	}
}


