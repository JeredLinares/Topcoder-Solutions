import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Runner{

	public static void main(String[] s){
/*
		String[] input1 = {
"R......R",
".R....R.",
"..R..R..",
"...RR...",
"...RR...",
"..R..R..",
".R....R.",
"R......R"
};

		FiveRooksDiv2 roo = new FiveRooksDiv2();
		System.out.println(roo.findMax(input1));
*/

int[] start = {
1,5,10
};
int[] time = {
3,6,1
};


		OvercookedDiv2 over = new OvercookedDiv2();
		System.out.println(over.minStale(start, time));

	}
}
