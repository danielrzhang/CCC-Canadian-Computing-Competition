import java.util.Scanner;
public class ccc09j3 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String timeInput = in.nextLine();
		int hour = 0;
		int minute = 0;

		if (timeInput.length() == 1 || timeInput.length() == 2) {
			hour = 0;
			minute = Integer.parseInt(timeInput);
		}

		else if (timeInput.length() == 3) {
			hour = Integer.parseInt(timeInput.substring(0, 1));
			minute = Integer.parseInt(timeInput.substring(1, 3));
		}

		else {
			hour = Integer.parseInt(timeInput.substring(0, 2));
			minute = Integer.parseInt(timeInput.substring(2, 4));
		}

		int oHour = hour;
		int oMinute = minute;
		if (oHour == 0)
			System.out.println(oMinute + " in Ottawa");
		else
			System.out.printf("%d%02d in Ottawa%n", oHour, oMinute);

		int vHour = (hour - 3) % 24;
		int vMinute = minute;

		if (vHour < 0)
			vHour = 24 + vHour;
		if (vHour == 0)
			System.out.println(vMinute + " in Victoria");
		else
			System.out.printf("%d%02d in Victoria%n", vHour, vMinute);

		int eHour = (hour - 2) % 24;
		int eMinute = minute;
		if (eHour < 0)
			eHour = 24 + eHour;
		if (eHour == 0)
			System.out.println(eMinute + " in Edmonton");
		else
			System.out.printf("%d%02d in Edmonton%n", eHour, eMinute);

		int wHour = (hour - 1) % 24;
		int wMinute = minute;
		if (wHour < 0)
			wHour = 24 + wHour;
		if (wHour == 0)
			System.out.println(wMinute + " in Winnipeg");
		else
			System.out.printf("%d%02d in Winnipeg%n", wHour, wMinute);

		int tHour = hour;
		int tMinute = minute;
		if (tHour < 0)
			tHour = 24 + tHour;
		if (tHour == 0)
			System.out.println(tMinute + " in Toronto");
		else
			System.out.printf("%d%02d in Toronto%n", tHour, tMinute);

		int hHour = (hour + 1) % 24;
		int hMinute = minute;
		if (hHour < 0)
			hHour = 24 + hHour;
		if (hHour == 0)
			System.out.println(hMinute + " in Halifax");
		else
			System.out.printf("%d%02d in Halifax%n", hHour, hMinute);

		int sHour = (hour + 1) % 24;
		int sMinute = minute + 30;
		if (sMinute > 60) {
			sHour++;
			sMinute = sMinute % 60;
		}
		if (sHour < 0)
			sHour = sHour + 24;
		if (sHour == 0)
			System.out.println(sMinute + " in St. John's");
		else
			System.out.printf("%d%02d in St. John's%n", sHour, sMinute);
		in.close();

	}
}