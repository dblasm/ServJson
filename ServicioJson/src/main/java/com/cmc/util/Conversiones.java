package com.cmc.util;

import java.sql.Timestamp;

public class Conversiones {
	
	// Conversión de String a Timestamp
	public static Timestamp toTimestamp(String fecha) {
		return Timestamp.valueOf(fecha);
	}
	
	//Conversión de String a Float
	public static Float toFloat(String valor) {
		return Float.parseFloat(valor);
	}
}
