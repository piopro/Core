package com.example.calc;

public class NativeAPI {
	
	static {
		System.loadLibrary("NativeAPI");
	}
	
	public static native String GetString(); 
	
}