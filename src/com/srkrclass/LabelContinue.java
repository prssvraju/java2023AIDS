package com.srkrclass;

class LabelContinue {
	public static void main(String args[]) {
		Skip: // label
		for (int j = 0; j < 10; ++j) {
			if (j % 2 == 0)// modulo division continue Skip;// restarting the labelled loop
			{
				System.out.println("number = " + j + " square = " + j * j);
			}
		}
	}
}
