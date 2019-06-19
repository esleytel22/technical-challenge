
public class Tortoise {
	public static int[] race(int v1, int v2, int g) {
		int sec = (g * 3600) / (v2 - v1);
		if (v2 <= v1)
			return null;
		return new int [] {sec /3600, (sec % 3600) / 60, sec % 60 };
	}

}
