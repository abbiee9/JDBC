import java.util.StringTokenizer;

class StringTokenizerEx
{
	public static void main(String args[]) {
		String s = "Get Entertained";
		//StringTokenizer st = new StringTokenizer(s, "t");
		StringTokenizer st = new StringTokenizer(s,"at");
		while (st.hasMoreElements())
			System.out.print(st.nextToken());
	}
}